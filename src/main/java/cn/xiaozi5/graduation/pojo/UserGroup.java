package cn.xiaozi5.graduation.pojo;

import java.util.List;

public class UserGroup {
    private Integer groupId;

    private String groupName;

    private Integer groupState;
    
    private List<AuthorityGroup> authorityGroups;
    
    

    public List<AuthorityGroup> getAuthorityGroups() {
		return authorityGroups;
	}

	public void setAuthorityGroups(List<AuthorityGroup> authorityGroups) {
		this.authorityGroups = authorityGroups;
	}

	public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public Integer getGroupState() {
        return groupState;
    }

    public void setGroupState(Integer groupState) {
        this.groupState = groupState;
    }
}