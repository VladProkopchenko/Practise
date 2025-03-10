<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<html>
<t:head title="Вход">

</t:head>
<t:centeredBody>
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
</t:centeredBody>
</html>
