package by.academy.homework1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите тип переменной: ");
        String type = sc.nextLine();

        System.out.println("Введите переменную: ");
        //String variable = sc.nextLine();

        switch (type) {
            case "int":
                //int varInt = Integer.parseInt (type);
                int varInt = sc.nextInt();
                System.out.println(varInt % 2);
                break;
            case "double":
                double varDouble = sc.nextDouble();
                System.out.println(varDouble*0.7);
                break;
            case "float":
                float varFloat = sc.nextFloat();
                System.out.println(varFloat*varFloat);
                break;
            case "char":
                int varChar = sc.next().charAt(0);
                //char varChar = sc.next().charAt(0);
                //int v = varChar;
                System.out.println(varChar);
                break;
            case "String":
                String varString = sc.nextLine();
                System.out.println("Hello" + varString);
                break;
            default:
                String var = sc.nextLine();
                System.out.println("Unsupported type");
        }

        sc.close();

    }
}