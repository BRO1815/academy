package by.academy.homework1;

import java.io.IOException;
import java.util.Scanner;

public class Task5 {

    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {
        int pairsCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int x = i + 1; x < arr.length; x++) {
                if (arr[i] - arr[x] == k || arr[i] - arr[x] == -k)
                    pairsCount++;
            }
        }

        return pairsCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Введите строку");
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrItems[i]);
            System.out.print(arr[i] + " ");
        }

        int result = pairs(k, arr);
        System.out.println();
        System.out.println(result);

        scanner.close();
    }
}

