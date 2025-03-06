package org.example.task6.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.task6.model.User;
import org.example.task6.tools.UserTool;
import org.example.task6.tools.Validator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class LoginServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
        rd.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        HttpSession session = request.getSession();

        List<User> users = new ArrayList<>();

        if (session.getAttribute("users") == null) {
            User admin = new User(1, "Вася", "ххх", "ххх", "admin@mail.ru",
                    "admin", "admin123", "admin", new Date(100, Calendar.AUGUST, 34));
            User user = new User(2, "Петя", "ххх", "ххх", "user@gmail.com",
                    "user", "user123", "user", new Date(100, Calendar.JUNE, 15));
            users.add(admin);
            users.add(user);
            session.setAttribute("users", users);
        } else {
            users = (List<User>) session.getAttribute("users");
        }

        if (Validator.isNotEmpty(login) && Validator.isNotEmpty(password)) {
            if (UserTool.checkPassword(users, login, password)) {
                session.setAttribute("user", UserTool.getUserByLogin(users, login));
                session.setAttribute("isLoggedIn", true);
                response.sendRedirect(request.getContextPath() + "/menu");
            } else {
                response.sendRedirect(request.getContextPath() + "/login");
            }
        } else {
            response.sendRedirect(request.getContextPath() + "/login");
        }

    }
}
