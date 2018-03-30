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
	<jsp:include page="dialog.jsp"></jsp:include>
	<jsp:include page="user-popup.jsp"></jsp:include>
	<shiro:hasAnyRoles name="user">
		<div id="wrapper">
			<div class="overlay"></div>
			<!-- Sidebar -->
			<nav class="navbar navbar-inverse navbar-fixed-top"
				id="sidebar-wrapper" role="navigation">
			<ul class="nav sidebar-nav">
				<li class="sidebar-brand"><a href="${APP_PATH }/manage">
						人工智能云课堂 </a></li>
				<!-- 
				<shiro:hasAnyRoles name="admin">
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" id="system_manage" data-toggle="dropdown"> 
							<i class="fa fa-fw fa-plus"></i> 系统管理 <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li class="dropdown-header">管理员可用</li>
							<li manage_type="system_manage_user"><a href="javascript:;">用户管理</a></li>
							<li manage_type="system_manage_config"><a
								href="javascript:;">配置管理</a></li>
						</ul>
					</li>
				</shiro:hasAnyRoles>
				<li><a href="#"><i class="fa fa-fw fa-twitter"></i> Last page</a></li>
				 -->
				 <c:forEach items="${lv1menu}" var="lv1m">
				 	<li class="dropdown">
						<a href="#" class="dropdown-toggle" id="${lv1m.menupath}" data-toggle="dropdown"> 
							<i class="${lv1m.menuimage}"></i> ${lv1m.menuname} <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li class="dropdown-header">管理员可用</li>
							<c:forEach items="${lv2menu}" var="lv2m">
								<c:if test="${lv1m.id==lv2m.parentmenuid}">
									<li manage_type="${lv2m.menupath}"><a href="javascript:;">${lv2m.menuname}</a></li>
								</c:if>
							</c:forEach>
						</ul>
					 </li>
				 </c:forEach>
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
										<li><a href="#">${sessionUserName.username }</a></li>
										<li><a href="#">Something</a></li>
										<li role="separator" class="divider"></li>
										<li><a href="${APP_PATH }/shiro/logout">退出</a></li>
									</ul>
								</div>
							</div>
							<div class="ums-main">
								<div class="row ums-config-manage">
									<!-- 标题 -->
									<div class="row">
										<div class="col-md-12">
											<h1>配置管理</h1>
										</div>
									</div>
									<!-- 显示配置数据 -->
									<div class="row" style="margin-top: 47px;">
										<div class="col-md-12">
											<ul class="nav nav-pills" id="configTab">
											  <li class="active"><a href="#tab-config-wx" style="border-bottom-left-radius: 0;border-bottom-right-radius: 0;">微信平台配置</a></li>
											  <li><a href="#tab-config-wxshop" style="border-bottom-left-radius: 0;border-bottom-right-radius: 0;">微信商户平台配置</a></li>
											</ul>
											<div class="tab-content" style="height: 300px;background-color: #ffba02;">
										      <div class="tab-pane active" id="tab-config-wx" style="padding-top: 50px;">
										      	<table class="table table-hover table-bordered" id="config_table_wx">
										      		<thead>
														<tr style="display: flex;">
															<th style="flex: 1">配置项</th>
															<th style="flex: 3">配置信息</th>
															<th style="flex: 1">操作</th>
														</tr>
													</thead>
													<tbody></tbody>
												</table>
										      </div>
										      <div class="tab-pane" id="tab-config-wxshop" style="padding-top: 50px;">
										      	<table class="table table-hover table-bordered" id="config_table_wxshop">
										      		<thead>
														<tr style="display: flex;">
															<th style="flex: 1">配置项</th>
															<th style="flex: 3">配置信息</th>
															<th style="flex: 1">操作</th>
														</tr>
													</thead>
													<tbody></tbody>
												</table>
										      </div>
										    </div>
										</div>
									</div>
								</div>
								<div class="row ums-user-manage">
									<!-- 标题 -->
									<div class="row">
										<div class="col-md-12">
											<h1>用户管理</h1>
										</div>
									</div>
									<!-- 按钮 -->
									<div class="row">
										<div style="display: flex; justify-content: flex-end; margin-right: 20px;">
											<button class="btn btn-primary" id="user_add_modal_btn">
												<span class="glyphicon glyphicon-plus"></span>&nbsp;新增
											</button>
											&nbsp;&nbsp;&nbsp;
											<button class="btn btn-danger" id="user_delete_all_btn">
												<span class="glyphicon glyphicon-trash"></span>&nbsp;删除
											</button>
										</div>
									</div>
									<!-- 显示表格数据 -->
									<div class="row" style="padding-top: 45px;">
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
														<th style="flex: 2">用户角色</th>
														<th style="flex: 1">性别</th>
														<th style="flex: 3">手机</th>
														<th style="flex: 4">邮箱</th>
														<th style="flex: 7">操作</th>
													</tr>
												</thead>
												<tbody></tbody>
											</table>
										</div>
									</div>
									<!-- 显示分页信息 -->
									<div id="paging-information" style="position: fixed;top: 90%; width: 55%;">
										<div class="row" style="margin-top: 15px;">
											<!--分页文字信息  -->
											<div class="col-md-6" id="page_info_area"></div>
											<!-- 分页条信息 -->
											<div class="col-md-6"
												style="display: flex; justify-content: flex-end;margin-top: -30px;"
												id="page_nav_area"></div>
										</div>
									</div>
								</div>
								<!-- 显示菜单数据 -->
								<div class="row ums-menu-manage">
										<!-- 标题 -->
										<div class="row">
											<div class="col-md-12">
												<h1>菜单管理</h1>
											</div>
										</div>
										<!-- 按钮 -->
										<div class="row">
											<div style="display: flex; justify-content: flex-end; margin-right: 20px;">
												<button class="btn btn-primary" id="menu_add_modal_btn">
													<span class="glyphicon glyphicon-plus"></span>&nbsp;新增
												</button>
											</div>
										</div>
										<!-- 显示菜单数据 -->
										<div class="row" style="padding-top: 45px;">
											<div class="col-md-12">
												<table class="table table-hover table-bordered"
													id="menus_table">
													<thead>
														<tr style="display: flex;">
															<th style="flex: 1">菜单名</th>
															<th style="flex: 1">菜单路径</th>
															<th style="flex: 1">菜单等级</th>
															<th style="flex: 1">父菜单</th>
															<th style="flex: 1">操作</th>
														</tr>
													</thead>
													<tbody></tbody>
												</table>
											</div>
										</div>
										<!-- 显示分页信息 -->
										<div id="paging-information-menu" style="position: fixed;top: 90%; width: 55%;">
											<div class="row" style="margin-top: 15px;">
												<!--分页文字信息  -->
												<div class="col-md-6" id="page_info_area_menu"></div>
												<!-- 分页条信息 -->
												<div class="col-md-6"
													style="display: flex; justify-content: flex-end;margin-top: -30px;"
													id="page_nav_area_menu"></div>
											</div>
										</div>
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
		<script src="${APP_PATH }/static/js/validate/jquery.validate.min.js"></script>
		<script src="${APP_PATH }/static/js/validate/additional-methods.min.js"></script>
		<script src="${APP_PATH }/static/js/validate/user.rule.message.js"></script>
		<script src="${APP_PATH }/static/js/city/distpicker.data.js"></script>
		<script src="${APP_PATH }/static/js/city/distpicker.js"></script>
		<script src="${APP_PATH }/static/js/school.js"></script>
		<script src="${APP_PATH }/static/js/menu/base.js"></script>
		<script src="${APP_PATH }/static/js/user/base.js"></script>
		<script src="${APP_PATH }/static/js/config/base.js"></script>
		<script type="text/javascript">
			// 应用根路径
			var APP_PATH = "${APP_PATH}";
			// 分页信息
			var totalRecord, currentPage;
			$(function(){
				// 响应配置信息tab页
				$('#configTab a').click(function (e) {
				  e.preventDefault();
				  $(this).tab('show');
				});
				// 初始化学校select
				areaBind("${APP_PATH}/school/getSchool", "school", "s_province", "s_city", "s_area");
				$("#teacherRegDistpicker").distpicker();
				// 用于表单验证
				$("#createUserWithTeacher form").validate({
					debug : false,
					rules : userManager.teacher.rules,
					messages:userManager.teacher.messages,
					showErrors: errorCallBackWithTeacher
				});
				$("#createUserWithParent form").validate({
					debug : false,
					rules : userManager.parent.rules,
					messages:userManager.parent.messages,
					showErrors: errorCallBackWithParent
				});
			});
			$(function() {
				// 控制显示菜单当前项为用户管理页面
				handleManager("system_manage_user");
				// 点击菜单栏的响应事件
				$(".sidebar-nav").on("click","li",function(e){
					// 防止点击后关闭菜单栏
					e.stopPropagation(); 
					// 处理各种管理item
					handleManager($(this).attr("manage_type"));
				});
				// 设置分页容器宽度
				$("#paging-information").width($(".ums-user-manage").width());  // 用户分页
				$("#paging-information-menu").width($(".ums-user-manage").width()); // 菜单分页
				// 菜单栏初始化相关信息
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
				// 设置系统管理下拉展开
				menuItemDropdown("#system_manage");
				// 显示菜单功能
				$('[data-toggle="offcanvas"]').click(function() {
					$('#wrapper').toggleClass('toggled');
				});
				// 显示菜单项功能
				function menuItemDropdown(id){
					$(id).dropdown('toggle');
				}
				//------菜单栏初始化相关信息 ------//
			});
			// 处理个页面的数据请求
			function handleManager(type){
				if (type=="system_manage_user") { // 用户管理
					// 跳转到哪页
					to_page("user",1);
					handleShowOrHideContent(".ums-user-manage");
				} else if (type=="system_manage_config") { // 配置管理
					// 获取配置管理信息
					get_config_info();
					handleShowOrHideContent(".ums-config-manage");
				} else if (type=="system_manage_menu") { // 菜单管理
					// 获取菜单信息
					to_page("menu", 1);
					handleShowOrHideContent(".ums-menu-manage");
				}
			}
			// 获取配置管理相关信息
			function get_config_info(){
				$.ajax({
					url: "${APP_PATH}/sys/config",
					type: "GET",
					success: function(result){
						build_config_table(result);
					},
					error: function(){
						alert("请检查网络...");
					}
				});
			}
			// 跳转到指定table页
			function to_page(type, pn){
				if (type=='user') { // 用户table
					$.ajax({
						url:"${APP_PATH}/user/users",
						data:"pn="+pn,
						type:"GET",
						success:function(result){
							//1、解析并显示员工数据
							build_user_table(result);
							//2、解析并显示分页信息
							build_page_info(result);
							//3、解析显示分页条数据
							build_page_nav(result);
						}
					});
				} else if (type=='menu') { // 菜单table
					$.ajax({
						url: "${APP_PATH}/menu/menu",
						data: "pn="+pn,
						type: "GET",
						success: function(result){
							//1、构建菜单表格
							build_menu_table(result);
							//2、解析并显示分页信息
							build_menu_page_info(result);
							//3、解析显示分页条数据
							build_menu_page_nav(result);
						},
						error: function(){
							alert("网络异常...");
						}
					});
				}					
			}
			
			// 控制显示菜单当前项
			function handleShowOrHideContent(itemClass){
				var classArray = [".ums-user-manage", ".ums-menu-manage", ".ums-config-manage"];
				for (var i=0;i<classArray.length;i++) {
					$(classArray[i]).hide();
				}
				$(itemClass).show();
			}
						
			// dialog按钮相应
			$("#dialogOk").click(function(){
				if ("user-delete" == $(this).attr("btn-type")) {
					//发送ajax请求删除
					$.ajax({
						url:"{$APP_PATH}/user/user/"+$(this).attr("del-names"),
						type:"DELETE",
						success:function(result){
							dialogHide();
							//回到当前页面
							to_page("user", currentPage);
						},
						error:function(){
							dialogHide();
							alertShow("请稍后再试...");
						}
					});
				} else if ("config-reset" == $(this).attr("btn-type")) {
					$.ajax({
						url:"${APP_PATH}/sys/config/"+$(this).attr("reset-names")+"/empty",
						type:"PUT",
						success:function(result){
							dialogHide();
							//回到当前配置
							if (result.code==1) {
								get_config_info();
							} else {
								alertShow("请稍后再试...");
							}
						},
						error:function(){
							dialogHide();
							alertShow("请稍后再试!!!");
						}
					});
				} else if ("menu-del" == $(this).attr("btn-type")) {
					$.ajax({
						url:"${APP_PATH}/menu/menu/"+$(this).attr("menu-id")+"/"+$(this).attr("parent-id"),
						type:"DELETE",
						success:function(result){
							dialogHide();
							//回到当前配置
							if (result.code==1) {
								window.location.href = "${APP_PATH}"+result.extend.url;
							//	to_page("menu", currentPage);
							} else {
								alertShow("请稍后再试...");
							}
						},
						error:function(){
							dialogHide();
							alertShow("请稍后再试!!!");
						}
					});
				}
			});
		</script>
	</shiro:hasAnyRoles>
</body>
</html>