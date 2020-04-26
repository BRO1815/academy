package by.academy.homework3.Task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task2_3_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату");
        String str = sc.nextLine();
        sc.close();
        String pattern = null;
        String regexpA = "(([0-2][0-9])|(3[0-1]))/((0[0-9])|(1[0-2]))/\\d{4}";
        String regexpB = "(([0-2][0-9])|(3[0-1]))-((0[0-9])|(1[0-2]))-\\d{4}";

        if (Pattern.matches(regexpA, str)) {
            pattern = "dd/MM/yyyy";
        } else if (Pattern.matches(regexpB, str)) {
            pattern = "dd-MM-yyyy";
        } else {
            System.out.println("Не соответствует допустимым форматам даты");
            return;
        }

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            date = dateFormat.parse(str);
            dateFormat = new SimpleDateFormat("EEEE  dd");
            System.out.println("День: " + dateFormat.format(date));
            dateFormat = new SimpleDateFormat("MMMM");
            System.out.println("Месяц: " + dateFormat.format(date));
            dateFormat = new SimpleDateFormat("y");
            System.out.println("Year: " + dateFormat.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("------------ Task4 ------------ ");

        dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(dateFormat.format(calendar.getTime()));
        calendar.add(Calendar.MONTH, 3);
        calendar.add(Calendar.DAY_OF_MONTH, 2);
        calendar.add(Calendar.HOUR, 4);
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
