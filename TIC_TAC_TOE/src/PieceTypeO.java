//Implemntation of the PieceTypeO class
// This class represents a specific type of game piece, "O", in a board game context.
public class PieceTypeO extends Piece {
    public PieceTypeO() {
        super(PieceTyper.O); // Call the constructor of the superclass (Piece) with PieceTyper.O
    }

    @Override
    public String toString() {
        return "O"; // Return the string representation of the piece type
    }
}
