package by.academy.Deal;

import by.academy.Deal.Menu.Menu;

import java.io.FileNotFoundException;

public class Program {
    public static void main(String... args) throws FileNotFoundException {

        User buyer = new User("Petia", 1000);
        User seller = new User("Vasia", 1000);

        Product vinoProduct = new Product("Vino", 10, 40);
        Product tortProduct = new Product("Tort", 2, 200);
        Product sharikProduct = new Product("Sharik", 5, 20);
        Product[] products = new Product[10];
        products[0] = vinoProduct;
        products[1] = tortProduct;
        products[2] = sharikProduct;

        Menu menu = new Menu();
        menu.menu(buyer, seller, products);
    }
}
