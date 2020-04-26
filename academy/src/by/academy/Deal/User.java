package by.academy.Deal;

import java.util.Date;

public class User {

    private String name;
    private double money;
    private Date dateOfBirth;
    private String phone;
    private String email;

    public User() {
        super();
    }

    public User(String name, int money) {
        super();
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

}
