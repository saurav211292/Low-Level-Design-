import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    Board board;
    Deque<Player> players;

    Game() {
        InitializeGame();
    }

    public void InitializeGame() {
        board = new Board(3); // Create a 3x3 board
        players = new LinkedList<>(); // Initialize the deque for players

        players.add(new Player(new PieceTypeX(), "player1Name")); // Add Player 1 with X piece type
        players.add(new Player(new PieceTypeO(), "player2Name")); // Add Player 2 with O piece type
    }

    public void startGame() {

        boolean noWinner = false;
        while (!noWinner) {

            if (board.isFull()) {
                System.out.println("Game Over! No winner, it's a draw.");
                break; // Exit the loop if the board is full
            }
            Player playerTurn = players.poll(); // Get the current player from the deque
            System.err.println("Current Player: " + playerTurn.getName()); // Print the current player's name
            System.out.println("Enter the coordinates to place your piece (x y): ");
            Scanner scanner = new Scanner(System.in); // Create a scanner to read user input
            int x = scanner.nextInt(); // Read the x coordinate
            int y = scanner.nextInt(); // Read the y coordinate
            System.err.println("X: " + x + " Y: " + y); // Print the coordinates entered by the user
            if (board.placePeice(x, y, playerTurn.getPieceTyper()) == false) {
                players.add(playerTurn);
                continue; // If the placement fails, continue to the next iteration
            } // Place the piece on the board

            if (board.checkWinner()) {
                System.out.println("Player " + playerTurn.getName() + " wins!"); // Print the
                noWinner = true; // Set noWinner to true to exit the loop
            }

            board.printBoard(); // Print the current state of the board
            players.add(playerTurn);
        }

    }
}
