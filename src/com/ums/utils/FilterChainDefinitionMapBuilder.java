package com.ums.utils;

import java.util.LinkedHashMap;

public class FilterChainDefinitionMapBuilder {
/*
 	配置哪些页面需要受保护. 
 	以及访问这些页面需要的权限. 
 	1). anon 可以被匿名访问
 	2). authc 必须认证(即登录)后才可能访问的页面. 
 	3). logout 登出.
 	4). roles 角色过滤器
*/
	public LinkedHashMap<String, String> buildFilterChainDefinitionMap(){
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("/index.jsp", "anon");
		map.put("/login", "anon");
		map.put("/shiro/login", "anon");
		map.put("/static/**", "anon");
		map.put("/manage", "user");
//		map.put("/manage", "authc,roles[admin]");
		map.put("/shiro/logout", "logout");
		map.put("/**", "rememberAuthFilter");
//		map.put("/**", "authc");
		return map;
	}
	
}
