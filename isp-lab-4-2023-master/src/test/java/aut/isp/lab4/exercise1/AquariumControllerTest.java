package aut.isp.lab4.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AquariumControllerTest {
    //implement minimal tests

    @Test
    public void testConstructor() {
        AquariumController testController = AquariumController.getInstance("testManufacturer", "testModel", 50);
        assertEquals("testManufacturer", testController.getManufacturer());
        assertEquals("testModel", testController.getModel());
        assertEquals(50, testController.getCurrentTime(), 0);
    }

    @Test
    public void testSetCurrentTime() {
        AquariumController testController = AquariumController.getInstance("testManufacturer", "testModel", 50);
        testController.setCurrentTime(100);
        assertEquals(100, testController.getCurrentTime(), 0);
    }

    @Test
    public void testGetInstance() {
        AquariumController testController1 = AquariumController.getInstance("testManufacturer1", "testModel1", 50);
        AquariumController testController2 = AquariumController.getInstance("testManufacturer2", "testModel2", 100);
        assertEquals("testManufacturer1", testController2.getManufacturer());
    }
}
