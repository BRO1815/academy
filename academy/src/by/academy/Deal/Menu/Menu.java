package by.academy.Deal.Menu;

import by.academy.Deal.Deal;
import by.academy.Deal.Product;
import by.academy.Deal.User;

import java.util.Scanner;

public class Menu {

    private Product[] products;

    public void menu(User buyer, User seller, Product[] product) {

        products = product;
        ChangeUserData changeBuyerData = new ChangeUserData();
        ChangeUserData changeSellerData = new ChangeUserData();
        ChangeOrder changeOrder = new ChangeOrder();
        Scanner scan = new Scanner(System.in);
        String sc;
        int i = 0;

        while (i != 6) {
            System.out.println("1-Внести новые данные покупателя");
            System.out.println("2-Внести новые данные продавца");
            System.out.println("3-Добавить товар");
            System.out.println("4-Удалить товар по наименованию");
            System.out.println("5-Завершить сделку, получить чек");
            System.out.println("6-Выйти");

            sc = scan.next();

            try {
                i = Integer.parseInt(sc);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }

            switch (i) {
                case 1:
                    changeBuyerData.changeUserData(buyer);
                    break;
                case 2:
                    changeSellerData.changeUserData(seller);
                    break;
                case 3:
                    changeOrder.addProduct(products);
                    break;
                case 4:
                    System.out.println("Наименование товара");
                    sc = scan.next();
                    RemoveProduct rp = new RemoveProduct();
                    if (rp.removeProduct(products, sc)) {
                        System.out.println(sc + "- товар удален");
                        break;
                    }
                    System.out.println(sc + "- наименование не найдено");
                    break;
                case 5:
                    Deal deal = new Deal(buyer, seller, products);
                    deal.deal();
                    System.out.println(deal.getDealInformation());
                    deal.chequeInFile();
                    break;
            }

        }
        scan.close();
        product = products;
    }
}




