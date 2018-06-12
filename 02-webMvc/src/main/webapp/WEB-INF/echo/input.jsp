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
    <title>Echo Input View</title>
</head>
<body>
<h2>入力画面</h2>
<form:form modelAttribute="echoForm">
    <div>Please input text :</div>
    <div>
        <form:input path="text"/>
    </div>
    <div>
        <form:button>送信</form:button>
    </div>
</form:form>
</body>
</html>
