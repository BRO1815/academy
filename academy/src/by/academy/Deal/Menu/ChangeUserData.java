package by.academy.Deal.Menu;

import by.academy.Deal.User;
import by.academy.homework3.Task5.BelarusPhoneValidator;
import by.academy.homework3.Task5.EmailValidator;

import java.util.Scanner;

public class ChangeUserData {
    String data;

    public void changeUserData(User user) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Имя");
        data = scan.next();
        user.setName(data);

        System.out.println("Количество денег");
        data = scan.next();
        user.setMoney(Double.parseDouble(data));

        System.out.println("Дата рождения");
        DateOn don = new DateOn();
        user.setDateOfBirth(don.dateOn());

        BelarusPhoneValidator bpv = new BelarusPhoneValidator();
        for (int i = 0; i < 1; ) {
            System.out.println("Телефон +(12 цифр)");
            data = scan.next();
            if (bpv.validate(data)) {
                user.setPhone(data);
                i = 2;
            } else {
                System.out.println("Телефон введен неверно");
            }
        }

        EmailValidator ev = new EmailValidator();
        for (int i = 0; i < 1; ) {
            System.out.println("Email");
            data = scan.next();
            if (ev.validate(data)) {
                user.setEmail(data);
                i = 2;
            }
        }
        scan.close();
    }
}
