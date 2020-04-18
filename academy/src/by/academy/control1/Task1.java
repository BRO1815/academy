package by.academy.control1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество чисел : ");
        int a = sc.nextInt();
        sc.close();
        int arr[] = new int[a];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[1];
        int min = arr[1];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min ) {
                min = arr[i];
            }
            if (arr[i] > max ) {
                max = arr[i];
            }
            sum += arr[i];

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                sum -= arr[i];
            }
            if (arr[i] == min) {
                sum -= arr[i];
            }
        }

        System.out.println();
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Сумма: " + sum);


    }
}