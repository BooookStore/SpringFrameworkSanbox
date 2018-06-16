<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Echo Data</title>
</head>
<body>
<p><c:out value="${data.toLocaleString()}"/></p>
</body>
</html>
