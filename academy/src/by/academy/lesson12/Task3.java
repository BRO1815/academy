package by.academy.lesson12;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("academy/src/io/file.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("academy/src/io/copied_file_task3.txt"))) {

            int a;
            while((a = reader.read()) != -1) {
                writer.write(a);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

