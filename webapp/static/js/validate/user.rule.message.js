var userManager = {
	teacher : {
		rules : {
			username : {
				required : true,
				rangelength : [6,16]
			},
			password : {
				required : true,
				minlength : 6
			},
			confirm : {
				required : true,
				equalTo : '#teacher-password'
			},
			telphone : {
				required : true,
				isMobile : true,
			},
			school : {
				required : true
			}
		},
		messages:{
			username:{
	            required:"请输入用户名",
	            rangelength:"用户名长度在必须为：{0}-{1}之间"
	        },
	        password:{
	            required:"请输入密码",
	            minlength:"密码至少由6位字符组成"
	        },
	        confirm:{
	            required:"请再次输入密码",
	            equalTo:"两次密码必须一致"
	        }, 
	        telphone : {
				required : "请输入手机号",
				isMobile : "请正确填写您的手机号码"
			},
			school : {
				required : "请选择学校"
			}
		}
	},
	parent : {
		rules : {
			username : {
				required : true,
				rangelength : [6,16]
			},
			password : {
				required : true,
				minlength : 6
			},
			confirm : {
				required : true,
				equalTo : '#parent-password'
			},
			telphone : {
				required : true,
				isMobile : true,
			}
		},
		messages:{
			username:{
                required:"请输入用户名",
                rangelength:"用户名长度在必须为：{0}-{1}之间"
            },
            password:{
                required:"请输入密码",
                minlength:"密码至少由6位字符组成"
            },
            confirm:{
                required:"请再次输入密码",
                equalTo:"两次密码必须一致"
            }, 
            telphone : {
				required : "请输入手机号",
				isMobile : "请正确填写您的手机号码"
			}
		}
	}
}
var errorUserName,errorPassWord,errorConfirm,errorTelPhone="";

jQuery.validator.addMethod("isMobile", function(value, element) {  
    var length = value.length;  
    var regPhone = /^1([3578]\d|4[57])\d{8}$/;  
    return this.optional(element) || ( length == 11 && regPhone.test( value ) );    
}, "请正确填写您的手机号码");  

function errorCallBackWithTeacher(errorMap, errorList) {
	errorUserName = errorMap['username']!=undefined?errorMap['username']:errorUserName;
	 errorPassWord = errorMap['password']!=undefined?errorMap['password']:errorPassWord;
	 errorConfirm  = errorMap['confirm']!=undefined?errorMap['confirm']:errorConfirm;
	 errorTelPhone = errorMap['telphone']!=undefined?errorMap['telphone']:errorTelPhone;
	 for(var status in this.invalid){
		 var obj = $("#createUserWithTeacher input[name="+status+"]");
		 if (status=='username' && this.invalid[status]){
			 obj.parent().parent().addClass("has-error");
			 obj.next().remove();
			 obj.after($("<label class='control-label validate-label-style'></label>").append(errorUserName));
		 } else if (status=='password' && this.invalid[status]) {
			 obj.parent().parent().addClass("has-error");
			 obj.next().remove();
			 obj.after($("<label class='control-label validate-label-style'></label>").append(errorPassWord));
		 } else if (status=='confirm' && this.invalid[status]) {
			 obj.parent().parent().addClass("has-error");
			 obj.next().remove();
			 obj.after($("<label class='control-label validate-label-style'></label>").append(errorConfirm));
		 } else if (status=='telphone' && this.invalid[status]) {
			 obj.parent().parent().addClass("has-error");
			 obj.next().remove();
			 obj.after($("<label class='control-label validate-label-style'></label>").append(errorTelPhone));
		 } else {
			 obj.next().remove();
			 obj.parent().parent().removeClass("has-error");
			 obj.parent().parent().addClass("has-success");
		 }
	 }
	 if (0==this.numberOfInvalids()) { // 证明没有错误...
		 $("#createUserWithTeacher form").attr("validate-status", "ok");
	 } else {
		 $("#createUserWithTeacher form").attr("validate-status", "no");
	 }
}

function errorCallBackWithParent(errorMap, errorList) {
	 errorUserName = errorMap['username']!=undefined?errorMap['username']:errorUserName;
	 errorPassWord = errorMap['password']!=undefined?errorMap['password']:errorPassWord;
	 errorConfirm  = errorMap['confirm']!=undefined?errorMap['confirm']:errorConfirm;
	 errorTelPhone = errorMap['telphone']!=undefined?errorMap['telphone']:errorTelPhone;
	 for(var status in this.invalid){
		 var obj = $("#createUserWithParent input[name="+status+"]");
		 if (status=='username' && this.invalid[status]){
			 obj.parent().parent().addClass("has-error");
			 obj.next().remove();
			 obj.after($("<label class='control-label validate-label-style'></label>").append(errorUserName));
		 } else if (status=='password' && this.invalid[status]) {
			 obj.parent().parent().addClass("has-error");
			 obj.next().remove();
			 obj.after($("<label class='control-label validate-label-style'></label>").append(errorPassWord));
		 } else if (status=='confirm' && this.invalid[status]) {
			 obj.parent().parent().addClass("has-error");
			 obj.next().remove();
			 obj.after($("<label class='control-label validate-label-style'></label>").append(errorConfirm));
		 } else if (status=='telphone' && this.invalid[status]) {
			 obj.parent().parent().addClass("has-error");
			 obj.next().remove();
			 obj.after($("<label class='control-label validate-label-style'></label>").append(errorTelPhone));
		 } else {
			 obj.next().remove();
			 obj.parent().parent().removeClass("has-error");
			 obj.parent().parent().addClass("has-success");
		 }
	 }
	 if (0==this.numberOfInvalids()) { // 证明没有错误...
		 $("#createUserWithParent form").attr("validate-status", "ok");
	 } else {
		 $("#createUserWithParent form").attr("validate-status", "no");
	 }
}