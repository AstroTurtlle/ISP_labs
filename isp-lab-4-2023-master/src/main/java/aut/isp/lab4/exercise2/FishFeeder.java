package aut.isp.lab4.exercise2;

public class FishFeeder {
    private String manufacturer;
    private String model;
    private int meals;

    public FishFeeder(String manufacturer, String model, int meals) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.meals = meals;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public String getModel() {
        return model;
    }
    public int getMeals() {
        return meals;
    }

    public void feed() {
        if(this.meals > 0) {
            this.meals--;
            System.out.println("A meal has been fed.");
        }
        else System.out.println("Feeder is empty.");
    }
    public void fillUp() {
        this.meals = 14;
        System.out.println("Feeder has been filled.");
    }

    @Override
    public String toString() {
        return String.format("FishFeeder{ manufacturer=%s, model=%s, meals=%d }", manufacturer, model, meals);
    }
}
