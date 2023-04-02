package isp.lab4.exercise1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    private String orderID;
    private LocalDateTime date;
    private Double totalPrice;
    private List<Product> products = new ArrayList<>();

    public Order(String orderID) {
        this.orderID = orderID;
        this.date = LocalDateTime.now();
        this.totalPrice = 0.00;
    }

    public void addProduct(Product product) {
        products.add(product);
        this.totalPrice += product.getPrice();
    }

    public List<Product> getProducts() {
        return products;
    }
}
