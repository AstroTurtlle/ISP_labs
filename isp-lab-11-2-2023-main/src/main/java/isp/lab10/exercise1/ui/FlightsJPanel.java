package isp.lab10.exercise1.ui;

import javax.swing.*;

public class FlightsJPanel extends JPanel{
    private AirportFrame frame;
    public FlightsJPanel(AirportFrame frame) {
        this.frame = frame;
        initComponent();
    }
    private void initComponent() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JTable jFlights = new JTable();
        jFlights.setModel(frame.getFlights());
        jFlights.getColumnModel().getColumn(2).setCellRenderer(new CellRenderer0());
        jFlights.getColumnModel().getColumn(1).setCellRenderer(new CellRenderer1());
        jFlights.getColumnModel().getColumn(0).setCellRenderer(new CellRenderer0());

        add(jFlights);

    }
}
