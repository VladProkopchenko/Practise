package org.example.task6.service;

import org.example.task6.model.User;

import java.util.List;

public interface UserService {
     void createUser(User user);
     User getUserById(int id);
     List<User> getAllUsers();
     void deleteUser(int id);
     User getUserByLogin(String login);
     boolean checkPassword(String login, String password);
     void updateUser(User user);
}
