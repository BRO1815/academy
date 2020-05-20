package by.academy.lesson13;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        String vvod = sc.nextLine();
        String[] parts = vvod.split(" ");

        StringBuilder strBuilder = new StringBuilder();

        Arrays.sort(parts);
        char first = 0;
        //parts[0].toUpperCase() + parts.slice(1);
        for (String x : parts) {
            first = x.charAt(0);
        }
    }
}
