package cn.xiaozi5.graduation.base.common;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.xiaozi5.graduation.pojo.UserGroup;
import cn.xiaozi5.graduation.user.mapper.UserGroupMapper;


/**
 * @author xiaozi5
 *	用户组缓存
 */
@Component("userGroupCache")
public class UserGroupCache implements Cache<UserGroup>  {
	@Autowired
	private UserGroupMapper userGroupMapper;
	
	private final Map<String, UserGroup> userGroupMap = new HashMap<>();
	
	private static final ReadWriteLock LOCK =new ReentrantReadWriteLock();
	
	
	/**
	 * 查询用户组下的权限组
	 * @param userGroupId
	 * @return
	 */
	public UserGroup queryById (String userGroupId){
		Lock readlock = UserGroupCache.LOCK.readLock();
		readlock.lock();
		try {
		 return	userGroupMap.get(userGroupId);
		} finally {
			readlock.unlock();
		}
	}
	
	/**
	 * 初始化用户组map
	 */
	@PostConstruct
	public void initCache () {
		Lock writeLock = UserGroupCache.LOCK.writeLock();
		writeLock.lock();
		try {
			userGroupMap.clear();
			List<UserGroup> allUserGroups = userGroupMapper.queryAllUserGroup();
			for (UserGroup userGroup : allUserGroups) {
				userGroupMap.put(userGroup.getGroupId().toString(), userGroup);
			}
		} finally {
			writeLock.unlock();
		}
	}
}
