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

$(document).ready(function(){
	//验证jQuery引入成功
	//alert("111");
	
	$("#divId").load("${pageContext.request.contextPath}/environment/guest/toErJiUI");
	
}) 


	
</script>
	
</head>

<body>
	哈哈哈
	<a href="environment/guest/toErJiUI" >跳转到二级联动页面</a><br>
	<form action="environment/guest/formTest" method="post">
		
		<input type="submit" value="提交">
	</form>
	<div id="divId">
	
	</div>
</body>
</html>