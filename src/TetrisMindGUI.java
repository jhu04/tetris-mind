import javax.swing.*;

public class TetrisMindGUI {
    private static final String TITLE = "Tetris Mind";
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame frame = new JFrame(TITLE);
        frame.setLayout(null);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Board board = new Board();
        frame.add(board);

//        Music music = new Music();
//        frame.add(music);

        frame.setVisible(true);
    }
}
