package isp.lab3.exercise5;

public class VendingMachine {
    private static final String menu = "Machine Menu:\n" +
            "  1. displayProducts() - Displays available products and their id\n" +
            "  2. insertCoin(value) - Inserts as many coins as specified in value\n" +
            "  3. selectProduct(id) - Returns the product with the specified id\n" +
            "  4. displayCredit() - Displays the current amount of coins";
    private String[] products = {"water", "apple juice", "snacks", "pepsi"};
    private int coins = 0;

    public int getCoins() {
        return coins;
    }

    public String[] displayProducts() {
        for(int i=0;i< this.products.length;i++) System.out.println(i + ". " + this.products[i]);
        return products;
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

    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        userMenu();
        machine.displayProducts();
        machine.insertCoin(10);
        machine.displayCredit();
        System.out.println(machine.selectProduct(1));
    }
}
