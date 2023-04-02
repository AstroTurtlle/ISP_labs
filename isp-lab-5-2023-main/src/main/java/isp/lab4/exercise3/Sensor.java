package isp.lab4.exercise3;

public abstract class Sensor {
    private String installLocation;
    private String name;
    public abstract double getSensorValue();

    @Override
    public String toString() {
        return "Sensor{" +
                "value='" + getSensorValue() +
                '}';
    }

    public Sensor(String installLocation, String name) {
        this.installLocation = installLocation;
        this.name = name;
    }
}
