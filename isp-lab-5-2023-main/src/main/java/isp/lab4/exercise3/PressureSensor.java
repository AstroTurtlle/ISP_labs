package isp.lab4.exercise3;
import java.util.Random;

public class PressureSensor extends Sensor{
    private double pressure = new Random().nextDouble() + new Random().nextInt(100);

    public PressureSensor(String installLocation, String name) {
        super(installLocation, name);
    }

    public double getSensorValue() {
        return pressure;
    }

}
