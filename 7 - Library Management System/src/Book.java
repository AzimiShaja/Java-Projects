public class Book {

    private String title;
    private String author;
    private String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }

    public String getTitle() {
        return title;

    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String toString() {
        return ("----------------------------------\n"
                + "Title: " + title + " Author: " + author + " Isbn: " + isbn
                + "\n------------------------------------");
    }

}
