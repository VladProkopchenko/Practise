<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Main Page</h1>
<h1>Привет, ${sessionScope.user.name}</h1>
<form action="${pageContext.request.contextPath}/menu" method="post">
    <button type="submit" name="action" value="logout">Выйти</button>
    <button type="submit" name="action" value="addUser">добавить пользователя</button>
</form>
<c:if test="${sessionScope.user.role == 'admin'}">
    <p>Пользователи</p>
    <table>
        <tr>
            <th>Имя</th>
            <th>Фамилия</th>
            <th>Отчество</th>
            <th>Логин</th>
            <th>Почта</th>
            <th>Дата рождения</th>
            <th>Роль</th>
        </tr>
        <c:forEach var="user" items="${sessionScope.users}">
            <tr>
                <td>${user.name}</td>
                <td>${user.surname}</td>
                <td>${user.patronymic}</td>
                <td>${user.login}</td>
                <td>${user.email}</td>
                <td>${user.birthday}</td>
                <td>${user.role}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>
