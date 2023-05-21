package isp.lab10.exercise1.service;

import javax.swing.*;

public class Aircraft implements Runnable{

    String id;
    String status;
    String time;
    int altitude;

    public Aircraft(String id) {
        this.id = id;
        this.status = "available";
        this.time = "0.000s";
        System.out.println("Aircraft "+id+" is created. Ready to take off.");
    }

    public void start(){
        Thread t = new Thread(this);
        t.start();
    }

    public void run(){
        int k = 0;
        System.out.println("Starting Taxing state for Aircraft " + id);
        status = "Taxing";
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Aircraft " + id + " is taking off");
        status = "Takeoff";
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Aircraft " + id + " is ascending");
        status = "Ascending";
        while(k<altitude){
            k++;
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Aircraft " + id + " is cruising");
        status = "Cruising";
        long time = System.currentTimeMillis();
        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        time = System.currentTimeMillis() - time;
        System.out.println("Aircraft "+id+" is descending");
        status = "Descending";
        while(k>0){
            k--;
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Aircraft "+id+" has landed");
        status = "Landed";
        this.time = time/1000.0 + "s";
        System.out.println("Total flying time was: " + time/1000.0 + "s");
    }

    public void receiveAtcCommand(AtcCommand command) {
        if(command.getClass() == TakeoffCommand.class) {
            if(this.status == "available") {
                altitude = ((TakeoffCommand) command).getAltitude();
                this.start();
            }
            else JOptionPane.showMessageDialog(new JFrame(), "This command is unavailable at the moment.",
                    "Error message", JOptionPane.ERROR_MESSAGE);
        }
        else {
            if(this.status == "Cruising")
                synchronized (this) {this.notify();}
            else JOptionPane.showMessageDialog(new JFrame(), "This command is unavailable at the moment.",
                    "Error message", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public String toString() {
        return "Aircraft ID: " + id;
    }

    public String getId() {
        return id;
    }
}
