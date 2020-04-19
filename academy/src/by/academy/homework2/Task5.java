package by.academy.homework2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.nextLine();
        sc.close();
        String regexp = "([а-яА-Я]+)|([a-zA-Z]+)";
        StringBuilder rezult = new StringBuilder();

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            rezult.append(str.substring(matcher.end() - 1, matcher.end()));
        }
        System.out.println(rezult);
    }
}