<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: bookstore
  Date: 18/06/12
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Echo Input View</title>
</head>
<body>
<h2>input page</h2>
<form:form modelAttribute="echoForm">
    <div>Please input text :</div>
    <div>
        <form:input path="text"/>
        <form:errors path="text"/>
    </div>
    <div>
        <form:button>send</form:button>
    </div>
</form:form>
</body>
</html>
