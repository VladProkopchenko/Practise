package org.example.task6.service;

import org.example.task6.dao.FileUserDAO;
import org.example.task6.dao.UserDAO;
import org.example.task6.model.User;
import org.example.task6.tools.Validator;

import java.util.List;

public class UserServiceImpl implements UserService {
    private static UserServiceImpl userServiceImpl;
    private final UserDAO userDAO;

    private UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public static UserServiceImpl getInstance(UserDAO userDAO) {
        if (userServiceImpl == null) {
            userServiceImpl = new UserServiceImpl(userDAO);
        }
        return userServiceImpl;
    }

    public void createUser(User user) {
        userDAO.createUser(user);
    }

    public User getUserById(int id) {
        return userDAO.read(id);
    }

    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    public void deleteUser(int id) {
        userDAO.deleteById(id);
    }

    public User getUserByLogin(String login) {
        return userDAO.findByLogin(login);
    }

    @Override
    public boolean checkPassword(String login, String password) {
        System.out.println("UserServiceImpl.checkPassword");
        List<User> users = userDAO.findAll();
        boolean result = false;
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)
                    && Validator.isNotEmpty(login) && Validator.isNotEmpty(password)) {
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public void updateUser(User user) {
        userDAO.update(user);
    }
}
