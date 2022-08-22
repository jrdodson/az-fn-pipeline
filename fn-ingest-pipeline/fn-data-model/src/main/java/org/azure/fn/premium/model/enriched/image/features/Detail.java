package org.azure.fn.premium.model.enriched.image.features;

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
        "celebrities",
        "landmarks"
})
public class Detail implements Serializable
{

    @JsonProperty("celebrities")
    private List<Celebrity> celebrities = new ArrayList<Celebrity>();
    @JsonProperty("landmarks")
    private List<Landmark> landmarks = new ArrayList<Landmark>();
    @JsonIgnore
    private Map<String, java.lang.Object> additionalProperties = new HashMap<String, java.lang.Object>();
    private final static long serialVersionUID = 102835739224506583L;

    @JsonProperty("celebrities")
    public List<Celebrity> getCelebrities() {
        return celebrities;
    }

    @JsonProperty("celebrities")
    public void setCelebrities(List<Celebrity> celebrities) {
        this.celebrities = celebrities;
    }

    public Detail withCelebrities(List<Celebrity> celebrities) {
        this.celebrities = celebrities;
        return this;
    }

    @JsonProperty("landmarks")
    public List<Landmark> getLandmarks() {
        return landmarks;
    }

    @JsonProperty("landmarks")
    public void setLandmarks(List<Landmark> landmarks) {
        this.landmarks = landmarks;
    }

    public Detail withLandmarks(List<Landmark> landmarks) {
        this.landmarks = landmarks;
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

    public Detail withAdditionalProperty(String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Detail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("celebrities");
        sb.append('=');
        sb.append(((this.celebrities == null)?"<null>":this.celebrities));
        sb.append(',');
        sb.append("landmarks");
        sb.append('=');
        sb.append(((this.landmarks == null)?"<null>":this.landmarks));
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
        result = ((result* 31)+((this.celebrities == null)? 0 :this.celebrities.hashCode()));
        result = ((result* 31)+((this.landmarks == null)? 0 :this.landmarks.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Detail) == false) {
            return false;
        }
        Detail rhs = ((Detail) other);
        return ((((this.celebrities == rhs.celebrities)||((this.celebrities!= null)&&this.celebrities.equals(rhs.celebrities)))&&((this.landmarks == rhs.landmarks)||((this.landmarks!= null)&&this.landmarks.equals(rhs.landmarks))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
