package isp.lab6.exercise2;

public class Vehicle {
    private int VIN;
    private String license_plate;
    private String make;
    private String model;
    private int year;

    public Vehicle(int VIN, String license_plate, String make, String model, int year) {
        this.VIN = VIN;
        this.license_plate = license_plate;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public int getVIN() {
        return VIN;
    }

    public String getLicense_plate() {
        return license_plate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VIN=" + VIN +
                ", license_plate='" + license_plate + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
