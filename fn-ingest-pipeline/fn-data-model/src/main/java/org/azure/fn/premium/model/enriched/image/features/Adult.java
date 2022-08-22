package org.azure.fn.premium.model.enriched.image.features;

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
        "isAdultContent",
        "isRacyContent",
        "isGoryContent",
        "adultScore",
        "racyScore",
        "goreScore"
})
public class Adult implements Serializable
{

    @JsonProperty("isAdultContent")
    private Boolean isAdultContent;
    @JsonProperty("isRacyContent")
    private Boolean isRacyContent;
    @JsonProperty("isGoryContent")
    private Boolean isGoryContent;
    @JsonProperty("adultScore")
    private Double adultScore;
    @JsonProperty("racyScore")
    private Double racyScore;
    @JsonProperty("goreScore")
    private Double goreScore;
    @JsonIgnore
    private Map<String, java.lang.Object> additionalProperties = new HashMap<String, java.lang.Object>();
    private final static long serialVersionUID = -3455514904298229160L;

    @JsonProperty("isAdultContent")
    public Boolean getIsAdultContent() {
        return isAdultContent;
    }

    @JsonProperty("isAdultContent")
    public void setIsAdultContent(Boolean isAdultContent) {
        this.isAdultContent = isAdultContent;
    }

    public Adult withIsAdultContent(Boolean isAdultContent) {
        this.isAdultContent = isAdultContent;
        return this;
    }

    @JsonProperty("isRacyContent")
    public Boolean getIsRacyContent() {
        return isRacyContent;
    }

    @JsonProperty("isRacyContent")
    public void setIsRacyContent(Boolean isRacyContent) {
        this.isRacyContent = isRacyContent;
    }

    public Adult withIsRacyContent(Boolean isRacyContent) {
        this.isRacyContent = isRacyContent;
        return this;
    }

    @JsonProperty("isGoryContent")
    public Boolean getIsGoryContent() {
        return isGoryContent;
    }

    @JsonProperty("isGoryContent")
    public void setIsGoryContent(Boolean isGoryContent) {
        this.isGoryContent = isGoryContent;
    }

    public Adult withIsGoryContent(Boolean isGoryContent) {
        this.isGoryContent = isGoryContent;
        return this;
    }

    @JsonProperty("adultScore")
    public Double getAdultScore() {
        return adultScore;
    }

    @JsonProperty("adultScore")
    public void setAdultScore(Double adultScore) {
        this.adultScore = adultScore;
    }

    public Adult withAdultScore(Double adultScore) {
        this.adultScore = adultScore;
        return this;
    }

    @JsonProperty("racyScore")
    public Double getRacyScore() {
        return racyScore;
    }

    @JsonProperty("racyScore")
    public void setRacyScore(Double racyScore) {
        this.racyScore = racyScore;
    }

    public Adult withRacyScore(Double racyScore) {
        this.racyScore = racyScore;
        return this;
    }

    @JsonProperty("goreScore")
    public Double getGoreScore() {
        return goreScore;
    }

    @JsonProperty("goreScore")
    public void setGoreScore(Double goreScore) {
        this.goreScore = goreScore;
    }

    public Adult withGoreScore(Double goreScore) {
        this.goreScore = goreScore;
        return this;
    }

    @JsonAnyGetter
    public Map<String, java.lang.Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
    }

    public Adult withAdditionalProperty(String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Adult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isAdultContent");
        sb.append('=');
        sb.append(((this.isAdultContent == null)?"<null>":this.isAdultContent));
        sb.append(',');
        sb.append("isRacyContent");
        sb.append('=');
        sb.append(((this.isRacyContent == null)?"<null>":this.isRacyContent));
        sb.append(',');
        sb.append("isGoryContent");
        sb.append('=');
        sb.append(((this.isGoryContent == null)?"<null>":this.isGoryContent));
        sb.append(',');
        sb.append("adultScore");
        sb.append('=');
        sb.append(((this.adultScore == null)?"<null>":this.adultScore));
        sb.append(',');
        sb.append("racyScore");
        sb.append('=');
        sb.append(((this.racyScore == null)?"<null>":this.racyScore));
        sb.append(',');
        sb.append("goreScore");
        sb.append('=');
        sb.append(((this.goreScore == null)?"<null>":this.goreScore));
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
        result = ((result* 31)+((this.racyScore == null)? 0 :this.racyScore.hashCode()));
        result = ((result* 31)+((this.adultScore == null)? 0 :this.adultScore.hashCode()));
        result = ((result* 31)+((this.isAdultContent == null)? 0 :this.isAdultContent.hashCode()));
        result = ((result* 31)+((this.isGoryContent == null)? 0 :this.isGoryContent.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.goreScore == null)? 0 :this.goreScore.hashCode()));
        result = ((result* 31)+((this.isRacyContent == null)? 0 :this.isRacyContent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Adult) == false) {
            return false;
        }
        Adult rhs = ((Adult) other);
        return ((((((((this.racyScore == rhs.racyScore)||((this.racyScore!= null)&&this.racyScore.equals(rhs.racyScore)))&&((this.adultScore == rhs.adultScore)||((this.adultScore!= null)&&this.adultScore.equals(rhs.adultScore))))&&((this.isAdultContent == rhs.isAdultContent)||((this.isAdultContent!= null)&&this.isAdultContent.equals(rhs.isAdultContent))))&&((this.isGoryContent == rhs.isGoryContent)||((this.isGoryContent!= null)&&this.isGoryContent.equals(rhs.isGoryContent))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.goreScore == rhs.goreScore)||((this.goreScore!= null)&&this.goreScore.equals(rhs.goreScore))))&&((this.isRacyContent == rhs.isRacyContent)||((this.isRacyContent!= null)&&this.isRacyContent.equals(rhs.isRacyContent))));
    }

}
