<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: bookstore
  Date: 18/06/11
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h1>Welcome My Spring Web MVC Demo Application</h1>
<ul>
    <li><a href="<c:url value="/echo"/>">echo application</a></li>
    <li><a href="<c:url value="/requestmapping"/>">request mapping</a></li>
</ul>
</body>
</html>
