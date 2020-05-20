package by.academy.lesson12.Task1_2;

import java.io.*;

public class FileInputOutputStreamDemo {
    public static void main(String[] args) {

        File dir = new File("academy/src/io");
        if (!dir.exists()) {
            dir.mkdir();
        }

        File file = new File(dir, "file.txt");

        try (OutputStream output = new FileOutputStream(file);
             InputStream input = new FileInputStream(file)) {

            char[] symbols = {'a', 'b', 'c'};

            for (char i : symbols) {
                // Запись каждого символа в текстовый файл
                output.write(i);
            }

            int size = input.available();

            for (int i = 0; i < size; i++) {
                // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }
        } catch (IOException e) {
            System.out.print("Exception" + e);
        }
    }
}