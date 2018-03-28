package com.ums.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.ums.utils.PropertyUtil;

@Service
public class SysConfigService {
	
	
	public void handleWXProperties(String propertyKey, String propertyValue, HttpServletRequest request) {
		if ("empty".equals(propertyValue)) {
			propertyValue = "";
		}
		if ("appid".equals(propertyKey)) {
			if (null != PropertyUtil.getProperty("APPID", propertyValue)) {
				PropertyUtil.updateProperties("APPID", propertyValue, request);
			} else {
				PropertyUtil.writeProperties("APPID", propertyValue, request);
			}
		} else if ("appsecret".equals(propertyKey)) {
			if (null != PropertyUtil.getProperty("APPSECRET", propertyValue)) {
				PropertyUtil.updateProperties("APPSECRET", propertyValue, request);
			} else {
				PropertyUtil.writeProperties("APPSECRET", propertyValue, request);
			}
		} else if ("token".equals(propertyKey)) {
			if (null != PropertyUtil.getProperty("TOKEN", propertyValue)) {
				PropertyUtil.updateProperties("TOKEN", propertyValue, request);
			} else {
				PropertyUtil.writeProperties("TOKEN", propertyValue, request);
			}
		} else if ("encodingaeskey".equals(propertyKey)) {
			if (null != PropertyUtil.getProperty("ENCODINGAESKEY",propertyValue)){
	        	PropertyUtil.updateProperties("ENCODINGAESKEY",propertyValue,request);
	        }else{
	        	PropertyUtil.writeProperties("ENCODINGAESKEY",propertyValue,request);
	        }
		} else if ("partnerid".equals(propertyKey)) {
			if (null != PropertyUtil.getProperty("PARTNERID",propertyValue)){
	        	PropertyUtil.updateProperties("PARTNERID",propertyValue,request);
	        }else{
	        	PropertyUtil.writeProperties("PARTNERID",propertyValue,request);
	        }
		} else if ("partnerkey".equals(propertyKey)) {
			if (null != PropertyUtil.getProperty("PARTNERKEY",propertyValue)){
	        	PropertyUtil.updateProperties("PARTNERKEY",propertyValue,request);
	        }else{
	        	PropertyUtil.writeProperties("PARTNERKEY",propertyValue,request);
	        }
		}
	}
	
	public void handleWXProperties(HttpServletRequest request) {
		String appid = request.getParameter("appid");
		String appsecret = request.getParameter("appsecret");
		String token = request.getParameter("token");
		String encodingaeskey = request.getParameter("encodingaeskey");
        if (null != PropertyUtil.getProperty("APPID",request)){
        	PropertyUtil.updateProperties("APPID",appid,request);
        }else{
        	PropertyUtil.writeProperties("APPID",appid,request);
        }
        
        if (null != PropertyUtil.getProperty("APPSECRET",request)){
        	PropertyUtil.updateProperties("APPSECRET",appsecret,request);
        }else{
        	PropertyUtil.writeProperties("APPSECRET",appsecret,request);
        }
        
        if (null != PropertyUtil.getProperty("TOKEN",request)){
        	PropertyUtil.updateProperties("TOKEN",token,request);
        }else{
        	PropertyUtil.writeProperties("TOKEN",token,request);
        }
        
        if (null != PropertyUtil.getProperty("ENCODINGAESKEY",request)){
        	PropertyUtil.updateProperties("ENCODINGAESKEY",encodingaeskey,request);
        }else{
        	PropertyUtil.writeProperties("ENCODINGAESKEY",encodingaeskey,request);
        }
	}
}
