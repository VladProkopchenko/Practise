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
import org.example.task6.service.UserServiceImpl;
import org.example.task6.tools.FileUtil;

import java.io.IOException;
import java.util.List;

public class MenuServlet extends HttpServlet {
    private FileUtil fileUtil = new FileUtil();
    private UserDAO userDAO = FileUserDAO.getInstance(fileUtil);
    private UserService userService = UserServiceImpl.getInstance(userDAO);

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/menu.jsp");
        rd.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String action = request.getParameter("action");
        HttpSession session = request.getSession();

        if (action.equals("logout")) {
            session.setAttribute("isLoggedIn", "false");
            response.sendRedirect(request.getContextPath() + "/login");
        }
        if (action.equals("addUser")) {
            response.sendRedirect(request.getContextPath() + "/new-user");
        }
        if(action.equals("editUser")) {
            int userId = Integer.parseInt(request.getParameter("userId"));
            User user = userService.getUserById(userId);
            session.setAttribute("userForEdit",user);
            response.sendRedirect(request.getContextPath() + "/edit-user");
        }
        if(action.equals("deleteUser")) {
            int userId = Integer.parseInt(request.getParameter("userId"));
            userService.deleteUser(userId);
            List<User> users = userService.getAllUsers();
            session.setAttribute("users", users);
            response.sendRedirect(request.getContextPath() + "/menu");
        }
    }
}
