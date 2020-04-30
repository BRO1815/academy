package by.academy.Deal;

import java.util.Calendar;
import java.util.Date;

public class Deal {

    private User buyer;
    private User seller;
    private Product[] products;
    private double fullPrice;
    private StringBuilder dealInformation = new StringBuilder();
    private Date deadlineDate;

    public Deal() {
        super();
    }

    public Deal(User buyer, User seller, Product[] products) {
        super();
        this.buyer = buyer;
        this.seller = seller;
        this.products = products;
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 10);
        deadlineDate = calendar.getTime();
    }

    public StringBuilder getDealInformation() {
        return dealInformation;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public double getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(double fullPrice) {
        this.fullPrice = fullPrice;
    }

    public Date getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(Date deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public void deal() {

        addInformation();

        double summ = 0;

        for (int p = 0; p < products.length && products[p] != null; p++) {
            summ += products[p].getSumPrice();
        }
        dealInformation.append("Сумма сделки: ");
        dealInformation.append(summ);

        if (summ <= buyer.getMoney()) {
            buyer.setMoney(buyer.getMoney() - summ);
            seller.setMoney(seller.getMoney() + summ);
            this.fullPrice = summ;
        } else {
            dealInformation.append("\n");
            dealInformation.append("Сделка не состоялась, у покупателя недостаточно денег.");
        }
    }

    private void addInformation() {

        dealInformation.append("Сделка между продавцом ");
        dealInformation.append(seller.getName());
        dealInformation.append(" и покупателем ");
        dealInformation.append(buyer.getName());
        dealInformation.append("\n");
        dealInformation.append("Товар\t\t| Количество | Стоимость ");
        dealInformation.append("\n");
        for (int i = 0; i < products.length && products[i] != null; i++) {
            dealInformation.append(products[i].getTitle());
            dealInformation.append(" \t\t| ");
            dealInformation.append(products[i].getQuantity());
            dealInformation.append("\t\t | ");
            dealInformation.append(products[i].getSumPrice());
            dealInformation.append("\n");
        }

    }
}


