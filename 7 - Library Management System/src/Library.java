public class Library {
    private Book[] books;
    private int numBooks;

    public Library() {
        books = new Book[30]; // The library has capacity to store 30 books
        numBooks = 0; // The number of books stored to the library
    }

    public void addBook(Book book) {
        if (numBooks >= books.length) {
            System.out.println("Library is full. Cannot add more books.");
            return;
        }
        books[numBooks] = book;
        numBooks++;
        System.out.println("------------------------------");
        System.out.println("    Book added successfully.");
        System.out.println("---------------------------------\n");
    }

    public void removeBook(String title) {
        boolean bookRemoved = false;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                for (int j = i; j < numBooks - 1; j++) {
                    books[j] = books[j + 1];
                }
                numBooks--;
                bookRemoved = true;
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

    public void searchBook(String title) {
        boolean bookFound = false;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                System.out.println(books[i]);
                bookFound = true;
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Book not found!");
        }
    }

    public void displayAllBooks() {
        if (numBooks == 0) {
            System.out.println("------------------------------");
            System.out.println("   No books in the library.");
            System.out.println("--------------------------------");
            return;
        }
        for (int i = 0; i < numBooks; i++) {
            System.out.println(books[i]); // print all books in the library
        }
    }
}
