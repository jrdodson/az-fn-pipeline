package org.azure.fn;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.time.*;
import java.util.*;
import java.util.logging.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;
import org.azure.fn.premium.model.bing.ArticleSearch;
import org.azure.fn.premium.model.bing.features.Value;
import org.azure.fn.premium.model.enriched.text.EnrichedTextContent;
import org.azure.fn.premium.model.serialization.fnSerializer;
import org.azure.fn.premium.model.utils.PropertyKeys;
import org.azure.fn.premium.model.utils.Sources;

import javax.net.ssl.HttpsURLConnection;

public class Function {

    @FunctionName("TimedNewsSearch")
    @EventHubOutput(name = "enriched_article", eventHubName = "enriched_article", connection = "AzureEventHubConnection")
    public String[] runNewsQuery(
        @TimerTrigger(name = "timer", schedule = "0 30 8 * * *") String timerInfo,
        final ExecutionContext context
    ) throws Exception {
        context.getLogger().info("fn news crawler invoked at " + LocalDateTime.now());

        String subscriptionKey = System.getenv("BING_SEARCH_V7_SUBSCRIPTION_KEY");
        String endpoint = System.getenv("BING_SEARCH_V7_ENDPOINT") + "/v7.0/news/search?freshness=Day&";
        String searchQuery = System.getenv("BING_SEARCH_V7_QUERY");

        if(Strings.isNullOrEmpty(subscriptionKey) ||
            Strings.isNullOrEmpty(endpoint) ||
            Strings.isNullOrEmpty(searchQuery)) {
            throw new Exception("Invalid value for subscriptionKey or endpoint config! Exiting.");
        }
        context.getLogger().info("Searching for articles within the last 24 hours...");
        String json = search(searchQuery, endpoint, subscriptionKey);

        context.getLogger().info("Done. Submitting to pipeline...");
        ObjectMapper mapper = fnSerializer.getMapper();
        ArticleSearch searchObject = mapper.readValue(json, ArticleSearch.class);

        List<String> batch = new ArrayList<>();
        for(Value article : searchObject.getValue()) {
            String articleJson = mapper.writeValueAsString(transfer(article, context.getLogger()));
            batch.add(articleJson);
        }
        context.getLogger().info("Done.");
        return batch.toArray(new String[batch.size()]);
    }

    @FunctionName("HttpArticleJson")
    @EventHubOutput(name = "enriched_article", eventHubName = "enriched_article", connection = "AzureEventHubConnection")
    public String postBingNewsJson(@HttpTrigger(
            name = "req",
            methods = {HttpMethod.POST},
            authLevel = AuthorizationLevel.ANONYMOUS)
            HttpRequestMessage<Optional<String>> content,
                                   final ExecutionContext context) throws Exception {
        context.getLogger().info("Received news article...");
        String json = content.getBody().get();
        if(null == json) {
            throw new Exception("Received a null payload! Nothing to do.");
        }

        context.getLogger().info("Enriching article...");
        ObjectMapper mapper = fnSerializer.getMapper();
        Value article = mapper.readValue(json, Value.class);

        EnrichedTextContent etc = transfer(article, context.getLogger());
        return mapper.writeValueAsString(etc);
    }

    public EnrichedTextContent transfer(Value article, Logger logger) {
        EnrichedTextContent etc = new EnrichedTextContent().withId(UUID.randomUUID().toString())
                .withParentId(null)
                .withSourceType(Sources.HTTP_ARTICLE.name())
                .withRawContent(article.getName())
                .withAdditionalProperty(PropertyKeys.ArticleDescription, article.getDescription())
                .withAdditionalProperty(PropertyKeys.ArticleURL, article.getUrl())
                .withAdditionalProperty(PropertyKeys.ArticlePublishDate, article.getDatePublished())
                .withAdditionalProperty(PropertyKeys.ArticleCategory, article.getCategory());
        if(null != article.getProvider() && article.getProvider().size() != 0)
            article.getProvider()
                   .forEach(provider -> {
                        etc.withAdditionalProperty(PropertyKeys.ArticleProviderName, provider.getName())
                           .withAdditionalProperty(PropertyKeys.ArticleProviderType, provider.getType());
                    });
        if(null != article.getAbout() && article.getAbout().size() != 0)
            article.getAbout()
                    .forEach(topic -> {
                        etc.withAdditionalProperty(PropertyKeys.ArticleTopics, topic.getName());
                    });
        if(null != article.getMentions() && article.getMentions().size() != 0)
            article.getMentions()
                    .forEach(mention -> {
                        etc.withAdditionalProperty(PropertyKeys.ArticleMentions, mention.getName());
                    });
        return etc;
    }

    public String search (String searchQuery, String endpoint, String subscriptionKey) throws Exception {
        URL url = new URL(endpoint + "q=" +  URLEncoder.encode(searchQuery, "UTF-8"));
        HttpsURLConnection connection = (HttpsURLConnection)url.openConnection();
        connection.setRequestProperty("Ocp-Apim-Subscription-Key", subscriptionKey);

        InputStream stream = connection.getInputStream();
        Scanner scanner = new Scanner(stream);
        String response  = scanner.useDelimiter("\\A").next();

        scanner.close();
        return response;
    }
}
