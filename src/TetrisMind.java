import javax.swing.*;
import java.awt.event.KeyEvent;

public class TetrisMind extends JFrame {
    private JToggleButton musicToggleButton;
    private JButton musicInformationButton;
    private JButton leaderboardButton;
    private JPanel mainPanel;
    private JPanel board;
    private JButton leaderboardInformationButton;
    private JButton creditsButton;

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("UR_UNINIT_READ")
    public TetrisMind() {
        setContentPane(mainPanel);
        setTitle("Tetris Mind");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        musicToggleButton.setMnemonic(KeyEvent.VK_M);
        musicToggleButton.addActionListener(e -> JOptionPane.showMessageDialog(TetrisMind.this, "Music toggle button clicked"));
        musicInformationButton.addActionListener(e -> JOptionPane.showMessageDialog(TetrisMind.this, "Info button clicked"));

        creditsButton.setMnemonic(KeyEvent.VK_C);
        creditsButton.addActionListener(event -> {
            Credits credits = new Credits();
            credits.setVisible(true);
        });
    }

    public static void main(String[] args) {
        new TetrisMind();
    }

    private void createUIComponents() {
        board = new Board();
    }
}
