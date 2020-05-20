package by.academy.lesson13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = 0;

        try {
            x = sc.nextInt();
            sc.close();

            if (x % 2 != 0) {
                System.out.print("не");
            }
            System.out.println("четное");
            for (int i = 2; i <= x; i++) {
                if (i == x) {
                    System.out.print("простое");
                }

                if (x % i == 0) {
                    System.out.print("составное");
                    return;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
            sc.close();
        }
    }
}

