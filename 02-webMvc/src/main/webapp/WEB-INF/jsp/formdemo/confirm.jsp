<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create Account</title>
</head>
<body>
<h5>create account confirm</h5>
<p>You Input</p>
<p>Name : <c:out value="${account.name}"/></p>
<p>TEL : <c:out value="${account.tel}"/></p>
<p>Date of birth : <c:out value="${account.dateOfBirth}"/></p>
<p>Email : <c:out value="${account.email}"/></p>
</body>
</html>
