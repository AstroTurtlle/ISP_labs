package isp.lab4.exercise2;

public class Laptop implements Chargeable{
    private int batteryLevel = 50;
    public int getBatteryLevel() {return batteryLevel;}
    public void charge(int duration) {
        batteryLevel += duration;
        if(batteryLevel >= 100) {
            batteryLevel = 100;
            System.out.println("Device is fully charged.");
        }
    }
}
