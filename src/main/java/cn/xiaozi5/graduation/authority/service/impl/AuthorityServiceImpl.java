package cn.xiaozi5.graduation.authority.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xiaozi5.graduation.authority.mapper.AuthorityGroupMapper;
import cn.xiaozi5.graduation.authority.service.AuthorityService;
import cn.xiaozi5.graduation.base.common.Cache;
import cn.xiaozi5.graduation.base.common.UserGroupCache;
import cn.xiaozi5.graduation.pojo.AuthorityGroup;
import cn.xiaozi5.graduation.pojo.User;
import cn.xiaozi5.graduation.pojo.UserGroup;

/**
 * @author xiaozi5
 * 权限管理服务实现类
 *
 */
@Service
public class AuthorityServiceImpl implements AuthorityService{
	
	
	@Autowired
	private AuthorityGroupMapper authorityGroupMapper;
	
	@Resource(name="userGroupCache")
	private Cache<UserGroup> userGourpCache;
	
	@Override
	public Object getLeftNav(User user) {
		List<AuthorityGroup> list=authorityGroupMapper.queryUserAuthorityGroups(user);
		if (list==null||list.size()<1) {
			return "未查询到该账户菜单,请联系管理员确认";
		}
		return list;
	}
	
	public Object getLeftNavByCache(User user) {
		UserGroup userGroup = userGourpCache.queryById(user.getId().toString());
		if (userGroup==null||userGroup.getAuthorityGroups()==null||userGroup.getAuthorityGroups().size()<1) {
			return "未查询到该账户菜单,请联系管理员确认";
		}
		return userGroup.getAuthorityGroups();
	}
}
