var common = {};

common.ajaxPost = function(url, param, success){
	$.ajax({
		type : 'post',
		url : url,
		contentType : 'application/json;charset=utf-8',
		data : JSON.stringify(param),
		dataType : 'json',
		success : function(data){
			success(data);
		},
		error : function(error){
			alert("操作失败");
		}
	});
};

common.ajaxGet = function(url, param, success){
	$.ajax({
		type : 'get',
		url : url,
		data : param,
		success : function(data){
			success(data);
		},
		error : function(error){
			alert("操作失败");
		}
	});
};