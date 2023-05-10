package Homework_12;

public class Author {
    private String authorName;

    private String authorSurname;

    private Author createAuthor() {
        Author author = new Author();
        author.authorName = authorName;
        author.authorSurname = authorSurname;
        return author;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }
}