package cn.xiaozi5.graduation.authority.service;

import java.util.List;

import cn.xiaozi5.graduation.pojo.AuthorityGroup;
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
	List<AuthorityGroup> getLeftNav(User user);

}
