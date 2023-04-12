import javax.swing.*;
import java.awt.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Board extends JPanel {
    protected static final int WIDTH = 200;
    protected static final int HEIGHT = 400;
    private static final int X_OFFSET = 20;
    private static final int Y_OFFSET = 20;
    protected static final int ROWS = 20;
    protected static final int COLS = 10;
    private static final Color BACKGROUND_COLOR = Color.DARK_GRAY;
    private Piece active;
    private Queue<Piece> nextQueue;

    public Board() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        active = Piece.I;
        nextQueue = new ArrayDeque<>();

        // test pieces
        nextQueue.add(Piece.J);
        nextQueue.add(Piece.L);
        nextQueue.add(Piece.O);
    }

    private void paintNextQueue(Graphics g) {
        g.setColor(BACKGROUND_COLOR);
        g.fillRect(X_OFFSET + WIDTH + 10, Y_OFFSET, 10, HEIGHT);

        int x = X_OFFSET + WIDTH + 20;
        int y = Y_OFFSET;
        for (Piece piece : nextQueue) {
            piece.paintComponent(g, x, y);
            y += 50;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(BACKGROUND_COLOR);
        g.fillRect(X_OFFSET, Y_OFFSET, WIDTH, HEIGHT);
        g.setColor(Color.WHITE);
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                g.drawRect(X_OFFSET + col * WIDTH / COLS, Y_OFFSET + row * HEIGHT / ROWS, WIDTH / COLS, HEIGHT / ROWS);
            }
        }

        active.paintComponent(g, X_OFFSET, Y_OFFSET);

        paintNextQueue(g);
    }
}
