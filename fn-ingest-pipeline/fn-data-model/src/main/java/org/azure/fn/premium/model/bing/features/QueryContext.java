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
        "originalQuery",
        "adultIntent"
})
public class QueryContext {

    @JsonProperty("originalQuery")
    private String originalQuery;
    @JsonProperty("adultIntent")
    private Boolean adultIntent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("originalQuery")
    public String getOriginalQuery() {
        return originalQuery;
    }

    @JsonProperty("originalQuery")
    public void setOriginalQuery(String originalQuery) {
        this.originalQuery = originalQuery;
    }

    public QueryContext withOriginalQuery(String originalQuery) {
        this.originalQuery = originalQuery;
        return this;
    }

    @JsonProperty("adultIntent")
    public Boolean getAdultIntent() {
        return adultIntent;
    }

    @JsonProperty("adultIntent")
    public void setAdultIntent(Boolean adultIntent) {
        this.adultIntent = adultIntent;
    }

    public QueryContext withAdultIntent(Boolean adultIntent) {
        this.adultIntent = adultIntent;
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

    public QueryContext withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QueryContext.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("originalQuery");
        sb.append('=');
        sb.append(((this.originalQuery == null)?"<null>":this.originalQuery));
        sb.append(',');
        sb.append("adultIntent");
        sb.append('=');
        sb.append(((this.adultIntent == null)?"<null>":this.adultIntent));
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
        result = ((result* 31)+((this.adultIntent == null)? 0 :this.adultIntent.hashCode()));
        result = ((result* 31)+((this.originalQuery == null)? 0 :this.originalQuery.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QueryContext) == false) {
            return false;
        }
        QueryContext rhs = ((QueryContext) other);
        return ((((this.adultIntent == rhs.adultIntent)||((this.adultIntent!= null)&&this.adultIntent.equals(rhs.adultIntent)))&&((this.originalQuery == rhs.originalQuery)||((this.originalQuery!= null)&&this.originalQuery.equals(rhs.originalQuery))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}