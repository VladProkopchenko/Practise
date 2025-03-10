<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<html>
<t:head title="Меню">

</t:head>
<t:borderedBody>
    <div class="right-align">
        <p>Привет, ${sessionScope.user.name}</p>
        <form action="${pageContext.request.contextPath}/menu" method="post">
            <button type="submit" name="action" value="logout">Выйти</button>
        </form>
    </div>
    <h2>Главная страница</h2>
    <form action="${pageContext.request.contextPath}/menu" method="post">
        <c:if test="${sessionScope.user.role == 'admin'}">
            <button type="submit" name="action" value="addUser">Добавить пользователя</button>
        </c:if>
    </form>
    <c:if test="${sessionScope.user.role == 'admin'}">
        <div class="table-container">
            <h3>Пользователи</h3>
            <table>
                <tr>
                    <th>Имя</th>
                    <th>Фамилия</th>
                    <th>Отчество</th>
                    <th>Почта</th>
                    <th>Дата рождения</th>
                    <th>Роль</th>
                </tr>
                <c:forEach var="user" items="${sessionScope.users}">
                    <tr>
                        <td>${user.name}</td>
                        <td>${user.surname}</td>
                        <td>${user.patronymic}</td>
                        <td>${user.email}</td>
                        <td>
                            <fmt:formatDate value="${user.birthday}" pattern="dd.MM.yyyy" />
                        </td>
                        <td>
                            <c:if test="${user.role == 'admin'}">
                                Администратор
                            </c:if>
                            <c:if test="${user.role == 'user'}">
                                Пользователь
                            </c:if>
                        </td>
                        <td>
                            <form action="${pageContext.request.contextPath}/menu" method="post">
                                <input type="hidden" name="userId" value="${user.id}"/>
                                <button type="submit" name="action" value="editUser">Редактировать</button>
                                <button type="submit" name="action" value="deleteUser">Удалить</button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </c:if>
</t:borderedBody>
</html>
