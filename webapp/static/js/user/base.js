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
			url:APP_PATH+"/user/user/"+$(this).attr("del-names"),
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
		url: APP_PATH+"/user/role/"+$("#authModalOk").attr("current-user-id"),
		data: $("#userAuthModalContent form").serialize(),
		type: "PUT",
		success: function(result){
			authModalHide();
			if (0==result.code) {
				alertShow("请稍后再试...");
			} else {
				to_page("user", currentPage);
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
	$.ajax({
		url: APP_PATH+"/user/user/"+$("#userEditModalOk").attr("current-user-id"),
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
	if('ok'!=$($("#userAddModalOk").attr("create-user-type")).find("form").attr("validate-status")){
		// 本地验证未通过
		return;
	}else {
		// 本地验证通过，重置form表单
		$($("#userAddModalOk").attr("create-user-type")).find("form").find(".form-group").removeClass("has-success has-error");
		$($("#userAddModalOk").attr("create-user-type")).find("form").attr("validate-status", "no");
	}
	var role;
	var formSerialize = $($("#userAddModalOk").attr("create-user-type")).find("form").serialize();
	if ($("#userAddModalOk").attr("create-user-type")=="#createUserWithParent"){
		role = "P";  // 家长
	} else {
		role = "T";  // 教师
	}
	$.ajax({
		url: APP_PATH+"/user/user/"+role,
		type: "POST",
		data: formSerialize+"&role=",
		success: function(result){
			userAddModalHide();
			if (1==result.code) {
				alertShow(result.extend.username+"添加成功...");
			} else {
				// 处理表单验证信息
				alert(result.extend.errors);
			}
		},
		error: function(result){
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
		url: APP_PATH+"/user/user/"+userid,
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
		url: APP_PATH+"/user/user/"+userid,
		type: "GET",
		success: function(result){
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
		url: APP_PATH+"/user/role/"+userId,
		type:"GET",
		success:function(result){
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
		var userRoleTd = $("<td style='flex: 2;'></td>").append(userRoleNameById(item.userroleid));
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
			.append(userRoleTd)
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