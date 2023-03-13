import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Set up the game
        System.out.println("Lets Play a game");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int maxNumber = 100;
        int randomNumber = random.nextInt(maxNumber) + 1;
        int attempts = 0;
        int guess;
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        System.out.println("I'm thinking of a number between 1 and " + maxNumber + ". Can you guess what it is?");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        // Play the game
        while (true) {
            // Get the player's guess
            System.out.print("\nEnter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            // Check if the guess is correct
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        // Close the scanner
        scanner.close();
    }

}