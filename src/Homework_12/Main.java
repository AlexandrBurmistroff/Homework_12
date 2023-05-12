package Homework_12;

public class Main {

    public static void main(String[] args) {
        Author dostoevsky = new Author("Фёдор", "Достоевский");
        Author gogol = new Author("Николай", "Гоголь");

        Book crimeAndPunishment = new Book("Преступление и наказание", dostoevsky, 1866);
        Book deadSouls = new Book("Мёртвые души", gogol, 1842);

        System.out.println("Автор: " + dostoevsky);
        System.out.println("Автор: " + gogol);

        System.out.println("Книга: " + crimeAndPunishment);
        crimeAndPunishment.setBookYear(1989);
        System.out.println("Переиздание - " + crimeAndPunishment);
        System.out.println("Книга: " + deadSouls);
    }
}
