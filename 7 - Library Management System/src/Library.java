/**
 * The Library class represents a library that can store up to 30 books.
 */
public class Library {
    private Book[] books; // Array to store books in the library
    private int numBooks; // Number of books currently stored in the library

    /**
     * Creates a new Library object with a capacity to store 30 books.
     */
    public Library() {
        books = new Book[30]; // Initialize the books array to have a length of 30
        numBooks = 0; // Initialize the number of books stored to 0
    }

    /**
     * Adds a new book to the library.
     *
     * @param book The book object to add to the library
     */
    public void addBook(Book book) {
        if (numBooks >= books.length) {
            System.out.println("Library is full. Cannot add more books.");
            return;
        }
        books[numBooks] = book; // Add the book to the next available index in the array
        numBooks++; // Increment the number of books stored in the library
        System.out.println("------------------------------");
        System.out.println("    Book added successfully.");
        System.out.println("---------------------------------\n");
    }

    /**
     * Removes a book from the library based on its title.
     *
     * @param title The title of the book to remove
     */
    public void removeBook(String title) {
        boolean bookRemoved = false; // Flag to check if the book was removed or not
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equals(title)) { // Check if the current book's title matches the given title
                // Shift all subsequent books one index to the left to fill in the gap of the
                // removed book
                for (int j = i; j < numBooks - 1; j++) {
                    books[j] = books[j + 1];
                }
                numBooks--; // Decrement the number of books stored in the library
                bookRemoved = true; // Set the flag to true
                break;
            }
        }
        if (bookRemoved) {
            System.out.println("---------------------------------------");
            System.out.println("  Book has been removed successfully.");
            System.out.println("------------------------------------------");
        } else {
            System.out.println("Book not found!");
        }
    }

    /**
     * Searches for a book in the library based on its title.
     *
     * @param title The title of the book to search for
     */
    public void searchBook(String title) {
        boolean bookFound = false; // Flag to check if the book was found or not
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equals(title)) { // Check if the current book's title matches the given title
                System.out.println(books[i]); // Print the book information
                bookFound = true; // Set the flag to true
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Book not found!");
        }
    }

    /**
     * Displays all books currently stored in the library.
     */
    public void displayAllBooks() {
        if (numBooks == 0) {
            System.out.println("------------------------------");
            System.out.println("   No books in the library.");
            System.out.println("--------------------------------");
            return;
        }
        for (int i = 0; i < numBooks; i++) {
            System.out.println(books[i]); // Print all books in the library
        }
    }
}
