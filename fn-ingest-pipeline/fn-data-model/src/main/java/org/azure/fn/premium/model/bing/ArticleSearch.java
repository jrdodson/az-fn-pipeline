package org.azure.fn.premium.model.bing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.azure.fn.premium.model.bing.features.QueryContext;
import org.azure.fn.premium.model.bing.features.Sort;
import org.azure.fn.premium.model.bing.features.Value;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "_type",
        "readLink",
        "queryContext",
        "totalEstimatedMatches",
        "sort",
        "value"
})
public class ArticleSearch {

    @JsonProperty("_type")
    private String type;
    @JsonProperty("readLink")
    private String readLink;
    @JsonProperty("queryContext")
    private QueryContext queryContext;
    @JsonProperty("totalEstimatedMatches")
    private Integer totalEstimatedMatches;
    @JsonProperty("sort")
    private List<Sort> sort = null;
    @JsonProperty("value")
    private List<Value> value = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_type")
    public String getType() {
        return type;
    }

    @JsonProperty("_type")
    public void setType(String type) {
        this.type = type;
    }

    public ArticleSearch withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("readLink")
    public String getReadLink() {
        return readLink;
    }

    @JsonProperty("readLink")
    public void setReadLink(String readLink) {
        this.readLink = readLink;
    }

    public ArticleSearch withReadLink(String readLink) {
        this.readLink = readLink;
        return this;
    }

    @JsonProperty("queryContext")
    public QueryContext getQueryContext() {
        return queryContext;
    }

    @JsonProperty("queryContext")
    public void setQueryContext(QueryContext queryContext) {
        this.queryContext = queryContext;
    }

    public ArticleSearch withQueryContext(QueryContext queryContext) {
        this.queryContext = queryContext;
        return this;
    }

    @JsonProperty("totalEstimatedMatches")
    public Integer getTotalEstimatedMatches() {
        return totalEstimatedMatches;
    }

    @JsonProperty("totalEstimatedMatches")
    public void setTotalEstimatedMatches(Integer totalEstimatedMatches) {
        this.totalEstimatedMatches = totalEstimatedMatches;
    }

    public ArticleSearch withTotalEstimatedMatches(Integer totalEstimatedMatches) {
        this.totalEstimatedMatches = totalEstimatedMatches;
        return this;
    }

    @JsonProperty("sort")
    public List<Sort> getSort() {
        return sort;
    }

    @JsonProperty("sort")
    public void setSort(List<Sort> sort) {
        this.sort = sort;
    }

    public ArticleSearch withSort(List<Sort> sort) {
        this.sort = sort;
        return this;
    }

    @JsonProperty("value")
    public List<Value> getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(List<Value> value) {
        this.value = value;
    }

    public ArticleSearch withValue(List<Value> value) {
        this.value = value;
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

    public ArticleSearch withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ArticleSearch.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("readLink");
        sb.append('=');
        sb.append(((this.readLink == null)?"<null>":this.readLink));
        sb.append(',');
        sb.append("queryContext");
        sb.append('=');
        sb.append(((this.queryContext == null)?"<null>":this.queryContext));
        sb.append(',');
        sb.append("totalEstimatedMatches");
        sb.append('=');
        sb.append(((this.totalEstimatedMatches == null)?"<null>":this.totalEstimatedMatches));
        sb.append(',');
        sb.append("sort");
        sb.append('=');
        sb.append(((this.sort == null)?"<null>":this.sort));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
        result = ((result* 31)+((this.readLink == null)? 0 :this.readLink.hashCode()));
        result = ((result* 31)+((this.totalEstimatedMatches == null)? 0 :this.totalEstimatedMatches.hashCode()));
        result = ((result* 31)+((this.queryContext == null)? 0 :this.queryContext.hashCode()));
        result = ((result* 31)+((this.sort == null)? 0 :this.sort.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ArticleSearch) == false) {
            return false;
        }
        ArticleSearch rhs = ((ArticleSearch) other);
        return ((((((((this.readLink == rhs.readLink)||((this.readLink!= null)&&this.readLink.equals(rhs.readLink)))&&((this.totalEstimatedMatches == rhs.totalEstimatedMatches)||((this.totalEstimatedMatches!= null)&&this.totalEstimatedMatches.equals(rhs.totalEstimatedMatches))))&&((this.queryContext == rhs.queryContext)||((this.queryContext!= null)&&this.queryContext.equals(rhs.queryContext))))&&((this.sort == rhs.sort)||((this.sort!= null)&&this.sort.equals(rhs.sort))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
