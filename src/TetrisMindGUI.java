import javax.swing.*;

public class TetrisMindGUI {
    private static final String TITLE = "Tetris Mind";
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame frame = new JFrame(TITLE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello, World!");
        frame.add(label);

        frame.add(new Board());

        frame.setVisible(true);
    }
}
