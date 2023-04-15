package isp.lab6.exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExercise2 {
    @Test
    public void testAddVehicle() {
        VehicleManager test = new VehicleManager();
        assertEquals(0, test.getVehicles().size());
        Vehicle vehicle1 = new Vehicle(138, "BH35SIS", "Volkswagen", "Passat", 2000);
        Vehicle vehicle2 = new Vehicle(130, "BH45SIS", "Volkswagen", "Passat", 2010);
        Vehicle vehicle3 = new Vehicle(138, "BH55SIS", "Toyota", "Corolla", 2010);
        test.addVehicle(vehicle1);
        assertEquals(1, test.getVehicles().size());
        test.addVehicle(vehicle2);
        assertEquals(2, test.getVehicles().size());
        test.addVehicle(vehicle3);
        assertEquals(2, test.getVehicles().size());
    }

    @Test
    public void testRemoveVehicle() {
        VehicleManager test = new VehicleManager();
        assertEquals(0, test.getVehicles().size());
        Vehicle vehicle1 = new Vehicle(138, "BH35SIS", "Volkswagen", "Passat", 2000);
        test.addVehicle(vehicle1);
        assertEquals(1, test.getVehicles().size());
        test.removeVehicle(137);
        assertEquals(1, test.getVehicles().size());
        test.removeVehicle(138);
        assertEquals(0, test.getVehicles().size());
    }

    @Test
    public void testExistsVehicle() {
        VehicleManager test = new VehicleManager();
        Vehicle vehicle1 = new Vehicle(138, "BH35SIS", "Volkswagen", "Passat", 2000);
        test.addVehicle(vehicle1);
        assertEquals(false, test.existsVehicle(130));
        assertEquals(true, test.existsVehicle(138));
    }

    @Test
    public void testDisplayVehicles() {
        VehicleManager test = new VehicleManager();
        Vehicle vehicle1 = new Vehicle(138, "BH35SIS", "Volkswagen", "Passat", 2000);
        test.addVehicle(vehicle1);
        String[] display = test.displayVehicles().split(",");
        assertEquals(" license_plate='BH35SIS'", display[1]);
    }
}
