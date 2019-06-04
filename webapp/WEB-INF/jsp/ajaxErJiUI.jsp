<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" 
	src="${pageContext.request.contextPath}/jsp_static/jquery-1.7.2.js"></script>
<script type="text/javascript">

	$(document).ready(function(){
		//城市改变,根据城市ID得到对应的部门
		$("#city").change(function(){
			var id = this.value;
			if(id == ''){
				var op = "<option value=''>请选择</option>";
				$("#department").html(op);
				$("#person").html(op);
			}else{
				$.ajax({
					type:"POST",
					url:"${pageContext.request.contextPath}/environment/guest/getDepartmentListByCityId",
					data:{"cityId":id},
					success:function(data){
						var op = "<option value=''>请选择</option>"
						$.each(data,function(i,val){
							op += "<option value="+val.id+">"+val.name+"</option>"
						})
						$("#department").html(op);
					}
				})
			}
		}),
		
		//部门改变,根据部门ID得到对应的人员
		$("#department").change(function(){
			var id = this.value;
			if(id == ''){
				var op = "<option value=''>请选择</option>";
				$("#person").html(op);
			}else{
				$.ajax({
					type:"POST",
					url:"${pageContext.request.contextPath}/environment/guest/getPersonListByDeptId",
					data:{
						"departmentId":id
					},
					success:function(data){
						var op = "<option value=''>请选择</option>"
						$.each(data,function(i,val){
							op += "<option value="+val.id+">"+val.name+"</option>"
						})
						$("#person").html(op);
					}
				})
			}
		})
	})

</script>
</head>
<body>
	City:<select id="city"  name="cityName">
		     <!-- <option value=''>请选择</option>
		     <option value="1">北京</option>
		     <option value="2">大连</option>
		     <option value="3">沈阳</option> -->
		     <option value=''>请选择</option>
		     <c:forEach items="${allCityList }" var="city">
		     	<option value='${city.id }'>${city.name }</option>
		     </c:forEach>
		</select> 
		&nbsp;&nbsp;&nbsp;&nbsp;
	Department:<select id="department"  name="departmentName">
					<option value=''>请选择</option>
				</select>
		&nbsp;&nbsp;&nbsp;&nbsp;
	Person:<select id="person"  name="personName">
				<option value=''>请选择</option>
		   </select>
		   <br>
</body>
</html>