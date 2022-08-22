package org.azure.fn.premium.model.enriched.image;

import java.io.Serializable;
import java.lang.Object;
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
import org.azure.fn.premium.model.enriched.image.features.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "categories",
        "adult",
        "tags",
        "description",
        "requestId",
        "metadata",
        "faces",
        "color",
        "imageType",
        "objects"
})
public class EnrichedImageContent implements Serializable
{

    @JsonProperty("categories")
    private List<Category> categories = new ArrayList<Category>();
    @JsonProperty("adult")
    private Adult adult;
    @JsonProperty("tags")
    private List<Tag> tags = new ArrayList<Tag>();
    @JsonProperty("description")
    private Description description;
    @JsonProperty("requestId")
    private String requestId;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("faces")
    private List<Face> faces = new ArrayList<Face>();
    @JsonProperty("color")
    private Color color;
    @JsonProperty("imageType")
    private ImageType imageType;
    @JsonProperty("objects")
    private List<Object> objects = new ArrayList<>();
    @JsonIgnore
    private Map<String, java.lang.Object> additionalProperties = new HashMap<String, java.lang.Object>();
    private final static long serialVersionUID = 8466973479237743488L;

    @JsonProperty("categories")
    public List<Category> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public EnrichedImageContent withCategories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    @JsonProperty("adult")
    public Adult getAdult() {
        return adult;
    }

    @JsonProperty("adult")
    public void setAdult(Adult adult) {
        this.adult = adult;
    }

    public EnrichedImageContent withAdult(Adult adult) {
        this.adult = adult;
        return this;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public EnrichedImageContent withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("description")
    public Description getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Description description) {
        this.description = description;
    }

    public EnrichedImageContent withDescription(Description description) {
        this.description = description;
        return this;
    }

    @JsonProperty("requestId")
    public String getRequestId() {
        return requestId;
    }

    @JsonProperty("requestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public EnrichedImageContent withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public EnrichedImageContent withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    @JsonProperty("faces")
    public List<Face> getFaces() {
        return faces;
    }

    @JsonProperty("faces")
    public void setFaces(List<Face> faces) {
        this.faces = faces;
    }

    public EnrichedImageContent withFaces(List<Face> faces) {
        this.faces = faces;
        return this;
    }

    @JsonProperty("color")
    public Color getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(Color color) {
        this.color = color;
    }

    public EnrichedImageContent withColor(Color color) {
        this.color = color;
        return this;
    }

    @JsonProperty("imageType")
    public ImageType getImageType() {
        return imageType;
    }

    @JsonProperty("imageType")
    public void setImageType(ImageType imageType) {
        this.imageType = imageType;
    }

    public EnrichedImageContent withImageType(ImageType imageType) {
        this.imageType = imageType;
        return this;
    }

    @JsonProperty("objects")
    public List<Object> getObjects() {
        return objects;
    }

    @JsonProperty("objects")
    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }

    public EnrichedImageContent withObjects(List<Object> objects) {
        this.objects = objects;
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

    public EnrichedImageContent withAdditionalProperty(String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnrichedImageContent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("categories");
        sb.append('=');
        sb.append(((this.categories == null)?"<null>":this.categories));
        sb.append(',');
        sb.append("adult");
        sb.append('=');
        sb.append(((this.adult == null)?"<null>":this.adult));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("requestId");
        sb.append('=');
        sb.append(((this.requestId == null)?"<null>":this.requestId));
        sb.append(',');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("faces");
        sb.append('=');
        sb.append(((this.faces == null)?"<null>":this.faces));
        sb.append(',');
        sb.append("color");
        sb.append('=');
        sb.append(((this.color == null)?"<null>":this.color));
        sb.append(',');
        sb.append("imageType");
        sb.append('=');
        sb.append(((this.imageType == null)?"<null>":this.imageType));
        sb.append(',');
        sb.append("objects");
        sb.append('=');
        sb.append(((this.objects == null)?"<null>":this.objects));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.color == null)? 0 :this.color.hashCode()));
        result = ((result* 31)+((this.requestId == null)? 0 :this.requestId.hashCode()));
        result = ((result* 31)+((this.objects == null)? 0 :this.objects.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.categories == null)? 0 :this.categories.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.adult == null)? 0 :this.adult.hashCode()));
        result = ((result* 31)+((this.faces == null)? 0 :this.faces.hashCode()));
        result = ((result* 31)+((this.imageType == null)? 0 :this.imageType.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnrichedImageContent) == false) {
            return false;
        }
        EnrichedImageContent rhs = ((EnrichedImageContent) other);
        return ((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.color == rhs.color)||((this.color!= null)&&this.color.equals(rhs.color))))&&((this.requestId == rhs.requestId)||((this.requestId!= null)&&this.requestId.equals(rhs.requestId))))&&((this.objects == rhs.objects)||((this.objects!= null)&&this.objects.equals(rhs.objects))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.categories == rhs.categories)||((this.categories!= null)&&this.categories.equals(rhs.categories))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.adult == rhs.adult)||((this.adult!= null)&&this.adult.equals(rhs.adult))))&&((this.faces == rhs.faces)||((this.faces!= null)&&this.faces.equals(rhs.faces))))&&((this.imageType == rhs.imageType)||((this.imageType!= null)&&this.imageType.equals(rhs.imageType))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
