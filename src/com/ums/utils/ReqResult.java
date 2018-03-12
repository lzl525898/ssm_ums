package com.ums.utils;

import java.util.HashMap;
import java.util.Map;

public class ReqResult {
	// 1-->ok   0-->no
	private Integer code; 
	// 提示信息
	private String message;
	//用户要返回给浏览器的数据
	private Map<String, Object> extend = new HashMap<String, Object>();
	
	public static ReqResult success() {
		ReqResult requestResult = new ReqResult();
		requestResult.setMessage("处理成功...");
		requestResult.setCode(1);
		return requestResult;
	}
	
	public static ReqResult success(String msg) {
		ReqResult requestResult = new ReqResult();
		requestResult.setMessage(msg);
		requestResult.setCode(1);
		return requestResult;
	}
	
	public static ReqResult fail() {
		ReqResult requestResult = new ReqResult();
		requestResult.setMessage("处理失败...");
		requestResult.setCode(0);
		return requestResult;
	}
	
	public static ReqResult fail(String msg) {
		ReqResult requestResult = new ReqResult();
		requestResult.setMessage(msg);
		requestResult.setCode(0);
		return requestResult;
	}
	
	public ReqResult add(String key,Object value) {
		this.getExtend().put(key, value);
		return this;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Object> getExtend() {
		return extend;
	}

	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}
}
