package org.azure.fn.premium.model.bing.features;

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
        "contentUrl",
        "width",
        "height"
})
public class Thumbnail {

    @JsonProperty("contentUrl")
    private String contentUrl;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("contentUrl")
    public String getContentUrl() {
        return contentUrl;
    }

    @JsonProperty("contentUrl")
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public Thumbnail withContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
        return this;
    }

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    public Thumbnail withWidth(Integer width) {
        this.width = width;
        return this;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    public Thumbnail withHeight(Integer height) {
        this.height = height;
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

    public Thumbnail withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Thumbnail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("contentUrl");
        sb.append('=');
        sb.append(((this.contentUrl == null)?"<null>":this.contentUrl));
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null)?"<null>":this.width));
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null)?"<null>":this.height));
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
        result = ((result* 31)+((this.width == null)? 0 :this.width.hashCode()));
        result = ((result* 31)+((this.contentUrl == null)? 0 :this.contentUrl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Thumbnail) == false) {
            return false;
        }
        Thumbnail rhs = ((Thumbnail) other);
        return (((((this.width == rhs.width)||((this.width!= null)&&this.width.equals(rhs.width)))&&((this.contentUrl == rhs.contentUrl)||((this.contentUrl!= null)&&this.contentUrl.equals(rhs.contentUrl))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
    }

}