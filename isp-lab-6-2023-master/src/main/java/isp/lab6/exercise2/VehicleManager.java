package isp.lab6.exercise2;

import java.util.HashSet;
import java.util.Set;

public class VehicleManager {
    Set<Vehicle> vehicles = new HashSet<>();
    public void addVehicle(Vehicle vehicle) {
        int ok = 1;
        for(Vehicle vehicle1 : vehicles)
            if(vehicle1.getVIN() == vehicle.getVIN()) {
                ok = 0;
                break;
            }
        if(ok == 1) vehicles.add(vehicle);
    }
    public void removeVehicle(int VIN) {
        for(Vehicle vehicle1 : vehicles)
            if(vehicle1.getVIN() == VIN) {
                vehicles.remove(vehicle1);
                break;
            }
    }
    public boolean existsVehicle(int VIN) {
        for(Vehicle vehicle1 : vehicles)
            if(vehicle1.getVIN() == VIN)
                return true;
        return false;
    }
    public String displayVehicles() {
        String display = "";
        for(Vehicle vehicle1 : vehicles)
            display += vehicle1.toString() + "\n";
        return display;
    }
    public Set<Vehicle> getVehicles() {
        return vehicles;
    }
}
