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

function clickBut(){
	//alert(123);
	var ee = $("#textareaId").val();
	alert(ee);
	var str = textareaTo(ee);
	alert(str);
	/* $.ajax({
		type:"POST",
		url:"${pageContext.request.contextPath}/environment/guest/toErJiUI",
		data:{
			"name":"gaoming"
		},
		success:function(data){
			alert(data.age);
		},
		dataType:"json"
	}); */
	
}

/**
* @funciton 转换textarea存入数据库的回车换行和空格  textarea ---  数据库,用val取数据，置换'\n'
*/
function textareaTo(str){
    var reg=new RegExp("\n","g");
    var regSpace=new RegExp(" ","g");
    
    str = str.replace(reg,"<br>");
    str = str.replace(regSpace,"&nbsp;");
    
    return str;
}

$(document).ready(function(){
	//验证jQuery引入成功
	//alert("111");
	
	//$("#divId").load("${pageContext.request.contextPath}/environment/guest/toErJiUI");
	
}) 


	
</script>
	
</head>

<body>
	哈哈哈
	<a href="environment/guest/toErJiUI" >跳转到二级联动页面</a><br>
	<a href="environment/guest/toModelAndViewUI" >跳转到ModelAndView页面</a><br>
	<a href="environment/guest/toEclassStudentUI" >跳转到学生页面</a><br>
	<a href="environment/guest/toEclassStudentUI2" >跳转到学生页面2</a><br>
	<a href="" download="2.jpg">2.jpg</a>
	
	<form action="/environment/guest/saveCity" method="post">
		<textarea rows="5" cols="5" name="name" id="textareaId"></textarea>
		<input type="submit" value="提交">
	</form>
	<div id="divId">
		<button id="but" onclick="clickBut()">ttt</button>
	</div>
	========================================================
</body>
</html>