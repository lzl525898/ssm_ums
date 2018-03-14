package com.ums.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Map<String, Object> map) {
		map.put("logoImg", "http://bpic.588ku.com/element_origin_min_pic/20/16/02/1956c6bbc1bbf9b.jpg");
		return "login";
	}
	
	@RequestMapping(value="/manage", method=RequestMethod.GET)
	public String intoManage(Map<String, Object> map) {
		map.put("name", "liangzelei");
		return "manage";
	}
}
