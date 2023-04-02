package isp.lab5.test.exercise2;
import isp.lab4.exercise2.Chargeable;
import isp.lab4.exercise2.Laptop;
import isp.lab4.exercise2.SmartPhone;
import isp.lab4.exercise2.SmartWatch;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ex2Test {
    @Test
    public void methodsTest() {
        Chargeable laptop = new Laptop();
        Chargeable smartphone = new SmartPhone();
        Chargeable smartwatch = new SmartWatch();
        assertEquals(50, laptop.getBatteryLevel());
        assertEquals(50, smartphone.getBatteryLevel());
        assertEquals(50, smartwatch.getBatteryLevel());
        laptop.charge(10);
        smartphone.charge(10);
        smartwatch.charge(10);
        assertEquals(60, laptop.getBatteryLevel());
        assertEquals(100, smartphone.getBatteryLevel());
        assertEquals(70, smartwatch.getBatteryLevel());
        smartphone.charge(10);
        assertEquals(100, smartphone.getBatteryLevel());
    }
}
