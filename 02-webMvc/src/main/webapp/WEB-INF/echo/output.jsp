<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: bookstore
  Date: 18/06/12
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Echo Output</title>
</head>
<body>
<h2>Output View</h2>
<div>You inputted text :</div>
<div>
    <%--suppress ELValidationInJSP --%>
    <c:out value="${echoForm.text}"/>
</div>
</body>
</html>
