package isp.lab6.exercise3;

import java.util.HashMap;
import java.util.Map;

public class ActiveSessions {
    private String username;
    private Map<Product, Integer> shoppingCart = new HashMap<>();
    public void addToCart(Product product, int quantity) {
        shoppingCart.put(product, quantity);
    }

    public ActiveSessions(String username) {
        this.username = username;
    }

    public Map<Product, Integer> getShoppingCart() {
        return shoppingCart;
    }
}
