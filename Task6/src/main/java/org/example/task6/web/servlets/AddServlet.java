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
import org.example.task6.tools.Validator;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AddServlet extends HttpServlet {
    private FileUtil fileUtil = new FileUtil();
    private UserDAO userDAO = FileUserDAO.getInstance(fileUtil);
    private UserService userService = UserServiceImpl.getInstance(userDAO);

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


        if(Validator.isNotEmpty(name) && Validator.isNotEmpty(surname) && Validator.isNotEmpty(patronymic)
        && Validator.isNotEmpty(email) && Validator.isNotEmpty(login) && Validator.isNotEmpty(password)
            && Validator.isNotEmpty(role) && Validator.isNotEmpty(birthdayStr)){
            HttpSession session = request.getSession();
            List<User> users = userService.getAllUsers();
            User user = new User(users.size()+1, name, surname, patronymic, email, login, password, role, birthday);
            userService.createUser(user);
            users = userService.getAllUsers();
            session.setAttribute("users", users);

            response.sendRedirect(request.getContextPath() + "/menu");
        }
        else{
            response.sendRedirect(request.getContextPath() + "/new-user");
        }
    }
}
