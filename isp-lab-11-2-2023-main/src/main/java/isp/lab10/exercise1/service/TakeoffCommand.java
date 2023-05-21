package isp.lab10.exercise1.service;

public class TakeoffCommand extends AtcCommand{
    private int altitude;

    public TakeoffCommand(String command, int alt) {
        super(command);
        altitude = alt;
    }

    public int getAltitude() {
        return altitude;
    }
}
