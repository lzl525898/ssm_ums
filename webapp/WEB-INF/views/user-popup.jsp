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

.validate-label-style {
	margin-top: -4px;
	margin-bottom: -12px !important;
	font-size: 5px !important;
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
				<div class="modalHeaderTitle">配置编辑</div>
				<div class="modalClosebg">
					<button type="button" class="btn close" data-dismiss="modal">
						<img alt="X" src="${APP_PATH}/static/img/dialog/close.png">
					</button>
				</div>
			</div>
			<div class="modalContentbg">
				<div class="modalContent user-brow-content"
					id="configEditModalContent">
					<form class="form-horizontal" style="margin-top: -5px;">
						<div class="form-group">
							<label class="col-sm-3 control-label">配置项</label>
							<div class="col-sm-9">
								<p class="form-control-static user-brow-color"></p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label" for="sysInputConfig">配置信息</label>
							<div class="col-sm-9">
								<input type="text" class="form-control user-input-style" name="config-info" id="sysInputConfig"/>
							</div>
						</div>
					</form>
				</div>
			</div>
			<div class="modalFooterbg">
				<button type="button" class="btn okBtn" id="configEditModalOk"></button>
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
											placeholder="请输入家长账号..." name="username"
											id="userInputUserName" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label" for="userInputRealName">家长密码</label>
									<div class="col-sm-9">
										<input type="password" id="parent-password"
											class="form-control user-input-style"
											placeholder="请输入家长密码..." name="password"
											id="userInputPassword" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label" for="userInputRealName">确认密码</label>
									<div class="col-sm-9">
										<input type="password" class="form-control user-input-style"
											placeholder="请确认家长密码..." name="confirm" id="userInputConfirm" />
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
						<div class="tab-pane" style="margin-top: 25px;"
							id="createUserWithTeacher">
							<form class="form-horizontal">
								<div class="form-group">
									<label class="col-sm-3 control-label">教师账户</label>
									<div class="col-sm-9">
										<input type="text" class="form-control user-input-style"
											placeholder="请输入教师账号..." name="username"/>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label" for="userInputRealName">教师密码</label>
									<div class="col-sm-9">
										<input type="password" id="teacher-password"
											class="form-control user-input-style"
											placeholder="请输入教师密码..." name="password"/>
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
									<label class="col-sm-3 control-label">教师手机</label>
									<div class="col-sm-9">
										<input type="text" class="form-control user-input-style"
											placeholder="请输入手机号码..." name="telphone" id="userInputPhone" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">所在区域</label>
									<div class="col-sm-9">
										<div class="user-input-style" id="teacherRegDistpicker"
										     style="display: flex;justify-content: space-between;">
											<div class="col-sm-4" style="padding: 0;padding-right: 3px;">
												<select class="form-control" id="s_province" name="province"
													style="font-size: 12px; padding: 0;"></select>
											</div>
											<div class="col-sm-4" style="padding: 0;padding-left: 3px;padding-right: 3px;">
												<select class="form-control" id="s_city" name="city"
													style="font-size: 12px; padding: 0;"></select>
											</div>
											<div class="col-sm-4" style="padding: 0;padding-left: 3px;">
												<select class="form-control" id="s_area" name="area"
													style="font-size: 12px; padding: 0;"></select>
											</div>
										</div>
											
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">所在学校</label>
									<div class="col-sm-9">
										<select class="form-control user-input-style" id="school" name="school" required="required"></select>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="modalFooterbg">
				<button type="button" class="btn okBtn" id="userAddModalOk"></button>
				<button type="button" class="btn cancleBtn" data-dismiss="modal"></button>
			</div>
		</div>
	</div>
	
	<!-- 配置编辑 -->
	<div class="modal fade" id="configEditModal" tabindex="-1" role="dialog">
		<div class="shortModalbg">
			<!-- 系统提示  shortModalbg longModalbg-->
			<div class="modalHeaderbg">
				<div class="modalHeaderTitle">配置修改</div>
				<div class="modalClosebg">
					<button type="button" class="btn close" data-dismiss="modal">
						<img alt="X" src="${APP_PATH}/static/img/dialog/close.png">
					</button>
				</div>
			</div>
			<div class="modalContentbg">
				<div class="modalContent" id="configModalContent">
					<form class="form-horizontal" style="margin-top: -5px;">
						<div class="form-group">
							<div class="col-sm-1"></div>
							<div  class="col-sm-3" style="text-align: right;">
								<label class="control-label">配置项&nbsp;:</label>
							</div>
							<div class="col-sm-7" style="text-align: left;">
								<p class="form-control-static" id="config_name" style="color: #583e7e"></p>
							</div>
							<div class="col-sm-1"></div>
						</div>
						<div class="form-group">
							<div class="col-sm-1"></div>
							<div  class="col-sm-3" style="text-align: right;">
								<label class="control-label">配置信息&nbsp;:</label>
							</div>
							<div class="col-sm-7" style="display: flex;justify-content: flex-start;align-items: center;padding-top: 4px;">
								<input type="text"
									   class="form-control"
									   placeholder="请输入配置信息..." id="config_info"/>
							</div>
						</div>
					</form>
				</div>
			</div>
			<div class="modalFooterbg">
				<button type="button" class="btn okBtn" id="configModalOk"></button>
				<button type="button" class="btn cancleBtn" data-dismiss="modal"></button>
			</div>
		</div>
	</div>
	<script src="${APP_PATH }/static/js/utils.js"></script>
	<script type="text/javascript">
	    // 初始化省市区
		// 显示权限dialog
		function authModalShow(object) {
			$("#userAuthModalContent select").empty(); 
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
			// 还原form表单样式
			$("#createUserWithParent form")[0].reset();
			$("#createUserWithTeacher form")[0].reset();
			$("#createUserWithParent form").find(".form-group").removeClass("has-success has-error");
			$("#createUserWithTeacher form").find(".form-group").removeClass("has-success has-error");
			$("#createUserWithParent form").find(".control-label.validate-label-style").remove();
			$("#createUserWithTeacher form").find(".control-label.validate-label-style").remove();
			
			// 点击tab响应
			$('#userTypeTab a').click(function (e) {
				  e.preventDefault();
				  $("#userAddModalOk").attr("create-user-type", "#"+$(this).prop("href").split("#")[1]);
				  $(this).tab('show');
			});
			// 显示添加用户dialog
			$("#userAddModalOk").attr("create-user-type", $("#userTypeTab").find("a:first").attr("href"));
			$("#userAddModal").modal("show");
		}
		
		// 隐藏添加用户dialog
		function userAddModalHide() {
			$("#userAddModal").modal("hide");
		}
		
		// 显示编辑配置dialog
		function configEditModalShow(object) {
			$("#config_name").empty();
			$("#config_name").append(object.get(2));
			$("#config_info").empty();
			$("#config_info").val(object.get(3));
			$("#configModalOk").attr("config-type", object.get(1));
			$("#configEditModal").modal("show");
		}
		// 隐藏编辑配置dialog
		function configEditModalHide() {
			$("#configEditModal").modal("hide");
		}
		
	</script>
</body>
</html>