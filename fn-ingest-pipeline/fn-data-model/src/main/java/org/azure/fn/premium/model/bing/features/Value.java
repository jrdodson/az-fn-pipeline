package org.azure.fn.premium.model.bing.features;

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
        "name",
        "url",
        "image",
        "description",
        "about",
        "mentions",
        "provider",
        "datePublished",
        "category"
})
public class Value {

    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
    @JsonProperty("image")
    private Image image;
    @JsonProperty("description")
    private String description;
    @JsonProperty("about")
    private List<About> about = null;
    @JsonProperty("mentions")
    private List<Mention> mentions = null;
    @JsonProperty("provider")
    private List<Provider> provider = null;
    @JsonProperty("datePublished")
    private String datePublished;
    @JsonProperty("category")
    private String category;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Value withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Value withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("image")
    public Image getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Image image) {
        this.image = image;
    }

    public Value withImage(Image image) {
        this.image = image;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Value withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("about")
    public List<About> getAbout() {
        return about;
    }

    @JsonProperty("about")
    public void setAbout(List<About> about) {
        this.about = about;
    }

    public Value withAbout(List<About> about) {
        this.about = about;
        return this;
    }

    @JsonProperty("mentions")
    public List<Mention> getMentions() {
        return mentions;
    }

    @JsonProperty("mentions")
    public void setMentions(List<Mention> mentions) {
        this.mentions = mentions;
    }

    public Value withMentions(List<Mention> mentions) {
        this.mentions = mentions;
        return this;
    }

    @JsonProperty("provider")
    public List<Provider> getProvider() {
        return provider;
    }

    @JsonProperty("provider")
    public void setProvider(List<Provider> provider) {
        this.provider = provider;
    }

    public Value withProvider(List<Provider> provider) {
        this.provider = provider;
        return this;
    }

    @JsonProperty("datePublished")
    public String getDatePublished() {
        return datePublished;
    }

    @JsonProperty("datePublished")
    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public Value withDatePublished(String datePublished) {
        this.datePublished = datePublished;
        return this;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    public Value withCategory(String category) {
        this.category = category;
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

    public Value withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Value.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null) ? "<null>" : this.url));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null) ? "<null>" : this.image));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null) ? "<null>" : this.description));
        sb.append(',');
        sb.append("about");
        sb.append('=');
        sb.append(((this.about == null) ? "<null>" : this.about));
        sb.append(',');
        sb.append("mentions");
        sb.append('=');
        sb.append(((this.mentions == null) ? "<null>" : this.mentions));
        sb.append(',');
        sb.append("provider");
        sb.append('=');
        sb.append(((this.provider == null) ? "<null>" : this.provider));
        sb.append(',');
        sb.append("datePublished");
        sb.append('=');
        sb.append(((this.datePublished == null) ? "<null>" : this.datePublished));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null) ? "<null>" : this.category));
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
        result = ((result * 31) + ((this.datePublished == null) ? 0 : this.datePublished.hashCode()));
        result = ((result * 31) + ((this.image == null) ? 0 : this.image.hashCode()));
        result = ((result * 31) + ((this.provider == null) ? 0 : this.provider.hashCode()));
        result = ((result * 31) + ((this.mentions == null) ? 0 : this.mentions.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.about == null) ? 0 : this.about.hashCode()));
        result = ((result * 31) + ((this.description == null) ? 0 : this.description.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.category == null) ? 0 : this.category.hashCode()));
        result = ((result * 31) + ((this.url == null) ? 0 : this.url.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Value) == false) {
            return false;
        }
        Value rhs = ((Value) other);
        return (((((((((((this.datePublished == rhs.datePublished) || ((this.datePublished != null) && this.datePublished.equals(rhs.datePublished))) && ((this.image == rhs.image) || ((this.image != null) && this.image.equals(rhs.image)))) && ((this.provider == rhs.provider) || ((this.provider != null) && this.provider.equals(rhs.provider)))) && ((this.mentions == rhs.mentions) || ((this.mentions != null) && this.mentions.equals(rhs.mentions)))) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.about == rhs.about) || ((this.about != null) && this.about.equals(rhs.about)))) && ((this.description == rhs.description) || ((this.description != null) && this.description.equals(rhs.description)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.category == rhs.category) || ((this.category != null) && this.category.equals(rhs.category)))) && ((this.url == rhs.url) || ((this.url != null) && this.url.equals(rhs.url))));
    }
}
