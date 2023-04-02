package isp.lab5.test.exercise3;

import isp.lab4.exercise3.MonitoringService;
import isp.lab4.exercise3.PressureSensor;
import isp.lab4.exercise3.Sensor;
import isp.lab4.exercise3.TemperatureSensor;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ex3Test {
    @Test
    public void monitoringServiceTests() {
        MonitoringService monitor = new MonitoringService();
        assertEquals(0, monitor.getSensors().size());
        Sensor sensor1 = new PressureSensor("Cluj", "pres1");
        monitor.addSensor(sensor1);
        Sensor sensor2 = new PressureSensor("Cluj", "pres2");
        monitor.addSensor(sensor2);
        Sensor sensor3 = new PressureSensor("Cluj", "pres3");
        monitor.addSensor(sensor3);
        Sensor sensor4 = new TemperatureSensor("Oradea", "temp1");
        monitor.addSensor(sensor4);
        Sensor sensor5 = new TemperatureSensor("Oradea", "temp2");
        monitor.addSensor(sensor5);
        Sensor sensor6 = new TemperatureSensor("Oradea", "temp3");
        monitor.addSensor(sensor6);
        assertEquals(6, monitor.getSensors().size());
    }
}
