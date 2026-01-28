public class LibraryApp {
    public static void main(String[] args) {
        Author author1 = new Author("Федор", "Достоевский");
        Author author2 = new Author("Антон", "Чехов");

        Book book1 = new Book("Преступление и наказание", author1, 1866);
        Book book2 = new Book("Вишневый сад", author2, 1904);

        System.out.println("Книга: " + book1.getTitle() + ", Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", Год: " + book1.getPublicationYear());
        System.out.println("Книга: " + book2.getTitle() + ", Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", Год: " + book2.getPublicationYear());

        book1.setPublicationYear(1872);
        System.out.println("Обновленный год публикации книги '" + book1.getTitle() + "': " + book1.getPublicationYear());
    }
}
