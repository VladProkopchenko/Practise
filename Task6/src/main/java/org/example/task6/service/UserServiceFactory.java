package org.example.task6.service;

import org.example.task6.dao.FileUserDAO;
import org.example.task6.dao.UserDAO;

public class UserServiceFactory {
    public static UserService getUserService() {
        UserDAO userDAO = FileUserDAO.getInstance();
        return UserServiceImpl.getInstance(userDAO);
    }
}
