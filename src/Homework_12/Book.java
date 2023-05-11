package Homework_12;

import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author bookAuthor;
    private int bookYear;

    public Book(String bookName, Author bookAuthor, int bookYear) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getBookAuthor() {
        return this.bookAuthor;
    }

    public int getBookYear() {
        return this.bookYear;
    }

    public int setBookYear(int bookYear) {
        this.bookYear = bookYear;
        return bookYear;
    }

    @Override
    public String toString() {
        return "Название книги: " + bookName + ", Автор: " + bookAuthor + ", Год издания: " + bookYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if ((o == null) || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName);
    }
}
