/**
 * The Book class represents a book with a title, author, and ISBN number.
 */
public class Book {

    private String title; // instance variable of title
    private String author; // instance variable of author
    private String isbn; // instance variable of Isbn

    /**
     * Constructs a Book object with a given title, author, and ISBN number. *
     * 
     * @param title  the title of the book
     * @param author the author of the book
     * @param isbn   the ISBN number of the book
     */
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }

    /**
     * 
     * Returns the title of the book.
     * 
     * @return the title of the book
     */
    public String getTitle() {
        return title;

    }

    /**
     * 
     * Returns the author of the book.
     * 
     * @return the author of the book
     */

    public String getAuthor() {
        return author;
    }

    /**
     * 
     * Returns the ISBN number of the book.
     * 
     * @return the ISBN number of the book
     */

    public String getIsbn() {
        return isbn;
    }

    /**
     * 
     * Returns a string representation of the book, including the title, author, and
     * ISBN number.
     * 
     * @return a string representation of the book
     */
    public String toString() {
        return ("----------------------------------\n"
                + "Title: " + title + " Author: " + author + " Isbn: " + isbn
                + "\n------------------------------------");
    }

}
