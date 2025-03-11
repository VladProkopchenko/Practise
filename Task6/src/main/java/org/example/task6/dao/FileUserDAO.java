package org.example.task6.dao;

import org.example.task6.model.User;
import org.example.task6.tools.FileUtil;

import java.util.List;

public class FileUserDAO implements UserDAO {
    private static FileUserDAO fileUserDAO;
    private final FileUtil fileUtil;
    private final String fileDirectory = "C:\\Users\\Admin\\Desktop\\Practise\\Task6\\src\\main\\java\\org\\example\\task6\\users.txt";

    private FileUserDAO(FileUtil fileUtil) {
        this.fileUtil = fileUtil;
    }
    public static FileUserDAO getInstance(FileUtil fileUtil) {
        if (fileUserDAO == null) {
            fileUserDAO = new FileUserDAO(fileUtil);
        }
        return fileUserDAO;
    }
    @Override
    public void createUser(User user) {
        List<User> users = fileUtil.readUsersFromFile(fileDirectory);
        users.add(user);
        fileUtil.writeUsersToFile(fileDirectory, users);
    }

    @Override
    public void update(User user) {
        List<User> users = fileUtil.readUsersFromFile(fileDirectory);
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
        fileUtil.writeUsersToFile(fileDirectory, users);
    }

    @Override
    public List<User> findAll() {
        System.out.println("UserDAO.findAll");
        System.out.println(fileUtil.readUsersFromFile(fileDirectory));
        return fileUtil.readUsersFromFile(fileDirectory);
    }
    @Override
    public User findByLogin(String login) {
        List<User> users = fileUtil.readUsersFromFile(fileDirectory);
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User read(int id) {
        List<User> users = fileUtil.readUsersFromFile(fileDirectory);
        for (User user : users) {
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        List<User> users = fileUtil.readUsersFromFile(fileDirectory);
        for(int i=0; i<users.size(); i++) {
            if(users.get(i).getId() == id) {
                users.remove(i);
            }
        }
        fileUtil.writeUsersToFile(fileDirectory, users);
    }
}
