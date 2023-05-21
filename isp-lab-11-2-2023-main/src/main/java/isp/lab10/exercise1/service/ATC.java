package isp.lab10.exercise1.service;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ATC {
    Map<String, Aircraft> aircrafts = new HashMap<>();
    public void addAircraft(String id){
        aircrafts.put(id, new Aircraft(id));
        System.out.println("Aircraft with id " + id + " added\n");
    }

    public void sendCommand(String id, AtcCommand command){
        System.out.println("Aircraft with id " + id + " received command " + command);
        if(!aircrafts.containsKey(id)) JOptionPane.showMessageDialog(new JFrame(), "This id does not exist.",
                "Error message", JOptionPane.ERROR_MESSAGE);
        else synchronized (id) {
            aircrafts.get(id).receiveAtcCommand(command);
        }
    }

    public void showAircrafts(){
        System.out.println("Available aircrafts are:");
        for (Aircraft i : aircrafts.values()) {
            System.out.print("  " + i.getId() + ". ");
            System.out.println(i);
        }
        System.out.println();
    }

    public Map<String, Aircraft> getAircrafts() {
        return aircrafts;
    }
}

