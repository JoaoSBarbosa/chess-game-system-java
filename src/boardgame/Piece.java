package boardgame;

public class Piece {
    protected Position position;

    private Board board;

    // no construtorar não recebe a posição porque a posição inicial da peça é nulo
    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "position=" + position +
                ", board=" + board +
                '}';
    }
}
