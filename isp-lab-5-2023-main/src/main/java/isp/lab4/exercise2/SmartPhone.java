package isp.lab4.exercise2;

public class SmartPhone implements Chargeable{
    private int batteryLevel = 50;
    public int getBatteryLevel() {return batteryLevel;}
    public void charge(int duration) {
        batteryLevel += 5 * duration;
        if(batteryLevel >= 100) {
            batteryLevel = 100;
            System.out.println("Device is fully charged.");
        }
    }
}
