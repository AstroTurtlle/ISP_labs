package isp.lab3.exercise3;
import isp.lab3.exercise1.Tree;
import org.junit.Test;
import static org.junit.Assert.*;

public class VehicleTest {
    @Test
    public void testToString() {
        Vehicle vehicle = new Vehicle("Volkswagen", "Passat", 160, 'D');
        assertEquals("Volkswagen (Passat) speed 160 fuel type D", vehicle.toString());
    }
}
