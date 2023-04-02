package isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Chargeable laptop = new Laptop();
        Chargeable smartphone = new SmartPhone();
        Chargeable smartwatch = new SmartWatch();
        laptop.charge(10);
        smartphone.charge(10);
        smartwatch.charge(10);
        System.out.println(laptop.getBatteryLevel());
        System.out.println(smartphone.getBatteryLevel());
        System.out.println(smartwatch.getBatteryLevel());
    }
}
