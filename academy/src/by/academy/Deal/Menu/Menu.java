package by.academy.Deal.Menu;

import by.academy.Deal.Product;
import by.academy.Deal.User;

import java.util.Scanner;

public class Menu {

    private Product[] products;


    public void menu(User buyer, User seller, Product[] product) {
        this.products = product;
        ChangeUserData changeBuyerData = new ChangeUserData();
        ChangeUserData changeSellerData = new ChangeUserData();
        ChangeOrder changeOrder = new ChangeOrder();
        Scanner scan = new Scanner(System.in);
        String sc;
        int i = 0;
        while (i != 5) {
            System.out.println("1-Внести новые данные покупателя");
            System.out.println("2-Внести новые данные продавца");
            System.out.println("3-Добавить товар");
            System.out.println("4-Удалить товар по наименованию");
            System.out.println("5-Выйти");
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
                    changeOrder.addProduct(products);
                    break;
                case 4:
                    System.out.println("Наименование товара");
                    sc = scan.next();
                    for (int z = 0; z <= products.length; z++) {
                        if (z == products.length) {
                            System.out.println("Совпадений нет");
                            break;
                        }
                        if (products[z] != null && products[z].getTitle().equals(sc)) {
                            for (int x = z; x + 1 < products.length; x++) {
                                products[x] = products[x + 1];
                            }
                            products[product.length] = null;
                        }

                    }
                    break;
            }

        }
        scan.close();
        product = products;
    }
}




