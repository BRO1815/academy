package by.academy.homework1;

//import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
                
        int x = 2;
        /*
         Scanner sc = new Scanner(System.in);
         System.out.println("Введите число: ");
         x = sc.nextInt();
         sc.close();
		*/
        
        double z = 0;
        for (int i = 0; z <= 1_000_000; i++) {
            z = Math.pow(x,i);
            System.out.println(x +"^"+i+"="+z);
        }

    }
}