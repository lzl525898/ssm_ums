package com.ums.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ums.bean.Role;
import com.ums.bean.User;
import com.ums.service.UserManageService;
import com.ums.utils.ReqResult;

@Controller
@RequestMapping("/user")
public class UserManageController {
	
	@Autowired
	private UserManageService userManageService;
	
	/**
	 * 获取用户信息
	 * pn要显示指定页码
	 **/
	@RequestMapping(value="/users", method=RequestMethod.GET)
	@ResponseBody
	public ReqResult getUsers(@RequestParam(value="pn", defaultValue="1")Integer pn) {
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 10);
		List<User> userList = userManageService.getAll();
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo<User> pageInfo = new PageInfo<User>(userList, 5);
		return ReqResult.success().add("pageInfo", pageInfo);
	}
	
	/**
	 * 单个批量二合一
	 * 批量删除：a-b-c
	 * 单个删除：a
	 **/
	@RequestMapping(value="/user/{names}", method=RequestMethod.DELETE)
	@ResponseBody
	public ReqResult deleteUser(@PathVariable("names")String names) {
		List<String> delNames = new ArrayList<>();
		String[] strNames = names.split("-");
		//组装id的集合
		for (String string : strNames) {
			delNames.add(string);
		}
		userManageService.deleteBatch(delNames);
		return ReqResult.success("删除成功...");
	}
	/**
	 * 获取用户信息
	 **/
	@RequestMapping(value="/user/{id}", method=RequestMethod.GET)
	@ResponseBody
	public ReqResult getUser(@PathVariable("id")Long id) {
		User user = userManageService.getUserById(id);
		if (user==null) 
			return ReqResult.fail("查无此用户，id不正确...");
		return ReqResult.success().add("user", user);
	}
	/**
	 * 更新用户信息
	 **/
	@RequestMapping(value="/user/{id}", method=RequestMethod.PUT)
	@ResponseBody
	public ReqResult updateUser(User nUser) {
		User user = userManageService.getUserById(nUser.getId());
		if (user==null) 
			return ReqResult.fail("查无此用户，id不正确...");
		user.setAge(nUser.getAge());
		user.setSex(nUser.getSex());
		user.setEmail(nUser.getEmail());
		user.setTruename(nUser.getTruename());
		user.setTelphone(nUser.getTelphone());
		userManageService.updateUser(user);
		return ReqResult.success();
	}
	/**
	 * 添加用户信息
	 **/
	@RequestMapping(value="/user/{role}", method=RequestMethod.POST)
	@ResponseBody
	public ReqResult addUser(@Valid User user, BindingResult error, @PathVariable("role")String role) {
		if (error.hasErrors()) {
			//校验失败，应该返回失败
			Map<String, Object> map = new HashMap<>();
			List<FieldError> errors = error.getFieldErrors();
			for (FieldError fieldError : errors) {
				System.out.println("错误的字段名："+fieldError.getField());
				System.out.println("错误信息："+fieldError.getDefaultMessage());
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return ReqResult.fail().add("errors", map);
		}
		// role  grade school 
		 if("P".equals(role)) {
			 user.setUserroleid(2L);
		} else {
			user.setUserroleid(5L);
		}
		user.setSex(0);
		user.setMoney(0.0);
		user.setIsdelete(0);
		user.setIntegral(5);
		user.setParentid(0L);
		user.setUserstatus(0);
		user.setAlwayslogin(1);
		user.setHomephone(user.getTelphone());
		user.setLastlogintime(com.ums.utils.DateUtil.getNowDateLong());
		user.setCreateTime(com.ums.utils.DateUtil.getNowDateLong());
		user.setHeadimg("/ssm-ums/static/img/avatar.jpg");
		Object password = new SimpleHash("sha-256", user.getPassword());
		user.setPassword(password.toString());
		userManageService.addUser(user);
		return ReqResult.success().add("username", user.getUsername());
	}
	/**
	 * 获取用户权限列表：list
	 * 获取用户当前权限: string
	 **/
	@RequestMapping(value="/role/{id}", method=RequestMethod.GET)
	@ResponseBody
	public ReqResult getUserRole(@PathVariable("id")Long id) {
		User user = userManageService.getUserById(id);
		if (user==null) 
			return ReqResult.fail("查无此用户，id不正确...");
		Map<String,Object> roleMap = new HashMap<>();
		String curRole = "empty";
		List<Role> roleList = userManageService.getRolesAll();
		for (Role role : roleList) {
			if (role.getId()==user.getUserroleid()) {
				curRole = role.getRoleName();
			}
		}
		if ("empty".equals(curRole)) {
			return ReqResult.fail("查询权限信息错误...");
		}
		roleMap.put("roleName", curRole);
		roleMap.put("roleId", user.getUserroleid().intValue());
		return ReqResult.success().add("roles", roleList).add("curRole", roleMap);
	}
	/**
	 * 获取用户权限列表：list
	 * 获取用户当前权限: string
	 **/
	@RequestMapping(value="/role/{id}", method=RequestMethod.PUT)
	@ResponseBody
	public ReqResult updateUserRole(@PathVariable("id")Long id,HttpServletRequest request) {
		User user = userManageService.getUserById(id);
		if (user==null) 
			return ReqResult.fail("查无此用户，id不正确...");
		String roleId = request.getParameter("roleId");
		user.setUserroleid(Long.parseLong(roleId));
		userManageService.updateUser(user);
		return ReqResult.success();
	}
//  测试专用	
//	@RequestMapping(value="users", method=RequestMethod.GET)
//	public String getUsersWithUrl(@RequestParam(value="pn", defaultValue="1")Integer pn, HttpServletRequest request) {
//		// 在查询之前只需要调用，传入页码，以及每页的大小
//		PageHelper.startPage(pn, 3);
//		List<User> userList = userManageService.getAll();
//		PageInfo<User> pageInfo = new PageInfo<User>(userList, 5);
//		request.setAttribute("userList", pageInfo);
//		return "login";
//	}
}
