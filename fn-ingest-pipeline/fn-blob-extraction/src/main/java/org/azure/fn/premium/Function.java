package org.azure.fn.premium;

import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;
import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.azure.fn.premium.model.blob.BlobRequest;
import org.azure.fn.premium.model.enriched.text.EnrichedTextContent;
import org.azure.fn.premium.model.serialization.fnSerializer;
import org.azure.fn.premium.model.utils.Sources;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Logger;

public class Function {

    @FunctionName("ConsumeBlobContent")
    @EventHubOutput(name = "blob_ingest_raw", eventHubName = "blob_ingest_raw", connection = "AzureEventHubConnection")
    public String blobRun(
       @BlobTrigger(name="blob",
               dataType = "binary",
               path="blob/{name}",
               connection="AzureWebJobsStorage") byte[] content,
        final ExecutionContext context
    ) throws Exception {
        context.getLogger().info("Received blob event...");
        if (null == content || content.length == 0) {
            context.getLogger().warning("Blob content is null or empty! Nothing to do.");
        }
        context.getLogger().info("Transferring content to enriched model...");
        ObjectMapper mapper = fnSerializer.getMapper();
        return mapper.writeValueAsString(parseBytes(content, context.getLogger()));
    }

    @FunctionName("RequestBlobContent")
    public HttpResponseMessage httpRun(@HttpTrigger(name="req",
            methods={HttpMethod.GET, HttpMethod.POST},
            authLevel=AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<String>> request,
                                       final ExecutionContext context) throws Exception {
        context.getLogger().info("Received blob request...");
        String message = request.getBody().get();
        if(null == message) {
            return request.createResponseBuilder(HttpStatus.BAD_REQUEST).body("Invalid json received.").build();
        }

        context.getLogger().info("Decoding message...");

        ObjectMapper mapper = fnSerializer.getMapper();
        BlobRequest blob = mapper.readValue(message, BlobRequest.class);

        context.getLogger().info("Success. Transferring data to enriched model...");
        EnrichedTextContent content = parse(blob, context.getLogger());
        String json = mapper.writeValueAsString(content);
        return request.createResponseBuilder(HttpStatus.OK)
                .body(json)
                .build();
    }

    public EnrichedTextContent parseBytes(byte[] contents, Logger logger) throws Exception {
        String text = extract(contents, logger);
        String extension = inferExtension(contents, logger);
        return transfer(text, extension);
    }
    public EnrichedTextContent parse(BlobRequest request, Logger logger) throws Exception {
        BlobServiceClient client = new BlobServiceClientBuilder()
                .connectionString(request.getBlobEndpoint())
                .buildClient();
        byte[] contents = client.getBlobContainerClient(request.getBlobContainer())
                .getBlobClient(request.getFileName())
                .downloadContent()
                .toBytes();

        String text = extract(contents, logger);
        return transfer(text, request);
    }

    public EnrichedTextContent transfer(String contents, String ext) {
        return new EnrichedTextContent().withId(UUID.randomUUID().toString())
                .withParentId(null)
                .withRawContent(contents)
                .withSourceType(Sources.BLOB_DOCUMENT.name())
                .withAdditionalProperty("BlobEndpoint", "default")
                .withAdditionalProperty("BlobExtension", ext)
                .withAdditionalProperty("BlobFilePath", "default");
    }
    public EnrichedTextContent transfer(String contents, BlobRequest request) {
        return new EnrichedTextContent().withId(request.getId().toString())
                .withParentId(null)
                .withRawContent(contents)
                .withSourceType(Sources.BLOB_DOCUMENT.name())
                .withAdditionalProperty("BlobEndpoint", request.getBlobEndpoint())
                .withAdditionalProperty("BlobExtension", request.getFileExt())
                .withAdditionalProperty("BlobFilePath", request.getFilePath());
    }

    public String inferExtension(byte[] content, Logger logger) throws Exception {
        Tika tika = new Tika();
        try {
            String ext = tika.detect(content);
            if(ext.trim().isEmpty()) {
                logger.warning("Could not detect extension.");
            } else {
                logger.warning("Successfully detected extension.");
            }
            return ext;
        } catch(Exception ex) {
            throw ex;
        }
    }
    public String extract(byte[] content, Logger logger) throws Exception {
        Tika tika = new Tika();
        try {
            String text = tika.parseToString(new ByteArrayInputStream(content));
            if(text.trim().isEmpty()) {
                logger.warning("Could not extract content.");
            } else {
                logger.warning("Successfully extracted content.");
            }
            return text;
        } catch(IOException | TikaException ex) {
            throw new Exception("Unable to extract text from blob ", ex);
        }
    }
}
