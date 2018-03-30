// 菜单 单个编辑
$(document).on("click",".menu_edit_btn",function(){
	//1、弹出是否确认重置配置对话框
	var menuId = $(this).parents("tr").find("td:eq(0)").attr("menu_id");
	editMenuModalShow(menuId);
});

$("#menuEditModalOk").click(function(){
	$.ajax({
		url: APP_PATH+"/menu/menu/"+$(this).attr("menu-id"),
		type: "POST",
		data: $("#menuEditModalContent form").serialize(),
		success: function(result){
			editMenuModalHide();
			if(result.code==1){
				if (result.extend.status==0) { // 表明更新为主菜单, 需要重新访问url
					window.location.href = APP_PATH+result.extend.url;
				} else {
					to_page("menu", currentPage);
				}
			}else {
				alertShow("请稍后再试...");
			}
		}
	});
});

// 菜单 单个删除
$(document).on("click",".menu_del_btn",function(){
	//1、弹出是否确认重置配置对话框
	var menuName = $(this).parents("tr").find("td:eq(0)").text();
	var menuId = $(this).parents("tr").find("td:eq(0)").attr("menu_id");
	var parentId = $(this).parents("tr").find("td:eq(3)").text();
	$("#dialogOk").attr("btn-type", "menu-del");
	$("#dialogOk").attr("menu-id", menuId);
	$("#dialogOk").attr("parent-id", parentId);
	if (parentId==0) {
		dialogShow("【"+menuName+"】是父菜单，删除将影响包含在内的子菜单，确认要删除吗？");
	} else {
		dialogShow("确认要删除【"+menuName+"】吗？");
	}
});

// 添加菜单按钮
$("#menu_add_modal_btn").click(function(){
	addMenuModalShow(null);
});

//添加菜单相应按钮
$("#menuAddModalOk").click(function(){
	$.ajax({
		url: APP_PATH+"/menu/menu",
		type: "PUT",
		data: $("#menuAddModalContent form").serialize(),
		success: function(result){
			addMenuModalHide();
			window.location.href = APP_PATH+"/manage";
		},
		error: function(){
			addMenuModalHide();
			alertShow("请稍后再试...");
		}
	});
});

//解析并显示配置属性数据
function build_menu_table(result){
	//清空table表格
	$("#menus_table tbody").empty();
	var menus = result.extend.pageInfo.list;
	$.each(menus,function(index,item){
		var menuNameTd = $("<td style='flex: 1;'></td>").append(item.menuname).attr("menu_id", item.id);
		var menuPathTd = $("<td style='flex: 1;'></td>").append(item.menupath);
		var menuLevelTd = $("<td style='flex: 1;'></td>").append(item.menulvl);
		var menuParentTd = $("<td style='flex: 1;'></td>").append(item.parentmenuid);
		var menuEditBtn = $("<button></button>").addClass("btn btn-primary btn-xs menu_edit_btn")
	    .append($("<span></span>").addClass("glyphicon glyphicon-edit")).append("&nbsp;编辑");
		var menuDelBtn = $("<button></button>").addClass("btn btn-danger btn-xs menu_del_btn")
         .append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("&nbsp;删除");
		var menuBtnsTd = $("<td style='display:flex;justify-content: space-around;flex: 1;'></td>").append(menuEditBtn).append(menuDelBtn);
		$("<tr style='display: flex;'></tr>").append(menuNameTd)
			.append(menuPathTd)
			.append(menuLevelTd)
			.append(menuParentTd)
			.append(menuBtnsTd)
			.appendTo("#menus_table tbody");
	});
}

//解析显示分页信息
function build_menu_page_info(result){
	$("#page_info_area_menu").empty();
	$("#page_info_area_menu").append("当前"+result.extend.pageInfo.pageNum+"页,总"+
			result.extend.pageInfo.pages+"页,总"+
			result.extend.pageInfo.total+"条记录");
	totalRecord = result.extend.pageInfo.total;
	currentPage = result.extend.pageInfo.pageNum;
}
//解析显示分页条，点击分页要能去下一页....
function build_menu_page_nav(result){
	$("#page_nav_area_menu").empty();
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
			to_page("menu", 1);
		});
		prePageLi.click(function(){
			to_page("menu", result.extend.pageInfo.pageNum -1);
		});
	}
	var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
	var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
	if(result.extend.pageInfo.hasNextPage == false){
		nextPageLi.addClass("disabled");
		lastPageLi.addClass("disabled");
	}else{
		nextPageLi.click(function(){
			to_page("menu", result.extend.pageInfo.pageNum +1);
		});
		lastPageLi.click(function(){
			to_page("menu", result.extend.pageInfo.pages);
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
			to_page("menu", item);
		});
		ul.append(numLi);
	});
	//添加下一页和末页 的提示
	ul.append(nextPageLi).append(lastPageLi);
	//把ul加入到nav
	var navEle = $("<nav></nav>").append(ul);
	navEle.appendTo("#page_nav_area_menu");
}