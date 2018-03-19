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
import org.springframework.beans.factory.annotation.Autowired;

import com.ums.service.GlobalUserService;
import com.ums.bean.User;

public class ShiroRealm extends AuthorizingRealm {

	@Autowired
	private GlobalUserService globalUserService;
	// 用于认证的方法
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// 将token强转为UsernamePasswordToken
		System.out.println("开始验证用户信息....");
		UsernamePasswordToken currentUser = (UsernamePasswordToken) token;
		// 获取登录用户名
		String userName = currentUser.getUsername();
		User myUser = globalUserService.selectByUsername(userName);
		if (myUser!=null) {
			if (myUser.getId()!=0) {
				Object principal = myUser.getUsername();
				Object hashedCredentials = myUser.getPassword();
				String realmName = getName();
				SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal, hashedCredentials, realmName);
				return info;
			}else { // 表明数据库查询异常...
				System.out.println("存在多条数据");
				throw new UnknownAccountException("存在多条数据");
			}
		}
		return null;
	}
	// 用于授权的方法
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principas) {
		// 设置基本角色
		Set<String> roles = new HashSet<String>();
		roles.add("user");
		// 获取登录用户信息
		Object principal = principas.getPrimaryPrincipal();
		User myUser = globalUserService.selectByUsername(principal.toString());
		// 利用登录用户信息获取当前用户角色或权限
		if (myUser.getUserroleid()==1) { //  管理员 
			roles.add("admin");
		} else if (myUser.getUserroleid()==5) { // 老师
			roles.add("teacher");
		}
		// 创建SimpleAuthorizationInfo，并设置其roles属性
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roles);
		// 返回SimpleAuthorizationInfo对象
		return info;
	}
}
