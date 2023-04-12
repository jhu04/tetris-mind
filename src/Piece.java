import java.awt.*;

public enum Piece {
    I(new boolean[][]{
            {false, false, false, false},
            {true, true, true, true},
            {false, false, false, false},
            {false, false, false, false}
    }, Color.CYAN),
    J(new boolean[][]{
            {true, false, false},
            {true, true, true},
            {false, false, false}
    }, Color.BLUE),
    L(new boolean[][]{
            {false, false, true},
            {true, true, true},
            {false, false, false}
    }, Color.ORANGE),
    O(new boolean[][]{
            {true, true},
            {true, true}
    }, Color.YELLOW),
    S(new boolean[][]{
            {false, true, true},
            {true, true, false},
            {false, false, false}
    }, Color.GREEN),
    T(new boolean[][]{
            {false, true, false},
            {true, true, true},
            {false, false, false}
    }, Color.MAGENTA),
    Z(new boolean[][]{
            {true, true, false},
            {false, true, true},
            {false, false, false}
    }, Color.RED);

    private final boolean[][] squares;
    private final Color color;

    Piece(boolean[][] squares, Color color) {
        this.squares = squares;
        this.color = color;
    }

    public boolean[][] getSquares() {
        return squares;
    }

    public Color getColor() {
        return color;
    }

    void paintComponent(Graphics g, int xOffset, int yOffset) {
        g.setColor(color);
        for (int row = 0; row < squares.length; row++) {
            for (int col = 0; col < squares[row].length; col++) {
                if (squares[row][col]) {
                    int x = xOffset + col * Board.WIDTH / Board.COLS;
                    int y = yOffset + row * Board.HEIGHT / Board.ROWS;
                    g.setColor(color);
                    g.fillRect(x, y, Board.WIDTH / Board.COLS, Board.HEIGHT / Board.ROWS);
                    g.setColor(Color.WHITE);
                    g.drawRect(x, y, Board.WIDTH / Board.COLS, Board.HEIGHT / Board.ROWS);
                }
            }
        }
    }
}
