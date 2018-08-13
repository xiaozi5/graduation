package cn.xiaozi5.graduation.authority.mapper;

import java.util.List;

import cn.xiaozi5.graduation.pojo.AuthorityGroup;
import cn.xiaozi5.graduation.pojo.User;

public interface AuthorityGroupMapper {
    int deleteByPrimaryKey(Integer authorityGroupId);

    int insert(AuthorityGroup record);

    int insertSelective(AuthorityGroup record);

    AuthorityGroup selectByPrimaryKey(Integer authorityGroupId);

    int updateByPrimaryKeySelective(AuthorityGroup record);

    int updateByPrimaryKey(AuthorityGroup record);

	List<AuthorityGroup> queryUserAuthorityGroups(User user);
}