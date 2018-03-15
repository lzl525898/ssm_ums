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
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

public class SecondShiroRealm extends AuthorizingRealm {

	// 用于认证的方法
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		// 将token强转为UsernamePasswordToken
		System.out.println("SecondShiroRealm....");
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
			hashedCredentials = "fe6c2688014ef583554250eadc8cf9fc249c6d91";
		} else if ("zelei".equals(userName)) {
			hashedCredentials = "38c326aef6689e547d7a57eb060151031ff9cfc4";
		} else {
			hashedCredentials = "97ce7ef67570a4d797ce7ef67570a4d7";
		}
		ByteSource credentialsSalt = ByteSource.Util.bytes(userName);
		String realmName = getName();
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal, hashedCredentials, credentialsSalt, realmName);
		return info;
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		Set<String> roles = new HashSet<String>();
		roles.add("user");
		Object principal = principals.getPrimaryPrincipal();
		if ("admin".equals(principal)) {
			roles.add("admin");
		}
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roles);
		return info;
	}
}
