package isp.lab3.exercise6;

import isp.lab3.exercise5.VendingMachine;

public class VendingMachineSingleton {
    private static final String menu = "Machine Menu:\n" +
            "  1. displayProducts() - Displays available products and their id\n" +
            "  2. insertCoin(value) - Inserts as many coins as specified in value\n" +
            "  3. selectProduct(id) - Returns the product with the specified id\n" +
            "  4. displayCredit() - Displays the current amount of coins\n" +
            "  5. userMenu() - Displays this menu again";
    private String[] products = {"water", "apple juice", "snacks", "pepsi"};
    private int coins = 0;

    public int getCoins() {
        return coins;
    }

    public void displayProducts() {
        for(int i=0;i< this.products.length;i++) System.out.println(i + ". " + this.products[i]);
    }

    public void insertCoin(int value) {
        this.coins += value;
    }

    public String selectProduct(int id) {
        if(id < 0 || id >= products.length)
            return "This product id does not exist.";
        return products[id];
    }

    public void displayCredit() {
        System.out.println("Current credit is: " + coins);
    }

    public static void userMenu() {
        System.out.println(menu);
    }
    private static volatile VendingMachineSingleton instance;

    private VendingMachineSingleton() {}

    public static VendingMachineSingleton getInstance() {
        if (instance == null) {
            synchronized (VendingMachineSingleton.class) {
                if (instance == null) {
                    instance = new VendingMachineSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
        System.out.println(getInstance());
    }
}
