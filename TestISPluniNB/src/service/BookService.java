package service;
import model.Book;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BookService {
    private static String path = ".\\src\\data\\library.txt";
    private static Path file_path = Paths.get(path);
    public void addBook(Book book) throws IOException {
        Files.writeString(file_path, book.toString()+'\n',
                StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}
