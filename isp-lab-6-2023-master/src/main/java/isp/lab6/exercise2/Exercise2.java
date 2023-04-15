package isp.lab6.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        VehicleManager test = new VehicleManager();
        Vehicle vehicle1 = new Vehicle(138, "BH35SIS", "Volkswagen", "Passat", 2000);
        test.addVehicle(vehicle1);
        System.out.println(test.displayVehicles());
    }
}
