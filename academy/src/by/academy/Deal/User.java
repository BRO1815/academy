package by.academy.Deal;

public class User {

    private String name;
    private double money;

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

    public void setMoney(double money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

}
