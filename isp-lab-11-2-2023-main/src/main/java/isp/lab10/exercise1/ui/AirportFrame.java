package isp.lab10.exercise1.ui;

import isp.lab10.exercise1.service.ATC;
import isp.lab10.exercise1.service.Aircraft;
import isp.lab10.exercise1.service.FlightsQueryService;

import javax.swing.*;

public class AirportFrame extends JFrame {
    private ATC controller;
    private FlightsQueryService flights;

    public AirportFrame() {
        controller = new ATC();
        flights = new FlightsQueryService(this);
        initComponents();
        setVisible(true);
    }
    private void initComponents() {
        this.setSize(700, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel flight = new FlightsJPanel(this);
        JScrollPane scroll = new JScrollPane(flight);
        JPanel commands = new CommandsJPanel(this);
        JSplitPane tabs = new JSplitPane(JSplitPane.VERTICAL_SPLIT, scroll, commands);
        tabs.setResizeWeight(1.0);

        this.add(tabs);
    }

    public FlightsQueryService getFlights() {
        return flights;
    }

    public ATC getController() {
        return controller;
    }
}
