package ui;

import model.Book;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class BooksPanel extends JPanel {
    private LibraryManagementAppFrame frame;
    public BooksPanel(LibraryManagementAppFrame frame) {
        this.frame = frame;
        initComponents();
    }
    private void initComponents() {
        setLayout(new BorderLayout());

        JTable table = new JTable();
        table.setModel(frame.getTable());
        JScrollPane scroll = new JScrollPane(table);
        add(scroll, BorderLayout.CENTER);

        JButton button = new JButton("Add book");
        button.addActionListener(evt -> {
            try {
                addBookService();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        add(button, BorderLayout.PAGE_END);
    }
    public void addBookService() throws IOException {
        String title = JOptionPane.showInputDialog(this, "Enter book title:");
        String author = JOptionPane.showInputDialog(this, "Enter book author:");
        String ISBN = JOptionPane.showInputDialog(this, "Enter book ISBN:");
        Book book = new Book(title,author,ISBN);
        frame.getService().addBook(book);
        frame.getTable().fireTableDataChanged();
    }
}
