package by.academy.homework7.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] arg) {

        Class<Person> person = Person.class;
        Class<User> user = User.class;

        System.out.println("----getMethod----");
        Method personGetFirstName;
        try {
            personGetFirstName = person.getMethod("getFirstName");
            System.out.println(personGetFirstName);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("----getMethods() User----");
        Method[] userMethods = user.getMethods();
        for (Method i : userMethods) {
            System.out.println(i);
        }

        System.out.println("----getField private----");
        try {
            Field userFirstName = user.getField("firstName");
            System.out.println(userFirstName);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("----getField()----");
        try {
            Field userLastName = user.getField("lastName");
            System.out.println(userLastName);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("----getFields()----");
        Field[] userFields = user.getFields();
        for (Field i : userFields) {
            System.out.println(i);
        }

        Method personGetLastName;
        System.out.println("----getDeclaredMethod----");
        try {
            personGetLastName = person.getDeclaredMethod("getLastName");
            System.out.println(personGetLastName);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("----user.getDeclaredMethods()----");
        Method[] userDeclaredMethods = user.getDeclaredMethods();
        for (Method i : userDeclaredMethods) {
            System.out.println(i);
        }

        System.out.println("----getDeclaredField----");
        try {
            Field userDeclaredLoginField = user.getDeclaredField("login");
            System.out.println(userDeclaredLoginField);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("----getDeclaredFields()----");
        Field[] userDeclaredFields = user.getDeclaredFields();
        for (Field i : userDeclaredFields) {
            System.out.println(i);
        }

        System.out.println("----Vasya----");
        User vasya = new User();
        try {
            Field firstNameField = person.getDeclaredField("firstName");
            Field lastNameField = person.getDeclaredField("lastName");
            Field ageField = person.getDeclaredField("age");
            Field dateOfBirthField = person.getDeclaredField("dateOfBirth");
            Field loginField = user.getDeclaredField("login");
            Field passwordField = user.getDeclaredField("password");
            Field emailField = user.getDeclaredField("email");

            firstNameField.setAccessible(true);
            firstNameField.set(vasya, "Vasya");
            lastNameField.setAccessible(true);
            lastNameField.set(vasya, "Pupkin");
            ageField.setAccessible(true);
            ageField.set(vasya, (short) 25);
            dateOfBirthField.setAccessible(true);

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            dateOfBirthField.set(vasya, format.parse("01/01/1995"));

            loginField.setAccessible(true);
            loginField.set(vasya, "Vasya_nagibator_1995");
            passwordField.setAccessible(true);
            passwordField.set(vasya, "12345");
            emailField.setAccessible(true);
            emailField.set(vasya, "Pupkin1995@email.com");

            System.out.println("FirstName: " + firstNameField.get(vasya));
            System.out.println("LastName: " + lastNameField.get(vasya));
            System.out.println("ageField: " + ageField.get(vasya));
            System.out.println("dateOfBirthField: " + dateOfBirthField.get(vasya));
            System.out.println("login: " + loginField.get(vasya));
            System.out.println("email: " + emailField.get(vasya));
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("----Vasya_invoke----");
        try {
            Method toStringMethod = user.getMethod("toString");
            System.out.println(toStringMethod.invoke(vasya));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
