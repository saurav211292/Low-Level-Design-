// Player will be assigned one type of piece (X or O) and a name.
// This class represents a player in a board game, with a specific type of piece (X or O) and a name.
public class Player {
    public Piece pieceTyper; // X or O
    public String name; // Name of the player

    // when we create a player we will assign him a piece type and a name
    // This constructor initializes a Player object with a specific piece type and
    // name.
    public Player(Piece pieceTyper, String name) {
        this.pieceTyper = pieceTyper;
        this.name = name;
    }

    public Piece getPieceTyper() {
        return pieceTyper;
    }

    public String getName() {
        return name;
    }

    public void setPieceTyper(Piece pieceTyper) {
        this.pieceTyper = pieceTyper;
    }
}
