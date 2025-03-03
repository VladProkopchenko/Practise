<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>welcome.jhtml</h1>

<form action="${pageContext.request.contextPath}/welcome.jhtml" method="post">
    <button type="submit" name="action" value="logout">Выйти</button>
</form>
<br>
<br>
<form action="${pageContext.request.contextPath}/welcome.jhtml" method="post">
    <button type="submit" name="action" value="edit">Сменить пароль</button>
</form>
</body>
</html>
