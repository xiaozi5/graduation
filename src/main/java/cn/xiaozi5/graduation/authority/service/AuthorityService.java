package cn.xiaozi5.graduation.authority.service;

import java.util.List;

import cn.xiaozi5.graduation.pojo.AuthorityGroup;
import cn.xiaozi5.graduation.pojo.User;

public interface AuthorityService {

	List<AuthorityGroup> getLeftNav(User user);

}
