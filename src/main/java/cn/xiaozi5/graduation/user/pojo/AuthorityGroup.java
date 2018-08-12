package cn.xiaozi5.graduation.user.pojo;

public class AuthorityGroup {
    private Integer authorityGroupId;

    private String authorityGroupName;

    public Integer getAuthorityGroupId() {
        return authorityGroupId;
    }

    public void setAuthorityGroupId(Integer authorityGroupId) {
        this.authorityGroupId = authorityGroupId;
    }

    public String getAuthorityGroupName() {
        return authorityGroupName;
    }

    public void setAuthorityGroupName(String authorityGroupName) {
        this.authorityGroupName = authorityGroupName == null ? null : authorityGroupName.trim();
    }
}