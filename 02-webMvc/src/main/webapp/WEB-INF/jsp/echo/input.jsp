<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Echo Input View</title>
</head>
<body>
<h2>input page</h2>
<form:form modelAttribute="echoForm">
    <div>入力してください。 :</div>
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
