package org.azure.fn.premium.model.enriched.text.features.sentiment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "target",
        "sentiment",
        "assessments"
})
public class Opinion implements Serializable
{

    @JsonProperty("target")
    private String target;
    @JsonProperty("sentiment")
    private String sentiment;
    @JsonProperty("assessments")
    private List<Assessment> assessments = new ArrayList<Assessment>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3852423428586219152L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Opinion() {
    }

    /**
     *
     * @param sentiment
     * @param assessments
     * @param target
     */
    public Opinion(String target, String sentiment, List<Assessment> assessments) {
        super();
        this.target = target;
        this.sentiment = sentiment;
        this.assessments = assessments;
    }

    @JsonProperty("target")
    public String getTarget() {
        return target;
    }

    @JsonProperty("target")
    public void setTarget(String target) {
        this.target = target;
    }

    public Opinion withTarget(String target) {
        this.target = target;
        return this;
    }

    @JsonProperty("sentiment")
    public String getSentiment() {
        return sentiment;
    }

    @JsonProperty("sentiment")
    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    public Opinion withSentiment(String sentiment) {
        this.sentiment = sentiment;
        return this;
    }

    @JsonProperty("assessments")
    public List<Assessment> getAssessments() {
        return assessments;
    }

    @JsonProperty("assessments")
    public void setAssessments(List<Assessment> assessments) {
        this.assessments = assessments;
    }

    public Opinion withAssessments(List<Assessment> assessments) {
        this.assessments = assessments;
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

    public Opinion withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Opinion.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("target");
        sb.append('=');
        sb.append(((this.target == null)?"<null>":this.target));
        sb.append(',');
        sb.append("sentiment");
        sb.append('=');
        sb.append(((this.sentiment == null)?"<null>":this.sentiment));
        sb.append(',');
        sb.append("assessments");
        sb.append('=');
        sb.append(((this.assessments == null)?"<null>":this.assessments));
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
        result = ((result* 31)+((this.assessments == null)? 0 :this.assessments.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.target == null)? 0 :this.target.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Opinion) == false) {
            return false;
        }
        Opinion rhs = ((Opinion) other);
        return (((((this.sentiment == rhs.sentiment)||((this.sentiment!= null)&&this.sentiment.equals(rhs.sentiment)))&&((this.assessments == rhs.assessments)||((this.assessments!= null)&&this.assessments.equals(rhs.assessments))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.target == rhs.target)||((this.target!= null)&&this.target.equals(rhs.target))));
    }

}
