package by.academy.homework2;

public class Task4 {
    public static void main(String[] args) {
        Visa Visa = new Visa("Вася", "Жук", 256389);
        Visa.cashOut();
        Visa.buyPotatoes();
        Visa VisaGold = new VisaGold("Женя", "Жук", 256389);
        VisaGold.buyPotatoes();
    }
}

abstract class BankCard {
    abstract void cashOut();
}

class Visa extends BankCard {

    String name;
    String familyName;
    int number;

    public Visa(String name, String familyName, int number) {
        this.name = name;
        this.familyName = familyName;
        this.number = number;
    }

    public Visa() {

    }

    @Override
    public void cashOut() {
        System.out.println(number + ": деньги обналичены");
    }

    public void buyPotatoes() {
        System.out.println(" Картошка куплена");


    }
}

class VisaGold extends Visa {

    public VisaGold(String name, String familyName, int number) {
        super();
        this.name = name;
        this.familyName = familyName;
        this.number = number;
    }

    @Override
    public void buyPotatoes() {
        System.out.println(" Картошка куплена со скидкой");

    }
}
