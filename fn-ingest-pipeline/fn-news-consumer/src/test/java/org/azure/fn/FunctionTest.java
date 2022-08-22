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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


/**
 * Unit test for Function class.
 */
public class FunctionTest {
    private final static String articleJson = "{\"name\":\"Microsoft to open flagship London brick-and-mortar retail store\",\"url\":\"http://www.contoso.com/article/microsoft-to-open-flagshi...\",\"image\":{\"thumbnail\":{\"contentUrl\":\"https://www.bing.com/th?id=ON.F9E4A49EC010417...\",\"width\":220,\"height\":146}},\"description\":\"After years of rumors about Microsoft opening a brick-and-mortar...\",\"about\":[{\"readLink\":\"https://api.cognitive.microsoft.com/api/v7/entiti...\",\"name\":\"Microsoft\"},{\"readLink\":\"https://api.cognitive.microsoft.com/api/v7/entit...\",\"name\":\"London\"}],\"provider\":[{\"_type\":\"Organization\",\"name\":\"Contoso\"}],\"datePublished\":\"2017-09-21T21:16:00.0000000Z\",\"category\":\"ScienceAndTechnology\"}";
    @Test
    public void testHttpTriggerJava() throws Exception {
        // Setup
        @SuppressWarnings("unchecked")
        final HttpRequestMessage<Optional<String>> req = mock(HttpRequestMessage.class);
        final Optional<String> queryBody = Optional.of(articleJson);
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
        final String ret = new Function().postBingNewsJson(req, context);

        // Verify
        assertNotNull(ret);

        ObjectMapper mapper = fnSerializer.getMapper();
        EnrichedTextContent content = mapper.readValue(ret, EnrichedTextContent.class);

        assertNotNull(content);
    }
}
