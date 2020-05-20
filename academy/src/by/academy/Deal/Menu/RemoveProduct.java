package by.academy.Deal.Menu;

import by.academy.Deal.Product;

public class RemoveProduct {
    public boolean removeProduct(Product[] products, String productName) {
        boolean fit = false;
        for (int z = 0; z < products.length; z++) {

            if (products[z] != null && products[z].getTitle().equals(productName)) {
                for (int x = z; x + 1 < products.length; x++) {
                    products[x] = products[x + 1];
                }
                products[products.length - 1] = null;
                fit = true;
            }
        }
        return fit;
    }
}
