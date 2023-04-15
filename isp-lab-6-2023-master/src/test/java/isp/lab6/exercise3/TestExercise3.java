package isp.lab6.exercise3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class TestExercise3 {
    @Test
    public void test_OnlineStore() {
        OnlineStore test_store = new OnlineStore();
        Comparator<Product> sortCriteria = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                int res = o1.getName().compareTo(o2.getName());
                if (res == 0)
                    return o1.getPrice() < o2.getPrice() ? -1 : 1;
                else
                    return res;
            }
        };
        Product prod1 = new Product("televizor", 5000);
        Product prod2 = new Product("laptop", 3500);
        Product prod3 = new Product("aparat de cafea", 760);
        test_store.getProducts().add(prod1);
        test_store.getProducts().add(prod2);
        test_store.getProducts().add(prod3);

        //GETPRODUCTSSORTED
        assertEquals("televizor",test_store.getProducts().get(0).getName());
        List<Product> sorted_products = new ArrayList<>();
        sorted_products = test_store.getProductsSorted(sortCriteria);
        assertEquals("aparat de cafea",sorted_products.get(0).getName());

        //ADDSESSION
        test_store.addSession("Radu");
        assertEquals(1, test_store.getSessions().size());

        //ADDTOCART
        test_store.addToCart("Radu", prod1, 7);
        test_store.addToCart("Radu", prod3, 1);
        assertEquals(2, test_store.getSessions().get("Radu").getShoppingCart().size());

        //CHECKOUT
        assertEquals("35760", test_store.checkout("Radu"));

        //REMOVESESSION
        test_store.removeSession("Radu");
        assertEquals(0, test_store.getSessions().size());
    }

    @Test
    public void test_LoginSystem() {
        LoginSystem test_login = new LoginSystem();
        //REGISTER
        test_login.register("Radu", "parola");
        assertEquals(1, test_login.getUsers().size());

        //LOGIN
        assertFalse(test_login.login("Radu", "password"));
        assertTrue(test_login.login("Radu", "parola"));
        assertEquals(1, test_login.getStore().getSessions().size());

        //LOGOUT
        assertTrue(test_login.logout("Radu"));
        assertFalse(test_login.logout("Radu"));
        assertEquals(0, test_login.getStore().getSessions().size());
    }
}
