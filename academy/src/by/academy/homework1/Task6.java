package by.academy.homework1;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первую строку: ");
        String line1 = sc.nextLine();
        System.out.println("Введите вторую строку: ");
        String line2 = sc.nextLine();

        sc.close();

        if (line1.length() != line2.length()) {
            System.out.println("False");
        } else {
            int symbolSum = 0;
            for (int i = 0; i < line1.length(); i++) {

                for (int x = 0; x < line1.length(); x++) {
                    if (line1.charAt(i) == line1.charAt(x)) {
                        symbolSum++;
                    }
                    if (line1.charAt(i) == line2.charAt(x)) {
                        symbolSum--;
                    }

                }
                if (symbolSum != 0) {
                    System.out.println("False");
                    return;
                }

            }
            System.out.println("True");

        }
    }
}