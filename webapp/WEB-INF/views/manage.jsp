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
	<jsp:include page="popup.jsp"></jsp:include>
	<shiro:hasAnyRoles name="user">
		<div id="wrapper">
			<div class="overlay"></div>
			<!-- Sidebar -->
			<nav class="navbar navbar-inverse navbar-fixed-top" id="sidebar-wrapper" role="navigation">
				<ul class="nav sidebar-nav">
					<li class="sidebar-brand"><a href="${APP_PATH }/manage">
							人工智能云课堂 </a></li>
					<shiro:hasAnyRoles name="admin">
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							id="system_manage" data-toggle="dropdown"> <i
								class="fa fa-fw fa-plus"></i> 系统管理 <span class="caret"></span>
						</a>
							<ul class="dropdown-menu" role="menu">
								<li class="dropdown-header">管理员可用</li>
								<li manage_type="system_manage_user"><a href="javascript:;">用户管理</a></li>
								<li manage_type="system_manage_config"><a href="javascript:;">配置管理</a></li>
							</ul></li>
					</shiro:hasAnyRoles>
					<li><a href="#"><i class="fa fa-fw fa-twitter"></i> Last page</a></li>
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
				// 点击菜单栏的响应事件
				$(".sidebar-nav").on("click","li",function(e){
					// 防止点击后关闭菜单栏
					e.stopPropagation(); 
					// 处理各种管理item
					handleManager($(this).attr("manage_type"));
				});
				// 设置分页容器宽度
				$("#paging-information").width($(".ums-user-manage").width());
				// 跳转到哪页
				to_page("user",1);
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
			function handleManager(type){
				if (type=="system_manage_user") {
					alert("用户管理");
				} else if (type=="system_manage_config") {
					alert("配置管理");
				}
			}
			// 跳转到指定table页
			function to_page(type, pn){
				if (type=='user') {
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
				}					
			}
			//用户 点击添加用户
			$("#user_add_modal_btn").click(function(){
				userAddModalShow();
			});
			//用户 点击全部删除，批量删除
			$("#user_delete_all_btn").click(function(){
				var userNames = "";
				var delNameStr = "";
				$.each($(".check_user_item:checked"),function(){
					//this
					userNames += $(this).parents("tr").find("td:eq(2)").text()+",";
					//组装员工name字符串
					delNameStr += $(this).parents("tr").find("td:eq(2)").text()+"-";
				});
				if (delNameStr=="" || userNames=="") {
					alertShow("请先选择要删除的用户...");
					return;
				}
				//去除userNames多余的,
				userNames = userNames.substring(0, userNames.length-1);
				//去除删除的userNames多余的-
				delNameStr = delNameStr.substring(0, delNameStr.length-1);
				$("#dialogOk").attr("btn-type", "user-delete");
				$("#dialogOk").attr("del-names", delNameStr);
				dialogShow("确认删除【"+userNames+"】吗？");
			});
			// dialog按钮相应
			$("#dialogOk").click(function(){
				if ("user-delete" == $(this).attr("btn-type")) {
					//发送ajax请求删除
					$.ajax({
						url:"${APP_PATH}/user/user/"+$(this).attr("del-names"),
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
				}
			});
			// 用户权限响应
			$("#authModalOk").click(function(){
				$.ajax({
					url: "${APP_PATH}/user/role/"+$("#authModalOk").attr("current-user-id"),
					data: $("#authModalContent form").serialize(),
					type: "PUT",
					success: function(result){
						authModalHide();
						if (0==result.code) {
							alertShow("请稍后再试...");
						}
					},
					error: function(){
						authModalHide();
						alertShow("请稍后再试...");
					}
				});
			});
			// 用户编辑响应
			$("#userEditModalOk").click(function(){
				console.log($("#userEditModalContent form").serialize());
				$.ajax({
					url: "${APP_PATH}/user/user/"+$("#userEditModalOk").attr("current-user-id"),
					data: $("#userEditModalContent form").serialize(),
					type: "PUT",
					success: function(result){
						userEditModalHide();
						if (0==result.code) {
							alertShow("请稍后再试...");
						}
						//回到当前页面
						to_page("user", currentPage);
						
					},
					error: function(){
						userEditModalHide();
						alertShow("请稍后再试...");
					}
				});
			});
			// 用户添加响应
			$("#userAddModalOk").click(function(){
				var role;
				var formSerialize = $($("#userAddModalOk").attr("create-user-type")).find("form").serialize();
				if ($("#userAddModalOk").attr("create-user-type")=="#createUserWithParent"){
					role = "P";  // 家长
				} else {
					role = "T";  // 教师
				}
				$.ajax({
					url: "${APP_PATH}/user/user/"+role,
					type: "POST",
					data: formSerialize+"&role=",
					success: function(result){
						userAddModalHide();
						if (1==result.code) {
							alertShow(result.extend.username+"添加成功...");
						} else {
							// 处理表单验证信息
							handleFormValidate(result);
						}
					},
					error: function(result){
						console.log(result);
						userAddModalHide();
						alertShow("请稍后再试...");
					}
				});
			});
			// 用户 单个删除
			$(document).on("click",".user_del_btn",function(){
				//1、弹出是否确认删除对话框
				var userName = $(this).parents("tr").find("td:eq(2)").text();
				$("#dialogOk").attr("btn-type", "user-delete");
				$("#dialogOk").attr("del-names", userName);
				dialogShow("确认删除【"+userName+"】吗？");
			});
			//用户浏览
			$(document).on("click",".user_brow_btn",function(){
				var userid = $(this).parents("tr").find("td:eq(1)").text();
				$.ajax({
					url: "${APP_PATH}/user/user/"+userid,
					type: "GET",
					success: function(result){
						if (1==result.code) {
							userBrowModalShow(result.extend.user);
						} else {
							alertShow("请稍后再试...");
						}
					},
					error: function(){
						alertShow("请稍后再试...");
					},
				});
				
			});
			// 用户修改
			$(document).on("click",".user_edit_btn", function(){
				var userid = $(this).parents("tr").find("td:eq(1)").text();
				$("#userEditModalOk").attr("current-user-id", userid);
				$.ajax({
					url: "${APP_PATH}/user/user/"+userid,
					type: "GET",
					success: function(result){
						console.log(result);
						if (1==result.code) {
							userEditModalShow(result.extend.user);
						} else {
							alertShow("请稍后再试...");
						}
						
					},
					error: function(){
						alertShow("请稍后再试...");
					},
				});
			});
			//用户 权限修改
			$(document).on("click",".user_auth_btn",function(){
				var userId = $(this).parents("tr").find("td:eq(1)").text();
				$("#authModalOk").attr("current-user-id", userId);
				$.ajax({
					url: "${APP_PATH}/user/role/"+userId,
					type:"GET",
					success:function(result){
						console.log(result);
						//显示角色设置dialog
						if (1==result.code) {
							authModalShow(result.extend);
						} else {
							alertShow("请稍后再试...");
						}
					},
					error:function(){
						dialogHide();
						alertShow("请稍后再试...");
					}
				});
				
			});
			// 控制全选按钮是否被点击
			$(document).on("click", ".check_user_item", function(){
				var index = 0;
				$.each($(".check_user_item:checked"), function(){
					index++;
				});
				if (10==index) {
					$("#user_check_all").prop("checked", true);
				} else {
					$("#user_check_all").prop("checked", false);
				}
			});
			//完成全选/全不选功能
			$("#user_check_all").click(function(){
				$(".check_user_item").prop("checked",$(this).prop("checked"));
			});
			//解析并显示用户数据
			function build_user_table(result){
				//清空table表格
				$("#users_table tbody").empty();
				var users = result.extend.pageInfo.list;
				$.each(users,function(index,item){
					var checkBoxTd = $("<td style='flex: 1;'><input type='checkbox' class='check_user_item'/></td>");
					var userIdTd   = $("<td style='flex: 1;'></td>").append(item.id);
					var userNameTd = $("<td style='flex: 2;'></td>").append(item.username);
					var trueNameTd = $("<td style='flex: 2;'></td>").append(item.truename);
					var sexTd      = $("<td style='flex: 1;'></td>").append(item.sex==0?"男":"女");
					var phoneTd    = $("<td style='flex: 3;'></td>").append(item.telphone);
					var emailTd    = $("<td style='flex: 4;'></td>").append(item.email);
					var authBtn    = $("<button></button>").addClass("btn btn-warning btn-xs user_auth_btn")
									 .append($("<span></span>").addClass("glyphicon glyphicon-check")).append("&nbsp;权限");
					var editBtn    = $("<button></button>").addClass("btn btn-primary btn-xs user_edit_btn")
								     .append($("<span></span>").addClass("glyphicon glyphicon-edit")).append("&nbsp;编辑");
					var browBtn    = $("<button></button>").addClass("btn btn-info btn-xs user_brow_btn")
									 .append($("<span></span>").addClass("glyphicon glyphicon-eye-open")).append("&nbsp;浏览");
					var delBtn     = $("<button></button>").addClass("btn btn-danger btn-xs user_del_btn")
					 		         .append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("&nbsp;删除");
					var btnTd      = $("<td style='display:flex;justify-content: space-around;flex: 7;'></td>").append(authBtn).append(editBtn).append(browBtn).append(delBtn);
					$("<tr style='display: flex;'></tr>").append(checkBoxTd)
						.append(userIdTd)
						.append(userNameTd)
						.append(trueNameTd)
						.append(sexTd)
						.append(phoneTd)
						.append(emailTd)
						.append(btnTd)
						.appendTo("#users_table tbody");
				});
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
						to_page("user", 1);
					});
					prePageLi.click(function(){
						to_page("user", result.extend.pageInfo.pageNum -1);
					});
				}
				var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
				var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
				if(result.extend.pageInfo.hasNextPage == false){
					nextPageLi.addClass("disabled");
					lastPageLi.addClass("disabled");
				}else{
					nextPageLi.click(function(){
						to_page("user", result.extend.pageInfo.pageNum +1);
					});
					lastPageLi.click(function(){
						to_page("user", result.extend.pageInfo.pages);
					});
				}
				//添加首页和前一页 的提示
				ul.append(firstPageLi).append(prePageLi);
				//1,2,3遍历给ul中添加页码提示
				$.each(result.extend.pageInfo.navigatepageNums,function(index,item){
					var numLi = $("<li></li>").append($("<a></a>").append(item));
					if(result.extend.pageInfo.pageNum == item){
						numLi.addClass("active");
					}
					numLi.click(function(){
						to_page("user", item);
					});
					ul.append(numLi);
				});
				//添加下一页和末页 的提示
				ul.append(nextPageLi).append(lastPageLi);
				//把ul加入到nav
				var navEle = $("<nav></nav>").append(ul);
				navEle.appendTo("#page_nav_area");
			}
			// 处理表单验证信息
			function handleFormValidate(result){
				if (result.extend.errors.password) {
					console.log(result.extend.errors.password);
				}
			}
		</script>
	</shiro:hasAnyRoles>
</body>
</html>