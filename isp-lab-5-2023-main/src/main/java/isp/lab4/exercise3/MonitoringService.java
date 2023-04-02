package isp.lab4.exercise3;

import com.beust.ah.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonitoringService {
    private List<Sensor> sensors = new ArrayList<>();
    public double getAverageTemperatureSensors() {
        double average = 0.0;
        int numberOfTemperatureSensors = 0;
        for(Sensor i : sensors) {
            if(i.getClass().getName() == "isp.lab4.exercise3.TemperatureSensor") {
                average += i.getSensorValue();
                numberOfTemperatureSensors ++;
            }
        }
        return average/numberOfTemperatureSensors;
    }
    public double getAverageAllSensors() {
        double average = 0;
        for(Sensor i : sensors) {
            average += i.getSensorValue();
        }
        return average/sensors.size();
    }
    public void addSensor(Sensor sensor) {
        if(sensors.size() < 10) {
            sensors.add(sensor);
            System.out.println("A sensor has been added.");
        }
        else System.out.println("Cannot add more sensors.");
    }

    public List<Sensor> getSensors() {
        return sensors;
    }
}
