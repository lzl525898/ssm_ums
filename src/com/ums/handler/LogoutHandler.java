package com.ums.handler;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.LogoutFilter;

public class LogoutHandler extends LogoutFilter {
	@Override
	protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		Subject subject = getSubject(request, response);
		String redirectUrl = getRedirectUrl(request,response,subject);  
		try {  
            subject.logout();  
        }catch (Exception e){
            e.printStackTrace();  
        }  
        issueRedirect(request,response,redirectUrl);  
		return false;
	}
}
