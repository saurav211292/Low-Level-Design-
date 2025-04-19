//This implments PieceTypeX so represnt type X
// This class represents a specific type of game piece, "X", in a board game context.
public class PieceTypeX extends Piece {
    public PieceTypeX() {
        super(PieceTyper.X); // Call the constructor of the superclass (Piece) with PieceTyper.X
    }

    @Override
    public String toString() {
        return "X"; // Return the string representation of the piece type
    }
}
