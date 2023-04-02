package isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        MonitoringService monitor = new MonitoringService();
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
        System.out.println(monitor.getAverageAllSensors());
        System.out.println(monitor.getAverageTemperatureSensors());
    }
}
