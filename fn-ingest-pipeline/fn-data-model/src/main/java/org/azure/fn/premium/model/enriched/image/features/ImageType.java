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
        "clipArtType",
        "lineDrawingType"
})
public class ImageType implements Serializable
{

    @JsonProperty("clipArtType")
    private Integer clipArtType;
    @JsonProperty("lineDrawingType")
    private Integer lineDrawingType;
    @JsonIgnore
    private Map<String, java.lang.Object> additionalProperties = new HashMap<String, java.lang.Object>();
    private final static long serialVersionUID = -1629186533685753014L;

    @JsonProperty("clipArtType")
    public Integer getClipArtType() {
        return clipArtType;
    }

    @JsonProperty("clipArtType")
    public void setClipArtType(Integer clipArtType) {
        this.clipArtType = clipArtType;
    }

    public ImageType withClipArtType(Integer clipArtType) {
        this.clipArtType = clipArtType;
        return this;
    }

    @JsonProperty("lineDrawingType")
    public Integer getLineDrawingType() {
        return lineDrawingType;
    }

    @JsonProperty("lineDrawingType")
    public void setLineDrawingType(Integer lineDrawingType) {
        this.lineDrawingType = lineDrawingType;
    }

    public ImageType withLineDrawingType(Integer lineDrawingType) {
        this.lineDrawingType = lineDrawingType;
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

    public ImageType withAdditionalProperty(String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ImageType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("clipArtType");
        sb.append('=');
        sb.append(((this.clipArtType == null)?"<null>":this.clipArtType));
        sb.append(',');
        sb.append("lineDrawingType");
        sb.append('=');
        sb.append(((this.lineDrawingType == null)?"<null>":this.lineDrawingType));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lineDrawingType == null)? 0 :this.lineDrawingType.hashCode()));
        result = ((result* 31)+((this.clipArtType == null)? 0 :this.clipArtType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImageType) == false) {
            return false;
        }
        ImageType rhs = ((ImageType) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.lineDrawingType == rhs.lineDrawingType)||((this.lineDrawingType!= null)&&this.lineDrawingType.equals(rhs.lineDrawingType))))&&((this.clipArtType == rhs.clipArtType)||((this.clipArtType!= null)&&this.clipArtType.equals(rhs.clipArtType))));
    }

}
