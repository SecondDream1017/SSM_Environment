<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	展示页面
	<c:forEach items="${surveyList }" var="survey">
		<table>
			<tr>
				<td>${survey.name }</td>
			</tr>
		</table>
	</c:forEach>
	<hr>
	${name }
	<hr>
	<c:forEach items="${mapValue }" var="map">
		${map.key }-->${map.value }
	</c:forEach>
</body>
</html>