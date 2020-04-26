package by.academy.lesson8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IP {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите дату");
            String str = sc.nextLine();
            //sc.close();
            String regexp = "(((([0-1][0-9][0-9])|(2[0-4][0-5])|(2[0-5][0-5]))\\.){3}(([0-1][0-9][0-9])|(2[0-4][0-5])|(2[0-5][0-5])))";

            //Pattern pattern = Pattern.compile(regexp);
            //Matcher matcher = pattern.matcher(str);
            boolean found = Pattern.matches(regexp, str);
            if (found) {
                System.out.println("IP");
            } else {
                System.out.println("НЕ IP");
            }
        }
    }
}
