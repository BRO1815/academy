package by.academy.homework3.Task5;

import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {

        Validator usa = new AmericanPhoneValidator();
        Validator bel = new BelarusPhoneValidator();
        Validator em = new EmailValidator();
        String str1 = "+375292237193";
        if (bel.validate(str1)) {
            System.out.println("1");
        }
        if (usa.validate(str1)) {
            System.out.println("2");
        }
        if (em.validate(str1)) {
            System.out.println("3");
        }




    }



}
