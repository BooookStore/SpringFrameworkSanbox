<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Create Account</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
          integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
<div class="container d-flex flex-column">
    <h5>アカウント作成</h5>
    <form:form modelAttribute="accountCreateForm">
        <form:errors path="*"/>
        <div class="row mb-2">
            <label class="col-3">Name</label>
            <form:input path="name"/>
        </div>
        <div class="row mb-2 text-danger">
            <div class="col-3"></div>
            <form:errors path="name"/>
        </div>
        <div class="row mb-2">
            <label class="col-3">TEL</label>
            <form:input path="tel"/>
        </div>
        <div class="row mb-2 text-danger">
            <div class="col-3"></div>
            <form:errors path="tel"/>
        </div>
        <div class="row mb-2">
            <label class="col-3">Date of birth</label>
            <form:input path="dateOfBirth"/>
        </div>
        <div class="row mb-2">
            <div class="col-3 text-danger"></div>
            <form:errors path="dateOfBirth"/>
        </div>
        <div class="row mb-2">
            <label class="col-3">Email</label>
            <form:input path="email"/>
        </div>
        <div class="row mb-2 text-danger">
            <div class="col-3"></div>
            <form:errors path="email"/>
        </div>
        <div class="row mb-2">
            <label class="col-3">Email</label>
            <form:input path="address"/>
        </div>
        <div class="row mb-2 text-danger">
            <div class="col-3"></div>
            <form:errors path="address"/>
        </div>
        <div class="row mb-2">
            <label class="col-3">Email (Confirm)</label>
            <form:input path="addressConfirm"/>
        </div>
        <div class="row mb-2 text-danger">
            <div class="col-3"></div>
            <form:errors path="addressConfirm"/>
        </div>
        <div class="row mb-2">
            <label class="col-3">Agreement</label>
            <form:checkbox path="agreed"/>
        </div>
        <div class="row mb-2 text-danger">
            <div class="col-3"></div>
            <form:errors path="agreed"/>
        </div>
        <div class="row mb-2">
            <form:button>Register</form:button>
        </div>
    </form:form>
</div>
</body>
</html>
