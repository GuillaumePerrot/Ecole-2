<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<c:forEach items="${formations}" var="formation">
<h3>Id Formation: ${formation.id}</h3>
<h3>theme Formation: ${formation.theme}</h3>
</c:forEach>

</body>
</html>