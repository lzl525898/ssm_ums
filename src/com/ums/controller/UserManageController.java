package com.ums.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ums.bean.User;
import com.ums.service.UserManageService;
import com.ums.utils.ReqResult;

@Controller
@RequestMapping("/user")
public class UserManageController {
	
	@Autowired
	private UserManageService userManageService;
	
	@RequestMapping(value="users", method=RequestMethod.GET)
	@ResponseBody
	public ReqResult getUsers(@RequestParam(value="pn", defaultValue="1")Integer pn) {
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 3);
		List<User> userList = userManageService.getAll();
		PageInfo<User> pageInfo = new PageInfo<User>(userList, 5);
		return ReqResult.success().add("pageInfo", pageInfo);
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
