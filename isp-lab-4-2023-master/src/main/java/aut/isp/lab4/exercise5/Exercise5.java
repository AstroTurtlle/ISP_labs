package aut.isp.lab4.exercise5;

public class Exercise5 {
    public static void main(String[] args) {
        AquariumController testController = new AquariumController("Bosch", "Z1000", 0, 12.00F);
        testController.getTemperature_sensor().setValue(15);
        testController.checkTemperature();
        testController.getLevel_sensor().setValue(15);
        testController.checkWaterLevel();
    }
}
