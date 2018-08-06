package cn.xiaozi5.graduation.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.xiaozi5.graduation.user.service.UserService;

/**
 * @author xiaozi5
 *用户
 */
@RestController
@RequestMapping("/user")
public class UserCtl {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/info/{id}", method = {RequestMethod.POST,RequestMethod.GET})
	public Object getInfo(@PathVariable String id) {
		Map<String, String> map = new HashMap<>();
		return userService.getUserInfo(id);
	}
}
