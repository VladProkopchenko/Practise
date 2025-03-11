package org.example.task6.dao;

import org.example.task6.model.User;
import org.example.task6.tools.FileUtil;

import java.util.List;

public class FileUserDAO implements UserDAO {
    private static FileUserDAO fileUserDAO;
    private final String fileDirectory = "C:\\Users\\Admin\\Desktop\\Practise\\Task6\\src\\main\\java\\org\\example\\task6\\users.txt";

    private FileUserDAO() {
    }
    public static FileUserDAO getInstance() {
        if (fileUserDAO == null) {
            fileUserDAO = new FileUserDAO();
        }
        return fileUserDAO;
    }
    @Override
    public void createUser(User user) {
        List<User> users = FileUtil.readUsersFromFile(fileDirectory);
        users.add(user);
        FileUtil.writeUsersToFile(fileDirectory, users);
    }

    @Override
    public void update(User user) {
        List<User> users = FileUtil.readUsersFromFile(fileDirectory);
        for (User u : users) {
            if (u.getId() == user.getId()) {
                u.setName(user.getName());
                u.setPassword(user.getSurname());
                u.setEmail(user.getEmail());
                u.setLogin(user.getLogin());
                u.setRole(user.getRole());
                u.setBirthday(user.getBirthday());
            }
        }
        FileUtil.writeUsersToFile(fileDirectory, users);
    }

    @Override
    public List<User> findAll() {
        System.out.println("UserDAO.findAll");
        System.out.println(FileUtil.readUsersFromFile(fileDirectory));
        return FileUtil.readUsersFromFile(fileDirectory);
    }
    @Override
    public User findByLogin(String login) {
        List<User> users = FileUtil.readUsersFromFile(fileDirectory);
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User read(int id) {
        List<User> users = FileUtil.readUsersFromFile(fileDirectory);
        for (User user : users) {
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        List<User> users = FileUtil.readUsersFromFile(fileDirectory);
        for(int i=0; i<users.size(); i++) {
            if(users.get(i).getId() == id) {
                users.remove(i);
            }
        }
        FileUtil.writeUsersToFile(fileDirectory, users);
    }
}
