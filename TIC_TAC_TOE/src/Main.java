import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Start Tic Tac Toe Game");
        Board board = new Board(3); // Create a 3x3 board
        board.printBoard(); // Print the initial empty board
        Game game = new Game(); // Create a new game instance
        game.startGame(); // Start the game10
    }

}
