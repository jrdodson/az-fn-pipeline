package org.azure.fn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;
import org.azure.fn.premium.model.enriched.text.EnrichedTextContent;
import org.azure.fn.premium.model.serialization.fnSerializer;
import org.azure.fn.premium.model.utils.PropertyKeys;
import org.azure.fn.premium.model.utils.Sources;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;

public class ArticleParserFunction {

    @FunctionName("ArticleParse")
    @EventHubOutput(name = "parsed_article", eventHubName = "parsed_article", connection = "AzureEventHubConnection")
    public String[] eventHubRun(
        @EventHubTrigger(name = "article",
                eventHubName = "enriched_article",
                connection = "AzureEventHubConnection",
                consumerGroup = "$Default",
                cardinality = Cardinality.MANY,
                dataType = "string") List<String> message,
        final ExecutionContext context
    ) {
        context.getLogger().info("fn article parser received events...");
        List<String> batch = new ArrayList<>();
        ObjectMapper mapper = fnSerializer.getMapper();
        message.forEach(event -> {
            context.getLogger().info("Processing event...");
            try {
                EnrichedTextContent content = mapper.readValue(event, EnrichedTextContent.class);
                String url = (String)content.getPropertyExpectSingleValue(PropertyKeys.ArticleURL);
                if(null == url) {
                    throw new Exception("No URL found! Skipping...");
                }
                List<String> subContent = getSoup(url, content, mapper, context.getLogger());
                batch.addAll(subContent);
            } catch (Exception e) {
                context.getLogger().warning("Parsing exception occurred, skipping event...");
            }
        });
        return batch.toArray(new String[batch.size()]);
    }

    public List<String> getSoup(String URL, EnrichedTextContent etc, ObjectMapper mapper, Logger logger) throws IOException {
        Document doc = Jsoup.connect(URL).get();
        Elements paragraphs = doc.select("p");
        List<String> strings = paragraphs.eachText();

        List<String> subContent = new ArrayList<>();
        strings.forEach(text -> {
            EnrichedTextContent content = transfer(text, etc);
            try {
                subContent.add(mapper.writeValueAsString(content));
            } catch (Exception e) {
                logger.warning("Parsing exception occurred, skipping text...");
            }
        });
        return subContent;
    }

    public EnrichedTextContent transfer(String text, EnrichedTextContent parent) {
        return new EnrichedTextContent().withId(UUID.randomUUID().toString())
                .withParentId(parent.getId())
                .withRawContent(text)
                .withSourceType(Sources.HTTP_ARTICLE_TEXT.name());
    }
}
