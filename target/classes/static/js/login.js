var formId = "#loginForm";
bindEvent();

function bindEvent(){
	$("#loginBtn").off().click(function(){
		var username = $(formId).find("input[name='username']").val();
		var password = $(formId).find("input[name='password']").val();
		var param = {
			username : username,
			password : password,
		};
		common.ajaxPost('/login/loginHandle', param, function(data){
			if(data){
				alert('登录成功');
				location.href = '/index/index';
			}else{
				alert('登录失败');
			}
		});
	});
}

//$.ajax({
//	type : 'post',
//	url : '/login/editMember',
//	contentType : 'application/json;charset=utf-8',
//	data : JSON.stringify({
//		id : 3,
//		mobile : '15172377038',
//	}),
//	dataType : 'json',
//	success : function(data){
//		console.info(data);
//	},
//	error : function(error){
//		alert("操作失败");
//	}
//});