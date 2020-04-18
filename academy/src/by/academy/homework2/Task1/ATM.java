package by.academy.homework2.Task1;

public class ATM {

    private int coins20;
    private int coins50;
    private int coins100;

    public int getCoins20() {
        return coins20;
    }

    public void setCoins20(int coins20) {
        this.coins20 = coins20;
    }

    public int getCoins50() {
        return coins50;
    }

    public void setCoins50(int coins50) {
        this.coins50 = coins50;
    }

    public int getCoins100() {
        return coins100;
    }

    public void setCoins100(int coins100) {
        this.coins100 = coins100;
    }


    public ATM(int coins20, int coins50, int coins100) {
        super();
        this.coins20 = coins20;
        this.coins50 = coins50;
        this.coins100 = coins100;
    }


}