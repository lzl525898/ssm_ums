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