package by.academy.homework6.Task3;

import java.io.*;
import java.util.ArrayList;

public class Task3 {
    public static void main(String[] arg) {

        ArrayList<User> list = new ArrayList<>();
        list.add(new User("Karl000", "Grimes", 20));
        list.add(new User("Karl001", "Grimes", 21));
        list.add(new User("Karl002", "Grimes", 22));
        list.add(new User("Karl003", "Grimes", 23));
        list.add(new User("Karl004", "Grimes", 24));
        list.add(new User("Karl005", "Grimes", 25));
        list.add(new User("Karl006", "Grimes", 26));
        list.add(new User("Karl007", "Grimes", 27));
        list.add(new User("Karl008", "Grimes", 28));
        list.add(new User("Karl009", "Grimes", 29));

        File dir = new File("academy/src/by/academy/homework6/Task3/users");
        if (!dir.exists()) {
            dir.mkdir();
        }
        String fileName = null;

        for (User i : list) {
            fileName = i.getName() + "_" + i.getFamilyName() + ".txt";
            File file = new File(dir, fileName);
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
                oos.writeObject(i);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
