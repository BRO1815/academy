package by.academy.Deal.Menu;

import by.academy.Deal.Product;
import by.academy.Deal.User;

import java.util.Scanner;

public class Menu {

    private Product[] product;


    public Product[] menu(User buyer, User seller, Product[] product) {
        this.product = product;
        ChangeUserData changeBuyerData = new ChangeUserData();
        ChangeUserData changeSellerData = new ChangeUserData();
        ChangeOrder changeOrder = new ChangeOrder();
        Scanner scan = new Scanner(System.in);
        String sc;
        int i = 0;
        while (i != 4) {
            System.out.println("1-Внести новые данные покупателя");
            System.out.println("2-Внести новые данные продавца");
            System.out.println("3-Добавить товар");
            System.out.println("4-Выйти");
            sc = scan.next();

            try {
                i = Integer.parseInt(sc);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }

            switch (i) {
                case 1:
                    changeBuyerData.ChangeUserData(buyer);
                    break;
                case 2:
                    changeSellerData.ChangeUserData(seller);
                    break;
                case 3:

                    break;
            }


        }
        scan.close();
        return product;
    }
}


