package by.academy.lesson13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = 0;
        int y = 0;
        int nok = 0;
        int nod = 1;
        try {
            x = sc.nextInt();
            y = sc.nextInt();
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
            sc.close();
            return;
        }
        nok = x * y;

        for (int i = 2; i <= x; i++) {
            if (x % i == 0 && y % i == 0) {
                x /= i;
                y /= i;
                nok /= i;
                nod *= i;
                i--;
            }
        }
        System.out.println("НОК :" + nok);
        System.out.print("НОД :" + nod);
    }
}

