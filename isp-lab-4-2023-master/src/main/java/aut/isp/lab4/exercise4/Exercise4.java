package aut.isp.lab4.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        AquariumController testController = new AquariumController("Bosch", "Z1000", 0, 12.00F);
        testController.setCurrentTime(12.00F);
        System.out.println(testController.toString());
        testController.setCurrentTime(8.00F);
        testController.setCurrentTime(15.00F);
    }
}
