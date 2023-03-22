package aut.isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        AquariumController testController = new AquariumController("Bosch", "Z1000", 0, 12.00F);
        testController.setCurrentTime(12.00F);
        System.out.println(testController.toString());
        testController.setFeedingTime(23.00F);
        testController.setCurrentTime(22.00F);
        System.out.println(testController.toString());
        testController.setCurrentTime(23.00F);
        System.out.println(testController.toString());
    }
}
