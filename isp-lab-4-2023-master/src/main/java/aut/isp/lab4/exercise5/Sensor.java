package aut.isp.lab4.exercise5;

public abstract class Sensor {
    private String manufacturer;
    private String model;

    public String toString() {
        return String.format("Sensor{manufacturer=%s, model=%s}", manufacturer, model);
    }
}
