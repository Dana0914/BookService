package service;

import model.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BookServiceTest {
    private BookService bookService;
    private Book book1;
    private Book book2;

    @BeforeEach
    public void setUp() {
        bookService = new BookService();
        book1 = new Book("Harry Potter", "J.K.Rowling", 1998);
        book2 = new Book("War and peace", "Lev Tolstoy", 1958);
    }
    @Test
    public void getBookListTest() {
        List<Book> expected = bookService.getBooksList();
        List<Book> actual = new ArrayList<>();
        actual.add(book1);
        actual.add(book2);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void removeBookTest() {
        boolean res = bookService.removeBook(book1);
        Assertions.assertTrue(res);
    }
    @Test
    public void addBookTest() {
        boolean res = bookService.addBook(book1);
        Assertions.assertTrue(res);
    }
    @Test
    public void searchBookByAuthor() {
        bookService.searchBookByAuthor(book1.getAuthor());
        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        Assertions.assertEquals(bookService.searchBookByAuthor(book1.getAuthor()), expected);
    }
    @Test
    public void searchBookByYear() {
        bookService.searchBookByYear(book1.getYear());
        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        Assertions.assertEquals(bookService.searchBookByYear(book1.getYear()), expected);
    }
}
