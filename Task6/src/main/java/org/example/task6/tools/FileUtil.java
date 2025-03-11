package org.example.task6.tools;

import org.example.task6.model.User;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileUtil {

    public static void  writeUsersToFile(String fileName, List<User> users) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (User user : users) {
                writer.write(user.toString());
                writer.newLine();
            }
            System.out.println("Данные успешно записаны в файл: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<User> readUsersFromFile(String fileName) {
        System.out.println("FileUtil.readUsersFromFile: " + fileName);
        List<User> users = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String surname = parts[2];
                String patronymic = parts[3];
                String email = parts[4];
                String login = parts[5];
                String password = parts[6];
                String role = parts[7];

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date birthday = dateFormat.parse(parts[8]);

                users.add(new User(id, name, surname, patronymic, email, login, password, role, birthday));
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return users;
    }
}
