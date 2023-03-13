import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("                          CALCULATOR");
        System.out.println("----------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nChoose an operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("\nEnter your choice: ");
        int choice = scanner.nextInt();

        double result = 0.0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("\nResult: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("\nResult: " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("\nResult: " + result);
                break;

            case 4:
                result = num1 / num2;
                System.out.println("\nResult: " + result);
                break;

            default:
                System.out.println("Invalid choice.");
                break;

        }
        scanner.close();
        System.out.println("Thanks for using");
    }
}