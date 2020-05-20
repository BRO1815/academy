package by.academy.lesson12.Task1_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {

        try (FileInputStream fileIn = new FileInputStream("academy/src/io/file.txt");
             FileOutputStream fileOut = new FileOutputStream("academy/src/io/copied_file.txt")) {

            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }

        } catch (IOException e) {
            System.err.println("Жаль :(");
        }
    }
}