package by.academy.homework1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число: ");
		int x = sc.nextInt();

		sc.close();

		for (int i = 1; i <= 10; i++) {
			System.out.println(x +"*"+i+"="+x*i);
		}

	}
}