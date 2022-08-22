package org.azure.fn.premium.model.twitter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "place",
        "coordinates",
        "retweeted",
        "in_reply_to_status_id",
        "id_str",
        "truncated",
        "in_reply_to_status_id_str",
        "utils",
        "favorited",
        "in_reply_to_user_id_str",
        "created_at",
        "contributors",
        "in_reply_to_screen_name",
        "user",
        "geo",
        "retweet_count",
        "in_reply_to_user_id",
        "text"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tweet implements Serializable
{

    @JsonProperty("place")
    private Object place;
    @JsonProperty("coordinates")
    private Object coordinates;
    @JsonProperty("retweeted")
    private Boolean retweeted;
    @JsonProperty("in_reply_to_status_id")
    private Object inReplyToStatusId;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("truncated")
    private Boolean truncated;
    @JsonProperty("in_reply_to_status_id_str")
    private Object inReplyToStatusIdStr;
    @JsonProperty("utils")
    private String source;
    @JsonProperty("favorited")
    private Boolean favorited;
    @JsonProperty("in_reply_to_user_id_str")
    private Object inReplyToUserIdStr;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("contributors")
    private Object contributors;
    @JsonProperty("in_reply_to_screen_name")
    private Object inReplyToScreenName;
    @JsonProperty("user")
    private User user;
    @JsonProperty("geo")
    private Object geo;
    @JsonProperty("retweet_count")
    private Object retweetCount;
    @JsonProperty("in_reply_to_user_id")
    private Object inReplyToUserId;
    @JsonProperty("text")
    private String text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4923959153255697025L;

    @JsonProperty("place")
    public Object getPlace() {
        return place;
    }

    @JsonProperty("place")
    public void setPlace(Object place) {
        this.place = place;
    }

    public Tweet withPlace(Object place) {
        this.place = place;
        return this;
    }

    @JsonProperty("coordinates")
    public Object getCoordinates() {
        return coordinates;
    }

    @JsonProperty("coordinates")
    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    public Tweet withCoordinates(Object coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    @JsonProperty("retweeted")
    public Boolean getRetweeted() {
        return retweeted;
    }

    @JsonProperty("retweeted")
    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    public Tweet withRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
        return this;
    }

    @JsonProperty("in_reply_to_status_id")
    public Object getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    @JsonProperty("in_reply_to_status_id")
    public void setInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    public Tweet withInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
        return this;
    }

    @JsonProperty("id_str")
    public String getIdStr() {
        return idStr;
    }

    @JsonProperty("id_str")
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public Tweet withIdStr(String idStr) {
        this.idStr = idStr;
        return this;
    }

    @JsonProperty("truncated")
    public Boolean getTruncated() {
        return truncated;
    }

    @JsonProperty("truncated")
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    public Tweet withTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    @JsonProperty("in_reply_to_status_id_str")
    public Object getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    @JsonProperty("in_reply_to_status_id_str")
    public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    public Tweet withInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
        return this;
    }

    @JsonProperty("utils")
    public String getSource() {
        return source;
    }

    @JsonProperty("utils")
    public void setSource(String source) {
        this.source = source;
    }

    public Tweet withSource(String source) {
        this.source = source;
        return this;
    }

    @JsonProperty("favorited")
    public Boolean getFavorited() {
        return favorited;
    }

    @JsonProperty("favorited")
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    public Tweet withFavorited(Boolean favorited) {
        this.favorited = favorited;
        return this;
    }

    @JsonProperty("in_reply_to_user_id_str")
    public Object getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    @JsonProperty("in_reply_to_user_id_str")
    public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    public Tweet withInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
        return this;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Tweet withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("contributors")
    public Object getContributors() {
        return contributors;
    }

    @JsonProperty("contributors")
    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    public Tweet withContributors(Object contributors) {
        this.contributors = contributors;
        return this;
    }

    @JsonProperty("in_reply_to_screen_name")
    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    @JsonProperty("in_reply_to_screen_name")
    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    public Tweet withInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
        return this;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    public Tweet withUser(User user) {
        this.user = user;
        return this;
    }

    @JsonProperty("geo")
    public Object getGeo() {
        return geo;
    }

    @JsonProperty("geo")
    public void setGeo(Object geo) {
        this.geo = geo;
    }

    public Tweet withGeo(Object geo) {
        this.geo = geo;
        return this;
    }

    @JsonProperty("retweet_count")
    public Object getRetweetCount() {
        return retweetCount;
    }

    @JsonProperty("retweet_count")
    public void setRetweetCount(Object retweetCount) {
        this.retweetCount = retweetCount;
    }

    public Tweet withRetweetCount(Object retweetCount) {
        this.retweetCount = retweetCount;
        return this;
    }

    @JsonProperty("in_reply_to_user_id")
    public Object getInReplyToUserId() {
        return inReplyToUserId;
    }

    @JsonProperty("in_reply_to_user_id")
    public void setInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    public Tweet withInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
        return this;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public Tweet withText(String text) {
        this.text = text;
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

    public Tweet withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tweet.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("place");
        sb.append('=');
        sb.append(((this.place == null)?"<null>":this.place));
        sb.append(',');
        sb.append("coordinates");
        sb.append('=');
        sb.append(((this.coordinates == null)?"<null>":this.coordinates));
        sb.append(',');
        sb.append("retweeted");
        sb.append('=');
        sb.append(((this.retweeted == null)?"<null>":this.retweeted));
        sb.append(',');
        sb.append("inReplyToStatusId");
        sb.append('=');
        sb.append(((this.inReplyToStatusId == null)?"<null>":this.inReplyToStatusId));
        sb.append(',');
        sb.append("idStr");
        sb.append('=');
        sb.append(((this.idStr == null)?"<null>":this.idStr));
        sb.append(',');
        sb.append("truncated");
        sb.append('=');
        sb.append(((this.truncated == null)?"<null>":this.truncated));
        sb.append(',');
        sb.append("inReplyToStatusIdStr");
        sb.append('=');
        sb.append(((this.inReplyToStatusIdStr == null)?"<null>":this.inReplyToStatusIdStr));
        sb.append(',');
        sb.append("utils");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("favorited");
        sb.append('=');
        sb.append(((this.favorited == null)?"<null>":this.favorited));
        sb.append(',');
        sb.append("inReplyToUserIdStr");
        sb.append('=');
        sb.append(((this.inReplyToUserIdStr == null)?"<null>":this.inReplyToUserIdStr));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("contributors");
        sb.append('=');
        sb.append(((this.contributors == null)?"<null>":this.contributors));
        sb.append(',');
        sb.append("inReplyToScreenName");
        sb.append('=');
        sb.append(((this.inReplyToScreenName == null)?"<null>":this.inReplyToScreenName));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("geo");
        sb.append('=');
        sb.append(((this.geo == null)?"<null>":this.geo));
        sb.append(',');
        sb.append("retweetCount");
        sb.append('=');
        sb.append(((this.retweetCount == null)?"<null>":this.retweetCount));
        sb.append(',');
        sb.append("inReplyToUserId");
        sb.append('=');
        sb.append(((this.inReplyToUserId == null)?"<null>":this.inReplyToUserId));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
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
        result = ((result* 31)+((this.idStr == null)? 0 :this.idStr.hashCode()));
        result = ((result* 31)+((this.inReplyToUserId == null)? 0 :this.inReplyToUserId.hashCode()));
        result = ((result* 31)+((this.coordinates == null)? 0 :this.coordinates.hashCode()));
        result = ((result* 31)+((this.truncated == null)? 0 :this.truncated.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.retweeted == null)? 0 :this.retweeted.hashCode()));
        result = ((result* 31)+((this.geo == null)? 0 :this.geo.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.inReplyToScreenName == null)? 0 :this.inReplyToScreenName.hashCode()));
        result = ((result* 31)+((this.inReplyToStatusId == null)? 0 :this.inReplyToStatusId.hashCode()));
        result = ((result* 31)+((this.inReplyToStatusIdStr == null)? 0 :this.inReplyToStatusIdStr.hashCode()));
        result = ((result* 31)+((this.place == null)? 0 :this.place.hashCode()));
        result = ((result* 31)+((this.contributors == null)? 0 :this.contributors.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.inReplyToUserIdStr == null)? 0 :this.inReplyToUserIdStr.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.retweetCount == null)? 0 :this.retweetCount.hashCode()));
        result = ((result* 31)+((this.favorited == null)? 0 :this.favorited.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tweet) == false) {
            return false;
        }
        Tweet rhs = ((Tweet) other);
        return (((((((((((((((((((((this.idStr == rhs.idStr)||((this.idStr!= null)&&this.idStr.equals(rhs.idStr)))&&((this.inReplyToUserId == rhs.inReplyToUserId)||((this.inReplyToUserId!= null)&&this.inReplyToUserId.equals(rhs.inReplyToUserId))))&&((this.coordinates == rhs.coordinates)||((this.coordinates!= null)&&this.coordinates.equals(rhs.coordinates))))&&((this.truncated == rhs.truncated)||((this.truncated!= null)&&this.truncated.equals(rhs.truncated))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.retweeted == rhs.retweeted)||((this.retweeted!= null)&&this.retweeted.equals(rhs.retweeted))))&&((this.geo == rhs.geo)||((this.geo!= null)&&this.geo.equals(rhs.geo))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.inReplyToScreenName == rhs.inReplyToScreenName)||((this.inReplyToScreenName!= null)&&this.inReplyToScreenName.equals(rhs.inReplyToScreenName))))&&((this.inReplyToStatusId == rhs.inReplyToStatusId)||((this.inReplyToStatusId!= null)&&this.inReplyToStatusId.equals(rhs.inReplyToStatusId))))&&((this.inReplyToStatusIdStr == rhs.inReplyToStatusIdStr)||((this.inReplyToStatusIdStr!= null)&&this.inReplyToStatusIdStr.equals(rhs.inReplyToStatusIdStr))))&&((this.place == rhs.place)||((this.place!= null)&&this.place.equals(rhs.place))))&&((this.contributors == rhs.contributors)||((this.contributors!= null)&&this.contributors.equals(rhs.contributors))))&&(((this.idStr!= null)&&this.idStr.equals(rhs.idStr))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.inReplyToUserIdStr == rhs.inReplyToUserIdStr)||((this.inReplyToUserIdStr!= null)&&this.inReplyToUserIdStr.equals(rhs.inReplyToUserIdStr))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.retweetCount == rhs.retweetCount)||((this.retweetCount!= null)&&this.retweetCount.equals(rhs.retweetCount))))&&((this.favorited == rhs.favorited)||((this.favorited!= null)&&this.favorited.equals(rhs.favorited))));
    }

}
