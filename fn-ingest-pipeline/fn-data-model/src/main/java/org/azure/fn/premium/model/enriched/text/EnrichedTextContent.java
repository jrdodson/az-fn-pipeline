package org.azure.fn.premium.model.enriched.text;

import java.io.Serializable;
import java.security.KeyException;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.azure.fn.premium.model.enriched.text.features.Sequence;
import org.azure.fn.premium.model.enriched.text.features.sentiment.SentimentFeature;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "parent_id",
        "raw_content",
        "source_type",
        "timestamp",
        "sequences",
        "sentiment",
        "properties"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class EnrichedTextContent implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("parent_id")
    private String parentId;
    @JsonProperty("raw_content")
    private String rawContent;
    @JsonProperty("source_type")
    private String sourceType;
    @JsonProperty("timestamp")
    private Long timestamp;
    @JsonProperty("sequences")
    private List<Sequence> sequences = new ArrayList<Sequence>();
    @JsonProperty("sentiment")
    private SentimentFeature sentimentFeature;
    @JsonProperty("properties")
    private Multimap<String, Object> additionalProperties = ArrayListMultimap.create();
    private final static long serialVersionUID = 650020445123607450L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EnrichedTextContent withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("parent_id")
    public String getParentId() {
        return parentId;
    }

    @JsonProperty("parent_id")
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public EnrichedTextContent withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    @JsonProperty("raw_content")
    public String getRawContent() {
        return rawContent;
    }

    @JsonProperty("raw_content")
    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

    public EnrichedTextContent withRawContent(String rawContent) {
        this.rawContent = rawContent;
        return this;
    }

    @JsonProperty("source_type")
    public String getSourceType() {
        return sourceType;
    }

    @JsonProperty("source_type")
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public EnrichedTextContent withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public EnrichedTextContent withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @JsonProperty("sequences")
    public List<Sequence> getSequences() {
        return sequences;
    }

    @JsonProperty("sequences")
    public void setSequences(List<Sequence> sequences) {
        this.sequences = sequences;
    }

    public EnrichedTextContent withSequences(List<Sequence> sequences) {
        this.sequences = sequences;
        return this;
    }

    @JsonProperty("sentiment")
    public SentimentFeature getSentimentFeature() {
        return sentimentFeature;
    }

    @JsonProperty("sentiment")
    public void setSentimentFeature(SentimentFeature sentimentFeature) {
        this.sentimentFeature = sentimentFeature;
    }

    public EnrichedTextContent withSentimentFeature(SentimentFeature sentimentFeature) {
        this.sentimentFeature = sentimentFeature;
        return this;
    }

    @JsonProperty("properties")
    public Multimap<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonProperty("properties")
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public EnrichedTextContent withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    public Object getPropertyExpectSingleValue(String key) {
        if(additionalProperties.containsKey(key)) {
            return additionalProperties.get(key).toArray()[0];
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnrichedTextContent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("parentId");
        sb.append('=');
        sb.append(((this.parentId == null)?"<null>":this.parentId));
        sb.append(',');
        sb.append("rawContent");
        sb.append('=');
        sb.append(((this.rawContent == null)?"<null>":this.rawContent));
        sb.append(',');
        sb.append("sourceType");
        sb.append('=');
        sb.append(((this.sourceType == null)?"<null>":this.sourceType));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("sequences");
        sb.append('=');
        sb.append(((this.sequences == null)?"<null>":this.sequences));
        sb.append(',');
        sb.append("sentiment");
        sb.append('=');
        sb.append(((this.sentimentFeature == null)?"<null>":this.sentimentFeature));
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
        result = ((result* 31)+((this.sourceType == null)? 0 :this.sourceType.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sequences == null)? 0 :this.sequences.hashCode()));
        result = ((result* 31)+((this.parentId == null)? 0 :this.parentId.hashCode()));
        result = ((result* 31)+((this.rawContent == null)? 0 :this.rawContent.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnrichedTextContent) == false) {
            return false;
        }
        EnrichedTextContent rhs = ((EnrichedTextContent) other);
        return ((((((((this.sourceType == rhs.sourceType)||((this.sourceType!= null)&&this.sourceType.equals(rhs.sourceType)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sequences == rhs.sequences)||((this.sequences!= null)&&this.sequences.equals(rhs.sequences))))&&((this.parentId == rhs.parentId)||((this.parentId!= null)&&this.parentId.equals(rhs.parentId))))&&((this.rawContent == rhs.rawContent)||((this.rawContent!= null)&&this.rawContent.equals(rhs.rawContent))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
