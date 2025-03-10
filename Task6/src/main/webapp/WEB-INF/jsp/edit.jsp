<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<html>
<t:head title="Изменить пользователя">

</t:head>
<t:centeredBody>
    <form action="${pageContext.request.contextPath}/edit-user" method="post">
        <h1>Редактировать пользователя</h1>
        <div class="form-group">
            <label for="name">Имя:</label>
            <input type="text" id="name" name="name" value="${sessionScope.userForEdit.name}">
        </div>
        <div class="form-group">
            <label for="surname">Фамилия:</label>
            <input type="text" id="surname" name="surname" value="${sessionScope.userForEdit.surname}">
        </div>
        <div class="form-group">
            <label for="patronymic">Отчество:</label>
            <input type="text" id="patronymic" name="patronymic" value="${sessionScope.userForEdit.patronymic}">
        </div>
        <div class="form-group">
            <label for="email">Почта:</label>
            <input type="text" id="email" name="email" value="${sessionScope.userForEdit.email}">
        </div>
        <div class="form-group">
            <label for="login">Логин:</label>
            <input type="text" id="login" name="login" value="${sessionScope.userForEdit.login}">
        </div>
        <div class="form-group">
            <label for="role">Роль:</label>
            <select id="role" name="role" required>
                <option value="user">Пользователь</option>
                <option value="admin">Администратор</option>
            </select>
        </div>
        <div class="form-group">
            <label for="birthday">Дата рождения:</label>
            <input type="date" id="birthday" name="birthday">
        </div>
        <button type="submit" name="action" value="save">Сохранить изменения</button>
        <button type="submit" name="action" value="cansel">Отменить изменения</button>
    </form>
</t:centeredBody>

</html>
