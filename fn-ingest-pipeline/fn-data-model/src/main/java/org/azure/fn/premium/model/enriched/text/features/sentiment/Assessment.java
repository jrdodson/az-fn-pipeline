package org.azure.fn.premium.model.enriched.text.features.sentiment;

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
        "assessed_sentiment",
        "assessed_text",
        "is_negated"
})
public class Assessment implements Serializable
{

    @JsonProperty("assessed_sentiment")
    private String assessedSentiment;
    @JsonProperty("assessed_text")
    private String assessedText;
    @JsonProperty("is_negated")
    private Boolean isNegated;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6404684883200115088L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Assessment() {
    }

    /**
     *
     * @param assessedSentiment
     * @param isNegated
     * @param assessedText
     */
    public Assessment(String assessedSentiment, String assessedText, Boolean isNegated) {
        super();
        this.assessedSentiment = assessedSentiment;
        this.assessedText = assessedText;
        this.isNegated = isNegated;
    }

    @JsonProperty("assessed_sentiment")
    public String getAssessedSentiment() {
        return assessedSentiment;
    }

    @JsonProperty("assessed_sentiment")
    public void setAssessedSentiment(String assessedSentiment) {
        this.assessedSentiment = assessedSentiment;
    }

    public Assessment withAssessedSentiment(String assessedSentiment) {
        this.assessedSentiment = assessedSentiment;
        return this;
    }

    @JsonProperty("assessed_text")
    public String getAssessedText() {
        return assessedText;
    }

    @JsonProperty("assessed_text")
    public void setAssessedText(String assessedText) {
        this.assessedText = assessedText;
    }

    public Assessment withAssessedText(String assessedText) {
        this.assessedText = assessedText;
        return this;
    }

    @JsonProperty("is_negated")
    public Boolean getIsNegated() {
        return isNegated;
    }

    @JsonProperty("is_negated")
    public void setIsNegated(Boolean isNegated) {
        this.isNegated = isNegated;
    }

    public Assessment withIsNegated(Boolean isNegated) {
        this.isNegated = isNegated;
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

    public Assessment withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Assessment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("assessedSentiment");
        sb.append('=');
        sb.append(((this.assessedSentiment == null)?"<null>":this.assessedSentiment));
        sb.append(',');
        sb.append("assessedText");
        sb.append('=');
        sb.append(((this.assessedText == null)?"<null>":this.assessedText));
        sb.append(',');
        sb.append("isNegated");
        sb.append('=');
        sb.append(((this.isNegated == null)?"<null>":this.isNegated));
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
        result = ((result* 31)+((this.isNegated == null)? 0 :this.isNegated.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.assessedSentiment == null)? 0 :this.assessedSentiment.hashCode()));
        result = ((result* 31)+((this.assessedText == null)? 0 :this.assessedText.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Assessment) == false) {
            return false;
        }
        Assessment rhs = ((Assessment) other);
        return (((((this.isNegated == rhs.isNegated)||((this.isNegated!= null)&&this.isNegated.equals(rhs.isNegated)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.assessedSentiment == rhs.assessedSentiment)||((this.assessedSentiment!= null)&&this.assessedSentiment.equals(rhs.assessedSentiment))))&&((this.assessedText == rhs.assessedText)||((this.assessedText!= null)&&this.assessedText.equals(rhs.assessedText))));
    }

}
