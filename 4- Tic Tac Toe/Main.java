import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Main
 */
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    public static void main(String[] args) {

        char[][] gameBoard = {
                { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' },
                { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' },
                { ' ', '|', ' ', '|', ' ' },
        };
        while (true) {
            printGameBoard(gameBoard);
            System.out.print("Enter Your placement (1-9): ");
            int playerPos = sc.nextInt();
            while (playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)) {
                System.out.println("Position is taken! Enter a correct position: ");
                playerPos = sc.nextInt();
            }

            position(gameBoard, "player", playerPos);
            String result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }

            int cpuPos;
            do {
                cpuPos = rand.nextInt(9) + 1;
            } while (playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos));
            position(gameBoard, "cpu", cpuPos);

            result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }
        }
    }

    private static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    private static void position(char[][] gameBoard, String user, int pos) {
        char symbol = 'X';
        if (user.equals("player")) {
            symbol = 'X';
            playerPositions.add(pos);
        } else if (user.equals("cpu")) {
            symbol = 'O';
            cpuPositions.add(pos);
        }
        switch (pos) {
            case 1 -> gameBoard[0][0] = symbol;
            case 2 -> gameBoard[0][2] = symbol;
            case 3 -> gameBoard[0][4] = symbol;
            case 4 -> gameBoard[2][0] = symbol;
            case 5 -> gameBoard[2][2] = symbol;
            case 6 -> gameBoard[2][4] = symbol;
            case 7 -> gameBoard[4][0] = symbol;
            case 8 -> gameBoard[4][2] = symbol;
            case 9 -> gameBoard[4][4] = symbol;
        }
    }

    private static String checkWinner() {
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);

        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);

        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(7, 5, 3);

        List<List> winningContdion = new ArrayList<List>();

        winningContdion.add(topRow);
        winningContdion.add(midRow);
        winningContdion.add(botRow);

        winningContdion.add(leftCol);
        winningContdion.add(midCol);
        winningContdion.add(rightCol);

        winningContdion.add(cross1);
        winningContdion.add(cross2);

        for (List l : winningContdion) {
            if (playerPositions.containsAll(l)) {
                return "Conragsts.... You Won!";
            } else if (cpuPositions.containsAll(l)) {
                return "Cpu Won!. Better Luck next Time";
            } else if (playerPositions.size() + cpuPositions.size() == 9) {
                return "Its Tie";
            }
        }

        return "";
    }
}
