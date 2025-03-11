package org.example.task6.dao;

public class UserDAOFactory {
    public static UserDAO getUserDAO() {
        return FileUserDAO.getInstance();
    }
}
