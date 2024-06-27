package service;

import lombok.Getter;
import model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@Getter
public class BookService {
    List<Book> booksList = new ArrayList<>(List.of(new Book("Harry Potter", "J.K.Rowling", 1998),
            new Book("War and peace", "Lev Tolstoy", 1958)));

    public boolean addBook(Book book) {
        return booksList.add(book);
    }

    public boolean removeBook(Book books) {
        for (Book book : booksList) {
            if (book.equals(books)) {
                if (booksList.remove(book)) {
                    return true;
                }
            }
        }
        return false;
    }
    public List<Book> searchBookByAuthor(String author) {
        return booksList.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }
    public List<Book> searchBookByYear(Integer year) {
        return booksList
                .stream()
                .filter(book -> Objects.equals(book.getYear(), year))
                .collect(Collectors.toList());

    }
    
    
}
