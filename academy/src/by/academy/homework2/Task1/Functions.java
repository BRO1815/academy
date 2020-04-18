package by.academy.homework2.Task1;

import java.util.Scanner;

public class Functions {

    private ATM atm1;
    Scanner ss = new Scanner(System.in);

    public Functions(ATM atm1) {
        this.atm1 = atm1;
    }

    public ATM getAtm1() {
        return atm1;
    }

    public void setAtm1(ATM atm1) {
        this.atm1 = atm1;
    }

    public void loading() {

        System.out.println("Введите количество загружаемых купюр номиналом 100$");
        int x100 = ss.nextInt();
        System.out.println("Введите количество загружаемых купюр номиналом 50$");
        int x50 = ss.nextInt();
        System.out.println("Введите количество загружаемых купюр номиналом 20$");
        int x20 = ss.nextInt();
        atm1.setCoins20(atm1.getCoins20() + x20);
        atm1.setCoins50(atm1.getCoins50() + x50);
        atm1.setCoins100(atm1.getCoins100() + x100);
    }

    public boolean give(int sum) {
        int x100 = atm1.getCoins100();
        int x50 = atm1.getCoins50();
        int x20 = atm1.getCoins20();
        int sumIn = x20 * 20 + x50 * 50 + x100 * 100;
        if (sumIn < sum) {
            System.out.println("Недостаточно денег");
            return false;
        }
        x100 = sum / 100;
        if (atm1.getCoins100() < x100) {
            x100 = atm1.getCoins100();
        }
        sum -= x100 * 100;
        x50 = sum / 50;
        if (atm1.getCoins50() < x50) {
            x50 = atm1.getCoins50();
        }
        sum -= x50 * 50;
        x20 = sum / 20;
        if (atm1.getCoins20() < x20) {
            x20 = atm1.getCoins20();
        }
        sum -= x20 * 20;
        if (sum != 0) {
            System.out.println("Сумма не может быть выдана");
            return false;
        }

        atm1.setCoins100(atm1.getCoins100() - x100);
        atm1.setCoins50(atm1.getCoins50() - x50);
        atm1.setCoins20(atm1.getCoins20() - x20);
        String str = "Выдано купюр номиналом 100$, 50$, 20$ : ";
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.append(x100);
        strBuilder.append(", ");
        strBuilder.append(x50);
        strBuilder.append(", ");
        strBuilder.append(x20);
        System.out.println(strBuilder.toString());

        return true;
    }

    public void checСash() {

        String str = "Имеется купюр номиналом 100$, 50$, 20$ : ";
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.append(atm1.getCoins100());
        strBuilder.append(", ");
        strBuilder.append(atm1.getCoins50());
        strBuilder.append(", ");
        strBuilder.append(atm1.getCoins20());
        strBuilder.append("| Сумма: ");
        strBuilder.append(atm1.getCoins20() * 20 + atm1.getCoins50() * 50 + atm1.getCoins100() * 100);
        System.out.println(strBuilder.toString());

    }
}
