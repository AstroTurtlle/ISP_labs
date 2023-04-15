package isp.lab6.exercise3;

import java.security.Key;
import java.util.*;

public class OnlineStore {
    private List<Product> products = new ArrayList<>();
    private Map<String, ActiveSessions> sessions = new HashMap<String, ActiveSessions>();
    public List<Product> getProducts() {
        return products;
    }
    public List<Product> getProductsSorted(Comparator<Product> sortCriteria) {
        List<Product> sorted_products = new ArrayList<>();
        sorted_products.addAll(products);
        Collections.sort(sorted_products, sortCriteria);
        return sorted_products;
    }
    public void addSession(String username) {
        if(sessions.get(username) == null)
            sessions.put(username, new ActiveSessions(username));
        else System.out.println("Session already exists.");
    }
    public void removeSession(String username) {
        if(sessions.get(username) != null) sessions.remove(username);
    }
    public void addToCart(String username, Product product, int quantity) {
        if(sessions.containsKey(username))
            sessions.get(username).addToCart(product, quantity);
        else System.out.println("Username is not active.");
    }
    public String checkout(String username) {
        Map<Product, Integer> cart = sessions.get(username).getShoppingCart();
        int suma = 0;
        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            suma += entry.getValue() * entry.getKey().getPrice();
        }
        return String.valueOf(suma);
    }

    public Map<String, ActiveSessions> getSessions() {
        return sessions;
    }
}
