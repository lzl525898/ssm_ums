<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="APP_PATH" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<link rel="stylesheet" type="text/css" href="${APP_PATH }/static/bootstrap-3.3.7/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="${APP_PATH }/static/css/main.css"/>
</head>
<body>
	<div style="height: 100%; padding: 100px;">
		<div class="ums_container">
			<div class="login_container">
				<div class="logo_container">
					<img src="${logoImg }" />
				</div>
				<div style="height: 70%; border: 1px solid #e6e6e6;"></div>
				<div class="info_container">
					<div class="infos">
						<form class="form-horizontal" id="form_user_login">
							<div class="form-group has-success has-feedback">
								<div style="display: flex; align-items: baseline;">
									<label class="control-label col-sm-3 col-md-3 col-lg-3"
										for="inputName">用户名 :</label>
									<div class="col-sm-7 col-md-7 col-lg-7">
										<input type="text" class="form-control" name="username"
											id="inputName"> <span
											class="glyphicon glyphicon-ok form-control-feedback"></span>
									</div>
								</div>
							</div>
							<div class="form-group has-success has-feedback">
								<div style="display: flex; align-items: baseline;">
									<label class="control-label col-sm-3 col-md-3 col-lg-3"
										for="inputPwd">密&nbsp;&nbsp;&nbsp;码 :</label>
									<div class="col-sm-7 col-md-7 col-lg-7">
										<input type="password" class="form-control" name="password"
											id="inputPwd"> <span
											class="glyphicon glyphicon-ok form-control-feedback"></span>
											<!-- 
										<label class="control-label" for="inputPwd">Input with
											success</label>
											 -->
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-3 col-md-3 col-lg-3"></div>
								<div class="col-sm-7 col-md-7 col-lg-7">
									<input type="checkbox" id="checkRemember" name="rememberMe"
										style="display: inline-block; vertical-align: middle; margin-bottom: 4px;" />
									<label for="checkRemember"
										style="font-size: 10px; color: #cccccc;">&nbsp;记住密码</label>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-3 col-md-3 col-lg-3"></div>
								<div class="col-sm-7 col-md-7 col-lg-7">
									<div style="display: flex;justify-content:space-between;">
										<button type="button" class="btn btn-primary" style="width: 45%" id="loginBtn">登录</button>
										<button type="button" class="btn btn-warning" style="width: 45%" id="resetBtn">重置</button>
									</div>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<script type="text/javascript" src="${APP_PATH }/static/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="${APP_PATH }/static/bootstrap-3.3.7/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		$(function(){
			$("#loginBtn").click(function(){
				$.ajax({
					url: "${APP_PATH}/shiro/login",
					type:"POST",
					data:$("#form_user_login").serialize(),
					success: function(result){
						console.log(result);
						window.location.href = "${APP_PATH}/"+result.message;
					}
				});
			});
		});
	</script>
</body>
</html>