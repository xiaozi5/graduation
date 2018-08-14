package cn.xiaozi5.graduation.base.common;

public interface Cache<T> {
	
	T queryById(String userGroupId);
	
	void initCache();
	
}
