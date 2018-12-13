bindEvent();

function bindEvent(){
	$("#loginOutBtn").off().click(function(){
		common.ajaxGet('/login/loginOut', {}, function(data){
			console.info(data);
			if(data){
				alert('登出成功');
				location.href = '/';
			}else{
				alert('登出失败');
			}
		});
	});
}