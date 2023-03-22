package aut.isp.lab4.exercise4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AquariumControllerTest {
    //implement minimal tests

    @Test
    public void testConstructor() {
        AquariumController testController = new AquariumController("testManufacturer", "testModel", 0, 12.00F);
        assertEquals("testManufacturer", testController.getManufacturer());
        assertEquals("testModel", testController.getModel());
        assertEquals(0, testController.getCurrentTime(), 0);
    }

    @Test
    public void testSetCurrentTime() {
        AquariumController testController = new AquariumController("testManufacturer", "testModel", 0, 12.00F);
        testController.setCurrentTime(100);
        assertEquals(100, testController.getCurrentTime(), 0);
    }

    @Test
    public void testSetFeedingTime() {
        AquariumController testController = new AquariumController("testManufacturer", "testModel", 0, 12.00F);
        testController.setFeedingTime(15.30F);
        assertEquals(15.30F, testController.getFeedingTime(), 0);
    }

    @Test
    public void testFeedOnTime() {
        AquariumController testController = new AquariumController("testManufacturer", "testModel", 0, 12.00F);
        testController.setFeedingTime(15.30F);
        testController.setCurrentTime(15.30F);
        assertEquals(13, testController.getFeeder().getMeals());
    }
}
