public class Main {
    public static void main(String[] args) {

        Author pushkin = new Author("Александр", "Пушкин");
        Author sholokhov = new Author("Михаил", "Шолохов");

        Book dubrovsky = new Book("Дубровский", pushkin, 1841);
        Book quietDon = new Book("Тихий Дон", sholokhov, 1928);

        System.out.println(dubrovsky.getBookName() + " " + dubrovsky.getPublishingYear() +
                " " + dubrovsky.getAuthor().getAuthorName() + " " + dubrovsky.getAuthor().getAuthorSurname());
        System.out.println(quietDon.getBookName() + " " + quietDon.getPublishingYear() +
                " " + quietDon.getAuthor().getAuthorName() + " " + quietDon.getAuthor().getAuthorSurname());

        printBook(dubrovsky);
        printBook(quietDon);

        quietDon.setPublishingYear(1932);
        printBook(quietDon);

    }

    private static void printBook(Book book) {
            System.out.println(book.getBookName() + " " + book.getPublishingYear() +
                    " " + book.getAuthor().getAuthorName() + " " + book.getAuthor().getAuthorSurname());
    }
}