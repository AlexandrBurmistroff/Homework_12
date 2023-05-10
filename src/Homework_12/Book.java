package Homework_12;

public class Book {
    private String bookName;
    private Author bookAuthor;
    private int bookYear;

    private Book createBook(String bookName, Author bookAuthor, int bookYear) {
        Book book = new Book();
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        return book;
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
}
