package cn.xiaozi5.graduation.authority.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xiaozi5.graduation.authority.mapper.AuthorityGroupMapper;
import cn.xiaozi5.graduation.authority.service.AuthorityService;
import cn.xiaozi5.graduation.pojo.User;
import cn.xiaozi5.graduation.user.pojo.AuthorityGroup;

@Service
public class AuthorityServiceImpl implements AuthorityService{
	
	
	@Autowired
	private AuthorityGroupMapper authorityGroupMapper;
	@Override
	public void getLeftNav(User user) {
		List<AuthorityGroup> authoritieGroups=authorityGroupMapper.queryUserAuthorityGroups(user);
		
	}

}
