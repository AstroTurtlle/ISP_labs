package isp.lab10.raceapp;

import javax.swing.*;
import java.awt.*;

public class RaceApp {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Car Race");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        isp.lab10.raceapp.CarPanel carPanel = new isp.lab10.raceapp.CarPanel();

        frame.getContentPane().add(carPanel);
        frame.pack();
        frame.setSize(500,300);
        frame.setVisible(true);

        isp.lab10.raceapp.Car car1 = new isp.lab10.raceapp.Car("Red car", carPanel);
        isp.lab10.raceapp.Car car2 = new isp.lab10.raceapp.Car("Blue car", carPanel);
        isp.lab10.raceapp.Car car3 = new isp.lab10.raceapp.Car("Green car", carPanel);
        isp.lab10.raceapp.Car car4 = new isp.lab10.raceapp.Car("Yellow car", carPanel);

        JFrame frame1 = new JFrame("Semaphore");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SemaphorePanel semaphorePanel = new SemaphorePanel();

        frame1.getContentPane().add(semaphorePanel);
        frame1.pack();
        frame1.setVisible(true);

        SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);
        semaphoreThread.start();
        semaphoreThread.join();

        PlaySound ps = new PlaySound();
        ps.playSound();

        RaceTimer timer = new RaceTimer();
        timer.setRaceStarted(true);
        timer.start();
        car1.start();
        car2.start();
        car3.start();
        car4.start();
        car1.join();
        car2.join();
        car3.join();
        car4.join();
        timer.setRaceStarted(false);
        ps.stopSound();
        timer.join();
        System.out.println("The race took " + timer.getTime());
        for(int i=0;i<4;i++)
            System.out.println((i + 1) + ". " + CarPanel.getPositions().get(i) + " with time: " + CarPanel.getTimes().get(i) + " seconds;");
    }
}