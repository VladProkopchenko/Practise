package org.example.task5;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
        rd.forward(req,res);

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();

        User user = new User("admin","admin123");
        if(session.getAttribute("user")!=null){
            User oldUser = (User)session.getAttribute("user");
            user.setName(oldUser.getName());
            user.setPassword(oldUser.getPassword());
        }

        if (user.getName().equals(username) && user.getPassword().equals(password)) {

            session.setAttribute("user", user);
            session.setAttribute("isLogin", true);
            response.sendRedirect(request.getContextPath() + "/welcome.jhtml");
        } else {
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        }
    }
}
