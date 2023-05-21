package isp.lab10.exercise1.service;

import isp.lab10.exercise1.ui.AirportFrame;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.swing.table.AbstractTableModel;

@Data
@AllArgsConstructor
public class FlightsQueryService extends AbstractTableModel {
    private AirportFrame frame;
    private String[] columns = new String[]{"Flight ID", "Flight status", "Total time cruising"};
    public FlightsQueryService(AirportFrame frame) {
        this.frame = frame;
    }
    @Override
    public int getRowCount() {
        return frame.getController().getAircrafts().size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    @Override
    public String getColumnName(int index) {
        return columns[index];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String key = (String) frame.getController().getAircrafts().keySet().toArray()[rowIndex];

        switch (columnIndex) {
            case 0:
                return frame.getController().getAircrafts().get(key).toString();
            case 1:
                return frame.getController().getAircrafts().get(key).status;
            case 2:
                return frame.getController().getAircrafts().get(key).time;
        }
        return "EMPTY";
    }
    public String getStatus(int row) {
        String key = (String) frame.getController().getAircrafts().keySet().toArray()[row];
        return frame.getController().getAircrafts().get(key).status;
    }
}
