package isp.lab5.test.exercise1;

import isp.lab4.exercise1.*;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class OrderTest {

    @Test
    public void test_gets() {
        Order order = new Order("1");
        Address address = new Address("Observatorului", "Cluj-Napoca");
        Customer customer1 = new Customer("cust1", "Radu", "0770120487", address);
        Customer customer2 = new Customer("cust2", "Mircea", "0777777777", address);
        Product product1 = new Product("prod1", "Laptop", 1350.00, ProductCategory.ELECTRONICS, customer1);
        Product product2 = new Product("prod1", "Television", 2250.00, ProductCategory.ELECTRONICS, customer2);
        order.addProduct(product1);
        order.addProduct(product2);
        assertEquals("cust1", order.getProducts().get(0).getCustomer().getCustomerID());
        assertEquals("Mircea", order.getProducts().get(1).getCustomer().getName());
        assertEquals("0770120487", order.getProducts().get(0).getCustomer().getPhone());
        assertEquals(address, order.getProducts().get(0).getCustomer().getAddress());
    }
    @Test
    public void test_products() {
        Order order = new Order("2");
        Address address = new Address("Observatorului", "Cluj-Napoca");
        Customer customer1 = new Customer("cust1", "Radu", "0770120487", address);
        assertEquals(0, order.getProducts().size());
        Product product1 = new Product("prod1", "Laptop", 1350.00, ProductCategory.ELECTRONICS, customer1);
        order.addProduct(product1);
        assertEquals(1, order.getProducts().size());
    }
}
