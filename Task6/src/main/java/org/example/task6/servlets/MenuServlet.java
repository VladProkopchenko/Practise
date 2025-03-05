package org.example.task6.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.task6.model.User;
import org.example.task6.tools.UserTool;

import java.io.IOException;
import java.util.List;

public class MenuServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/menu.jsp");
        rd.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getParameter("action");
        if (action.equals("logout")) {
            HttpSession session = request.getSession();
            session.setAttribute("isLoggedIn", "false");
            response.sendRedirect(request.getContextPath() + "/login");
        }
        if (action.equals("addUser")) {
            response.sendRedirect(request.getContextPath() + "/new-user");
        }
        if(action.equals("editUser")) {
            HttpSession session = request.getSession();
            List<User> users = (List<User>) session.getAttribute("users");
            int userId = Integer.parseInt(request.getParameter("userId"));
            User user = UserTool.getUserById(users,userId);
            session.setAttribute("userForEdit",user);
            response.sendRedirect(request.getContextPath() + "/edit-user");
        }
        if(action.equals("deleteUser")) {
            int userId = Integer.parseInt(request.getParameter("userId"));
            HttpSession session = request.getSession();
            List<User> users = (List<User>) session.getAttribute("users");
            for(int i=0; i<users.size(); i++) {
                if(users.get(i).getId() == userId) {
                    users.remove(i);
                }
            }
            session.setAttribute("users", users);
            response.sendRedirect(request.getContextPath() + "/menu");
        }
    }
}
