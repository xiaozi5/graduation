package cn.xiaozi5.graduation.authority.service;

import cn.xiaozi5.graduation.pojo.User;

/**
 * @author xiaozi5
 * 权限管理
 *
 */
public interface AuthorityService {

	/**
	 * @param user
	 * @return
	 * 获取左边任务栏的信息
	 */
	Object getLeftNav(User user);
	
	Object getLeftNavByCache(User user);

}
