public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Федор", "Достоевский");


        Book book1 = new Book("Война и мир", author1, 1867);
        Book book2 = new Book("Преступление и наказание", author2, 1866);


        System.out.println("Информация о книгах:");
        printBookInfo(book1);
        printBookInfo(book2);


        System.out.println("Изменяем год публикации книги 'Война и мир'...");
        book1.setPublicationYear(1869);


        System.out.println("Обновленная информация о книгах:");
        printBookInfo(book1);
        printBookInfo(book2);
    }

    public static void printBookInfo(Book book) {
        System.out.println("Книга:" + book.getTitle() + "'");
        System.out.println("Автор:" + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
        System.out.println("Год издания:" + book.getPublicationYear());
        System.out.println();
    }
}


class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}