package by.academy.homework6;

import java.io.*;

public class Task2 {
    public static void main(String[] arg) {

        File file = new File("academy/src/by/academy/homework6/task2.txt");
        File resultFile = new File("academy/src/by/academy/homework6/resultTask2.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(resultFile))) {

            int a;
            while ((a = bufferedReader.read()) != -1) {
                if ((char) a != ' ') {
                    bufferedWriter.write((char) a);
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
