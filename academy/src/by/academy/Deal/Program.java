package by.academy.Deal;

import by.academy.Deal.Menu.Menu;

public class Program {
    public static void main(String... args) {
        Menu menu = new Menu();

        User buyer = new User("Petia", 1000);
        User seller = new User("Vasia", 1000);

        Product vinoProduct = new Product("Vino", 10, 40);

        Product tortProduct = new Product("Tort", 2, 200);

        Product sharikProduct = new Product("Sharik", 5, 20);

        Product[] products = new Product[10];
        products[0] = vinoProduct;
        products[1] = tortProduct;
        products[2] = sharikProduct;

        menu.menu(buyer, seller, products);

        Deal dealBetweenPetiaAndVasia = new Deal(buyer, seller, products);

        dealBetweenPetiaAndVasia.deal();

        System.out.println(dealBetweenPetiaAndVasia.getDealInformation());

    }
}
