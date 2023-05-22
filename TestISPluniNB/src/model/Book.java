package model;

import lombok.Data;

@Data
public class Book {
    private String title;
    private String author;
    private String ISBN;

    @Override
    public String toString() {
        return title + ", " + author + ", " + ISBN;
    }

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
}
