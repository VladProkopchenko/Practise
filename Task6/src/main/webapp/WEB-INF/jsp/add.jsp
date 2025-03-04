
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/new-user" method="post">
    <p>Новый пользователь</p>
    <label for="name">Имя:</label>
    <input type="text" id="name" name="name" required><br>
    <label for="surname">Фамилия:</label>
    <input type="text" id="surname" name="surname" required><br>
    <label for="patronymic">Отчество:</label>
    <input type="text" id="patronymic" name="patronymic" required><br>
    <label for="email">Почта:</label>
    <input type="text" id="email" name="email" required><br>
    <label for="login">Логин:</label>
    <input type="text" id="login" name="login" required><br>
    <label for="password">Пароль:</label>
    <input type="password" id="password" name="password" required><br>
    <label for="role">Роль:</label>
    <select id="role" name="role" required>
        <option value="user">Пользователь</option>
        <option value="admin">Админ</option>
    </select><br>
    <label for="birthday">Дата рождения:</label>
    <input type="date" id="birthday" name="birthday" required><br>
    <button type="submit">Добавить</button>
</form>

</body>
</html>
