package com.ums.utils;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.util.ByteSource;

public class ShiroRealm extends AuthenticatingRealm {

	// 用于认证的方法
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		// 将token强转为UsernamePasswordToken
		UsernamePasswordToken currentUser = (UsernamePasswordToken) token;
		// 获取登录用户名
		String userName = currentUser.getUsername();
		if ("liuyanming".equals(userName)) {
			System.out.println("用户不存在");
			throw new UnknownAccountException("用户不存在...");
		}
		Object principal = userName;
		Object hashedCredentials = null;
		if ("admin".equals(userName)) {
			hashedCredentials = "cf2f84b6b83710fd7442ede509c95012";
		} else if ("zelei".equals(userName)) {
			hashedCredentials = "97ce7ef67570a4d730f6b929fb77faef";
		} else {
			hashedCredentials = "97ce7ef67570a4d797ce7ef67570a4d7";
		}
		ByteSource credentialsSalt = ByteSource.Util.bytes(userName);
		String realmName = getName();
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal, hashedCredentials, credentialsSalt, realmName);
		return info;
	}
}
