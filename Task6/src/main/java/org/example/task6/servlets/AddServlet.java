package org.example.task6.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.task6.model.User;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AddServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/add.jsp");
        rd.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String patronymic = request.getParameter("patronymic");
        String email = request.getParameter("email");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        String birthdayStr = request.getParameter("birthday");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = null;
        try {
            birthday = dateFormat.parse(birthdayStr);
        } catch (ParseException e) {
            System.out.println("Error date");
        }

        User user = new User(name,surname,patronymic,email,login,password,role,birthday);
        HttpSession session = request.getSession();
        List<User> users = (List<User>) session.getAttribute("users");
        users.add(user);
        session.setAttribute("users", users);

        response.sendRedirect(request.getContextPath()+"/menu");
    }
}
