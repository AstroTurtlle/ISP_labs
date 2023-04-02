package isp.lab4.exercise2;

public class SmartWatch implements Chargeable{
    private int batteryLevel = 50;
    public int getBatteryLevel() {return batteryLevel;}
    public void charge(int duration) {
        batteryLevel += 2 * duration;
        if(batteryLevel >= 100) {
            batteryLevel = 100;
            System.out.println("Device is fully charged.");
        }
    }
}
