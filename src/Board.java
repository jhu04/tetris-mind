import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayDeque;
import java.util.Queue;

public class Board extends JPanel implements KeyListener {
    protected static final int WIDTH = 200;
    protected static final int HEIGHT = 400;
    protected static final int ROWS = 20;
    protected static final int COLS = 10;
    private static final Color BACKGROUND_COLOR = Color.DARK_GRAY;
    private BoardPiece active;
    private final Queue<Piece> nextQueue;

    public Board() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        active = new BoardPiece(this, Piece.I, 0, 0);
        nextQueue = new ArrayDeque<>();

        // test pieces
        nextQueue.add(Piece.J);
        nextQueue.add(Piece.L);
        nextQueue.add(Piece.O);
    }

    private void paintNextQueue(Graphics g) {
        g.setColor(BACKGROUND_COLOR);
        g.fillRect(getX() + WIDTH + 10, getY(), 5 * WIDTH / COLS, HEIGHT);

        int x = getX() + WIDTH + 20;
        int y = getY() + 20;
        for (Piece piece : nextQueue) {
            piece.paintComponent(g, x, y);
            y += 50;
        }
    }

    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped");
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("left");
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("right");
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("down");
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("up");
        }
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("keyReleased");
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(BACKGROUND_COLOR);
        g.fillRect(getX(), getY(), WIDTH, HEIGHT);
        g.setColor(Color.WHITE);
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                g.drawRect(getX() + col * WIDTH / COLS, getY() + row * HEIGHT / ROWS, WIDTH / COLS, HEIGHT / ROWS);
            }
        }

        active.paintComponent(g);

        paintNextQueue(g);
    }
}
