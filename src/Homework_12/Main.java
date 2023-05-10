package Homework_12;

public class Main {

    public static void main(String[] args) {
        Author dostoevsky = new Author();
        String authorDostoevskyName;
        String authorDostoevskySurname = dostoevsky.getAuthorSurname();
        authorDostoevskyName = "Фёдор";
        authorDostoevskySurname = "Достоевский";
        String authorDostoevsky = authorDostoevskyName + " " + authorDostoevskySurname;
        System.out.println("Автор - " + authorDostoevsky);

        Book crimeAndPunishment = new Book();
        String crimePunishment = crimeAndPunishment.getBookName();
        crimePunishment = "Преступление и наказание";
        int crimePunishmentYear = crimeAndPunishment.getBookYear();
        System.out.println("Название - " + crimePunishment);

        crimePunishmentYear = 1866;
        System.out.println("Год издания - " + crimePunishmentYear);

        int editionCrimePunishmentYear = crimeAndPunishment.setBookYear(1989);
        System.out.println("Год переиздания - " + editionCrimePunishmentYear);


        Author gogol = new Author();
        String authorGogolName = gogol.getAuthorName();
        String authorGogolSurname = gogol.getAuthorSurname();
        authorGogolName = "Николай";
        authorGogolSurname = "Гоголь";
        String authorGogol = authorGogolName + " " + authorGogolSurname;
        System.out.println("Автор - " + authorGogol);

        Book deadSouls = new Book();
        String dead = deadSouls.getBookName();
        dead = "Мёртвые души";
        int deadYear = deadSouls.getBookYear();
        System.out.println("Название - " + dead);

        deadYear = 1842;
        System.out.println("Год издания - " + deadYear);
    }
}
