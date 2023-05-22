package ui;

import service.BookService;
import service.BookTableQuery;

import javax.swing.*;

public class LibraryManagementAppFrame extends JFrame {
    private BookTableQuery table;

    private BookService service;
    public LibraryManagementAppFrame() {
        table = new BookTableQuery();
        service = new BookService();
        initComponents();
        setVisible(true);
    }

    public BookTableQuery getTable() {
        return table;
    }
    public BookService getService() {
        return service;
    }

    private void initComponents() {
        this.setSize(600, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Library Management App");
        JPanel panel = new BooksPanel(this);
        this.add(panel);
    }
}
