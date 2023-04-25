import javax.swing.*;
import java.awt.*;

public class BoardPiece extends JPanel {
    private final Board board;
    private final Piece piece;
    private final int row;
    private final int col;

    public BoardPiece(Board board, Piece piece, int row, int col) {
        this.board = board;
        this.piece = piece;
        this.row = row;
        this.col = col;
    }

    public Piece getPiece() {
        return piece;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public BoardPiece translate(int dr, int dc) {
        return new BoardPiece(board, piece, row + dr, col + dc);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        piece.paintComponent(g, board.getX(), board.getY());
    }
}
