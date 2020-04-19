package by.academy.homework2;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.nextLine();
        sc.close();
        System.out.println(str.replaceAll(" +", " "));

    }

}