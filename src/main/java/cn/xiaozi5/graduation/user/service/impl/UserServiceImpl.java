package cn.xiaozi5.graduation.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xiaozi5.graduation.pojo.UserInfo;
import cn.xiaozi5.graduation.user.mapper.UserInfoMapper;
import cn.xiaozi5.graduation.user.mapper.UserMapper;
import cn.xiaozi5.graduation.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public UserInfo getUserInfo(String id) {
		return userInfoMapper.getUserInfo(id);
	}

}
