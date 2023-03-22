package aut.isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        FishFeeder feeder = new FishFeeder("Bosch", "Z1000", 14);
        feeder.feed();
        feeder.fillUp();
        System.out.println(feeder.toString());
    }
}
