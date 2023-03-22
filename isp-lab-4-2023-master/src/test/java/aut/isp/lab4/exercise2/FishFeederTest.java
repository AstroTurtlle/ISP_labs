package aut.isp.lab4.exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FishFeederTest {
    @Test
    public void testConstructor() {
        FishFeeder testFeeder = new FishFeeder("testManufacturer", "testModel", 14);
        assertEquals("testManufacturer", testFeeder.getManufacturer());
        assertEquals("testModel", testFeeder.getModel());
        assertEquals(14, testFeeder.getMeals());
    }
    @Test
    public void testFeed() {
        FishFeeder testFeeder = new FishFeeder("testManufacturer", "testModel", 1);
        testFeeder.feed();
        assertEquals(0, testFeeder.getMeals());
        testFeeder.feed();
        assertEquals(0, testFeeder.getMeals());
    }
    @Test
    public void testFillUp() {
        FishFeeder testFeeder = new FishFeeder("testManufacturer", "testModel", 0);
        testFeeder.fillUp();
        assertEquals(14, testFeeder.getMeals());
    }
}
