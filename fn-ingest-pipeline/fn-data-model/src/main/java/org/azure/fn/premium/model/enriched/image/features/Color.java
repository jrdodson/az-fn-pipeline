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
        "dominantColorForeground",
        "dominantColorBackground",
        "dominantColors",
        "accentColor",
        "isBWImg"
})
public class Color implements Serializable
{

    @JsonProperty("dominantColorForeground")
    private String dominantColorForeground;
    @JsonProperty("dominantColorBackground")
    private String dominantColorBackground;
    @JsonProperty("dominantColors")
    private List<String> dominantColors = new ArrayList<String>();
    @JsonProperty("accentColor")
    private String accentColor;
    @JsonProperty("isBWImg")
    private Boolean isBWImg;
    @JsonIgnore
    private Map<String, java.lang.Object> additionalProperties = new HashMap<String, java.lang.Object>();
    private final static long serialVersionUID = 5503447632990656827L;

    @JsonProperty("dominantColorForeground")
    public String getDominantColorForeground() {
        return dominantColorForeground;
    }

    @JsonProperty("dominantColorForeground")
    public void setDominantColorForeground(String dominantColorForeground) {
        this.dominantColorForeground = dominantColorForeground;
    }

    public Color withDominantColorForeground(String dominantColorForeground) {
        this.dominantColorForeground = dominantColorForeground;
        return this;
    }

    @JsonProperty("dominantColorBackground")
    public String getDominantColorBackground() {
        return dominantColorBackground;
    }

    @JsonProperty("dominantColorBackground")
    public void setDominantColorBackground(String dominantColorBackground) {
        this.dominantColorBackground = dominantColorBackground;
    }

    public Color withDominantColorBackground(String dominantColorBackground) {
        this.dominantColorBackground = dominantColorBackground;
        return this;
    }

    @JsonProperty("dominantColors")
    public List<String> getDominantColors() {
        return dominantColors;
    }

    @JsonProperty("dominantColors")
    public void setDominantColors(List<String> dominantColors) {
        this.dominantColors = dominantColors;
    }

    public Color withDominantColors(List<String> dominantColors) {
        this.dominantColors = dominantColors;
        return this;
    }

    @JsonProperty("accentColor")
    public String getAccentColor() {
        return accentColor;
    }

    @JsonProperty("accentColor")
    public void setAccentColor(String accentColor) {
        this.accentColor = accentColor;
    }

    public Color withAccentColor(String accentColor) {
        this.accentColor = accentColor;
        return this;
    }

    @JsonProperty("isBWImg")
    public Boolean getIsBWImg() {
        return isBWImg;
    }

    @JsonProperty("isBWImg")
    public void setIsBWImg(Boolean isBWImg) {
        this.isBWImg = isBWImg;
    }

    public Color withIsBWImg(Boolean isBWImg) {
        this.isBWImg = isBWImg;
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

    public Color withAdditionalProperty(String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Color.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dominantColorForeground");
        sb.append('=');
        sb.append(((this.dominantColorForeground == null)?"<null>":this.dominantColorForeground));
        sb.append(',');
        sb.append("dominantColorBackground");
        sb.append('=');
        sb.append(((this.dominantColorBackground == null)?"<null>":this.dominantColorBackground));
        sb.append(',');
        sb.append("dominantColors");
        sb.append('=');
        sb.append(((this.dominantColors == null)?"<null>":this.dominantColors));
        sb.append(',');
        sb.append("accentColor");
        sb.append('=');
        sb.append(((this.accentColor == null)?"<null>":this.accentColor));
        sb.append(',');
        sb.append("isBWImg");
        sb.append('=');
        sb.append(((this.isBWImg == null)?"<null>":this.isBWImg));
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
        result = ((result* 31)+((this.dominantColorForeground == null)? 0 :this.dominantColorForeground.hashCode()));
        result = ((result* 31)+((this.isBWImg == null)? 0 :this.isBWImg.hashCode()));
        result = ((result* 31)+((this.accentColor == null)? 0 :this.accentColor.hashCode()));
        result = ((result* 31)+((this.dominantColorBackground == null)? 0 :this.dominantColorBackground.hashCode()));
        result = ((result* 31)+((this.dominantColors == null)? 0 :this.dominantColors.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Color) == false) {
            return false;
        }
        Color rhs = ((Color) other);
        return (((((((this.dominantColorForeground == rhs.dominantColorForeground)||((this.dominantColorForeground!= null)&&this.dominantColorForeground.equals(rhs.dominantColorForeground)))&&((this.isBWImg == rhs.isBWImg)||((this.isBWImg!= null)&&this.isBWImg.equals(rhs.isBWImg))))&&((this.accentColor == rhs.accentColor)||((this.accentColor!= null)&&this.accentColor.equals(rhs.accentColor))))&&((this.dominantColorBackground == rhs.dominantColorBackground)||((this.dominantColorBackground!= null)&&this.dominantColorBackground.equals(rhs.dominantColorBackground))))&&((this.dominantColors == rhs.dominantColors)||((this.dominantColors!= null)&&this.dominantColors.equals(rhs.dominantColors))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
