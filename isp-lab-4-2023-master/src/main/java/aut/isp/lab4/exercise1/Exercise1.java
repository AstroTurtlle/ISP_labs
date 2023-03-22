package aut.isp.lab4.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        AquariumController controller = AquariumController.getInstance("Bosch", "Z100", 0);
        System.out.println(controller.toString());
        controller.setCurrentTime(100);
        System.out.println(controller.toString());
    }
}
