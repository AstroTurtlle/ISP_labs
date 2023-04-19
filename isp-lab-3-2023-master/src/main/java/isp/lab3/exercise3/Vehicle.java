package isp.lab3.exercise3;

import java.util.Objects;

public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private char fuel;
    private static int number_of_vehicles = 0;

    public Vehicle(String model, String type, int speed, char fuel) {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuel = fuel;
        number_of_vehicles ++;
    }

    @Override
    public String toString() {
        return  model + " (" +
                type + ") speed " +
                speed + " fuel type "+
                fuel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public char getFuel() {
        return fuel;
    }

    public void setFuel(char fuel) {
        this.fuel = fuel;
    }

    public static void number() { System.out.println(number_of_vehicles); }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Volkswagen", "Passat", 160, 'D');
        Vehicle vehicle2 = new Vehicle("Toyota", "Corolla", 220, 'B');

        //Teste gettere si settere
        assert vehicle1.getModel() == "Volkswagen";
        assert vehicle1.getType() == "Passat";
        assert vehicle1.getSpeed() == 160;
        assert vehicle1.getFuel() == 'D';

        vehicle1.setModel("Dacia");
        assert vehicle1.getModel().equals("Dacia");
        vehicle1.setType("Logan");
        assert vehicle1.getType() == "Logan";
        vehicle1.setSpeed(100);
        assert vehicle1.getSpeed() == 100;
        vehicle1.setFuel('B');
        assert vehicle1.getFuel() == 'B';

        //Compararea obiectelor
        assert Objects.equals(vehicle1, vehicle2);
    }
}
