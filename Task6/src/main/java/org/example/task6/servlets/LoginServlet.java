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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class LoginServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config)  {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
        rd.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        User admin = new User("user-admin", "qqq", "qqqqq", "com",
                "admin", "admin123", "admin", new Date(1999, Calendar.AUGUST, 15));
        User user = new User("user-user", "qqqq", "qqqq", "com",
                "user", "user123", "user", new Date(1999, Calendar.JUNE, 15));
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(user);
        session.setAttribute("users", users);

        if(UserTool.checkPassword(users,login,password)){
            session.setAttribute("user",UserTool.getCheckedUser(users,login));
            session.setAttribute("isLoggedIn",true);
            response.sendRedirect(request.getContextPath()+"/menu");
        }
        else{
            session.setAttribute("isLoggedIn",false);
            response.sendRedirect(request.getContextPath()+"/login");
        }

    }
}
