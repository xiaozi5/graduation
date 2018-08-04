package cn.xiaozi5.graduation.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.xiaozi5.graduation.pojo.UserInfo;
import cn.xiaozi5.graduation.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserCtl {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/info/{id}", method = {RequestMethod.POST,RequestMethod.GET})
	public UserInfo getInfo(@PathVariable String id) {
		return userService.getUserInfo(id);
	}


}
