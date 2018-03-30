package com.ums.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ums.bean.Menu;
import com.ums.service.MenuService;

@Controller
public class IndexController {
	
	@Autowired
	private MenuService menuService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login( Map<String, Object> map) {
		map.put("logoImg", "http://bpic.588ku.com/element_origin_min_pic/20/16/02/1956c6bbc1bbf9b.jpg");
		return "login";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/manage", method=RequestMethod.GET)
	public String intoManage(HttpServletRequest request, Map<String, Object> map) {
		// 获取后台管理菜单
		List<Menu> menuList = new ArrayList<Menu>();
		List<Menu> lv1MenuList = new ArrayList<Menu>();
		List<Menu> lv2MenuList = new ArrayList<Menu>();
		menuList = menuService.getAllMenus();
		lv1MenuList = MenuService.getLv1MenuList(menuList);
		lv2MenuList = MenuService.getLv2MenuList(menuList);
		// 获取当前登录用户信息
		Map<String, Object> isLoginMap;
		HttpSession httpSession = request.getSession(false);
		if (httpSession!=null) {
			isLoginMap =  (Map<String, Object>) httpSession.getAttribute("sessionIsLogin");
		}else {
			isLoginMap = null;
		}
		map.put("sessionUserName", isLoginMap);
		map.put("lv1menu", lv1MenuList);
		map.put("lv2menu", lv2MenuList);
		return "manage";
	}
}
