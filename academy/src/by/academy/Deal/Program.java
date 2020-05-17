package by.academy.Deal;

import by.academy.Deal.Menu.Menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String... args) throws FileNotFoundException {
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

        chequeInFile(dealBetweenPetiaAndVasia);

    }

    public static void chequeInFile(Deal deal) throws FileNotFoundException {
        DateFormat sdf = new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        StringBuilder chequeName = new StringBuilder();
        Date date = new Date();

        User user = deal.getSeller();
        chequeName.append("Deal_");
        user  = deal.getSeller();
        chequeName.append(user.getName());
        chequeName.append("-");
        user  = deal.getBuyer();
        chequeName.append(user.getName());
        chequeName.append(sdf.format(date));
        chequeName.append(".txt");

        File file = new File(String.valueOf(chequeName));
        PrintWriter printWriter = new PrintWriter(String.valueOf(chequeName));
        printWriter.println(deal.getDealInformation());
        printWriter.close();
    }
}
