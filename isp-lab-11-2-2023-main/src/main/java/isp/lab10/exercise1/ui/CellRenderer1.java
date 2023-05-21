package isp.lab10.exercise1.ui;

import isp.lab10.exercise1.service.FlightsQueryService;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class CellRenderer1 extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {

        //Cells are by default rendered as a JLabel.
        JLabel l = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setFont(new Font(Font.DIALOG,  Font.BOLD, 15));

        //Get the status for the current row.
        FlightsQueryService tableModel = (FlightsQueryService) table.getModel();
        if (tableModel.getStatus(row) == "available") { l.setBackground(Color.GREEN); }
        if (tableModel.getStatus(row) == "Taxing") { l.setBackground(Color.CYAN); }
        if (tableModel.getStatus(row) == "Takeoff") { l.setBackground(Color.MAGENTA); }
        if (tableModel.getStatus(row) == "Ascending") { l.setBackground(Color.BLUE); }
        if (tableModel.getStatus(row) == "Cruising") { l.setBackground(Color.RED); }
        if (tableModel.getStatus(row) == "Descending") { l.setBackground(Color.ORANGE); }
        if (tableModel.getStatus(row) == "Landed") { l.setBackground(Color.YELLOW); }

        //Return the JLabel which renders the cell.
        return l;

    }
}