package by.academy.homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите сумму покупки: ");
        float sum = sc.nextInt();

        System.out.println("Введите возраст покупателя:  ");
        int age = sc.nextInt();

        System.out.println("сумма покупки: " + sum);
        System.out.println("возраст покупателя: " + age);

        sc.close();

        int discount;
        if(sum < 100) {
            discount=5;
        } else if (sum >= 100 && sum < 200 ) {
               discount = 7;
            } else if (sum >= 200 && sum < 300) {
                    discount = 12;
                    if ( age > 18 ) {
                        discount = discount+4;
                    } else {
                        discount = discount-3;
                    }
                } else if (sum >= 300 && sum < 400) {
                        discount = 15;
                    } else {
                            discount = 20;
                        }


        System.out.println("Скидка " + discount + " % = " + sum *discount/100 + " руб.");

    }

    }
