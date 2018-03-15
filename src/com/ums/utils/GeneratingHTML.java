package com.ums.utils;

import java.util.HashMap;
import java.util.Map;

public class GeneratingHTML {
	
	private static final String SUCCESS_ICON = "success"; 
	private static final String WARNING_ICON = "warning"; 
	private static final String ERROR_ICON   = "error"; 
	
	//生成input标记
	public static String genGlyphicon(String status) {
		String glyphicon;
		if (SUCCESS_ICON.equals(status)) {
			glyphicon = "<span class='glyphicon glyphicon-ok form-control-feedback'></span>";
		} else if (WARNING_ICON.equals(status)) {
			glyphicon = "<span class='glyphicon glyphicon-warning-sign form-control-feedback'></span>";
		} else if (ERROR_ICON.equals(status)) {
			glyphicon = "<span class='glyphicon glyphicon-remove form-control-feedback'></span>";
		} else {
			glyphicon = "<span class='glyphicon glyphicon-ok form-control-feedback'></span>";
		}
		return glyphicon;
	}
	
	// 登录验证返回
	public static Map<String, Object> genLoginError() {
		Map<String, Object> map = new HashMap<>();
		map.put("id", "#validateInfo");
		map.put("dom", "<label id='validateInfo' class='control-label' style='padding: 0; margin:2px 0 -14px 0;color:red'>用户名或密码错误</label>");
		return map;
	}
}
