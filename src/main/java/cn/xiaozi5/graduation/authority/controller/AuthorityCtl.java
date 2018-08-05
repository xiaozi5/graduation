package cn.xiaozi5.graduation.authority.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.xiaozi5.graduation.authority.service.AuthorityService;
import cn.xiaozi5.graduation.pojo.User;

@RestController
@RequestMapping("/authority")
public class AuthorityCtl {
	
	@Autowired
	private AuthorityService authorityService;

	
	@RequestMapping(value = "/getLeftNav", method = RequestMethod.POST)
	public User requestMethodName(@RequestBody User user) {
		authorityService.getLeftNav(user);
		return null;
	}

	
}
