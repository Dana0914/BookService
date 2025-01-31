package model;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Getter
@Setter
public class Book {
    private String name;
    private String author;
    private Integer year;
    public Book() {

    }

    public Book(String name, String author, Integer year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name)
                && Objects.equals(author, book.author)
                && Objects.equals(year, book.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }
}
