package org.example.task6.web.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.task6.dao.FileUserDAO;
import org.example.task6.dao.UserDAO;
import org.example.task6.model.User;
import org.example.task6.service.UserService;
import org.example.task6.service.UserServiceFactory;
import org.example.task6.service.UserServiceImpl;
import org.example.task6.tools.FileUtil;

import java.io.IOException;
import java.util.List;

public class LoginServlet extends HttpServlet {
    private UserDAO userDAO = FileUserDAO.getInstance();
    private UserService userService = UserServiceFactory.getUserService("user",userDAO);

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
        rd.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        HttpSession session = request.getSession();

        List<User> users = userService.getAllUsers();
            if (userService.checkPassword(login, password)) {
                session.setAttribute("user", userService.getUserByLogin(login));
                session.setAttribute("isLoggedIn", true);
                session.setAttribute("users",users);
                response.sendRedirect(request.getContextPath() + "/menu");
            } else {
                response.sendRedirect(request.getContextPath() + "/login");
            }
    }
}
