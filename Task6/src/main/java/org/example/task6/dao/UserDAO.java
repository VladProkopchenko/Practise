package org.example.task6.dao;

import org.example.task6.model.User;

import java.util.List;

public interface UserDAO {
     void createUser(User user);
     void update(User user);
     List<User>findAll();
     User findByLogin(String login);
     User read(int id);
     void deleteById(int id);
}
