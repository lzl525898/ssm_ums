package com.ums.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ums.bean.User;
import com.ums.bean.UserExample;
import com.ums.bean.UserExample.Criteria;
import com.ums.dao.UserMapper;

@Service
public class GlobalUserService {
	
	@Autowired
	private UserMapper userMapper;
	
	// 初始化用户上下文
	public void initUserContext(String userName, Object ...obj) {
		
	}
	
	// 根据用户名查询用户
	public User selectByUsername(String userName) {
		UserExample userExample = new UserExample();
		Criteria criteria = userExample.createCriteria();
		criteria.andUsernameEqualTo(userName);
		List<User> userList = userMapper.selectByExample(userExample);
		if (userList.size()==1) {
			return userList.get(0) ;
		} else if (userList.size()==0) {
			return null;
		} else {
			User user = new User();
			user.setId(0L);
			return user;
		}
	}
	
}
