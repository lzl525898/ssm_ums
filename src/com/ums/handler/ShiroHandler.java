package com.ums.handler;

import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ums.utils.GeneratingHTML;
import com.ums.utils.ReqResult;

@Controller
@RequestMapping("/shiro")
public class ShiroHandler {
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public ReqResult login(@RequestParam("username") String username, @RequestParam("password") String password) {
		Subject currentUser = SecurityUtils.getSubject();
		if (!currentUser.isAuthenticated()) {
			// 把用户名封装成UsernamePasswordToken对象
			UsernamePasswordToken token = new UsernamePasswordToken(username, password);
			token.setRememberMe(true);
			try {
				currentUser.login(token);
			} catch (AuthenticationException e) {
				// TODO Auto-generated catch block
				return ReqResult.fail().add("info", GeneratingHTML.genLoginError());
			}
		}
		return ReqResult.success().add("url", "manage");
	}
}
