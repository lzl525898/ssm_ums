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
						<form class="form-horizontal">
							<div class="form-group has-success has-feedback">
								<label class="control-label col-sm-2" for="inputSuccess3">用户名:</label>
								<div class="col-sm-8">
									<input type="text" class="form-control" name="account" id="inputName"> 
									<span class="glyphicon glyphicon-ok form-control-feedback"></span>
								</div>
							</div>
							<div class="form-group has-success has-feedback">
								<label class="control-label col-sm-2" for="inputSuccess3">密&nbsp;&nbsp;码:</label>
								<div class="col-sm-8">
									<input type="text" class="form-control" name="passWord" id="inputPwd"> 
									<span class="glyphicon glyphicon-ok form-control-feedback"></span>
									<label class="control-label" for="inputPwd">Input with success</label>
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
		
		});
	</script>
</body>
</html>