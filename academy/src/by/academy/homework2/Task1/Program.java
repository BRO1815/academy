package by.academy.homework2.Task1;

import java.util.Scanner;

public class Program {
    public static void main(String... args) {
        ATM atm1 = new ATM(0, 0, 0);
        Functions WorkATM1 = new Functions(atm1);
        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            System.out.println("1-Добавить банкноты");
            System.out.println("2-Снять деньги");
            System.out.println("3-Выйти");
            switch (sc.nextInt()) {
                case 1:
                    WorkATM1.loading();
                    WorkATM1.checСash();
                    break;
                case 2:
                    System.out.println("Введите сумму");
                    if (WorkATM1.give(sc.nextInt())) {
                        System.out.println("Бжжжжж...жжж.ж..бжжж");
                        System.out.println("Возьмите деньги");
                    }
                    WorkATM1.checСash();
                    break;
                case 3: {
                    return;
                }

            }


        }

    }
}