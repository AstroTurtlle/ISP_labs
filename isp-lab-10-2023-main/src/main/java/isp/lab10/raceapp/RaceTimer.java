package isp.lab10.raceapp;

public class RaceTimer extends Thread{
    private long time;
    private boolean raceStarted = false;
    public void run() {
        while(raceStarted) {
            time++;
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }

    public long getTime() {
        return time;
    }

    public void setRaceStarted(boolean raceStarted) {
        this.raceStarted = raceStarted;
    }
}
