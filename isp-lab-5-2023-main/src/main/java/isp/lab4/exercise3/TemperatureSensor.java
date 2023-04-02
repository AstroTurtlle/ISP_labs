package isp.lab4.exercise3;

import java.util.Random;

public class TemperatureSensor extends Sensor{
    private double temperature = new Random().nextDouble() + new Random().nextInt(100);

    public TemperatureSensor(String installLocation, String name) {
        super(installLocation, name);
    }

    public double getSensorValue() {
        return temperature;
    }
}
