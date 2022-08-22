package org.azure.fn.premium.model.enriched.text.features;

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
        "id",
        "parent_id",
        "sequence",
        "language",
        "key_phrases",
        "polarity",
        "entities"
})
public class Sequence implements Serializable
{

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("parent_id")
    private Integer parentId;
    @JsonProperty("sequence")
    private String sequence;
    @JsonProperty("language")
    private Language language;
    @JsonProperty("key_phrases")
    private List<String> keyPhrases = new ArrayList<String>();
    @JsonProperty("polarity")
    private Polarity polarity;
    @JsonProperty("entities")
    private List<Entity> entities = new ArrayList<Entity>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4600616212249831687L;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Sequence withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("parent_id")
    public Integer getParentId() {
        return parentId;
    }

    @JsonProperty("parent_id")
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Sequence withParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    @JsonProperty("sequence")
    public String getSequence() {
        return sequence;
    }

    @JsonProperty("sequence")
    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public Sequence withSequence(String sequence) {
        this.sequence = sequence;
        return this;
    }

    @JsonProperty("language")
    public Language getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(Language language) {
        this.language = language;
    }

    public Sequence withLanguage(Language language) {
        this.language = language;
        return this;
    }

    @JsonProperty("key_phrases")
    public List<String> getKeyPhrases() {
        return keyPhrases;
    }

    @JsonProperty("key_phrases")
    public void setKeyPhrases(List<String> keyPhrases) {
        this.keyPhrases = keyPhrases;
    }

    public Sequence withKeyPhrases(List<String> keyPhrases) {
        this.keyPhrases = keyPhrases;
        return this;
    }

    @JsonProperty("polarity")
    public Polarity getPolarity() {
        return polarity;
    }

    @JsonProperty("polarity")
    public void setPolarity(Polarity polarity) {
        this.polarity = polarity;
    }

    public Sequence withPolarity(Polarity polarity) {
        this.polarity = polarity;
        return this;
    }

    @JsonProperty("entities")
    public List<Entity> getEntities() {
        return entities;
    }

    @JsonProperty("entities")
    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public Sequence withEntities(List<Entity> entities) {
        this.entities = entities;
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

    public Sequence withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sequence.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("parentId");
        sb.append('=');
        sb.append(((this.parentId == null)?"<null>":this.parentId));
        sb.append(',');
        sb.append("sequence");
        sb.append('=');
        sb.append(((this.sequence == null)?"<null>":this.sequence));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("keyPhrases");
        sb.append('=');
        sb.append(((this.keyPhrases == null)?"<null>":this.keyPhrases));
        sb.append(',');
        sb.append("polarity");
        sb.append('=');
        sb.append(((this.polarity == null)?"<null>":this.polarity));
        sb.append(',');
        sb.append("entities");
        sb.append('=');
        sb.append(((this.entities == null)?"<null>":this.entities));
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
        result = ((result* 31)+((this.sequence == null)? 0 :this.sequence.hashCode()));
        result = ((result* 31)+((this.keyPhrases == null)? 0 :this.keyPhrases.hashCode()));
        result = ((result* 31)+((this.entities == null)? 0 :this.entities.hashCode()));
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.parentId == null)? 0 :this.parentId.hashCode()));
        result = ((result* 31)+((this.polarity == null)? 0 :this.polarity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sequence) == false) {
            return false;
        }
        Sequence rhs = ((Sequence) other);
        return (((((((((this.sequence == rhs.sequence)||((this.sequence!= null)&&this.sequence.equals(rhs.sequence)))&&((this.keyPhrases == rhs.keyPhrases)||((this.keyPhrases!= null)&&this.keyPhrases.equals(rhs.keyPhrases))))&&((this.entities == rhs.entities)||((this.entities!= null)&&this.entities.equals(rhs.entities))))&&((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.parentId == rhs.parentId)||((this.parentId!= null)&&this.parentId.equals(rhs.parentId))))&&((this.polarity == rhs.polarity)||((this.polarity!= null)&&this.polarity.equals(rhs.polarity))));
    }

}
