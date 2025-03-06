
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        <%@include file="/WEB-INF/css/styles.css"%>
    </style>
</head>
<body>
<div class="center-content">
    <form action="${pageContext.request.contextPath}/new-user" method="post">
        <h1>Новый пользователь</h1>

        <div class="form-group">
            <label for="name">Имя:</label>
            <input type="text" id="name" name="name">
        </div>

        <div class="form-group">
            <label for="surname">Фамилия:</label>
            <input type="text" id="surname" name="surname">
        </div>

        <div class="form-group">
            <label for="patronymic">Отчество:</label>
            <input type="text" id="patronymic" name="patronymic">
        </div>

        <div class="form-group">
            <label for="email">Почта:</label>
            <input type="text" id="email" name="email">
        </div>

        <div class="form-group">
            <label for="login">Логин:</label>
            <input type="text" id="login" name="login">
        </div>

        <div class="form-group">
            <label for="password">Пароль:</label>
            <input type="password" id="password" name="password">
        </div>

        <div class="form-group">
            <label for="role">Роль:</label>
            <select id="role" name="role">
                <option value="user">Пользователь</option>
                <option value="admin">Администратор</option>
            </select>
        </div>

        <div class="form-group">
            <label for="birthday">Дата рождения:</label>
            <input type="date" id="birthday" name="birthday">
        </div>

        <button type="submit">Добавить</button>
    </form>
</div>
</body>

</html>
