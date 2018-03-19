package com.ums.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login( Map<String, Object> map) {
		map.put("logoImg", "http://bpic.588ku.com/element_origin_min_pic/20/16/02/1956c6bbc1bbf9b.jpg");
		return "login";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/manage", method=RequestMethod.GET)
	public String intoManage(HttpServletRequest request, Map<String, Object> map) {
		Map<String, Object> isLoginMap;
		HttpSession httpSession = request.getSession(false);
		if (httpSession!=null) {
			isLoginMap =  (Map<String, Object>) httpSession.getAttribute("sessionIsLogin");
		}else {
			isLoginMap = null;
		}
		map.put("sessionUserName", isLoginMap);
		return "manage";
	}
}
