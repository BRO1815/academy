package by.academy.homework6.Task4;

import java.io.*;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        File dir = new File("academy/src/by/academy/homework6/Task4/files");
        if (!dir.exists()) {
            dir.mkdir();
        }

        Random random = new Random();
        int size = 0;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("academy/src/by/academy/homework6/task2.txt"));
            int a;
            String text = null;
            while ((a = bufferedReader.read()) != -1) {
                text += (char) a;
            }
            bufferedReader.close();

            File resultFile = new File(dir, "result.txt");
            FileWriter resultWriter = new FileWriter(resultFile, true);
            for (int i = 0; i < 100; i++) {
                File file = new File(dir, i + ".txt");
                FileWriter fileWriter = new FileWriter(file);
                size = random.nextInt(text.length());
                fileWriter.write(text.substring(0, size));
                resultWriter.write(file.getName() + " - " + size + "\n");
                fileWriter.close();
            }
            resultWriter.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
