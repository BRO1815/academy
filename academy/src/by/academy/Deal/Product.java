package by.academy.Deal;

public class Product {

    private String title;
    private double price;
    private long quantity;

    public Product() {
        super();
    }

    public Product(String title, double price, long quantity) {
        super();
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public double getSumPrice() {
        return price * quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product [title=" + title + ", price=" + price + ", quantity=" + quantity + "]";
    }

}
