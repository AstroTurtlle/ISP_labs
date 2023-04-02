package isp.lab4.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        Order order = new Order("1");
        Address address = new Address("Observatorului", "Cluj-Napoca");
        Customer customer1 = new Customer("cust1", "Radu", "0770120487", address);
        Customer customer2 = new Customer("cust2", "Mircea", "0777777777", address);
        Product product1 = new Product("prod1", "Laptop", 1350.00, ProductCategory.ELECTRONICS, customer1);
        Product product2 = new Product("prod1", "Television", 2250.00, ProductCategory.ELECTRONICS, customer2);
        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product2);
        System.out.println(order);
    }
}
