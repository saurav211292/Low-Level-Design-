public class Board {

    int size;
    Piece[][] board;

    // create a board of size x size
    // This constructor initializes a Board object with a specific size and creates
    // a 2D array of Piece objects.
    Board(int size) {
        this.size = size;
        this.board = new Piece[size][size];
    }

    // Print the board in a readable format
    // This method prints the current state of the board to the console.
    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    System.out.print("  "); // Print a dash for empty spaces
                } else {
                    System.out.print(board[i][j].toString()); // Print the piece type (X or O)
                }
                if (j < size - 1) {
                    System.out.print("|"); // Print a vertical separator between columns
                }
            }
            System.out.println(); // Move to the next line after each row
            if (i < size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("--"); // Print a horizontal separator between rows
                    if (j < size - 1) {
                        System.out.print("+"); // Print a plus sign for intersections
                    }
                }
                System.out.println(); // Move to the next line after each separator row
            }
        }
    }

    // Place a piece on the board at the specified coordinates
    // This method places a piece on the board at the specified coordinates (x, y).
    Boolean placePeice(int x, int y, Piece piece) {
        if (x >= 0 && x < size && y >= 0 && y < size) {
            board[x][y] = piece; // Place the piece on the board at the specified coordinates
        } else {
            System.out.println("Invalid coordinates"); // Print an error message for invalid coordinates
            return false; // Return false to indicate failure
        }

        return true; // Return true to indicate successful placement (could be improved with error
                     // handling)
    }

    Boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    return false; // Return true if there is at least one free space on the board
                }
            }
        }
        return true; // Return false if no free spaces are found
    }

    Boolean checkWinner() {

        for (int i = 0; i < size; i++) {
            if (board[i][0] != null && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                return true; // Check rows for a winner
            }
        }

        for (int i = 0; i < size; i++) {
            if (board[0][i] != null && board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i])) {
                return true; // Check columns for a winner
            }
        }

        for (int i = 0; i < size; i++) {
            if (board[0][0] != null && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
                return true; // Check diagonal from top-left to bottom-right for a winner
            }
        }
        for (int i = 0; i < size; i++) {
            if (board[0][2] != null && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
                return true; // Check diagonal from top-right to bottom-left for a winner
            }
        }
        return false;
    }

}
