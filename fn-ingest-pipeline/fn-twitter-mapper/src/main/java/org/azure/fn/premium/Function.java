package org.azure.fn.premium;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.HttpResponseMessage;
import com.microsoft.azure.functions.HttpStatus;
import com.microsoft.azure.functions.annotation.*;
import org.azure.fn.premium.model.enriched.text.EnrichedTextContent;
import org.azure.fn.premium.model.serialization.fnSerializer;
import org.azure.fn.premium.model.utils.Sources;
import org.azure.fn.premium.model.twitter.Tweet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Function {
    @FunctionName("receiveTweetFromHttp")
    public HttpResponseMessage httpRun(@HttpTrigger(
                                    name = "req",
                                    methods = {HttpMethod.GET, HttpMethod.POST},
                                    authLevel = AuthorizationLevel.ANONYMOUS)
                                                HttpRequestMessage<Optional<String>> request,
            final ExecutionContext context) throws Exception {
        context.getLogger().info("Received tweet request...");
        String message = request.getBody().get();
        if(null == message) {
            return request.createResponseBuilder(HttpStatus.BAD_REQUEST).body("Invalid json received.").build();
        }

        context.getLogger().info("Decoding message...");

        ObjectMapper mapper = fnSerializer.getMapper();
        Tweet[] tweets = mapper.readValue(message, Tweet[].class);

        context.getLogger().info("Success. Transferring data to enriched model...");
        List<String> enrichmentBatch = new ArrayList<>();
        for(Tweet tweet : tweets) {
            EnrichedTextContent content = transferTweetData(tweet);
            String enrichedJson = mapper.writeValueAsString(content);
            enrichmentBatch.add(enrichedJson);
        }
        return request.createResponseBuilder(HttpStatus.OK)
                .body(enrichmentBatch.toArray(new String[enrichmentBatch.size()]))
                .build();
    }

    @FunctionName("receiveTweetFromEventHubStream")
    @EventHubOutput(name = "enriched_tweet", eventHubName = "enriched_tweet", connection = "AzureEventHubConnection")
    public String[] ehRun(@EventHubTrigger(name="tweets", eventHubName="twitter_ingest_raw", connection="AzureEventHubConnection") String message,
                        final ExecutionContext context) throws Exception {
        context.getLogger().info("Received tweet ingest...");
        if(null == message) {
            throw new RuntimeException("Received null message! Exiting.");
        }
        context.getLogger().info("Decoding message...");

        ObjectMapper mapper = fnSerializer.getMapper();
        Tweet[] tweets = mapper.readValue(message, Tweet[].class);

        context.getLogger().info("Success. Transferring data to enriched model...");
        List<String> enrichmentBatch = new ArrayList<>();
        for(Tweet tweet : tweets) {
            EnrichedTextContent content = transferTweetData(tweet);
            String enrichedJson = mapper.writeValueAsString(content);
            enrichmentBatch.add(enrichedJson);
        }
        return enrichmentBatch.toArray(new String[enrichmentBatch.size()]);
    }

    private EnrichedTextContent transferTweetData(final Tweet tweet) {
        EnrichedTextContent content = new EnrichedTextContent().withRawContent(tweet.getText())
                .withId(tweet.getIdStr())
                .withParentId(null)
                .withSourceType(Sources.TWITTER.name())
                .withTimestamp(System.currentTimeMillis())
                .withAdditionalProperty("CreatedAt", tweet.getCreatedAt())
                .withAdditionalProperty("Contributors", tweet.getContributors())
                .withAdditionalProperty("Geo", tweet.getGeo())
                .withAdditionalProperty("Coordinates", tweet.getCoordinates())
                .withAdditionalProperty("Place", tweet.getPlace())
                .withAdditionalProperty("RetweetCount", tweet.getRetweetCount())
                .withAdditionalProperty("User", tweet.getUser());
        return content;
    }
}
