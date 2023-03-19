
import java.util.Scanner;

/**
 * @author Shja Azımı
 *         This is the Main class for a library management program.
 *         It provides a user interface to interact with the Library class.
 */
public class Main {
    /**
     * The main method of the program. It displays the menu and calls the
     * corresponding methods of Library class
     * based on user input.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        menu(); // Keep your main clean :)
    }

    /**
     * Displays the menu and provides a way for the user to interact with the
     * Library.
     */
    public static void menu() {
        Library library = new Library(); // create a new Library object
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Display welcome message
        System.out.println("-----------------------------");
        System.out.println("    Welcome to the library");
        System.out.println("-----------------------------\n");

        // Display menu until user exits
        do {
            System.out.println("---------MENU--------");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    // Prompt user for book information and add it to the library
                    System.out.print("Enter the title of the book: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the author of the book: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter the ISBN of the book: ");
                    String isbn = scanner.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    break;

                case 2:
                    // Prompt user for book title and remove it from the library
                    System.out.print("Enter the title of the book to be removed: ");
                    String removeTitle = scanner.nextLine();
                    library.removeBook(removeTitle);
                    break;

                case 3:
                    // Prompt user for book title and search for it in the library
                    System.out.print("Enter the title of the book to be searched: ");
                    String searchTitle = scanner.nextLine();
                    library.searchBook(searchTitle);
                    break;

                case 4:
                    // Display all books in the library
                    library.displayAllBooks();
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting program.");
                    break;

                default:
                    // Invalid choice. Ask user to try again.
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();

        // Display goodbye message
        System.out.println("--------------------------------------");
        System.out.println("   Have a nice day. See you soon....");
        System.out.println("--------------------------------------");
    }
}
