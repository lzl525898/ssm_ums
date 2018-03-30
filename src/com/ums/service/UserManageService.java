package com.ums.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ums.bean.Role;
import com.ums.bean.User;
import com.ums.bean.UserExample;
import com.ums.bean.UserExample.Criteria;
import com.ums.dao.RoleMapper;
import com.ums.dao.UserMapper;

@Service
public class UserManageService {
	
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private RoleMapper roleMapper;
	
	// 查询所有用户
	public List<User> getAll(){
		return userMapper.selectByExample(null);
	}
	// 添加新建用户
	public int addUser(User user) {
		return userMapper.insert(user);
	}
	// 更新用户信息
	public int updateUser(User user) {
		return userMapper.updateByPrimaryKeySelective(user);
	}
	// 按照id查询用户
	public User getUserById(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}
	// 按照id删除用户
	public int deleteUserById(Long id) {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(id);
	}
	// 批量删除用户(按用户名)
	public void deleteBatch(List<String> names) {
		UserExample userExample = new UserExample();
		Criteria criteria = userExample.createCriteria();
		criteria.andUsernameIn(names);
		userMapper.deleteByExample(userExample);
	} 
	
	// 获取系统中用户权限
	public List<Role> getRolesAll() {
		return roleMapper.selectByExample(null);
	}
}
