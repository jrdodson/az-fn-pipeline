package org.azure.fn.premium.model.enriched.text.features;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "sentiment",
        "sentiment_idx",
        "sentiment_confidence"
})
public class Polarity implements Serializable
{

    @JsonProperty("sentiment")
    private String sentiment;
    @JsonProperty("sentiment_idx")
    private Integer sentimentIdx;
    @JsonProperty("sentiment_confidence")
    private Double sentimentConfidence;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5814576459500966565L;

    @JsonProperty("sentiment")
    public String getSentiment() {
        return sentiment;
    }

    @JsonProperty("sentiment")
    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    public Polarity withSentiment(String sentiment) {
        this.sentiment = sentiment;
        return this;
    }

    @JsonProperty("sentiment_idx")
    public Integer getSentimentIdx() {
        return sentimentIdx;
    }

    @JsonProperty("sentiment_idx")
    public void setSentimentIdx(Integer sentimentIdx) {
        this.sentimentIdx = sentimentIdx;
    }

    public Polarity withSentimentIdx(Integer sentimentIdx) {
        this.sentimentIdx = sentimentIdx;
        return this;
    }

    @JsonProperty("sentiment_confidence")
    public Double getSentimentConfidence() {
        return sentimentConfidence;
    }

    @JsonProperty("sentiment_confidence")
    public void setSentimentConfidence(Double sentimentConfidence) {
        this.sentimentConfidence = sentimentConfidence;
    }

    public Polarity withSentimentConfidence(Double sentimentConfidence) {
        this.sentimentConfidence = sentimentConfidence;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Polarity withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Polarity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sentiment");
        sb.append('=');
        sb.append(((this.sentiment == null)?"<null>":this.sentiment));
        sb.append(',');
        sb.append("sentimentIdx");
        sb.append('=');
        sb.append(((this.sentimentIdx == null)?"<null>":this.sentimentIdx));
        sb.append(',');
        sb.append("sentimentConfidence");
        sb.append('=');
        sb.append(((this.sentimentConfidence == null)?"<null>":this.sentimentConfidence));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.sentiment == null)? 0 :this.sentiment.hashCode()));
        result = ((result* 31)+((this.sentimentConfidence == null)? 0 :this.sentimentConfidence.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sentimentIdx == null)? 0 :this.sentimentIdx.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Polarity) == false) {
            return false;
        }
        Polarity rhs = ((Polarity) other);
        return (((((this.sentiment == rhs.sentiment)||((this.sentiment!= null)&&this.sentiment.equals(rhs.sentiment)))&&((this.sentimentConfidence == rhs.sentimentConfidence)||((this.sentimentConfidence!= null)&&this.sentimentConfidence.equals(rhs.sentimentConfidence))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sentimentIdx == rhs.sentimentIdx)||((this.sentimentIdx!= null)&&this.sentimentIdx.equals(rhs.sentimentIdx))));
    }

}
