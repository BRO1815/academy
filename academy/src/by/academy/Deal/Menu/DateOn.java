package by.academy.Deal.Menu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DateOn {

    public Date dateOn() {
        Date date = new Date();
        date=null;
        Scanner sc = new Scanner(System.in);
        String str;
        while (date==null) {
            str = sc.nextLine();
            String pattern = null;
            String regexpA = "(([0-2][0-9])|(3[0-1]))/((0[0-9])|(1[0-2]))/\\d{4}";
            String regexpB = "(([0-2][0-9])|(3[0-1]))-((0[0-9])|(1[0-2]))-\\d{4}";
            if (Pattern.matches(regexpA, str)) {
                pattern = "dd/MM/yyyy";

            } else if (Pattern.matches(regexpB, str)) {
                pattern = "dd-MM-yyyy";

            } else {
                System.out.println("Не соответствует допустимым форматам даты");
                continue;
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
            try {
                date = dateFormat.parse(str);
                return date;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        sc.close();
        return date;
    }
}