package cn.xiaozi5.graduation.pojo;

import java.util.ArrayList;
import java.util.List;

public class AuthorityGroup {
    private Integer authorityGroupId;

    private String authorityGroupName;
    
    private List<Authority> authorityList = new ArrayList<>();

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

	public List<Authority> getAuthorityList() {
		return authorityList;
	}

	public void setAuthorityList(List<Authority> authorityList) {
		this.authorityList = authorityList;
	}
    
}