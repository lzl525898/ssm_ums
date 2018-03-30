package com.ums.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ums.service.SysConfigService;
import com.ums.utils.PropertyUtil;
import com.ums.utils.ReqResult;

@Controller
@RequestMapping(value="/sys")
public class SysConfigController {
	
	@Autowired
	private SysConfigService sysConfigService;
	
	// 获取配置信息
	@RequestMapping(value="/config", method=RequestMethod.GET)
	@ResponseBody
	public ReqResult getConfigInfo() {
		Map<String, String> map = PropertyUtil.getProperties();
		return ReqResult.success().add("configInfo", map);
	}
	
	// 更新配置信息
	@RequestMapping(value="/config/{key}/{value}", method=RequestMethod.PUT)
	@ResponseBody
	public ReqResult updateConfigInfo(@PathVariable("key")String configKey, @PathVariable("value")String configValue, HttpServletRequest request) {
		sysConfigService.handleWXProperties(configKey, configValue, request);
		return ReqResult.success();
	}
}
