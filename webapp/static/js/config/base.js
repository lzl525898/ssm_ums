// 用户 单个重置
$(document).on("click",".config_wx_reset_btn",function(){
	//1、弹出是否确认重置配置对话框
	var configName = $(this).parents("tr").find("td:eq(0)").text();
	if (configName=="微信应用ID") {
		configName = "appid";
	} else if (configName=="微信应用密钥") {
		configName = "appsecret";
	} else if (configName=="微信交互token") {
		configName = "token";
	} else if (configName=="消息加解密密钥") {
		configName = "encodingaeskey";
	}
	$("#dialogOk").attr("btn-type", "config-reset");
	$("#dialogOk").attr("reset-names", configName);
	dialogShow("确认要重置【"+configName+"】吗？");
});

//编辑响应按钮
$("#configModalOk").click(function(){
	var configContent = $("#configModalContent").find("input").val();
	if (configContent==null || configContent=="") {
		configContent = "empty";
	}
	$.ajax({
		url:APP_PATH+"/sys/config/"+$(this).attr("config-type")+"/"+configContent,
		type:"PUT",
		success:function(result){
			configEditModalHide();
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
});

//用户 单个编辑
$(document).on("click",".config_wx_edit_btn",function(){
	//1、弹出是否确认重置配置对话框
	var configType = "";
	var configName = $(this).parents("tr").find("td:eq(0)").text();
	var configContent = $(this).parents("tr").find("td:eq(1)").text();
	if (configName=="微信应用ID") {
		configType = "appid";
	} else if (configName=="微信应用密钥") {
		configType = "appsecret";
	} else if (configName=="微信交互token") {
		configType = "token";
	} else if (configName=="消息加解密密钥") {
		configType = "encodingaeskey";
	} else if (configName=="商户号") {
		configType = "partnerid";
	} else if (configName=="API安全key") {
		configType = "partnerkey";
	}
	var configMap=new Map();
	configMap.set(1, configType);
	configMap.set(2, configName);
	configMap.set(3, configContent);
	configEditModalShow(configMap);
});

//解析并显示配置属性数据
function build_config_table(result){
	//清空table表格
	$("#config_table_wx tbody").empty();
	$("#config_table_wxshop tbody").empty();
	
	var configs = result.extend.configInfo;
	var idEditBtn = $("<button></button>").addClass("btn btn-primary btn-xs config_wx_edit_btn")
    .append($("<span></span>").addClass("glyphicon glyphicon-edit")).append("&nbsp;编辑");
	var idRepeatBtn = $("<button></button>").addClass("btn btn-danger btn-xs config_wx_reset_btn")
    .append($("<span></span>").addClass("glyphicon glyphicon-repeat")).append("&nbsp;重置");
	
	var seEditBtn = $("<button></button>").addClass("btn btn-primary btn-xs config_wx_edit_btn")
    .append($("<span></span>").addClass("glyphicon glyphicon-edit")).append("&nbsp;编辑");
	var seRepeatBtn = $("<button></button>").addClass("btn btn-danger btn-xs config_wx_reset_btn")
    .append($("<span></span>").addClass("glyphicon glyphicon-repeat")).append("&nbsp;重置");
	
	var toEditBtn = $("<button></button>").addClass("btn btn-primary btn-xs config_wx_edit_btn")
    .append($("<span></span>").addClass("glyphicon glyphicon-edit")).append("&nbsp;编辑");
	var toRepeatBtn = $("<button></button>").addClass("btn btn-danger btn-xs config_wx_reset_btn")
    .append($("<span></span>").addClass("glyphicon glyphicon-repeat")).append("&nbsp;重置");
	
	var egEditBtn = $("<button></button>").addClass("btn btn-primary btn-xs config_wx_edit_btn")
    .append($("<span></span>").addClass("glyphicon glyphicon-edit")).append("&nbsp;编辑");
	var egRepeatBtn = $("<button></button>").addClass("btn btn-danger btn-xs config_wx_reset_btn")
    .append($("<span></span>").addClass("glyphicon glyphicon-repeat")).append("&nbsp;重置");
	
	var wxIDNameTd = $("<td style='flex: 1;'></td>").append("微信应用ID");
	var wxIDTd = $("<td style='flex: 3;'></td>").append(configs.APPID);
	var wxIDBtnTd = $("<td style='display:flex;justify-content: space-around;flex: 1;'></td>").append(idEditBtn).append(idRepeatBtn);
	
	var wxSecretNameTd = $("<td style='flex: 1;'></td>").append("微信应用密钥");
	var wxSecretTd = $("<td style='flex: 3;'></td>").append(configs.APPSECRET);
	var wxSecretBtnTd = $("<td style='display:flex;justify-content: space-around;flex: 1;'></td>").append(seEditBtn).append(seRepeatBtn);
	
	var wxTokenNameTd = $("<td style='flex: 1;'></td>").append("微信交互token");
	var wxTokenTd = $("<td style='flex: 3;'></td>").append(configs.TOKEN);
	var wxTokenBtnTd = $("<td style='display:flex;justify-content: space-around;flex: 1;'></td>").append(toEditBtn).append(toRepeatBtn);
	
	var wxEncodingGaeskeyNameTd = $("<td style='flex: 1;'></td>").append("消息加解密密钥");
	var wxEncodingGaeskeyTd = $("<td style='flex: 3;'></td>").append(configs.ENCODINGAESKEY);
	var wxEncodingGaeskeyBtnTd = $("<td style='display:flex;justify-content: space-around;flex: 1;'></td>").append(egEditBtn).append(egRepeatBtn);
	
	$("<tr style='display: flex;'></tr>").append(wxIDNameTd)
		.append(wxIDTd)
		.append(wxIDBtnTd)
		.appendTo("#config_table_wx tbody");
	$("<tr style='display: flex;'></tr>").append(wxSecretNameTd)
		.append(wxSecretTd)
		.append(wxSecretBtnTd)
		.appendTo("#config_table_wx tbody");
	$("<tr style='display: flex;'></tr>").append(wxTokenNameTd)
		.append(wxTokenTd)
		.append(wxTokenBtnTd)
		.appendTo("#config_table_wx tbody");
	$("<tr style='display: flex;'></tr>").append(wxEncodingGaeskeyNameTd)
		.append(wxEncodingGaeskeyTd)
		.append(wxEncodingGaeskeyBtnTd)
		.appendTo("#config_table_wx tbody");
	
	var shopEditBtn = $("<button></button>").addClass("btn btn-primary btn-xs config_wx_edit_btn")
    .append($("<span></span>").addClass("glyphicon glyphicon-edit")).append("&nbsp;编辑");
	var shopRepeatBtn = $("<button></button>").addClass("btn btn-danger btn-xs config_wx_reset_btn")
    .append($("<span></span>").addClass("glyphicon glyphicon-repeat")).append("&nbsp;重置");
	
	var akEditBtn = $("<button></button>").addClass("btn btn-primary btn-xs config_wx_edit_btn")
    .append($("<span></span>").addClass("glyphicon glyphicon-edit")).append("&nbsp;编辑");
	var akRepeatBtn = $("<button></button>").addClass("btn btn-danger btn-xs config_wx_reset_btn")
    .append($("<span></span>").addClass("glyphicon glyphicon-repeat")).append("&nbsp;重置");
	
	var wxShopNameTd = $("<td style='flex: 1;'></td>").append("商户号");
	var wxShopTd = $("<td style='flex: 3;'></td>").append(configs.PARTNERID);
	var wxShopBtnTd = $("<td style='display:flex;justify-content: space-around;flex: 1;'></td>").append(shopEditBtn).append(shopRepeatBtn);
	
	var wxAPIKeyNameTd = $("<td style='flex: 1;'></td>").append("API安全key");
	var wxAPIKeyTd = $("<td style='flex: 3;'></td>").append(configs.PARTNERKEY);
	var wxAPIKeyBtnTd = $("<td style='display:flex;justify-content: space-around;flex: 1;'></td>").append(akEditBtn).append(akRepeatBtn);
	
	$("<tr style='display: flex;'></tr>").append(wxShopNameTd)
		.append(wxShopTd)
		.append(wxShopBtnTd)
		.appendTo("#config_table_wxshop tbody");
	$("<tr style='display: flex;'></tr>").append(wxAPIKeyNameTd)
		.append(wxAPIKeyTd)
		.append(wxAPIKeyBtnTd)
		.appendTo("#config_table_wxshop tbody");
}