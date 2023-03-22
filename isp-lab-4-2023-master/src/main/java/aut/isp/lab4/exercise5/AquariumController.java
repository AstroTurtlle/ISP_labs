package aut.isp.lab4.exercise5;

public class AquariumController {
    private FishFeeder feeder = new FishFeeder("Bosch", "Z1000", 14);
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private int temperature = 20;
    private TemperatureSensor temperature_sensor = new TemperatureSensor();
    private float level = 10;
    private LevelSensor level_sensor = new LevelSensor();
    private Actuator alarm = new Alarm();
    private Actuator heater = new Heater();

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
    }
    public void setFeedingTime(float feedingTime) { this.feedingTime = feedingTime;}
    public void checkTemperature() {
        if(temperature_sensor.getValue() < temperature) heater.turnOn();
        if(temperature_sensor.getValue() == temperature) heater.turnOff();
    }
    public void checkWaterLevel() {
        if(level_sensor.getValue() < level) alarm.turnOn();
        else alarm.turnOff();
    }

    public String toString() {
        return String.format("AquariumController{feeder=%s, manufacturer=%s, model=%s, currentTime=%f, feedingTime=%f, temperature=%d, level=%f}",
                feeder, manufacturer, model, currentTime, feedingTime, temperature, level);
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
    public TemperatureSensor getTemperature_sensor() {return temperature_sensor;}
    public LevelSensor getLevel_sensor() {return level_sensor;}
    public int getTemperature() {return temperature;}
    public float getLevel() {return level;}
}
