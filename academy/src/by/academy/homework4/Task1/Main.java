package by.academy.homework4.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str="";
        Date Date1 = new Date("01.01.2020");
        Date Date2 = new Date("01.01.2020");

        while (!str.equals("4")) {
            System.out.println("1-Узнать день недели");
            System.out.println("2-Узнать високосный ли год");
            System.out.println("3-Рассчитать количество дней во временном промежутке");
            System.out.println("4-Выйти");
            str = scan.next();

            switch (str) {
                case "1":
                    System.out.println("Введите дату");
                    str = scan.next();
                    if (Date1.setDate(str)) {
                        System.out.print(str);
                        System.out.print(" - ");
                        System.out.println(Date1.D.getWeekday());
                    }
                    break;
                case "2":
                    System.out.println("Введите год");
                    str = scan.next();
                    if (!Date1.leapYear(Short.parseShort(str)))
                        System.out.print("не");
                    System.out.println("високосный");
                    break;
                case "3": {
                    System.out.println("Введите первую дату");
                    str = scan.next();
                    if (Date1.setDate(str)) {
                        System.out.println("Введите вторую дату");
                        str = scan.next();
                        if (Date2.setDate(str)) {
                            SubtractionDate sd = new SubtractionDate(Date1, Date2);
                            System.out.print("Дней между датами: ");
                            System.out.println(Math.abs(sd.substract()));
                        }
                    }
                }
                case "4":
                    break;
                default:
                    System.out.println("введите номер пункта");
            }
        }
        scan.close();
    }
}
