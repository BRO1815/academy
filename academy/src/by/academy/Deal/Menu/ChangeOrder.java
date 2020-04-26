package by.academy.Deal.Menu;

import by.academy.Deal.Product;

import java.util.Scanner;

public class ChangeOrder {

    private Product[] addProducts;
    private Product[] replaceProducts;
    private int cell;

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }



    public Product[] addProduct(Product[] product) {
        this.addProducts = product;
        for (int i = 0; i <= addProducts.length; i++) {
            if (i == addProducts.length) {
                System.out.println("Корзина заполнена");
                return addProducts;
            }
            if (addProducts[i] == null) {
                cell = i;
                System.out.println(cell);
                break;
            }
        }

        addProducts[cell] = new Product();
        addProducts = replaceProduct(addProducts);
        return addProducts;
    }

    public Product[] replaceProduct(Product[] product) {
        this.replaceProducts = product;
        String data;
        Scanner scan = new Scanner(System.in);

        System.out.println("Наименование");
        data = scan.next();
        replaceProducts[cell].setTitle(data);

        System.out.println("Цена");
        data = scan.next();
        replaceProducts[cell].setPrice(Double.parseDouble(data));

        System.out.println("Количество");
        data = scan.next();
        replaceProducts[cell].setQuantity(Long.parseLong(data));
        return replaceProducts;
    }
}


