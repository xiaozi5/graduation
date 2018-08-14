package cn.xiaozi5.graduation.user.mapper;

import java.util.List;

import cn.xiaozi5.graduation.pojo.UserGroup;

public interface UserGroupMapper {
    int deleteByPrimaryKey(Integer groupId);

    int insert(UserGroup record);

    int insertSelective(UserGroup record);

    UserGroup selectByPrimaryKey(Integer groupId);

    int updateByPrimaryKeySelective(UserGroup record);

    int updateByPrimaryKey(UserGroup record);
    
    List<UserGroup> queryAllUserGroup();
}