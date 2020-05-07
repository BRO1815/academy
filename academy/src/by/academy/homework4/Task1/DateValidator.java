package by.academy.homework4.Task1;

import java.util.regex.Pattern;

public class DateValidator {

    public byte validate(String str) {

        String regexp1 = "(([0-2][0-9])|(3[0-1]))/((0[0-9])|(1[0-2]))/\\d{4}";
        String regexp2 = "(([0-2][0-9])|(3[0-1]))-((0[0-9])|(1[0-2]))-\\d{4}";
        String regexp3 = "(([0-2][0-9])|(3[0-1]))\\.((0[0-9])|(1[0-2]))\\.\\d{4}";

        if (Pattern.matches(regexp1, str)) {
            return 1;
        } else if (Pattern.matches(regexp2, str)) {
            return 2;
        } else if (Pattern.matches(regexp3, str)) {
            return 3;
        } else {
            System.out.println("Не соответствует допустимым форматам даты");
            return 0;
        }


    }
}

