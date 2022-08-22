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
        "name",
        "iso_6391_name",
        "language_confidence"
})
public class Language implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("iso_6391_name")
    private String iso6391Name;
    @JsonProperty("language_confidence")
    private Double languageConfidence;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4869464517303692668L;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Language withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("iso_6391_name")
    public String getIso6391Name() {
        return iso6391Name;
    }

    @JsonProperty("iso_6391_name")
    public void setIso6391Name(String iso6391Name) {
        this.iso6391Name = iso6391Name;
    }

    public Language withIso6391Name(String iso6391Name) {
        this.iso6391Name = iso6391Name;
        return this;
    }

    @JsonProperty("language_confidence")
    public Double getLanguageConfidence() {
        return languageConfidence;
    }

    @JsonProperty("language_confidence")
    public void setLanguageConfidence(Double languageConfidence) {
        this.languageConfidence = languageConfidence;
    }

    public Language withLanguageConfidence(Double languageConfidence) {
        this.languageConfidence = languageConfidence;
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

    public Language withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Language.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("iso6391Name");
        sb.append('=');
        sb.append(((this.iso6391Name == null)?"<null>":this.iso6391Name));
        sb.append(',');
        sb.append("languageConfidence");
        sb.append('=');
        sb.append(((this.languageConfidence == null)?"<null>":this.languageConfidence));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.languageConfidence == null)? 0 :this.languageConfidence.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.iso6391Name == null)? 0 :this.iso6391Name.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Language) == false) {
            return false;
        }
        Language rhs = ((Language) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.languageConfidence == rhs.languageConfidence)||((this.languageConfidence!= null)&&this.languageConfidence.equals(rhs.languageConfidence))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.iso6391Name == rhs.iso6391Name)||((this.iso6391Name!= null)&&this.iso6391Name.equals(rhs.iso6391Name))));
    }

}
