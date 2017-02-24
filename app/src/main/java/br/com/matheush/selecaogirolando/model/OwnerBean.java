package br.com.matheush.selecaogirolando.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by matheush on 24/02/17.
 */
public class OwnerBean {
    /**
     * login : mojombo
     * id : 1
     * avatar_url : https://avatars.githubusercontent.com/u/1?v=3
     * gravatar_id :
     * url : https://api.github.com/users/mojombo
     * html_url : https://github.com/mojombo
     * followers_url : https://api.github.com/users/mojombo/followers
     * following_url : https://api.github.com/users/mojombo/following{/other_user}
     * gists_url : https://api.github.com/users/mojombo/gists{/gist_id}
     * starred_url : https://api.github.com/users/mojombo/starred{/owner}{/repo}
     * subscriptions_url : https://api.github.com/users/mojombo/subscriptions
     * organizations_url : https://api.github.com/users/mojombo/orgs
     * repos_url : https://api.github.com/users/mojombo/repos
     * events_url : https://api.github.com/users/mojombo/events{/privacy}
     * received_events_url : https://api.github.com/users/mojombo/received_events
     * type : User
     * site_admin : false
     */

    @SerializedName("login")
    private String login;
    @SerializedName("id")
    private int id;
    @SerializedName("avatar_url")
    private String avatarUrl;
    @SerializedName("gravatar_id")
    private String gravatarId;
    @SerializedName("url")
    private String url;
    @SerializedName("html_url")
    private String htmlUrl;
    @SerializedName("followers_url")
    private String followersUrl;
    @SerializedName("following_url")
    private String followingUrl;
    @SerializedName("gists_url")
    private String gistsUrl;
    @SerializedName("starred_url")
    private String starredUrl;
    @SerializedName("subscriptions_url")
    private String subscriptionsUrl;
    @SerializedName("organizations_url")
    private String organizationsUrl;
    @SerializedName("repos_url")
    private String reposUrl;
    @SerializedName("events_url")
    private String eventsUrl;
    @SerializedName("received_events_url")
    private String receivedEventsUrl;
    @SerializedName("type")
    private String type;
    @SerializedName("site_admin")
    private boolean siteAdmin;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getGravatarId() {
        return gravatarId;
    }

    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public String getFollowingUrl() {
        return followingUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    public String getGistsUrl() {
        return gistsUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public String getStarredUrl() {
        return starredUrl;
    }

    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    @Override
    public String toString() {
        return "OwnerBean{" +
                "login='" + login + '\'' +
                ", id=" + id +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", gravatarId='" + gravatarId + '\'' +
                ", url='" + url + '\'' +
                ", htmlUrl='" + htmlUrl + '\'' +
                ", followersUrl='" + followersUrl + '\'' +
                ", followingUrl='" + followingUrl + '\'' +
                ", gistsUrl='" + gistsUrl + '\'' +
                ", starredUrl='" + starredUrl + '\'' +
                ", subscriptionsUrl='" + subscriptionsUrl + '\'' +
                ", organizationsUrl='" + organizationsUrl + '\'' +
                ", reposUrl='" + reposUrl + '\'' +
                ", eventsUrl='" + eventsUrl + '\'' +
                ", receivedEventsUrl='" + receivedEventsUrl + '\'' +
                ", type='" + type + '\'' +
                ", siteAdmin=" + siteAdmin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OwnerBean ownerBean = (OwnerBean) o;

        if (id != ownerBean.id) return false;
        if (siteAdmin != ownerBean.siteAdmin) return false;
        if (login != null ? !login.equals(ownerBean.login) : ownerBean.login != null) return false;
        if (avatarUrl != null ? !avatarUrl.equals(ownerBean.avatarUrl) : ownerBean.avatarUrl != null)
            return false;
        if (gravatarId != null ? !gravatarId.equals(ownerBean.gravatarId) : ownerBean.gravatarId != null)
            return false;
        if (url != null ? !url.equals(ownerBean.url) : ownerBean.url != null) return false;
        if (htmlUrl != null ? !htmlUrl.equals(ownerBean.htmlUrl) : ownerBean.htmlUrl != null)
            return false;
        if (followersUrl != null ? !followersUrl.equals(ownerBean.followersUrl) : ownerBean.followersUrl != null)
            return false;
        if (followingUrl != null ? !followingUrl.equals(ownerBean.followingUrl) : ownerBean.followingUrl != null)
            return false;
        if (gistsUrl != null ? !gistsUrl.equals(ownerBean.gistsUrl) : ownerBean.gistsUrl != null)
            return false;
        if (starredUrl != null ? !starredUrl.equals(ownerBean.starredUrl) : ownerBean.starredUrl != null)
            return false;
        if (subscriptionsUrl != null ? !subscriptionsUrl.equals(ownerBean.subscriptionsUrl) : ownerBean.subscriptionsUrl != null)
            return false;
        if (organizationsUrl != null ? !organizationsUrl.equals(ownerBean.organizationsUrl) : ownerBean.organizationsUrl != null)
            return false;
        if (reposUrl != null ? !reposUrl.equals(ownerBean.reposUrl) : ownerBean.reposUrl != null)
            return false;
        if (eventsUrl != null ? !eventsUrl.equals(ownerBean.eventsUrl) : ownerBean.eventsUrl != null)
            return false;
        if (receivedEventsUrl != null ? !receivedEventsUrl.equals(ownerBean.receivedEventsUrl) : ownerBean.receivedEventsUrl != null)
            return false;
        return type != null ? type.equals(ownerBean.type) : ownerBean.type == null;

    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + id;
        result = 31 * result + (avatarUrl != null ? avatarUrl.hashCode() : 0);
        result = 31 * result + (gravatarId != null ? gravatarId.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (htmlUrl != null ? htmlUrl.hashCode() : 0);
        result = 31 * result + (followersUrl != null ? followersUrl.hashCode() : 0);
        result = 31 * result + (followingUrl != null ? followingUrl.hashCode() : 0);
        result = 31 * result + (gistsUrl != null ? gistsUrl.hashCode() : 0);
        result = 31 * result + (starredUrl != null ? starredUrl.hashCode() : 0);
        result = 31 * result + (subscriptionsUrl != null ? subscriptionsUrl.hashCode() : 0);
        result = 31 * result + (organizationsUrl != null ? organizationsUrl.hashCode() : 0);
        result = 31 * result + (reposUrl != null ? reposUrl.hashCode() : 0);
        result = 31 * result + (eventsUrl != null ? eventsUrl.hashCode() : 0);
        result = 31 * result + (receivedEventsUrl != null ? receivedEventsUrl.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (siteAdmin ? 1 : 0);
        return result;
    }
}
