package org.azure.fn;

import com.azure.ai.textanalytics.TextAnalyticsClient;
import com.azure.ai.textanalytics.models.*;
import com.azure.ai.textanalytics.util.AnalyzeSentimentResultCollection;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;
import org.azure.fn.premium.model.enriched.text.EnrichedTextContent;
import org.azure.fn.premium.model.enriched.text.features.sentiment.Assessment;
import org.azure.fn.premium.model.enriched.text.features.sentiment.Opinion;
import org.azure.fn.premium.model.enriched.text.features.sentiment.SentimentFeature;
import org.azure.fn.premium.model.serialization.fnSerializer;
import org.azure.fn.premium.model.twitter.Tweet;
import org.azure.fn.premium.model.utils.CognitiveServiceClients;
import org.azure.fn.premium.model.utils.Tuples;


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

public class Function {

    @FunctionName("HttpSentimentRequest")
    public HttpResponseMessage httpRun(@HttpTrigger(
            name = "req",
            methods = {HttpMethod.GET, HttpMethod.POST},
            authLevel = AuthorizationLevel.ANONYMOUS)
                                               HttpRequestMessage<Optional<String>> request,
                                       final ExecutionContext context) throws Exception {
        context.getLogger().info("Received sentiment annotation request...");
        String message = request.getBody().get();
        if(null == message) {
            return request.createResponseBuilder(HttpStatus.BAD_REQUEST).body("Invalid json received.").build();
        }
        context.getLogger().info("Success. Transferring data to enriched model...");
        List<String> annotated = annotateSentiment(Arrays.asList(message), context.getLogger());
        return request.createResponseBuilder(HttpStatus.OK)
                .body(annotated)
                .build();
    }
    @FunctionName("ConsumeEnrichedTweets")
    @EventHubOutput(name = "sentiment_tagged", eventHubName = "annotated_sentiment", connection = "AzureEventHubConnection")
    public String[] consumeTweets(
            @EventHubTrigger(name = "tweets",
                    eventHubName = "enriched_tweet",
                    connection = "AzureEventHubConnection",
                    consumerGroup = "$Default",
                    cardinality = Cardinality.MANY,
                    dataType = "string") List<String> message,
            final ExecutionContext context
    ) throws Exception {
        context.getLogger().info("fn sentiment annotator received twitter data...");
        List<String> annotated = annotateSentiment(message, context.getLogger());
        return annotated.toArray(new String[annotated.size()]);
    }

    @FunctionName("ConsumeEnrichedArticle")
    @EventHubOutput(name = "sentiment_tagged", eventHubName = "annotated_sentiment", connection = "AzureEventHubConnection")
    public String[] consumeArticle(
            @EventHubTrigger(name = "enriched_articles",
                    eventHubName = "enriched_article",
                    connection = "AzureEventHubConnection",
                    consumerGroup = "$Default",
                    cardinality = Cardinality.MANY,
                    dataType = "string") List<String> message,
            final ExecutionContext context
    ) throws Exception {
        context.getLogger().info("fn sentiment annotator received article data...");
        List<String> annotated = annotateSentiment(message, context.getLogger());
        return annotated.toArray(new String[annotated.size()]);
    }

    @FunctionName("ConsumeParsedArticle")
    @EventHubOutput(name = "sentiment_tagged", eventHubName = "annotated_sentiment", connection = "AzureEventHubConnection")
    public String[] consumeParsedArticle(
            @EventHubTrigger(name = "parsed_articles",
                    eventHubName = "parsed_article",
                    connection = "AzureEventHubConnection",
                    consumerGroup = "$Default",
                    cardinality = Cardinality.MANY,
                    dataType = "string") List<String> message,
            final ExecutionContext context
    ) throws Exception {
        context.getLogger().info("fn sentiment annotator received article data...");
        List<String> annotated = annotateSentiment(message, context.getLogger());
        return annotated.toArray(new String[annotated.size()]);
    }

    @FunctionName("ConsumeBlob")
    @EventHubOutput(name = "sentiment_tagged", eventHubName = "annotated_sentiment", connection = "AzureEventHubConnection")
    public String[] consumeBlob(
            @EventHubTrigger(name = "blobs",
                    eventHubName = "blob_ingest_raw",
                    connection = "AzureEventHubConnection",
                    consumerGroup = "$Default",
                    cardinality = Cardinality.MANY,
                    dataType = "string") List<String> message,
            final ExecutionContext context
    ) throws Exception {
        context.getLogger().info("fn sentiment annotator received blob data...");
        List<String> annotated = annotateSentiment(message, context.getLogger());
        return annotated.toArray(new String[annotated.size()]);
    }

    public Tuples.Tuple2<Map<String, EnrichedTextContent>,
            List<TextDocumentInput>> prepareDocuments(List<String> serializedJson, ObjectMapper mapper, Logger logger) {
        List<TextDocumentInput> documents = new ArrayList<>();
        Map<String, EnrichedTextContent> contentMap = new HashMap<>();

        serializedJson.forEach(json -> {
            try {
                EnrichedTextContent content = mapper.readValue(json, EnrichedTextContent.class);
                contentMap.put(content.getId(), content);

                TextDocumentInput input = new TextDocumentInput(content.getId(), content.getRawContent());
                documents.add(input);
            } catch (JsonProcessingException e) {
                logger.warning(e.getMessage());
            }
        });
        return Tuples.tuple(contentMap, documents);
    }
    public List<String> annotateSentiment(List<String> message, Logger logger) throws Exception {
        List<String> batch = new ArrayList<>();
        logger.info("Attempting to fetch environment configuration...");

        final String endpoint = System.getenv("TEXT_ANALYTICS_ENDPOINT");
        final String key = System.getenv("TEXT_ANALYTICS_KEY");
        if(Strings.isNullOrEmpty(endpoint) || Strings.isNullOrEmpty(key)) {
            throw new Exception("Environment  variables not properly configured!");
        }
        ObjectMapper mapper = fnSerializer.getMapper();

        Tuples.Tuple2<Map<String, EnrichedTextContent>,List<TextDocumentInput>> data =
                prepareDocuments(message, mapper, logger);
        TextAnalyticsClient client = CognitiveServiceClients.textAnalyticsClient(key, endpoint);

        AnalyzeSentimentOptions requestOptions = new AnalyzeSentimentOptions()
                .setIncludeStatistics(true)
                .setIncludeOpinionMining(true)
                .setModelVersion("latest");

        Response<AnalyzeSentimentResultCollection> response =
                client.analyzeSentimentBatchWithResponse(data.v2, requestOptions, Context.NONE);

        if(response.getStatusCode() != 200) {
            throw new Exception("Text Analytics returned status code: " + response.getStatusCode());
        }

        AnalyzeSentimentResultCollection results = response.getValue();
        TextDocumentBatchStatistics batchStatistics = results.getStatistics();
        logger.info(String.format("Documents statistics: document count = %s, erroneous document count = %s, transaction count = %s, valid document count = %s.%n",
                batchStatistics.getDocumentCount(), batchStatistics.getInvalidDocumentCount(), batchStatistics.getTransactionCount(), batchStatistics.getValidDocumentCount()));

        AtomicInteger counter = new AtomicInteger();
        results.forEach(result -> {
            TextDocumentInput doc = data.v2.get(counter.getAndIncrement());
            DocumentSentiment sentiment = result.getDocumentSentiment();
            SentimentConfidenceScores scores = sentiment.getConfidenceScores();

            SentimentFeature sentimentFeature = new SentimentFeature()
                    .withAverageSentiment(sentiment.getSentiment().toString())
                    .withPositiveScore(scores.getPositive())
                    .withNeutralScore(scores.getNeutral())
                    .withNegativeScore(scores.getNegative());

            List<Opinion> opinions = new ArrayList<>();
            sentiment.getSentences().forEach(sentenceSentiment -> {
                sentenceSentiment.getOpinions().forEach(op -> {
                    Opinion opinion = new Opinion()
                            .withSentiment(op.getTarget().getSentiment().toString())
                            .withTarget(op.getTarget().getText());

                    List<Assessment> assessments = new ArrayList<>();
                    op.getAssessments().forEach(assessmentSentiment ->  {
                        Assessment assessment = new Assessment()
                                .withAssessedSentiment(assessmentSentiment.getSentiment().toString())
                                .withAssessedText(assessmentSentiment.getText())
                                .withIsNegated(assessmentSentiment.isNegated());
                        assessments.add(assessment);
                    });
                    opinions.add(opinion);
                });
            });
            sentimentFeature = sentimentFeature.withOpinions(opinions);

            EnrichedTextContent content = data.v1.get(doc.getId());
            content = content.withSentimentFeature(sentimentFeature);
            try {
                batch.add(mapper.writeValueAsString(content));
            } catch (Exception e) {
                logger.warning("Unable to serialize content with sentiment annotation, skipping: " + e);
            }
        });
        return batch;
    }


}
