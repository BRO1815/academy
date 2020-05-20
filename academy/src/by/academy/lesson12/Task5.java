package by.academy.lesson12;

import java.io.File;

public class Task5 {
    public static void main(String[] arg) {

        File dir = new File("academy/src/by/academy/Deal");
        showListFile(dir);
    }

    public static void showListFile(File dir) {

        if (dir.isDirectory()) {
            System.out.println("Каталог " + dir.getName());

            File[] ld = dir.listFiles();

            for (int i = ld.length - 1; i >= 0; i--) {
                if (ld[i].isFile()) {
                    System.out.println("Файл " + ld[i].getName());
                } else {
                    showListFile(ld[i]);
                }

            }
        }
    }
}
