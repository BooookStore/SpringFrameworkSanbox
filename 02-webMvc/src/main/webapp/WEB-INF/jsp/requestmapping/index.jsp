<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h5>Request Mapping, Data demo page home</h5>
<ul>
    <li><a href="<c:url value="/requestmapping/userId"/>">url path pattern demo</a></li>
    <li><a href="<c:url value="/requestmapping/param?userId=123"/>">request parameter demo</a></li>
</ul>
</body>
</html>
