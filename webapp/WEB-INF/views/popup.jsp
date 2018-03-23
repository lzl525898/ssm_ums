<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="APP_PATH" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
<link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/ums-dialog.css">
<style type="text/css">
.user-brow-color {
	color: #583e7e;
}

.set-user-role-select {
	width: 200px;
}

.user-brow-content {
	height: 500px !important;
}

.user-input-style {
	width: 320px;
}

.nav-pills li a {
	border: 0 none;
	background:#7c5aae;
	color: #fff;
}

.nav-pills li a:focus {
	border: 0 none;
	background:#7c5aae;
	color: #fff;
}

.nav-pills li a:hover {
	border: 0 none;
	background:#7c5aae;
	color: #fff;
}

.nav-pills li.active a {
	border: 0 none;
	background:#ffba02;
	color: #fff;
}

.nav-pills li.active a:focus {
	border: 0 none;
	background:#ffba02;
	color: #fff;
}

.nav-pills li.active a:hover {
	border: 0 none;
	background:#ffba02;
	color: #fff;
}

</style>
</head>
<body>
	<!-- 权限设置 -->
	<div class="modal fade" id="authModal" tabindex="-1" role="dialog">
		<div class="shortModalbg">
			<!-- 系统提示  shortModalbg longModalbg-->
			<div class="modalHeaderbg">
				<div class="modalHeaderTitle">权限设置</div>
				<div class="modalClosebg">
					<button type="button" class="btn close" data-dismiss="modal">
						<img alt="X" src="${APP_PATH}/static/img/dialog/close.png">
					</button>
				</div>
			</div>
			<div class="modalContentbg">
				<div class="modalContent" id="userAuthModalContent">
					<form class="form-horizontal" style="margin-top: -5px;">
						<div class="form-group">
							<div class="col-sm-1"></div>
							<div  class="col-sm-3" style="text-align: right;">
								<label class="control-label">当前角色&nbsp;:</label>
							</div>
							<div class="col-sm-7" style="text-align: left;">
								<p class="form-control-static" id="current_role" style="color: #583e7e"></p>
							</div>
							<div class="col-sm-1"></div>
						</div>
						<div class="form-group">
							<div class="col-sm-1"></div>
							<div  class="col-sm-3" style="text-align: right;">
								<label class="control-label">设定角色&nbsp;:</label>
							</div>
							<div class="col-sm-7" style="display: flex;justify-content: flex-start;align-items: center;padding-top: 4px;">
								<select class="set-user-role-select" name="roleId">
								</select>
							</div>
						</div>
					</form>
				</div>
			</div>
			<div class="modalFooterbg">
				<button type="button" class="btn okBtn" id="authModalOk"></button>
				<button type="button" class="btn cancleBtn" data-dismiss="modal"></button>
			</div>
		</div>
	</div>
	
	<!-- 用户浏览 -->
	<div class="modal fade" id="userBrowModal" tabindex="-1" role="dialog">
		<div class="longModalbg">
			<!-- 系统提示  shortModalbg longModalbg-->
			<div class="modalHeaderbg">
				<div class="modalHeaderTitle">用户浏览</div>
				<div class="modalClosebg">
					<button type="button" class="btn close" data-dismiss="modal">
						<img alt="X" src="${APP_PATH}/static/img/dialog/close.png">
					</button>
				</div>
			</div>
			<div class="modalContentbg">
				<div class="modalContent user-brow-content"
					id="userbrowModalContent">
					<form class="form-horizontal" style="margin-top: -5px;">
						<div class="form-group">
							<label class="col-sm-3 control-label">用户名&nbsp;:</label>
							<div class="col-sm-9">
								<p class="form-control-static user-brow-color"></p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">真实姓名&nbsp;:</label>
							<div class="col-sm-9">
								<p class="form-control-static user-brow-color"></p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">性别&nbsp;:</label>
							<div class="col-sm-9">
								<p class="form-control-static user-brow-color"></p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">年龄&nbsp;:</label>
							<div class="col-sm-9">
								<p class="form-control-static user-brow-color"></p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">手机&nbsp;:</label>
							<div class="col-sm-9">
								<p class="form-control-static user-brow-color"></p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">邮箱&nbsp;:</label>
							<div class="col-sm-9">
								<p class="form-control-static user-brow-color"></p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">用户角色&nbsp;:</label>
							<div class="col-sm-9">
								<p class="form-control-static user-brow-color"></p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">创建时间&nbsp;:</label>
							<div class="col-sm-9">
								<p class="form-control-static user-brow-color"></p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">最后登录时间&nbsp;:</label>
							<div class="col-sm-9">
								<p class="form-control-static user-brow-color"></p>
							</div>
						</div>
					</form>
				</div>
			</div>
			<div class="modalFooterbg">
				<button type="button" class="btn okBtn" data-dismiss="modal"></button>
			</div>
		</div>
	</div>
	
	<!-- 用户编辑 -->
	<div class="modal fade" id="userEditModal" tabindex="-1" role="dialog">
		<div class="longModalbg">
			<!-- 系统提示  shortModalbg longModalbg-->
			<div class="modalHeaderbg">
				<div class="modalHeaderTitle">用户编辑</div>
				<div class="modalClosebg">
					<button type="button" class="btn close" data-dismiss="modal">
						<img alt="X" src="${APP_PATH}/static/img/dialog/close.png">
					</button>
				</div>
			</div>
			<div class="modalContentbg">
				<div class="modalContent user-brow-content"
					id="userEditModalContent">
					<form class="form-horizontal" style="margin-top: -5px;">
						<div class="form-group">
							<label class="col-sm-3 control-label">用户名</label>
							<div class="col-sm-9">
								<p class="form-control-static user-brow-color"></p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">性别</label>
							<div class="col-sm-9">
								<label class="radio-inline"> 
									<input type="radio" style="margin-top: -1px;"
									name="sex" id="userRadioMale" value="0"/><span>男</span>
								</label> 
								<label class="radio-inline"> 
									<input type="radio" style="margin-top: -1px;"
									name="sex" id="userRadioFemale" value="1"><span>女</span>
								</label>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label" for="userInputRealName">真实姓名</label>
							<div class="col-sm-9">
								<input type="text" class="form-control user-input-style" name="truename" id="userInputRealName"/>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">年龄</label>
							<div class="col-sm-9">
								<input type="text" class="form-control user-input-style" name="age" id="userInputAge"/>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">手机</label>
							<div class="col-sm-9">
								<input type="text" class="form-control user-input-style" name="telphone" id="userInputPhone"/>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">邮箱</label>
							<div class="col-sm-9">
								<input type="text" class="form-control user-input-style" name="email" id="userInputEmail"/>
							</div>
						</div>
					</form>
				</div>
			</div>
			<div class="modalFooterbg">
				<button type="button" class="btn okBtn" id="userEditModalOk"></button>
				<button type="button" class="btn cancleBtn" data-dismiss="modal"></button>
			</div>
		</div>
	</div>
	
	<!-- 用户添加 -->
	<div class="modal fade" id="userAddModal" tabindex="-1" role="dialog">
		<div class="longModalbg">
			<!-- 系统提示  shortModalbg longModalbg-->
			<div class="modalHeaderbg">
				<div class="modalHeaderTitle">用户添加</div>
				<div class="modalClosebg">
					<button type="button" class="btn close" data-dismiss="modal">
						<img alt="X" src="${APP_PATH}/static/img/dialog/close.png">
					</button>
				</div>
			</div>
			<div class="modalContentbg">
				<div class="modalContent user-brow-content" id="userAddModalContent">
					<div style="display: flex; justify-content: center;">
						<ul class="nav nav-pills" id="userTypeTab">
							<li class="active"><a href="#createUserWithParent"
								style="width: 123px; text-align: center;">家长</a></li>
							<li><a href="#createUserWithTeacher"
								style="width: 123px; text-align: center;">老师</a></li>
						</ul>
					</div>
					<div class="tab-content">
						<div class="tab-pane active" style="margin-top: 25px;"
							id="createUserWithParent">
							<form class="form-horizontal">
								<div class="form-group">
									<label class="col-sm-3 control-label">家长账户</label>
									<div class="col-sm-9">
										<input type="text" class="form-control user-input-style"
											placeholder="请输入登录账号..." name="username" id="userInputUserName" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label" for="userInputRealName">家长密码</label>
									<div class="col-sm-9">
										<input type="password" class="form-control user-input-style"
											placeholder="请输入用户密码..." name="password" id="userInputPassword" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label" for="userInputRealName">确认密码</label>
									<div class="col-sm-9">
										<input type="password" class="form-control user-input-style"
											placeholder="请确认用户密码..." name="confirm" id="userInputConfirm" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">家长手机</label>
									<div class="col-sm-9">
										<input type="text" class="form-control user-input-style"
											placeholder="请输入手机号码..." name="telphone" id="userInputPhone" />
									</div>
								</div>
							</form>
						</div>
						<div class="tab-pane" id="createUserWithTeacher"><form action="#"></form>介绍内容...</div>
					</div>
				</div>
			</div>
			<div class="modalFooterbg">
				<button type="button" class="btn okBtn" id="userAddModalOk"></button>
				<button type="button" class="btn cancleBtn" data-dismiss="modal"></button>
			</div>
		</div>
	</div>
	
	<script type="text/javascript">
		// 显示权限dialog
		function authModalShow(object) {
			$("#authModalContent select").empty(); 
			$("#current_role").html(object.curRole.roleName);
			$("#current_role").attr("current-role-id", object.curRole.roleId);
			for(var i=0; i< object.roles.length;i++){
				if (object.roles[i].id==object.curRole.roleId) {
					$("#userAuthModalContent select").append($("<option value="+object.roles[i].id+" selected ='selected'></option>").append(object.roles[i].roleName));
				} else {
					$("#userAuthModalContent select").append($("<option value="+object.roles[i].id+"></option>").append(object.roles[i].roleName));
				}
			}
			$("#authModal").modal("show");
		}
		// 隐藏权限dialog
		function authModalHide() {
			$("#authModal").modal("hide");
		}
		// 显示浏览用户dialog
		function userBrowModalShow(object) {
			$("#userbrowModalContent").find("p:eq(0)").text(object.username);
			$("#userbrowModalContent").find("p:eq(1)").text(object.truename);
			$("#userbrowModalContent").find("p:eq(2)").text(object.sex==0?'男':'女');
			$("#userbrowModalContent").find("p:eq(3)").text(object.age);
			$("#userbrowModalContent").find("p:eq(4)").text(object.telphone);
			$("#userbrowModalContent").find("p:eq(5)").text(object.email);
			$("#userbrowModalContent").find("p:eq(6)").text(userRoleNameById(object.userroleid));
			$("#userbrowModalContent").find("p:eq(7)").text(object.createTime);
			$("#userbrowModalContent").find("p:eq(8)").text(object.lastlogintime);
			$("#userBrowModal").modal("show");
		}
		// 隐藏浏览用户dialog
		function userBrowModalHide() {
			$("#userBrowModal").modal("hide");
		}
		
		// 显示编辑用户dialog
		function userEditModalShow(object) {
			$("#userEditModalContent").find("p:eq(0)").text(object.username);
			if (object.sex==0) {
				$("#userRadioMale").attr("checked",true);
			} else {
				$("#userRadioFemale").attr("checked",true);
			}
			$("#userInputRealName").val(object.truename);
			$("#userInputAge").val(object.age);
			$("#userInputPhone").val(object.telphone);
			$("#userInputEmail").val(object.email);
			$("#userEditModal").modal("show");
		}
		
		// 隐藏编辑用户dialog
		function userEditModalHide() {
			$("#userEditModal").modal("hide");
		}
		
		// 显示添加用户dialog
		function userAddModalShow() {
			$("#createUserWithParent form")[0].reset();
			$("#createUserWithTeacher form")[0].reset();
			$('#userTypeTab a').click(function (e) {
				  e.preventDefault();
				  $("#userAddModalOk").attr("create-user-type", "#"+$(this).prop("href").split("#")[1]);
				  $(this).tab('show');
			});
			$("#userAddModalOk").attr("create-user-type", $("#userTypeTab").find("a:first").attr("href"));
			$("#userAddModal").modal("show");
		}
		
		// 隐藏添加用户dialog
		function userAddModalHide() {
			$("#userAddModal").modal("hide");
		}
		//返回用户角色
		function userRoleNameById(roleid){
			if (roleid==1) {
				return "管理员";
			} else if (roleid==2) {
				return "已注册学员";
			} else if (roleid==4) {
				return "已缴费学员";
			} else if (roleid==5) {
				return "教师";
			} else if (roleid==6) {
				return "助教";
			} else if (roleid==7) {
				return "游客";
			}
		}
	</script>
</body>
</html>