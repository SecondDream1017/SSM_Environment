<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" 
	src="${pageContext.request.contextPath}/jsp_static/jquery-1.7.2.js"></script>

<script type="text/javascript">

function show(flag){
	//alert(flag);
	if(flag == 1){
		//alert("是");
		var h = $("#divIdH").html();
		$("#divIdS").html(h);
	}else{
		//alert("否");
		$("#divIdS").html('');
	}
}

$(document).ready(function(){
	//验证jQuery引入成功
	//alert("111");
	
}) 


	
</script>
	
</head>

<body>
	是否开车
	<input type="radio" name="car" value="1" checked="checked" onclick="show(this.value)">是
	<input type="radio" name="car" value="0" onclick="show(this.value)">否
	<div id="divIdS">
		aaa
		<input type="text" name="userName">
	</div>
	
	<div id="divIdH" style="display:none">
		bbb
		<input type="text" name="userName">
	</div>
	
</body>
</html>