package cn.xiaozi5.graduation.authority.mapper;


import java.util.List;

import cn.xiaozi5.graduation.pojo.User;
import cn.xiaozi5.graduation.user.pojo.Authority;

public interface AuthorityMapper {
    int deleteByPrimaryKey(Integer authorityId);

    int insert(Authority record);

    int insertSelective(Authority record);

    Authority selectByPrimaryKey(Integer authorityId);

    int updateByPrimaryKeySelective(Authority record);

    int updateByPrimaryKey(Authority record);

}