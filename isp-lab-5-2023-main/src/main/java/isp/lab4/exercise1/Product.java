package isp.lab4.exercise1;

public class Product {
    private String productID;
    private String name;
    private double price;
    private ProductCategory productCategory;
    private Customer customer;

    public Product(String productID, String name, double price, ProductCategory productCategory, Customer customer) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.productCategory = productCategory;
        this.customer = customer;
    }

    public double getPrice() {
        return price;
    }

    public Customer getCustomer() {
        return customer;
    }
}
