<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
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
	<shiro:hasAnyRoles name="user">
		<div id="wrapper">
			<div class="overlay"></div>
			<!-- Sidebar -->
			<nav class="navbar navbar-inverse navbar-fixed-top"
				id="sidebar-wrapper" role="navigation">
			<ul class="nav sidebar-nav">
				<li class="sidebar-brand"><a href="${APP_PATH }/manage">
						人工智能云课堂 </a></li>
				<shiro:hasAnyRoles name="admin">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> <i class="fa fa-fw fa-plus"></i> 系统管理
							<span class="caret"></span>
					</a>
						<ul class="dropdown-menu" role="menu">
							<li class="dropdown-header">管理员可用</li>
							<li><a href="#">用户管理</a></li>
							<li><a href="#">配置管理</a></li>
						</ul></li>
				</shiro:hasAnyRoles>
				<li><a href="#"><i class="fa fa-fw fa-folder"></i> Page one</a></li>
				<li><a href="#"><i class="fa fa-fw fa-file-o"></i> Second
						page</a></li>
				<li><a href="#"><i class="fa fa-fw fa-cog"></i> Third page</a></li>
				<shiro:hasAnyRoles name="admin,teacher">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"><i class="fa fa-fw fa-plus"></i>
							Dropdown <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li class="dropdown-header">Dropdown heading</li>
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li><a href="#">Separated link</a></li>
							<li><a href="#">One more separated link</a></li>
						</ul></li>
				</shiro:hasAnyRoles>
				<li><a href="#"><i class="fa fa-fw fa-bank"></i> Page four</a></li>
				<li><a href="#"><i class="fa fa-fw fa-dropbox"></i> Page 5</a></li>
				<li><a href="#"><i class="fa fa-fw fa-twitter"></i> Last
						page</a></li>
			</ul>
			</nav>
			<!-- 页面主内容 -->
			<div id="page-content-wrapper">
				<button type="button"
					class="hamburger is-closed animated fadeInLeft"
					data-toggle="offcanvas">
					<span class="hamb-top"></span> <span class="hamb-middle"></span> <span
						class="hamb-bottom"></span>
				</button>
				<div class="container">
					<div class="row">
						<div class="col-lg-10 col-lg-offset-1">
							<div class="ums-nav">
								<div class="ums-nav-info">
									<img class="img-circle" id="avatar_info"
										dropdown-toggle" data-toggle="dropdown"
										src="${APP_PATH }/static/img/avatar.jpg" /> &nbsp;&nbsp; <span
										class="glyphicon glyphicon-triangle-bottom"></span>
									<ul class="dropdown-menu dropdown-menu-right">
										<li><a href="#">${sessionIsLogin.username }</a></li>
										<li><a href="#">Another action</a></li>
										<li><a href="#">Something else here</a></li>
										<li role="separator" class="divider"></li>
										<li><a href="${APP_PATH }/shiro/logout">退出</a></li>
									</ul>
								</div>
							</div>
							<div class="ums-main">
								<div class="row ums-user-manage"
									style="background-color: #ffba02;">
									<!-- 标题 -->
									<div class="row">
										<div class="col-md-12">
											<h1>用户管理</h1>
										</div>
									</div>
									<!-- 按钮 -->
									<div class="row">
										<div class="col-md-4 col-md-offset-10">
											<button class="btn btn-primary" id="user_add_modal_btn">新增</button>
											<button class="btn btn-danger" id="user_delete_all_btn">删除</button>
										</div>
									</div>
									<!-- 显示表格数据 -->
									<div class="row">
										<div class="col-md-12">
											<table class="table table-hover table-bordered"
												id="users_table">
												<thead>
													<tr style="display: flex;">
														<th style="flex: 1;"><input type="checkbox"
															id="user_check_all" /></th>
														<th style="flex: 1">ID</th>
														<th style="flex: 2">用户名</th>
														<th style="flex: 2">真实姓名</th>
														<th style="flex: 1">性别</th>
														<th style="flex: 3">手机</th>
														<th style="flex: 4">邮箱</th>
														<th style="flex: 7">操作</th>
													</tr>
												</thead>
												<tbody>

												</tbody>
											</table>
										</div>
									</div>
									<!-- 显示分页信息 -->
									<div class="row">
										<!--分页文字信息  -->
										<div class="col-md-6" id="page_info_area">
											13123131231231</div>
										<!-- 分页条信息 -->
										<div class="col-md-6" id="page_nav_area">asdfasf</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- /#页面主内容 -->
		</div>
		<script src="${APP_PATH }/static/js/jquery-3.3.1.min.js"></script>
		<script src="${APP_PATH }/static/bootstrap-3.3.7/js/bootstrap.min.js"></script>
		<script type="text/javascript">
			var totalRecord, currentPage;
			$(function() {
				to_page("user",1);
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
			// 跳转到指定table页
			function to_page(type, pn){
				if (type=='user') {
					$.ajax({
						url:"${APP_PATH}/user/users",
						data:"pn="+pn,
						type:"GET",
						success:function(result){
							console.log(result);
							//1、解析并显示员工数据
							//build_user_table(result);
							//2、解析并显示分页信息
							build_page_info(result);
							//3、解析显示分页条数据
							//build_page_nav(result);
						}
					});
				}					
			}
			//解析显示分页信息
			function build_page_info(result){
				$("#page_info_area").empty();
				$("#page_info_area").append("当前"+result.extend.pageInfo.pageNum+"页,总"+
						result.extend.pageInfo.pages+"页,总"+
						result.extend.pageInfo.total+"条记录");
				totalRecord = result.extend.pageInfo.total;
				currentPage = result.extend.pageInfo.pageNum;
			}
			//解析显示分页条，点击分页要能去下一页....
			function build_page_nav(result){
				//page_nav_area
				$("#page_nav_area").empty();
				var ul = $("<ul></ul>").addClass("pagination");
				
				//构建元素
				var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
				var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
				if(result.extend.pageInfo.hasPreviousPage == false){
					firstPageLi.addClass("disabled");
					prePageLi.addClass("disabled");
				}else{
					//为元素添加点击翻页的事件
					firstPageLi.click(function(){
						to_page(1);
					});
					prePageLi.click(function(){
						to_page(result.extend.pageInfo.pageNum -1);
					});
				}
				
				
				
				var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
				var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
				if(result.extend.pageInfo.hasNextPage == false){
					nextPageLi.addClass("disabled");
					lastPageLi.addClass("disabled");
				}else{
					nextPageLi.click(function(){
						to_page(result.extend.pageInfo.pageNum +1);
					});
					lastPageLi.click(function(){
						to_page(result.extend.pageInfo.pages);
					});
				}
				
				
				
				//添加首页和前一页 的提示
				ul.append(firstPageLi).append(prePageLi);
				//1,2，3遍历给ul中添加页码提示
				$.each(result.extend.pageInfo.navigatepageNums,function(index,item){
					
					var numLi = $("<li></li>").append($("<a></a>").append(item));
					if(result.extend.pageInfo.pageNum == item){
						numLi.addClass("active");
					}
					numLi.click(function(){
						to_page(item);
					});
					ul.append(numLi);
				});
				//添加下一页和末页 的提示
				ul.append(nextPageLi).append(lastPageLi);
				
				//把ul加入到nav
				var navEle = $("<nav></nav>").append(ul);
				navEle.appendTo("#page_nav_area");
			}
		</script>
	</shiro:hasAnyRoles>
</body>
</html>