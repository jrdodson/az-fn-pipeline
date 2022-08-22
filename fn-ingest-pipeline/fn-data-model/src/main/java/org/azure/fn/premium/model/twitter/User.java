package org.azure.fn.premium.model.twitter;

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
        "profile_background_image_url",
        "profile_link_color",
        "description",
        "screen_name",
        "id_str",
        "listed_count",
        "profile_background_tile",
        "profile_sidebar_fill_color",
        "statuses_count",
        "show_all_inline_media",
        "favourites_count",
        "profile_sidebar_border_color",
        "followers_count",
        "url",
        "contributors_enabled",
        "geo_enabled",
        "lang",
        "time_zone",
        "created_at",
        "location",
        "profile_background_color",
        "protected",
        "friends_count",
        "name",
        "follow_request_sent",
        "following",
        "profile_use_background_image",
        "profile_text_color",
        "profile_image_url",
        "id",
        "verified",
        "notifications",
        "utc_offset"
})
public class User implements Serializable {

    @JsonProperty("profile_background_image_url")
    private String profileBackgroundImageUrl;
    @JsonProperty("profile_link_color")
    private String profileLinkColor;
    @JsonProperty("description")
    private String description;
    @JsonProperty("screen_name")
    private String screenName;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("listed_count")
    private Integer listedCount;
    @JsonProperty("profile_background_tile")
    private Boolean profileBackgroundTile;
    @JsonProperty("profile_sidebar_fill_color")
    private String profileSidebarFillColor;
    @JsonProperty("statuses_count")
    private Integer statusesCount;
    @JsonProperty("show_all_inline_media")
    private Boolean showAllInlineMedia;
    @JsonProperty("favourites_count")
    private Integer favouritesCount;
    @JsonProperty("profile_sidebar_border_color")
    private String profileSidebarBorderColor;
    @JsonProperty("followers_count")
    private Integer followersCount;
    @JsonProperty("url")
    private String url;
    @JsonProperty("contributors_enabled")
    private Boolean contributorsEnabled;
    @JsonProperty("geo_enabled")
    private Boolean geoEnabled;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("time_zone")
    private String timeZone;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("location")
    private String location;
    @JsonProperty("profile_background_color")
    private String profileBackgroundColor;
    @JsonProperty("protected")
    private Boolean _protected;
    @JsonProperty("friends_count")
    private Integer friendsCount;
    @JsonProperty("name")
    private String name;
    @JsonProperty("follow_request_sent")
    private Object followRequestSent;
    @JsonProperty("following")
    private Object following;
    @JsonProperty("profile_use_background_image")
    private Boolean profileUseBackgroundImage;
    @JsonProperty("profile_text_color")
    private String profileTextColor;
    @JsonProperty("profile_image_url")
    private String profileImageUrl;
    @JsonProperty("id")
    @JsonIgnore
    private Integer id;
    @JsonProperty("verified")
    private Boolean verified;
    @JsonProperty("notifications")
    private Object notifications;
    @JsonProperty("utc_offset")
    private Integer utcOffset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4007498482459479080L;

    @JsonProperty("profile_background_image_url")
    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    @JsonProperty("profile_background_image_url")
    public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

    public User withProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
        return this;
    }

    @JsonProperty("profile_link_color")
    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    @JsonProperty("profile_link_color")
    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    public User withProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
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

    public User withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("screen_name")
    public String getScreenName() {
        return screenName;
    }

    @JsonProperty("screen_name")
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public User withScreenName(String screenName) {
        this.screenName = screenName;
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

    public User withIdStr(String idStr) {
        this.idStr = idStr;
        return this;
    }

    @JsonProperty("listed_count")
    public Integer getListedCount() {
        return listedCount;
    }

    @JsonProperty("listed_count")
    public void setListedCount(Integer listedCount) {
        this.listedCount = listedCount;
    }

    public User withListedCount(Integer listedCount) {
        this.listedCount = listedCount;
        return this;
    }

    @JsonProperty("profile_background_tile")
    public Boolean getProfileBackgroundTile() {
        return profileBackgroundTile;
    }

    @JsonProperty("profile_background_tile")
    public void setProfileBackgroundTile(Boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
    }

    public User withProfileBackgroundTile(Boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
        return this;
    }

    @JsonProperty("profile_sidebar_fill_color")
    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    @JsonProperty("profile_sidebar_fill_color")
    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    public User withProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
        return this;
    }

    @JsonProperty("statuses_count")
    public Integer getStatusesCount() {
        return statusesCount;
    }

    @JsonProperty("statuses_count")
    public void setStatusesCount(Integer statusesCount) {
        this.statusesCount = statusesCount;
    }

    public User withStatusesCount(Integer statusesCount) {
        this.statusesCount = statusesCount;
        return this;
    }

    @JsonProperty("show_all_inline_media")
    public Boolean getShowAllInlineMedia() {
        return showAllInlineMedia;
    }

    @JsonProperty("show_all_inline_media")
    public void setShowAllInlineMedia(Boolean showAllInlineMedia) {
        this.showAllInlineMedia = showAllInlineMedia;
    }

    public User withShowAllInlineMedia(Boolean showAllInlineMedia) {
        this.showAllInlineMedia = showAllInlineMedia;
        return this;
    }

    @JsonProperty("favourites_count")
    public Integer getFavouritesCount() {
        return favouritesCount;
    }

    @JsonProperty("favourites_count")
    public void setFavouritesCount(Integer favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    public User withFavouritesCount(Integer favouritesCount) {
        this.favouritesCount = favouritesCount;
        return this;
    }

    @JsonProperty("profile_sidebar_border_color")
    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    @JsonProperty("profile_sidebar_border_color")
    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    public User withProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
        return this;
    }

    @JsonProperty("followers_count")
    public Integer getFollowersCount() {
        return followersCount;
    }

    @JsonProperty("followers_count")
    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    public User withFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
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

    public User withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("contributors_enabled")
    public Boolean getContributorsEnabled() {
        return contributorsEnabled;
    }

    @JsonProperty("contributors_enabled")
    public void setContributorsEnabled(Boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    public User withContributorsEnabled(Boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
        return this;
    }

    @JsonProperty("geo_enabled")
    public Boolean getGeoEnabled() {
        return geoEnabled;
    }

    @JsonProperty("geo_enabled")
    public void setGeoEnabled(Boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    public User withGeoEnabled(Boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
        return this;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    public User withLang(String lang) {
        this.lang = lang;
        return this;
    }

    @JsonProperty("time_zone")
    public String getTimeZone() {
        return timeZone;
    }

    @JsonProperty("time_zone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public User withTimeZone(String timeZone) {
        this.timeZone = timeZone;
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

    public User withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public User withLocation(String location) {
        this.location = location;
        return this;
    }

    @JsonProperty("profile_background_color")
    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    @JsonProperty("profile_background_color")
    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    public User withProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
        return this;
    }

    @JsonProperty("protected")
    public Boolean getProtected() {
        return _protected;
    }

    @JsonProperty("protected")
    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    public User withProtected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }

    @JsonProperty("friends_count")
    public Integer getFriendsCount() {
        return friendsCount;
    }

    @JsonProperty("friends_count")
    public void setFriendsCount(Integer friendsCount) {
        this.friendsCount = friendsCount;
    }

    public User withFriendsCount(Integer friendsCount) {
        this.friendsCount = friendsCount;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public User withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("follow_request_sent")
    public Object getFollowRequestSent() {
        return followRequestSent;
    }

    @JsonProperty("follow_request_sent")
    public void setFollowRequestSent(Object followRequestSent) {
        this.followRequestSent = followRequestSent;
    }

    public User withFollowRequestSent(Object followRequestSent) {
        this.followRequestSent = followRequestSent;
        return this;
    }

    @JsonProperty("following")
    public Object getFollowing() {
        return following;
    }

    @JsonProperty("following")
    public void setFollowing(Object following) {
        this.following = following;
    }

    public User withFollowing(Object following) {
        this.following = following;
        return this;
    }

    @JsonProperty("profile_use_background_image")
    public Boolean getProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    @JsonProperty("profile_use_background_image")
    public void setProfileUseBackgroundImage(Boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    public User withProfileUseBackgroundImage(Boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
        return this;
    }

    @JsonProperty("profile_text_color")
    public String getProfileTextColor() {
        return profileTextColor;
    }

    @JsonProperty("profile_text_color")
    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    public User withProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
        return this;
    }

    @JsonProperty("profile_image_url")
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    @JsonProperty("profile_image_url")
    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public User withProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
        return this;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public User withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public User withVerified(Boolean verified) {
        this.verified = verified;
        return this;
    }

    @JsonProperty("notifications")
    public Object getNotifications() {
        return notifications;
    }

    @JsonProperty("notifications")
    public void setNotifications(Object notifications) {
        this.notifications = notifications;
    }

    public User withNotifications(Object notifications) {
        this.notifications = notifications;
        return this;
    }

    @JsonProperty("utc_offset")
    public Integer getUtcOffset() {
        return utcOffset;
    }

    @JsonProperty("utc_offset")
    public void setUtcOffset(Integer utcOffset) {
        this.utcOffset = utcOffset;
    }

    public User withUtcOffset(Integer utcOffset) {
        this.utcOffset = utcOffset;
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

    public User withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(User.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("profileBackgroundImageUrl");
        sb.append('=');
        sb.append(((this.profileBackgroundImageUrl == null) ? "<null>" : this.profileBackgroundImageUrl));
        sb.append(',');
        sb.append("profileLinkColor");
        sb.append('=');
        sb.append(((this.profileLinkColor == null) ? "<null>" : this.profileLinkColor));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null) ? "<null>" : this.description));
        sb.append(',');
        sb.append("screenName");
        sb.append('=');
        sb.append(((this.screenName == null) ? "<null>" : this.screenName));
        sb.append(',');
        sb.append("idStr");
        sb.append('=');
        sb.append(((this.idStr == null) ? "<null>" : this.idStr));
        sb.append(',');
        sb.append("listedCount");
        sb.append('=');
        sb.append(((this.listedCount == null) ? "<null>" : this.listedCount));
        sb.append(',');
        sb.append("profileBackgroundTile");
        sb.append('=');
        sb.append(((this.profileBackgroundTile == null) ? "<null>" : this.profileBackgroundTile));
        sb.append(',');
        sb.append("profileSidebarFillColor");
        sb.append('=');
        sb.append(((this.profileSidebarFillColor == null) ? "<null>" : this.profileSidebarFillColor));
        sb.append(',');
        sb.append("statusesCount");
        sb.append('=');
        sb.append(((this.statusesCount == null) ? "<null>" : this.statusesCount));
        sb.append(',');
        sb.append("showAllInlineMedia");
        sb.append('=');
        sb.append(((this.showAllInlineMedia == null) ? "<null>" : this.showAllInlineMedia));
        sb.append(',');
        sb.append("favouritesCount");
        sb.append('=');
        sb.append(((this.favouritesCount == null) ? "<null>" : this.favouritesCount));
        sb.append(',');
        sb.append("profileSidebarBorderColor");
        sb.append('=');
        sb.append(((this.profileSidebarBorderColor == null) ? "<null>" : this.profileSidebarBorderColor));
        sb.append(',');
        sb.append("followersCount");
        sb.append('=');
        sb.append(((this.followersCount == null) ? "<null>" : this.followersCount));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null) ? "<null>" : this.url));
        sb.append(',');
        sb.append("contributorsEnabled");
        sb.append('=');
        sb.append(((this.contributorsEnabled == null) ? "<null>" : this.contributorsEnabled));
        sb.append(',');
        sb.append("geoEnabled");
        sb.append('=');
        sb.append(((this.geoEnabled == null) ? "<null>" : this.geoEnabled));
        sb.append(',');
        sb.append("lang");
        sb.append('=');
        sb.append(((this.lang == null) ? "<null>" : this.lang));
        sb.append(',');
        sb.append("timeZone");
        sb.append('=');
        sb.append(((this.timeZone == null) ? "<null>" : this.timeZone));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null) ? "<null>" : this.createdAt));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null) ? "<null>" : this.location));
        sb.append(',');
        sb.append("profileBackgroundColor");
        sb.append('=');
        sb.append(((this.profileBackgroundColor == null) ? "<null>" : this.profileBackgroundColor));
        sb.append(',');
        sb.append("_protected");
        sb.append('=');
        sb.append(((this._protected == null) ? "<null>" : this._protected));
        sb.append(',');
        sb.append("friendsCount");
        sb.append('=');
        sb.append(((this.friendsCount == null) ? "<null>" : this.friendsCount));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("followRequestSent");
        sb.append('=');
        sb.append(((this.followRequestSent == null) ? "<null>" : this.followRequestSent));
        sb.append(',');
        sb.append("following");
        sb.append('=');
        sb.append(((this.following == null) ? "<null>" : this.following));
        sb.append(',');
        sb.append("profileUseBackgroundImage");
        sb.append('=');
        sb.append(((this.profileUseBackgroundImage == null) ? "<null>" : this.profileUseBackgroundImage));
        sb.append(',');
        sb.append("profileTextColor");
        sb.append('=');
        sb.append(((this.profileTextColor == null) ? "<null>" : this.profileTextColor));
        sb.append(',');
        sb.append("profileImageUrl");
        sb.append('=');
        sb.append(((this.profileImageUrl == null) ? "<null>" : this.profileImageUrl));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("verified");
        sb.append('=');
        sb.append(((this.verified == null) ? "<null>" : this.verified));
        sb.append(',');
        sb.append("notifications");
        sb.append('=');
        sb.append(((this.notifications == null) ? "<null>" : this.notifications));
        sb.append(',');
        sb.append("utcOffset");
        sb.append('=');
        sb.append(((this.utcOffset == null) ? "<null>" : this.utcOffset));
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
        result = ((result * 31) + ((this.showAllInlineMedia == null) ? 0 : this.showAllInlineMedia.hashCode()));
        result = ((result * 31) + ((this.geoEnabled == null) ? 0 : this.geoEnabled.hashCode()));
        result = ((result * 31) + ((this.description == null) ? 0 : this.description.hashCode()));
        result = ((result * 31) + ((this.profileTextColor == null) ? 0 : this.profileTextColor.hashCode()));
        result = ((result * 31) + ((this.screenName == null) ? 0 : this.screenName.hashCode()));
        result = ((result * 31) + ((this.contributorsEnabled == null) ? 0 : this.contributorsEnabled.hashCode()));
        result = ((result * 31) + ((this.profileUseBackgroundImage == null) ? 0 : this.profileUseBackgroundImage.hashCode()));
        result = ((result * 31) + ((this.createdAt == null) ? 0 : this.createdAt.hashCode()));
        result = ((result * 31) + ((this.profileBackgroundImageUrl == null) ? 0 : this.profileBackgroundImageUrl.hashCode()));
        result = ((result * 31) + ((this._protected == null) ? 0 : this._protected.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.lang == null) ? 0 : this.lang.hashCode()));
        result = ((result * 31) + ((this.profileImageUrl == null) ? 0 : this.profileImageUrl.hashCode()));
        result = ((result * 31) + ((this.idStr == null) ? 0 : this.idStr.hashCode()));
        result = ((result * 31) + ((this.profileSidebarBorderColor == null) ? 0 : this.profileSidebarBorderColor.hashCode()));
        result = ((result * 31) + ((this.statusesCount == null) ? 0 : this.statusesCount.hashCode()));
        result = ((result * 31) + ((this.utcOffset == null) ? 0 : this.utcOffset.hashCode()));
        result = ((result * 31) + ((this.profileBackgroundTile == null) ? 0 : this.profileBackgroundTile.hashCode()));
        result = ((result * 31) + ((this.profileBackgroundColor == null) ? 0 : this.profileBackgroundColor.hashCode()));
        result = ((result * 31) + ((this.verified == null) ? 0 : this.verified.hashCode()));
        result = ((result * 31) + ((this.favouritesCount == null) ? 0 : this.favouritesCount.hashCode()));
        result = ((result * 31) + ((this.timeZone == null) ? 0 : this.timeZone.hashCode()));
        result = ((result * 31) + ((this.friendsCount == null) ? 0 : this.friendsCount.hashCode()));
        result = ((result * 31) + ((this.profileLinkColor == null) ? 0 : this.profileLinkColor.hashCode()));
        result = ((result * 31) + ((this.listedCount == null) ? 0 : this.listedCount.hashCode()));
        result = ((result * 31) + ((this.url == null) ? 0 : this.url.hashCode()));
        result = ((result * 31) + ((this.profileSidebarFillColor == null) ? 0 : this.profileSidebarFillColor.hashCode()));
        result = ((result * 31) + ((this.following == null) ? 0 : this.following.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.location == null) ? 0 : this.location.hashCode()));
        result = ((result * 31) + ((this.followersCount == null) ? 0 : this.followersCount.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.notifications == null) ? 0 : this.notifications.hashCode()));
        result = ((result * 31) + ((this.followRequestSent == null) ? 0 : this.followRequestSent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return (((((((((((((((((((((((((((((((((((this.showAllInlineMedia == rhs.showAllInlineMedia) || ((this.showAllInlineMedia != null) && this.showAllInlineMedia.equals(rhs.showAllInlineMedia))) && ((this.geoEnabled == rhs.geoEnabled) || ((this.geoEnabled != null) && this.geoEnabled.equals(rhs.geoEnabled)))) && ((this.description == rhs.description) || ((this.description != null) && this.description.equals(rhs.description)))) && ((this.profileTextColor == rhs.profileTextColor) || ((this.profileTextColor != null) && this.profileTextColor.equals(rhs.profileTextColor)))) && ((this.screenName == rhs.screenName) || ((this.screenName != null) && this.screenName.equals(rhs.screenName)))) && ((this.contributorsEnabled == rhs.contributorsEnabled) || ((this.contributorsEnabled != null) && this.contributorsEnabled.equals(rhs.contributorsEnabled)))) && ((this.profileUseBackgroundImage == rhs.profileUseBackgroundImage) || ((this.profileUseBackgroundImage != null) && this.profileUseBackgroundImage.equals(rhs.profileUseBackgroundImage)))) && ((this.createdAt == rhs.createdAt) || ((this.createdAt != null) && this.createdAt.equals(rhs.createdAt)))) && ((this.profileBackgroundImageUrl == rhs.profileBackgroundImageUrl) || ((this.profileBackgroundImageUrl != null) && this.profileBackgroundImageUrl.equals(rhs.profileBackgroundImageUrl)))) && ((this._protected == rhs._protected) || ((this._protected != null) && this._protected.equals(rhs._protected)))) && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) && ((this.lang == rhs.lang) || ((this.lang != null) && this.lang.equals(rhs.lang)))) && ((this.profileImageUrl == rhs.profileImageUrl) || ((this.profileImageUrl != null) && this.profileImageUrl.equals(rhs.profileImageUrl)))) && ((this.idStr == rhs.idStr) || ((this.idStr != null) && this.idStr.equals(rhs.idStr)))) && ((this.profileSidebarBorderColor == rhs.profileSidebarBorderColor) || ((this.profileSidebarBorderColor != null) && this.profileSidebarBorderColor.equals(rhs.profileSidebarBorderColor)))) && ((this.statusesCount == rhs.statusesCount) || ((this.statusesCount != null) && this.statusesCount.equals(rhs.statusesCount)))) && ((this.utcOffset == rhs.utcOffset) || ((this.utcOffset != null) && this.utcOffset.equals(rhs.utcOffset)))) && ((this.profileBackgroundTile == rhs.profileBackgroundTile) || ((this.profileBackgroundTile != null) && this.profileBackgroundTile.equals(rhs.profileBackgroundTile)))) && ((this.profileBackgroundColor == rhs.profileBackgroundColor) || ((this.profileBackgroundColor != null) && this.profileBackgroundColor.equals(rhs.profileBackgroundColor)))) && ((this.verified == rhs.verified) || ((this.verified != null) && this.verified.equals(rhs.verified)))) && ((this.favouritesCount == rhs.favouritesCount) || ((this.favouritesCount != null) && this.favouritesCount.equals(rhs.favouritesCount)))) && ((this.timeZone == rhs.timeZone) || ((this.timeZone != null) && this.timeZone.equals(rhs.timeZone)))) && ((this.friendsCount == rhs.friendsCount) || ((this.friendsCount != null) && this.friendsCount.equals(rhs.friendsCount)))) && ((this.profileLinkColor == rhs.profileLinkColor) || ((this.profileLinkColor != null) && this.profileLinkColor.equals(rhs.profileLinkColor)))) && ((this.listedCount == rhs.listedCount) || ((this.listedCount != null) && this.listedCount.equals(rhs.listedCount)))) && ((this.url == rhs.url) || ((this.url != null) && this.url.equals(rhs.url)))) && ((this.profileSidebarFillColor == rhs.profileSidebarFillColor) || ((this.profileSidebarFillColor != null) && this.profileSidebarFillColor.equals(rhs.profileSidebarFillColor)))) && ((this.following == rhs.following) || ((this.following != null) && this.following.equals(rhs.following)))) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.location == rhs.location) || ((this.location != null) && this.location.equals(rhs.location)))) && ((this.followersCount == rhs.followersCount) || ((this.followersCount != null) && this.followersCount.equals(rhs.followersCount)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.notifications == rhs.notifications) || ((this.notifications != null) && this.notifications.equals(rhs.notifications)))) && ((this.followRequestSent == rhs.followRequestSent) || ((this.followRequestSent != null) && this.followRequestSent.equals(rhs.followRequestSent))));
    }
}