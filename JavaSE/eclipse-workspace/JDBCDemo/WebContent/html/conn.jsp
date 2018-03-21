<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="db" class="cc.openhome.DbBean"/>
<c:set target=""${db}" property="jdbcUrl"
	value="jdbc:mysql://localhost:3306/demo"/>
<c:set target=""${db}" property="username" value="root"/>
<c:set target=""${db}" property="password" value="854785"/>
<!DOCTYPE HTML PUBLIC "-//W3C/DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type"
			content="text/html; charset=UTF-8">
		<title>测试数据库连接</title>
	</head>
	<body>
		<c:choose>
			<c:when test="${db.connectedOK}">连接成功！</c:when>
			<c:otherwise>连接失败！</c:otherwise>
		</c:choose>
	</body>
</html>


