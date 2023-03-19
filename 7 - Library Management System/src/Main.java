
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        menu(); // Keep your main clean :)
    }

    public static void menu() {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("-----------------------------");
        System.out.println("    Welcome to the library");
        System.out.println("-----------------------------\n");
        do {
            System.out.println("---------MENU--------");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the title of the book: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the author of the book: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter the ISBN of the book: ");
                    String isbn = scanner.nextLine();
                    library.addBook(new Book(title, author, isbn));
                }
                case 2 -> {
                    System.out.print("Enter the title of the book to be removed: ");
                    String removeTitle = scanner.nextLine();
                    library.removeBook(removeTitle);
                }
                case 3 -> {
                    System.out.print("Enter the title of the book to be searched: ");
                    String searchTitle = scanner.nextLine();
                    library.searchBook(searchTitle);
                }
                case 4 -> library.displayAllBooks();
                case 5 -> System.out.println("Exiting program.");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        scanner.close();
        System.out.println("--------------------------------------");
        System.out.println("   Have a nice day. See you soon....");
        System.out.println("--------------------------------------");
    }
}
