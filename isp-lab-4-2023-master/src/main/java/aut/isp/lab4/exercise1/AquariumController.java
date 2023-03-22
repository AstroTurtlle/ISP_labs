package aut.isp.lab4.exercise1;

public class AquariumController {
    private static AquariumController SINGLE_CONTROLLER;

    //attributs
    private String manufacturer;
    private String model;
    private float currentTime;
    //constructors
    private AquariumController(String manufacturer, String model, float currentTime) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
    }
    public static AquariumController getInstance(String manufacturer, String model, float currentTime) {
        if(SINGLE_CONTROLLER == null) { SINGLE_CONTROLLER = new AquariumController(manufacturer,model,currentTime); }
        return SINGLE_CONTROLLER;
    }

    //methods
    public void setCurrentTime(float currentTime) { this.currentTime = currentTime;}
    public String toString() {
        return String.format("AquariumController{manufacturer=%s, model=%s, currentTime=%f}", manufacturer, model, currentTime);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public float getCurrentTime() {
        return currentTime;
    }
}
