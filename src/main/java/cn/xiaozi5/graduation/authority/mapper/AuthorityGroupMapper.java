package cn.xiaozi5.graduation.authority.mapper;

import java.util.List;

import cn.xiaozi5.graduation.pojo.AuthorityGroup;
import cn.xiaozi5.graduation.pojo.User;

/**
 * @author xiaozi5
 *权限组mapper
 */
public interface AuthorityGroupMapper {
    int deleteByPrimaryKey(Integer authorityGroupId);

    int insert(AuthorityGroup record);

    int insertSelective(AuthorityGroup record);

    AuthorityGroup selectByPrimaryKey(Integer authorityGroupId);

    int updateByPrimaryKeySelective(AuthorityGroup record);

    int updateByPrimaryKey(AuthorityGroup record);

	/**
	 * @param user
	 * @return
	 * 根据用户id查询他的分组下的权限组名及全部权限
	 */
	List<AuthorityGroup> queryUserAuthorityGroups(User user);
}