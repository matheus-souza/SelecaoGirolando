package br.com.matheush.selecaogirolando.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by matheush on 24/02/17.
 */

public class Owner implements Parcelable {

    /**
     * id : 1
     * name : grit
     * full_name : mojombo/grit
     * owner : {"login":"mojombo","id":1,"avatar_url":"https://avatars.githubusercontent.com/u/1?v=3","gravatar_id":"","url":"https://api.github.com/users/mojombo","html_url":"https://github.com/mojombo","followers_url":"https://api.github.com/users/mojombo/followers","following_url":"https://api.github.com/users/mojombo/following{/other_user}","gists_url":"https://api.github.com/users/mojombo/gists{/gist_id}","starred_url":"https://api.github.com/users/mojombo/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/mojombo/subscriptions","organizations_url":"https://api.github.com/users/mojombo/orgs","repos_url":"https://api.github.com/users/mojombo/repos","events_url":"https://api.github.com/users/mojombo/events{/privacy}","received_events_url":"https://api.github.com/users/mojombo/received_events","type":"User","site_admin":false}
     * private : false
     * html_url : https://github.com/mojombo/grit
     * description : **Grit is no longer maintained. Check out libgit2/rugged.** Grit gives you object oriented read/write access to Git repositories via Ruby.
     * fork : false
     * url : https://api.github.com/repos/mojombo/grit
     * forks_url : https://api.github.com/repos/mojombo/grit/forks
     * keys_url : https://api.github.com/repos/mojombo/grit/keys{/key_id}
     * collaborators_url : https://api.github.com/repos/mojombo/grit/collaborators{/collaborator}
     * teams_url : https://api.github.com/repos/mojombo/grit/teams
     * hooks_url : https://api.github.com/repos/mojombo/grit/hooks
     * issue_events_url : https://api.github.com/repos/mojombo/grit/issues/events{/number}
     * events_url : https://api.github.com/repos/mojombo/grit/events
     * assignees_url : https://api.github.com/repos/mojombo/grit/assignees{/user}
     * branches_url : https://api.github.com/repos/mojombo/grit/branches{/branch}
     * tags_url : https://api.github.com/repos/mojombo/grit/tags
     * blobs_url : https://api.github.com/repos/mojombo/grit/git/blobs{/sha}
     * git_tags_url : https://api.github.com/repos/mojombo/grit/git/tags{/sha}
     * git_refs_url : https://api.github.com/repos/mojombo/grit/git/refs{/sha}
     * trees_url : https://api.github.com/repos/mojombo/grit/git/trees{/sha}
     * statuses_url : https://api.github.com/repos/mojombo/grit/statuses/{sha}
     * languages_url : https://api.github.com/repos/mojombo/grit/languages
     * stargazers_url : https://api.github.com/repos/mojombo/grit/stargazers
     * contributors_url : https://api.github.com/repos/mojombo/grit/contributors
     * subscribers_url : https://api.github.com/repos/mojombo/grit/subscribers
     * subscription_url : https://api.github.com/repos/mojombo/grit/subscription
     * commits_url : https://api.github.com/repos/mojombo/grit/commits{/sha}
     * git_commits_url : https://api.github.com/repos/mojombo/grit/git/commits{/sha}
     * comments_url : https://api.github.com/repos/mojombo/grit/comments{/number}
     * issue_comment_url : https://api.github.com/repos/mojombo/grit/issues/comments{/number}
     * contents_url : https://api.github.com/repos/mojombo/grit/contents/{+path}
     * compare_url : https://api.github.com/repos/mojombo/grit/compare/{base}...{head}
     * merges_url : https://api.github.com/repos/mojombo/grit/merges
     * archive_url : https://api.github.com/repos/mojombo/grit/{archive_format}{/ref}
     * downloads_url : https://api.github.com/repos/mojombo/grit/downloads
     * issues_url : https://api.github.com/repos/mojombo/grit/issues{/number}
     * pulls_url : https://api.github.com/repos/mojombo/grit/pulls{/number}
     * milestones_url : https://api.github.com/repos/mojombo/grit/milestones{/number}
     * notifications_url : https://api.github.com/repos/mojombo/grit/notifications{?since,all,participating}
     * labels_url : https://api.github.com/repos/mojombo/grit/labels{/name}
     * releases_url : https://api.github.com/repos/mojombo/grit/releases{/id}
     * deployments_url : https://api.github.com/repos/mojombo/grit/deployments
     */

    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("full_name")
    private String fullName;
    @SerializedName("owner")
    private OwnerBean owner;
    @SerializedName("private")
    private boolean privateX;
    @SerializedName("html_url")
    private String htmlUrl;
    @SerializedName("description")
    private String description;
    @SerializedName("fork")
    private boolean fork;
    @SerializedName("url")
    private String url;
    @SerializedName("forks_url")
    private String forksUrl;
    @SerializedName("keys_url")
    private String keysUrl;
    @SerializedName("collaborators_url")
    private String collaboratorsUrl;
    @SerializedName("teams_url")
    private String teamsUrl;
    @SerializedName("hooks_url")
    private String hooksUrl;
    @SerializedName("issue_events_url")
    private String issueEventsUrl;
    @SerializedName("events_url")
    private String eventsUrl;
    @SerializedName("assignees_url")
    private String assigneesUrl;
    @SerializedName("branches_url")
    private String branchesUrl;
    @SerializedName("tags_url")
    private String tagsUrl;
    @SerializedName("blobs_url")
    private String blobsUrl;
    @SerializedName("git_tags_url")
    private String gitTagsUrl;
    @SerializedName("git_refs_url")
    private String gitRefsUrl;
    @SerializedName("trees_url")
    private String treesUrl;
    @SerializedName("statuses_url")
    private String statusesUrl;
    @SerializedName("languages_url")
    private String languagesUrl;
    @SerializedName("stargazers_url")
    private String stargazersUrl;
    @SerializedName("contributors_url")
    private String contributorsUrl;
    @SerializedName("subscribers_url")
    private String subscribersUrl;
    @SerializedName("subscription_url")
    private String subscriptionUrl;
    @SerializedName("commits_url")
    private String commitsUrl;
    @SerializedName("git_commits_url")
    private String gitCommitsUrl;
    @SerializedName("comments_url")
    private String commentsUrl;
    @SerializedName("issue_comment_url")
    private String issueCommentUrl;
    @SerializedName("contents_url")
    private String contentsUrl;
    @SerializedName("compare_url")
    private String compareUrl;
    @SerializedName("merges_url")
    private String mergesUrl;
    @SerializedName("archive_url")
    private String archiveUrl;
    @SerializedName("downloads_url")
    private String downloadsUrl;
    @SerializedName("issues_url")
    private String issuesUrl;
    @SerializedName("pulls_url")
    private String pullsUrl;
    @SerializedName("milestones_url")
    private String milestonesUrl;
    @SerializedName("notifications_url")
    private String notificationsUrl;
    @SerializedName("labels_url")
    private String labelsUrl;
    @SerializedName("releases_url")
    private String releasesUrl;
    @SerializedName("deployments_url")
    private String deploymentsUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public OwnerBean getOwner() {
        return owner;
    }

    public void setOwner(OwnerBean owner) {
        this.owner = owner;
    }

    public boolean isPrivateX() {
        return privateX;
    }

    public void setPrivateX(boolean privateX) {
        this.privateX = privateX;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFork() {
        return fork;
    }

    public void setFork(boolean fork) {
        this.fork = fork;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public String getBranchesUrl() {
        return branchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public String getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public String getBlobsUrl() {
        return blobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public String getTreesUrl() {
        return treesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public String getMergesUrl() {
        return mergesUrl;
    }

    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public String getReleasesUrl() {
        return releasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", owner=" + owner +
                ", privateX=" + privateX +
                ", htmlUrl='" + htmlUrl + '\'' +
                ", description='" + description + '\'' +
                ", fork=" + fork +
                ", url='" + url + '\'' +
                ", forksUrl='" + forksUrl + '\'' +
                ", keysUrl='" + keysUrl + '\'' +
                ", collaboratorsUrl='" + collaboratorsUrl + '\'' +
                ", teamsUrl='" + teamsUrl + '\'' +
                ", hooksUrl='" + hooksUrl + '\'' +
                ", issueEventsUrl='" + issueEventsUrl + '\'' +
                ", eventsUrl='" + eventsUrl + '\'' +
                ", assigneesUrl='" + assigneesUrl + '\'' +
                ", branchesUrl='" + branchesUrl + '\'' +
                ", tagsUrl='" + tagsUrl + '\'' +
                ", blobsUrl='" + blobsUrl + '\'' +
                ", gitTagsUrl='" + gitTagsUrl + '\'' +
                ", gitRefsUrl='" + gitRefsUrl + '\'' +
                ", treesUrl='" + treesUrl + '\'' +
                ", statusesUrl='" + statusesUrl + '\'' +
                ", languagesUrl='" + languagesUrl + '\'' +
                ", stargazersUrl='" + stargazersUrl + '\'' +
                ", contributorsUrl='" + contributorsUrl + '\'' +
                ", subscribersUrl='" + subscribersUrl + '\'' +
                ", subscriptionUrl='" + subscriptionUrl + '\'' +
                ", commitsUrl='" + commitsUrl + '\'' +
                ", gitCommitsUrl='" + gitCommitsUrl + '\'' +
                ", commentsUrl='" + commentsUrl + '\'' +
                ", issueCommentUrl='" + issueCommentUrl + '\'' +
                ", contentsUrl='" + contentsUrl + '\'' +
                ", compareUrl='" + compareUrl + '\'' +
                ", mergesUrl='" + mergesUrl + '\'' +
                ", archiveUrl='" + archiveUrl + '\'' +
                ", downloadsUrl='" + downloadsUrl + '\'' +
                ", issuesUrl='" + issuesUrl + '\'' +
                ", pullsUrl='" + pullsUrl + '\'' +
                ", milestonesUrl='" + milestonesUrl + '\'' +
                ", notificationsUrl='" + notificationsUrl + '\'' +
                ", labelsUrl='" + labelsUrl + '\'' +
                ", releasesUrl='" + releasesUrl + '\'' +
                ", deploymentsUrl='" + deploymentsUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Owner owner1 = (Owner) o;

        if (id != owner1.id) return false;
        if (privateX != owner1.privateX) return false;
        if (fork != owner1.fork) return false;
        if (name != null ? !name.equals(owner1.name) : owner1.name != null) return false;
        if (fullName != null ? !fullName.equals(owner1.fullName) : owner1.fullName != null)
            return false;
        if (owner != null ? !owner.equals(owner1.owner) : owner1.owner != null) return false;
        if (htmlUrl != null ? !htmlUrl.equals(owner1.htmlUrl) : owner1.htmlUrl != null)
            return false;
        if (description != null ? !description.equals(owner1.description) : owner1.description != null)
            return false;
        if (url != null ? !url.equals(owner1.url) : owner1.url != null) return false;
        if (forksUrl != null ? !forksUrl.equals(owner1.forksUrl) : owner1.forksUrl != null)
            return false;
        if (keysUrl != null ? !keysUrl.equals(owner1.keysUrl) : owner1.keysUrl != null)
            return false;
        if (collaboratorsUrl != null ? !collaboratorsUrl.equals(owner1.collaboratorsUrl) : owner1.collaboratorsUrl != null)
            return false;
        if (teamsUrl != null ? !teamsUrl.equals(owner1.teamsUrl) : owner1.teamsUrl != null)
            return false;
        if (hooksUrl != null ? !hooksUrl.equals(owner1.hooksUrl) : owner1.hooksUrl != null)
            return false;
        if (issueEventsUrl != null ? !issueEventsUrl.equals(owner1.issueEventsUrl) : owner1.issueEventsUrl != null)
            return false;
        if (eventsUrl != null ? !eventsUrl.equals(owner1.eventsUrl) : owner1.eventsUrl != null)
            return false;
        if (assigneesUrl != null ? !assigneesUrl.equals(owner1.assigneesUrl) : owner1.assigneesUrl != null)
            return false;
        if (branchesUrl != null ? !branchesUrl.equals(owner1.branchesUrl) : owner1.branchesUrl != null)
            return false;
        if (tagsUrl != null ? !tagsUrl.equals(owner1.tagsUrl) : owner1.tagsUrl != null)
            return false;
        if (blobsUrl != null ? !blobsUrl.equals(owner1.blobsUrl) : owner1.blobsUrl != null)
            return false;
        if (gitTagsUrl != null ? !gitTagsUrl.equals(owner1.gitTagsUrl) : owner1.gitTagsUrl != null)
            return false;
        if (gitRefsUrl != null ? !gitRefsUrl.equals(owner1.gitRefsUrl) : owner1.gitRefsUrl != null)
            return false;
        if (treesUrl != null ? !treesUrl.equals(owner1.treesUrl) : owner1.treesUrl != null)
            return false;
        if (statusesUrl != null ? !statusesUrl.equals(owner1.statusesUrl) : owner1.statusesUrl != null)
            return false;
        if (languagesUrl != null ? !languagesUrl.equals(owner1.languagesUrl) : owner1.languagesUrl != null)
            return false;
        if (stargazersUrl != null ? !stargazersUrl.equals(owner1.stargazersUrl) : owner1.stargazersUrl != null)
            return false;
        if (contributorsUrl != null ? !contributorsUrl.equals(owner1.contributorsUrl) : owner1.contributorsUrl != null)
            return false;
        if (subscribersUrl != null ? !subscribersUrl.equals(owner1.subscribersUrl) : owner1.subscribersUrl != null)
            return false;
        if (subscriptionUrl != null ? !subscriptionUrl.equals(owner1.subscriptionUrl) : owner1.subscriptionUrl != null)
            return false;
        if (commitsUrl != null ? !commitsUrl.equals(owner1.commitsUrl) : owner1.commitsUrl != null)
            return false;
        if (gitCommitsUrl != null ? !gitCommitsUrl.equals(owner1.gitCommitsUrl) : owner1.gitCommitsUrl != null)
            return false;
        if (commentsUrl != null ? !commentsUrl.equals(owner1.commentsUrl) : owner1.commentsUrl != null)
            return false;
        if (issueCommentUrl != null ? !issueCommentUrl.equals(owner1.issueCommentUrl) : owner1.issueCommentUrl != null)
            return false;
        if (contentsUrl != null ? !contentsUrl.equals(owner1.contentsUrl) : owner1.contentsUrl != null)
            return false;
        if (compareUrl != null ? !compareUrl.equals(owner1.compareUrl) : owner1.compareUrl != null)
            return false;
        if (mergesUrl != null ? !mergesUrl.equals(owner1.mergesUrl) : owner1.mergesUrl != null)
            return false;
        if (archiveUrl != null ? !archiveUrl.equals(owner1.archiveUrl) : owner1.archiveUrl != null)
            return false;
        if (downloadsUrl != null ? !downloadsUrl.equals(owner1.downloadsUrl) : owner1.downloadsUrl != null)
            return false;
        if (issuesUrl != null ? !issuesUrl.equals(owner1.issuesUrl) : owner1.issuesUrl != null)
            return false;
        if (pullsUrl != null ? !pullsUrl.equals(owner1.pullsUrl) : owner1.pullsUrl != null)
            return false;
        if (milestonesUrl != null ? !milestonesUrl.equals(owner1.milestonesUrl) : owner1.milestonesUrl != null)
            return false;
        if (notificationsUrl != null ? !notificationsUrl.equals(owner1.notificationsUrl) : owner1.notificationsUrl != null)
            return false;
        if (labelsUrl != null ? !labelsUrl.equals(owner1.labelsUrl) : owner1.labelsUrl != null)
            return false;
        if (releasesUrl != null ? !releasesUrl.equals(owner1.releasesUrl) : owner1.releasesUrl != null)
            return false;
        return deploymentsUrl != null ? deploymentsUrl.equals(owner1.deploymentsUrl) : owner1.deploymentsUrl == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (privateX ? 1 : 0);
        result = 31 * result + (htmlUrl != null ? htmlUrl.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (fork ? 1 : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (forksUrl != null ? forksUrl.hashCode() : 0);
        result = 31 * result + (keysUrl != null ? keysUrl.hashCode() : 0);
        result = 31 * result + (collaboratorsUrl != null ? collaboratorsUrl.hashCode() : 0);
        result = 31 * result + (teamsUrl != null ? teamsUrl.hashCode() : 0);
        result = 31 * result + (hooksUrl != null ? hooksUrl.hashCode() : 0);
        result = 31 * result + (issueEventsUrl != null ? issueEventsUrl.hashCode() : 0);
        result = 31 * result + (eventsUrl != null ? eventsUrl.hashCode() : 0);
        result = 31 * result + (assigneesUrl != null ? assigneesUrl.hashCode() : 0);
        result = 31 * result + (branchesUrl != null ? branchesUrl.hashCode() : 0);
        result = 31 * result + (tagsUrl != null ? tagsUrl.hashCode() : 0);
        result = 31 * result + (blobsUrl != null ? blobsUrl.hashCode() : 0);
        result = 31 * result + (gitTagsUrl != null ? gitTagsUrl.hashCode() : 0);
        result = 31 * result + (gitRefsUrl != null ? gitRefsUrl.hashCode() : 0);
        result = 31 * result + (treesUrl != null ? treesUrl.hashCode() : 0);
        result = 31 * result + (statusesUrl != null ? statusesUrl.hashCode() : 0);
        result = 31 * result + (languagesUrl != null ? languagesUrl.hashCode() : 0);
        result = 31 * result + (stargazersUrl != null ? stargazersUrl.hashCode() : 0);
        result = 31 * result + (contributorsUrl != null ? contributorsUrl.hashCode() : 0);
        result = 31 * result + (subscribersUrl != null ? subscribersUrl.hashCode() : 0);
        result = 31 * result + (subscriptionUrl != null ? subscriptionUrl.hashCode() : 0);
        result = 31 * result + (commitsUrl != null ? commitsUrl.hashCode() : 0);
        result = 31 * result + (gitCommitsUrl != null ? gitCommitsUrl.hashCode() : 0);
        result = 31 * result + (commentsUrl != null ? commentsUrl.hashCode() : 0);
        result = 31 * result + (issueCommentUrl != null ? issueCommentUrl.hashCode() : 0);
        result = 31 * result + (contentsUrl != null ? contentsUrl.hashCode() : 0);
        result = 31 * result + (compareUrl != null ? compareUrl.hashCode() : 0);
        result = 31 * result + (mergesUrl != null ? mergesUrl.hashCode() : 0);
        result = 31 * result + (archiveUrl != null ? archiveUrl.hashCode() : 0);
        result = 31 * result + (downloadsUrl != null ? downloadsUrl.hashCode() : 0);
        result = 31 * result + (issuesUrl != null ? issuesUrl.hashCode() : 0);
        result = 31 * result + (pullsUrl != null ? pullsUrl.hashCode() : 0);
        result = 31 * result + (milestonesUrl != null ? milestonesUrl.hashCode() : 0);
        result = 31 * result + (notificationsUrl != null ? notificationsUrl.hashCode() : 0);
        result = 31 * result + (labelsUrl != null ? labelsUrl.hashCode() : 0);
        result = 31 * result + (releasesUrl != null ? releasesUrl.hashCode() : 0);
        result = 31 * result + (deploymentsUrl != null ? deploymentsUrl.hashCode() : 0);
        return result;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeString(this.fullName);
        dest.writeParcelable((Parcelable) this.owner, flags);
        dest.writeByte(this.privateX ? (byte) 1 : (byte) 0);
        dest.writeString(this.htmlUrl);
        dest.writeString(this.description);
        dest.writeByte(this.fork ? (byte) 1 : (byte) 0);
        dest.writeString(this.url);
        dest.writeString(this.forksUrl);
        dest.writeString(this.keysUrl);
        dest.writeString(this.collaboratorsUrl);
        dest.writeString(this.teamsUrl);
        dest.writeString(this.hooksUrl);
        dest.writeString(this.issueEventsUrl);
        dest.writeString(this.eventsUrl);
        dest.writeString(this.assigneesUrl);
        dest.writeString(this.branchesUrl);
        dest.writeString(this.tagsUrl);
        dest.writeString(this.blobsUrl);
        dest.writeString(this.gitTagsUrl);
        dest.writeString(this.gitRefsUrl);
        dest.writeString(this.treesUrl);
        dest.writeString(this.statusesUrl);
        dest.writeString(this.languagesUrl);
        dest.writeString(this.stargazersUrl);
        dest.writeString(this.contributorsUrl);
        dest.writeString(this.subscribersUrl);
        dest.writeString(this.subscriptionUrl);
        dest.writeString(this.commitsUrl);
        dest.writeString(this.gitCommitsUrl);
        dest.writeString(this.commentsUrl);
        dest.writeString(this.issueCommentUrl);
        dest.writeString(this.contentsUrl);
        dest.writeString(this.compareUrl);
        dest.writeString(this.mergesUrl);
        dest.writeString(this.archiveUrl);
        dest.writeString(this.downloadsUrl);
        dest.writeString(this.issuesUrl);
        dest.writeString(this.pullsUrl);
        dest.writeString(this.milestonesUrl);
        dest.writeString(this.notificationsUrl);
        dest.writeString(this.labelsUrl);
        dest.writeString(this.releasesUrl);
        dest.writeString(this.deploymentsUrl);
    }

    public Owner() {
    }

    protected Owner(Parcel in) {
        this.id = in.readInt();
        this.name = in.readString();
        this.fullName = in.readString();
        this.owner = in.readParcelable(OwnerBean.class.getClassLoader());
        this.privateX = in.readByte() != 0;
        this.htmlUrl = in.readString();
        this.description = in.readString();
        this.fork = in.readByte() != 0;
        this.url = in.readString();
        this.forksUrl = in.readString();
        this.keysUrl = in.readString();
        this.collaboratorsUrl = in.readString();
        this.teamsUrl = in.readString();
        this.hooksUrl = in.readString();
        this.issueEventsUrl = in.readString();
        this.eventsUrl = in.readString();
        this.assigneesUrl = in.readString();
        this.branchesUrl = in.readString();
        this.tagsUrl = in.readString();
        this.blobsUrl = in.readString();
        this.gitTagsUrl = in.readString();
        this.gitRefsUrl = in.readString();
        this.treesUrl = in.readString();
        this.statusesUrl = in.readString();
        this.languagesUrl = in.readString();
        this.stargazersUrl = in.readString();
        this.contributorsUrl = in.readString();
        this.subscribersUrl = in.readString();
        this.subscriptionUrl = in.readString();
        this.commitsUrl = in.readString();
        this.gitCommitsUrl = in.readString();
        this.commentsUrl = in.readString();
        this.issueCommentUrl = in.readString();
        this.contentsUrl = in.readString();
        this.compareUrl = in.readString();
        this.mergesUrl = in.readString();
        this.archiveUrl = in.readString();
        this.downloadsUrl = in.readString();
        this.issuesUrl = in.readString();
        this.pullsUrl = in.readString();
        this.milestonesUrl = in.readString();
        this.notificationsUrl = in.readString();
        this.labelsUrl = in.readString();
        this.releasesUrl = in.readString();
        this.deploymentsUrl = in.readString();
    }

    public static final Parcelable.Creator<Owner> CREATOR = new Parcelable.Creator<Owner>() {
        @Override
        public Owner createFromParcel(Parcel source) {
            return new Owner(source);
        }

        @Override
        public Owner[] newArray(int size) {
            return new Owner[size];
        }
    };
}
