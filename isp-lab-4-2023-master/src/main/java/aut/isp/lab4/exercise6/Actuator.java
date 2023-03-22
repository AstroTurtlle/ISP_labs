package aut.isp.lab4.exercise6;

public abstract class Actuator {
    private String manufacturer;
    private String model;
    public abstract void turnOn();
    public abstract void turnOff();
    public String toString() {
        return String.format("Sensor{manufacturer=%s, model=%s}", manufacturer, model);
    }
}
