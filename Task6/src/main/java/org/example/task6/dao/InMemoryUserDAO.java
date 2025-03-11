package org.example.task6.dao;

import org.example.task6.model.User;

import java.util.List;

public class InMemoryUserDAO  implements UserDAO {
    private static InMemoryUserDAO inMemoryUserDAO;

    private InMemoryUserDAO() {
    }
    public static InMemoryUserDAO getInstance() {
        if(inMemoryUserDAO == null) {
            inMemoryUserDAO = new InMemoryUserDAO();
        }
        return inMemoryUserDAO;
    }

    public void createUser(User user) {

    }
    public void update(User user) {
    }
    public List<User> findAll(){
        return null;
    }

    @Override
    public User findByLogin(String login) {
        return null;
    }

    public User read(int id) {
        return null;
    }
    public void deleteById(int id) {

    }
}
