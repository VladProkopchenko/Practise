<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28.02.2025
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>loginedit</h1>
<form action="${pageContext.request.contextPath}/loginedit.jhtml" method="post">
    <label for="oldPassword">Старый пароль:</label>
    <input type="text" id="oldPassword" name="oldPassword" required><br>
    <label for="newPassword">Новый пароль:</label>
    <input type="password" id="newPassword" name="newPassword" required><br>
    <button type="submit">Сменить</button>
</form>
</body>
</html>
