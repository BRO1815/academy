package by.academy.Deal;

public class Program {

    public static void main(String... args) {

        User buyer = new User("Petia", 1000);
        User seller = new User("Vasia", 1000);

        Product vinoProduct = new Product("Vino", 10, 40);

        Product tortProduct = new Product("Tort", 2, 200);

        Product[] products = {vinoProduct, tortProduct};

        Deal dealBetweenPetiaAndVasia = new Deal(buyer, seller, products);

        dealBetweenPetiaAndVasia.deal();

        System.out.println(buyer.getMoney());

        System.out.println(seller.getMoney());

    }
}
