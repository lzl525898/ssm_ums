package com.ums.utils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

public class RememberAuthenticationFilter extends FormAuthenticationFilter {
	
	@Override
	protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
		Subject subject = getSubject(request, response);  
		//如果 isAuthenticated 为 false 证明不是登录过的，同时 isRememberd 为true 证明是没登陆直接通过记住我功能进来的  
		if(!subject.isAuthenticated() && subject.isRemembered()){  
			// 获取session看看是不是空的
			Session session = subject.getSession(true);
			if (session.getAttribute("userId") == null) {
				// 如果是空的才初始化
				String username = subject.getPrincipal().toString();
				// 在这个方法里面做初始化用户上下文的事情,设置session值
//				globalUserService.initUserContext(username, subject);
			}
		}
		//这个方法本来只返回 subject.isAuthenticated() 现在加上 subject.isRemembered() 让它同时也兼容remember这种情况  
        return subject.isAuthenticated() || subject.isRemembered(); 
	}
}
