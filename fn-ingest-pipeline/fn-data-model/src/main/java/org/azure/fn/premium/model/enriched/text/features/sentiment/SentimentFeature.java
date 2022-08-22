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
        "average_sentiment",
        "positive_score",
        "neutral_score",
        "negative_score",
        "opinions"
})
public class SentimentFeature implements Serializable {

    @JsonProperty("average_sentiment")
    private String averageSentiment;
    @JsonProperty("positive_score")
    private Double positiveScore;
    @JsonProperty("neutral_score")
    private Double neutralScore;
    @JsonProperty("negative_score")
    private Double negativeScore;
    @JsonProperty("opinions")
    private List<Opinion> opinions = new ArrayList<Opinion>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 9208397775019021712L;

    /**
     * No args constructor for use in serialization
     */
    public SentimentFeature() {
    }

    /**
     * @param positiveScore
     * @param opinions
     * @param neutralScore
     * @param negativeScore
     * @param averageSentiment
     */
    public SentimentFeature(String averageSentiment, Double positiveScore, Double neutralScore, Double negativeScore, List<Opinion> opinions) {
        super();
        this.averageSentiment = averageSentiment;
        this.positiveScore = positiveScore;
        this.neutralScore = neutralScore;
        this.negativeScore = negativeScore;
        this.opinions = opinions;
    }

    @JsonProperty("average_sentiment")
    public String getAverageSentiment() {
        return averageSentiment;
    }

    @JsonProperty("average_sentiment")
    public void setAverageSentiment(String averageSentiment) {
        this.averageSentiment = averageSentiment;
    }

    public SentimentFeature withAverageSentiment(String averageSentiment) {
        this.averageSentiment = averageSentiment;
        return this;
    }

    @JsonProperty("positive_score")
    public Double getPositiveScore() {
        return positiveScore;
    }

    @JsonProperty("positive_score")
    public void setPositiveScore(Double positiveScore) {
        this.positiveScore = positiveScore;
    }

    public SentimentFeature withPositiveScore(Double positiveScore) {
        this.positiveScore = positiveScore;
        return this;
    }

    @JsonProperty("neutral_score")
    public Double getNeutralScore() {
        return neutralScore;
    }

    @JsonProperty("neutral_score")
    public void setNeutralScore(Double neutralScore) {
        this.neutralScore = neutralScore;
    }

    public SentimentFeature withNeutralScore(Double neutralScore) {
        this.neutralScore = neutralScore;
        return this;
    }

    @JsonProperty("negative_score")
    public Double getNegativeScore() {
        return negativeScore;
    }

    @JsonProperty("negative_score")
    public void setNegativeScore(Double negativeScore) {
        this.negativeScore = negativeScore;
    }

    public SentimentFeature withNegativeScore(Double negativeScore) {
        this.negativeScore = negativeScore;
        return this;
    }

    @JsonProperty("opinions")
    public List<Opinion> getOpinions() {
        return opinions;
    }

    @JsonProperty("opinions")
    public void setOpinions(List<Opinion> opinions) {
        this.opinions = opinions;
    }

    public SentimentFeature withOpinions(List<Opinion> opinions) {
        this.opinions = opinions;
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

    public SentimentFeature withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SentimentFeature.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("averageSentiment");
        sb.append('=');
        sb.append(((this.averageSentiment == null) ? "<null>" : this.averageSentiment));
        sb.append(',');
        sb.append("positiveScore");
        sb.append('=');
        sb.append(((this.positiveScore == null) ? "<null>" : this.positiveScore));
        sb.append(',');
        sb.append("neutralScore");
        sb.append('=');
        sb.append(((this.neutralScore == null) ? "<null>" : this.neutralScore));
        sb.append(',');
        sb.append("negativeScore");
        sb.append('=');
        sb.append(((this.negativeScore == null) ? "<null>" : this.negativeScore));
        sb.append(',');
        sb.append("opinions");
        sb.append('=');
        sb.append(((this.opinions == null) ? "<null>" : this.opinions));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.positiveScore == null) ? 0 : this.positiveScore.hashCode()));
        result = ((result * 31) + ((this.opinions == null) ? 0 : this.opinions.hashCode()));
        result = ((result * 31) + ((this.neutralScore == null) ? 0 : this.neutralScore.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.negativeScore == null) ? 0 : this.negativeScore.hashCode()));
        result = ((result * 31) + ((this.averageSentiment == null) ? 0 : this.averageSentiment.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SentimentFeature) == false) {
            return false;
        }
        SentimentFeature rhs = ((SentimentFeature) other);
        return (((((((this.positiveScore == rhs.positiveScore) || ((this.positiveScore != null) && this.positiveScore.equals(rhs.positiveScore))) && ((this.opinions == rhs.opinions) || ((this.opinions != null) && this.opinions.equals(rhs.opinions)))) && ((this.neutralScore == rhs.neutralScore) || ((this.neutralScore != null) && this.neutralScore.equals(rhs.neutralScore)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.negativeScore == rhs.negativeScore) || ((this.negativeScore != null) && this.negativeScore.equals(rhs.negativeScore)))) && ((this.averageSentiment == rhs.averageSentiment) || ((this.averageSentiment != null) && this.averageSentiment.equals(rhs.averageSentiment))));
    }
}
