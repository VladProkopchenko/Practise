package org.example.task6.tools;

import org.example.task6.model.User;

import java.util.List;

public class UserTool {
    public static boolean checkPassword(List<User> users,String login, String password) {

        boolean result = false;
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return result;
    }
    public static User getCheckedUser(List<User> users, String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }
}
