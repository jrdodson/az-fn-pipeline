package org.azure.fn.premium;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.azure.functions.*;
import org.azure.fn.premium.model.blob.BlobRequest;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.*;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;


/**
 * Unit test for Function class.
 */
public class FunctionTest {
    static ObjectMapper mapper = new ObjectMapper();

    @Test
    public void testXlsx() throws Exception {
        // Setup
        @SuppressWarnings("unchecked")
        final HttpRequestMessage<Optional<String>> req = mock(HttpRequestMessage.class);
        final BlobRequest blobReq = new BlobRequest().withFileName("blobs/blob.pdf").withId(2)
                .withBlobContainer("testcontainer")
                .withFilePath("")
                .withFileExt(".xlsx")
                .withBlobEndpoint("");

        final Optional<String> queryBody = Optional.of(mapper.writeValueAsString(blobReq));
        doReturn(queryBody).when(req).getBody();

        doAnswer(new Answer<HttpResponseMessage.Builder>() {
            @Override
            public HttpResponseMessage.Builder answer(InvocationOnMock invocation) {
                HttpStatus status = (HttpStatus) invocation.getArguments()[0];
                return new HttpResponseMessageMock.HttpResponseMessageBuilderMock().status(status);
            }
        }).when(req).createResponseBuilder(any(HttpStatus.class));

        final ExecutionContext context = mock(ExecutionContext.class);
        doReturn(Logger.getGlobal()).when(context).getLogger();

        // Invoke
        final HttpResponseMessage ret = new Function().httpRun(req, context);

        // Verify
        assertEquals(ret.getStatus(), HttpStatus.OK);
    }

    @Test
    public void testDocx() throws Exception {
        // Setup
        @SuppressWarnings("unchecked")
        final HttpRequestMessage<Optional<String>> req = mock(HttpRequestMessage.class);
        final BlobRequest blobReq = new BlobRequest().withFileName("blobs/GTM ConOps v0.2.docx").withId(2)
                .withBlobContainer("testcontainer")
                .withFilePath("abfss://testcontainer@fedcsuadls.core.windows.net/blobs/GTM ConOps v0.2.docx")
                .withFileExt(".docx")
                .withBlobEndpoint("DefaultEndpointsProtocol=https;AccountName=fedcsuadls;AccountKey=8xdegymjuyVH/VQ828l7XII06hw8t9FQHjVhpQ41wdUwl+6wwwEbQHqp3x+X6uZ3WOipkKTtM2QOb3K5rsw6lA==;EndpointSuffix=core.windows.net");

        final Optional<String> queryBody = Optional.of(mapper.writeValueAsString(blobReq));
        doReturn(queryBody).when(req).getBody();

        doAnswer(new Answer<HttpResponseMessage.Builder>() {
            @Override
            public HttpResponseMessage.Builder answer(InvocationOnMock invocation) {
                HttpStatus status = (HttpStatus) invocation.getArguments()[0];
                return new HttpResponseMessageMock.HttpResponseMessageBuilderMock().status(status);
            }
        }).when(req).createResponseBuilder(any(HttpStatus.class));

        final ExecutionContext context = mock(ExecutionContext.class);
        doReturn(Logger.getGlobal()).when(context).getLogger();

        // Invoke
        final HttpResponseMessage ret = new Function().httpRun(req, context);

        // Verify
        assertEquals(ret.getStatus(), HttpStatus.OK);
    }
}