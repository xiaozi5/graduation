package cn.xiaozi5.graduation.pojo;

public class Authority {
    private Integer authorityId;

    private String authorityName;

    private String authorityUrl;

    private Integer authorityGroupId;

    public Integer getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName == null ? null : authorityName.trim();
    }

    public String getAuthorityUrl() {
        return authorityUrl;
    }

    public void setAuthorityUrl(String authorityUrl) {
        this.authorityUrl = authorityUrl == null ? null : authorityUrl.trim();
    }

    public Integer getAuthorityGroupId() {
        return authorityGroupId;
    }

    public void setAuthorityGroupId(Integer authorityGroupId) {
        this.authorityGroupId = authorityGroupId;
    }
}