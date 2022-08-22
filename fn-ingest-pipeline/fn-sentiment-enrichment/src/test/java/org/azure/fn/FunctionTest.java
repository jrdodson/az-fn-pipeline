package org.azure.fn;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.HttpResponseMessage;
import com.microsoft.azure.functions.HttpStatus;
import org.azure.fn.premium.model.enriched.text.EnrichedTextContent;
import org.azure.fn.premium.model.serialization.fnSerializer;
import org.junit.jupiter.api.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import java.util.Optional;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class FunctionTest {
    @Test
    //@SetEnvironmentVariable(key = "endpoint", value = "https://sher-cogsvc.cognitiveservices.azure.com/")
    //@SetEnvironmentVariable(key = "key", value = "b18e74ff46ec448ca4e37ddb8812f371")
    public void testHttpTriggerJava() throws Exception {
        // Setup
        ObjectMapper mapper = fnSerializer.getMapper();
        EnrichedTextContent content = new EnrichedTextContent().withId("1")
                .withRawContent("I love Azure, it's the best cloud hands-down.");
        String json = mapper.writeValueAsString(content);

        @SuppressWarnings("unchecked")
        final HttpRequestMessage<Optional<String>> req = mock(HttpRequestMessage.class);
        final Optional<String> queryBody = Optional.of(json);
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
