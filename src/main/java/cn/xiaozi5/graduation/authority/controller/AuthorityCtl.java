package cn.xiaozi5.graduation.authority.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.xiaozi5.graduation.authority.service.AuthorityService;
import cn.xiaozi5.graduation.pojo.User;

/**
 * @author xiaozi5
 *	权限管理
 */
@RestController
@RequestMapping("/authority")
public class AuthorityCtl {
	
	@Autowired
	private AuthorityService authorityService;

	
	/**
	 * @param user
	 * @return
	 * 获取左边菜单栏信息
	 */
	@RequestMapping(value = "/getLeftNav", method = {RequestMethod.POST,RequestMethod.GET})
	public Object getLeftNav( User user) {
		return authorityService.getLeftNavByCache(user);
	}
	
}
