package aut.isp.lab4.exercise4;

public class AquariumController {
    private FishFeeder feeder = new FishFeeder("Bosch", "Z1000", 14);
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private float lightsOnTime = 8.00F;
    private float lightsOffTime = 15.00F;
    public AquariumController(String manufacturer, String model, float currentTime, float feedingTime) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
        this.feedingTime = feedingTime;
    }

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
        if(currentTime == this.feedingTime)
            feeder.feed();
        if(currentTime == lightsOnTime) System.out.println("Lights are on.");
        if(currentTime == lightsOffTime) System.out.println("Lights are off.");
    }
    public void setFeedingTime(float feedingTime) { this.feedingTime = feedingTime;}

    public String toString() {
        return String.format("AquariumController{feeder=%s, manufacturer=%s, model=%s, currentTime=%f, feedingTime=%f}",
                feeder, manufacturer, model, currentTime, feedingTime);
    }

    public FishFeeder getFeeder() {
        return feeder;
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
    public float getFeedingTime() {
        return feedingTime;
    }
}
