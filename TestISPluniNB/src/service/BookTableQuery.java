package service;

import javax.swing.table.AbstractTableModel;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BookTableQuery extends AbstractTableModel {
    public String[] columns = {"Title", "Author", "ISBN"};
    public static List<String> getBooks() throws IOException {
        Path path1 = Paths.get(".\\src\\data\\library.txt");
        byte[] bytes = Files.readAllBytes(path1);
        return Files.readAllLines(path1, StandardCharsets.UTF_8);
    }
    @Override
    public int getRowCount() {
        try {
            return getBooks().size();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            String[] book_data = getBooks().get(rowIndex).split(", ");
            return book_data[columnIndex];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getColumnName(int index) {
        return columns[index];
    }
}
