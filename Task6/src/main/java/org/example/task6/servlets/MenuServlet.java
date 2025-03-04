package org.example.task6.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class MenuServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/menu.jsp");
        rd.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getParameter("action");
        if(action.equals("logout")){
            HttpSession session = request.getSession();
            session.setAttribute("isLoggedIn", "false");
            response.sendRedirect(request.getContextPath() + "/login");
        }
        if(action.equals("addUser")){
            response.sendRedirect(request.getContextPath() + "/new-user");
        }
    }
}
