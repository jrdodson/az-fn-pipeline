package org.azure.fn.premium.model.utils;

import com.azure.ai.textanalytics.TextAnalyticsAsyncClient;
import com.azure.ai.textanalytics.TextAnalyticsClient;
import com.azure.ai.textanalytics.TextAnalyticsClientBuilder;
import com.azure.core.credential.AzureKeyCredential;

public class CognitiveServiceClients {

    public static TextAnalyticsAsyncClient textAnalyticsAsyncClient(final String key, final String endpoint) {
        return new TextAnalyticsClientBuilder().credential(new AzureKeyCredential(key))
                .endpoint(endpoint)
                .buildAsyncClient();
    }

    public static TextAnalyticsClient textAnalyticsClient(final String key, final String endpoint) {
        return new TextAnalyticsClientBuilder().credential(new AzureKeyCredential(key))
                .endpoint(endpoint)
                .buildClient();
    }
}
