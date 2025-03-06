<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Вход</title>
    <style>
        <%@include file="/WEB-INF/css/styles.css"%>
    </style>
</head>
<body>
<div class="center-content">

    <form action="${pageContext.request.contextPath}/login" method="post">
        <h1>Вход</h1>
        <div class="form-group">
            <label for="login">Логин:</label>
            <input type="text" id="login" name="login">
        </div>
        <div class="form-group">
            <label for="password">Пароль:</label>
            <input type="password" id="password" name="password">
        </div>
        <button type="submit">Войти</button>
    </form>
</div>


</body>
</html>
