package isp.lab3.exercise5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    @Test
    public void displayProductsTest() {
        VendingMachine test = new VendingMachine();
        assertEquals(new String[]{"water", "apple juice", "snacks", "pepsi"}, test.displayProducts());
    }

    @Test
    public void insertCoinTest() {
        VendingMachine test = new VendingMachine();
        assertEquals(0, test.getCoins());
        test.insertCoin(5);
        assertEquals(5, test.getCoins());
    }

    @Test
    public void selectProductTest() {
        VendingMachine test = new VendingMachine();
        assertEquals("snacks", test.selectProduct(2));
    }
}
