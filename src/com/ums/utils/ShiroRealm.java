package com.ums.utils;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

public class ShiroRealm extends AuthorizingRealm {

	// 用于认证的方法
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		// 将token强转为UsernamePasswordToken
		System.out.println("firstShiroRealm....");
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
	// 用于授权的方法
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principas) {
		// 设置基本角色
		Set<String> roles = new HashSet<String>();
		roles.add("user");
		// 获取登录用户信息
		Object principal = principas.getPrimaryPrincipal();
		// 利用登录用户信息获取当前用户角色或权限
		if ("admin".equals(principal)) {
			roles.add("admin");
		}
		// 创建SimpleAuthorizationInfo，并设置其roles属性
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roles);
		// 返回SimpleAuthorizationInfo对象
		return info;
	}
}
