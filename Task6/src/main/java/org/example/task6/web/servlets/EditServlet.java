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
import org.example.task6.tools.Validator;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class EditServlet extends HttpServlet {
    private UserDAO userDAO = FileUserDAO.getInstance();
    private UserService userService = UserServiceFactory.getUserService("user",userDAO);

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/edit.jsp");
        rd.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        String action = request.getParameter("action");
        if(action.equals("save")) {
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            String patronymic = request.getParameter("patronymic");
            String email = request.getParameter("email");
            String login = request.getParameter("login");
            String role = request.getParameter("role");
            String birthdayStr = request.getParameter("birthday");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date birthday = null;
            try {
                birthday = dateFormat.parse(birthdayStr);
            } catch (ParseException e) {
                System.out.println("Error date");
            }
            if (Validator.isNotEmpty(name) && Validator.isNotEmpty(surname) && Validator.isNotEmpty(patronymic)
                    && Validator.isNotEmpty(email) && Validator.isNotEmpty(login)
                    && Validator.isNotEmpty(role) && Validator.isNotEmpty(birthdayStr)) {
                User modifiedUser = (User) session.getAttribute("userForEdit");
                modifiedUser.setName(name);
                modifiedUser.setSurname(surname);
                modifiedUser.setPatronymic(patronymic);
                modifiedUser.setEmail(email);
                modifiedUser.setLogin(login);
                modifiedUser.setRole(role);
                modifiedUser.setBirthday(birthday);
                userService.updateUser(modifiedUser);
                List<User> users = userService.getAllUsers();
                System.out.println(users);
                session.setAttribute("users", users);
                response.sendRedirect(request.getContextPath() + "/menu");
            } else {
                response.sendRedirect(request.getContextPath() + "/edit-user");
            }
        }
        if(action.equals("cansel")){
            response.sendRedirect(request.getContextPath() + "/menu");
        }

    }
}

