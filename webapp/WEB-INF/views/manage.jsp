<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="APP_PATH" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>管理主页</title>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css"
	href="${APP_PATH }/static/bootstrap-3.3.7/css/bootstrap.min.css" />
<link rel="stylesheet" href="${APP_PATH }/static/css/main.css">
<link rel="stylesheet" href="${APP_PATH }/static/css/style.css">
</head>
<body>
	<div id="wrapper">
		<div class="overlay"></div>
		<!-- Sidebar -->
		<nav class="navbar navbar-inverse navbar-fixed-top"
			id="sidebar-wrapper" role="navigation">
		<ul class="nav sidebar-nav">
			<li class="sidebar-brand"><a href="#"> 人工智能云课堂 </a></li>
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">
					<i class="fa fa-fw fa-plus"></i> 系统管理
					<span class="caret"></span>
				</a>
				<ul class="dropdown-menu" role="menu">
					<li class="dropdown-header">Dropdown heading</li>
					<li><a href="#">Action</a></li>
					<li><a href="#">Another action</a></li>
					<li><a href="#">Something else here</a></li>
					<li><a href="#">Separated link</a></li>
					<li><a href="#">One more separated link</a></li>
				</ul>
			</li>
			<li><a href="#"><i class="fa fa-fw fa-folder"></i> Page one</a></li>
			<li><a href="#"><i class="fa fa-fw fa-file-o"></i> Second
					page</a></li>
			<li><a href="#"><i class="fa fa-fw fa-cog"></i> Third page</a></li>
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown"><i class="fa fa-fw fa-plus"></i> Dropdown
					<span class="caret"></span></a>
				<ul class="dropdown-menu" role="menu">
					<li class="dropdown-header">Dropdown heading</li>
					<li><a href="#">Action</a></li>
					<li><a href="#">Another action</a></li>
					<li><a href="#">Something else here</a></li>
					<li><a href="#">Separated link</a></li>
					<li><a href="#">One more separated link</a></li>
				</ul></li>
			<li><a href="#"><i class="fa fa-fw fa-bank"></i> Page four</a></li>
			<li><a href="#"><i class="fa fa-fw fa-dropbox"></i> Page 5</a></li>
			<li><a href="#"><i class="fa fa-fw fa-twitter"></i> Last page</a></li>
		</ul>
		</nav>
		<!-- /#sidebar-wrapper -->

		<!-- Page Content -->
		<div id="page-content-wrapper">
			<button type="button" class="hamburger is-closed animated fadeInLeft"
				data-toggle="offcanvas">
				<span class="hamb-top"></span> <span class="hamb-middle"></span> <span
					class="hamb-bottom"></span>
			</button>
			<div class="container">
				<div class="row">
					<div class="col-lg-10 col-lg-offset-1">
						<div class="ums-nav">
							<div class="ums-nav-info">
								<img class="img-circle" id="avatar_info" dropdown-toggle" data-toggle="dropdown" src="${APP_PATH }/static/img/avatar.jpg"/>
								&nbsp;&nbsp;
								<span class="glyphicon glyphicon-triangle-bottom"></span>
								<ul class="dropdown-menu dropdown-menu-right">
									<li><a href="#">Action</a></li>
									<li><a href="#">Another action</a></li>
									<li><a href="#">Something else here</a></li>
									<li role="separator" class="divider"></li>
									<li><a href="${APP_PATH }/shiro/logout">退出</a></li>
								</ul>
							</div>
							
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- /#page-content-wrapper -->
	</div>
	<!-- /#wrapper -->
	<script src="${APP_PATH }/static/js/jquery-3.3.1.min.js"></script>
	<script src="${APP_PATH }/static/bootstrap-3.3.7/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		$(function() {
			var trigger = $('.hamburger'), overlay = $('.overlay'), isClosed = true;
				hamburger_cross();
				$('#wrapper').toggleClass('toggled');
			function hamburger_cross() {
				if (isClosed == true) {
					overlay.hide();
					trigger.removeClass('is-open');
					trigger.addClass('is-closed');
					isClosed = false;
				} else {
					overlay.show();
					trigger.removeClass('is-closed');
					trigger.addClass('is-open');
					isClosed = true;
				}
			}
			trigger.click(function() {
				hamburger_cross();
			});
			// 显示菜单功能
			$('[data-toggle="offcanvas"]').click(function() {
				$('#wrapper').toggleClass('toggled');
			});

		});
	</script>
</body>
</html>