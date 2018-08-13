package cn.xiaozi5.graduation.authority.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xiaozi5.graduation.authority.mapper.AuthorityGroupMapper;
import cn.xiaozi5.graduation.authority.service.AuthorityService;
import cn.xiaozi5.graduation.pojo.AuthorityGroup;
import cn.xiaozi5.graduation.pojo.User;

@Service
public class AuthorityServiceImpl implements AuthorityService{
	
	
	@Autowired
	private AuthorityGroupMapper authorityGroupMapper;
	
	@Override
	public List<AuthorityGroup> getLeftNav(User user) {
		return authorityGroupMapper.queryUserAuthorityGroups(user);
		
	}

}
