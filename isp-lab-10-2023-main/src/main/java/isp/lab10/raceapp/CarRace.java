package isp.lab10.raceapp;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CarRace { }

class Car extends Thread{
    private String name;
    private int distance = 0;
    private isp.lab10.raceapp.CarPanel carPanel;

    public Car(String name, isp.lab10.raceapp.CarPanel carPanel) {
        //set thread name;
        setName(name);
        this.name = name;
        this.carPanel = carPanel;
    }

    public void run() {
        long startTime = System.currentTimeMillis();
        while (distance < 400) {
            // simulate the car moving at a random speed
            int speed = (int) (Math.random() * 10) + 1;
            distance += speed;

            carPanel.updateCarPosition(name, distance);

            try {
                // pause for a moment to simulate the passage of time
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis() - startTime;
        carPanel.carFinished(name, endTime);
    }
}


class CarPanel extends JPanel{
    private static ArrayList<String> positions = new ArrayList();
    private static ArrayList<Float> times = new ArrayList();
    private int[] carPositions;
    private String[] carNames;
    private Color[] carColors;

    public CarPanel() {
        carPositions = new int[4];
        carNames = new String[]{"Red car", "Blue car", "Green car", "Yellow car"};
        carColors = new Color[]{Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 4; i++) {
            int yPos = 50 + i * 50; // Vertical position of the car
            int xPos = carPositions[i]; // Horizontal position of the car
            int carSize = 30; // Size of the car

            g.setColor(carColors[i]);
            g.fillOval(xPos, yPos, carSize, carSize);
            g.setColor(Color.BLACK);
            g.drawString(carNames[i], xPos, yPos - 5);
        }
    }

    public void updateCarPosition(String carName, int distance) {
        int carIndex = getCarIndex(carName);
        if (carIndex != -1) {
            carPositions[carIndex] = distance;
            repaint();
        }
    }

    public void carFinished(String carName, long endTime) {
        positions.add(carName);
        times.add(endTime/1000.0f);
    }

    private int getCarIndex(String carName) {
        for (int i = 0; i < 4; i++) {
            if (carNames[i].equals(carName)) {
                return i;
            }
        }
        return -1;
    }

    public static ArrayList<String> getPositions() {
        return positions;
    }

    public static ArrayList<Float> getTimes() {
        return times;
    }
}