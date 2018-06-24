<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h1>ブレンドファクトリー</h1>
<ul>
    <c:forEach items="${coffeeBeans}" var="bean">
        <li>${bean.id} : ${bean.name}</li>
    </c:forEach>
</ul>
</body>
</html>
