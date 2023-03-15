import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int computerScore = 0;
        int playerScore = 0;
        int ties = 0;

        while (true) {
            System.out.println("Enter your move (rock, paper, scissors): ");
            String playerMove = scanner.nextLine().toLowerCase();

            if (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
                System.out.println("Invalid move. Please try again.");
                continue;
            }

            int computerMove = random.nextInt(3); // 0 - rock, 1 - paper, 2 - scissors

            System.out.println("Computer move: " + getMoveName(computerMove));

            int result = getResult(playerMove, computerMove);

            if (result == 0) {
                System.out.println("It's a tie!");
                ties++;
            } else if (result == 1) {
                System.out.println("You win!");
                playerScore++;
            } else {
                System.out.println("You lose!");
                computerScore++;
            }

            System.out.println("Player: " + playerScore + " | Computer: " + computerScore + " | Ties: " + ties);

            System.out.println("Do you want to play again? (yes  /  no)");
            String playAgain = scanner.nextLine().toLowerCase();

            if (playAgain != "yes") {
                break;
            }
        }

        System.out.println("Final score: Player " + playerScore + " - Computer " + computerScore + " - Ties " + ties);
    }

    private static String getMoveName(int move) {
        switch (move) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "";
        }
    }

    private static int getResult(String playerMove, int computerMove) {
        if (playerMove.equals("rock")) {
            if (computerMove == 0) {
                return 0;
            } else if (computerMove == 1) {
                return -1;
            } else {
                return 1;
            }
        } else if (playerMove.equals("paper")) {
            if (computerMove == 0) {
                return 1;
            } else if (computerMove == 1) {
                return 0;
            } else {
                return -1;
            }
        } else { // scissors
            if (computerMove == 0) {
                return -1;
            } else if (computerMove == 1) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
