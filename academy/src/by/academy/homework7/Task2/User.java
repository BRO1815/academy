package by.academy.homework7.Task2;

import java.util.Date;

public class User extends Person {
    private String login;
    private String password;
    private String email;

    public User(String firstName, String lastName, short age, Date dateOfBirth, String login, String password, String email) {
        super(firstName, lastName, age, dateOfBirth);
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public User() {
        super();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        //Знаю, что это неправильный способ создания строки, но в этот раз мы нарушаем правила
        return ("First name: " + getFirstName()+ "\nLast name: "+ getLastName()+"\nAge: "+ getAge()+"\nDate of birth: "+ getDateOfBirth()+
                "\nLogin: "+ getLogin()+ "\nEmail: "+ getEmail());
    }

    public void printUserInfo(){
        System.out.println(this.toString());
    }
}
