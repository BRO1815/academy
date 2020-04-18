package by.academy.control1;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rn = new Random();

        //for (int i : arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(4);
            System.out.print(arr[i] + " ");
        }
        System.out.println(Arrays.toString(arr));
        int num = arr[0];
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                num = arr[i];
            }
            count = 1;
        }

        System.out.println(num + ": " + (max));
    }
}

