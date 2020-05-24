package by.academy.homework6;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] arg) {
        File file = new File("academy/src/by/academy/homework6/task1.txt");

        try(PrintWriter printWriter = new PrintWriter(file);
            Scanner scan = new Scanner(System.in)){
            String text = scan.next();

            while (!text.equals("stop")){
                printWriter.write(text);
                printWriter.write("\n");
                text = scan.next();
            }

        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
