package by.academy.Deal.Menu;

import by.academy.Deal.Product;

public class ChangeOrder {

    private Product[] product;
    private int freeCell;

    public Product[] addProduct(Product[] product) {
        this.product = product;
        for (int i = 0; i <= product.length; i++) {
           // if (i==product.length){

           // }
            if (product[i] == null){
                freeCell = i;
                break;
            }

        }
         product[freeCell]= new Product();


        return product;
    }

}
