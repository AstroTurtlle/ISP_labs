package isp.lab10.exercise1.ui;

import isp.lab10.exercise1.service.AtcCommand;
import isp.lab10.exercise1.service.LandCommand;
import isp.lab10.exercise1.service.TakeoffCommand;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CommandsJPanel extends JPanel {
    private AirportFrame frame;
    public CommandsJPanel(AirportFrame frame) {
        this.frame = frame;
        initComponent();
    }
    private void initComponent() {
        this.setLayout(new FlowLayout());
        this.setSize(300,100);

        JButton addButton = new JButton("Add aircraft");
        addButton.addActionListener(evt -> addAircraftAction(evt));
        addButton.setSize(200,200);

        JButton displayButton = new JButton("Display all aircrafts");
        displayButton.addActionListener(evt -> displayAircraftAction(evt));
        displayButton.setSize(100,200);

        JButton takeOffButton = new JButton("Takeoff option");
        takeOffButton.addActionListener(evt -> takeOffAction(evt));
        JButton landButton = new JButton("Landing option");
        landButton.addActionListener(evt -> landingAction(evt));

        add(addButton);
        add(takeOffButton);
        add(landButton);
        add(displayButton);
    }
    private void addAircraftAction(ActionEvent evt) {
        String id = JOptionPane.showInputDialog(this, "Enter new aircraft id:");
        frame.getController().addAircraft(id);
    }
    private void displayAircraftAction(ActionEvent evt) {
        frame.getFlights().fireTableDataChanged();

    }
    private void takeOffAction(ActionEvent evt) {
        String id = JOptionPane.showInputDialog(this, "Enter aircraft id for takeoff:");
        try {
            int altitude = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter altitude for aircraft:"));
            AtcCommand operation = new TakeoffCommand("take off", altitude);
            frame.getController().sendCommand(id, operation);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Altitude has to be an integer.",
                    "Error message", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void landingAction(ActionEvent evt) {
        String id = JOptionPane.showInputDialog(this, "Enter aircraft id for landing:");
        AtcCommand operation = new LandCommand("land");
        frame.getController().sendCommand(id, operation);
    }
}
