package isp.lab10.exercise1.ui;

import isp.lab10.exercise1.service.FlightsQueryService;
import lombok.var;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class CellRenderer0 extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {

        //Cells are by default rendered as a JLabel.
        JLabel l = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setFont(new Font(Font.DIALOG,  Font.BOLD, 15));
        return l;

    }
}