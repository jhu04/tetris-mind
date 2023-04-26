import javax.swing.*;

public class TetrisMind extends JFrame {
    private JButton musicToggleButton;
    private JButton musicInformationButton;
    private JButton leaderboardButton;
    private JPanel mainPanel;
    private JPanel board;
    private JButton leaderboardInformationButton;

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("UR_UNINIT_READ")
    public TetrisMind() {
        setContentPane(mainPanel);
        setTitle("Tetris Mind");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        musicToggleButton.addActionListener(e -> JOptionPane.showMessageDialog(TetrisMind.this, "Music toggle button clicked"));
        musicInformationButton.addActionListener(e -> JOptionPane.showMessageDialog(TetrisMind.this, "Info button clicked"));
    }

    public static void main(String[] args) {
        new TetrisMind();
    }

    private void createUIComponents() {
        board = new Board();
    }
}
