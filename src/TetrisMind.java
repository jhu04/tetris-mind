import javax.swing.*;

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

        musicToggleButton.addActionListener(e -> JOptionPane.showMessageDialog(TetrisMind.this, "Music toggle button clicked"));

        creditsButton.addActionListener(e -> {
            Credits credits = new Credits();
            credits.setVisible(true);
        });

        musicInformationButton.setIcon(new ImageIcon("assets/info-32x32.png"));
        musicInformationButton.addActionListener(e -> {
            MusicInformation musicInformation = new MusicInformation();
            musicInformation.setVisible(true);
        });

        leaderboardInformationButton.setIcon(new ImageIcon("assets/info-32x32.png"));
        leaderboardInformationButton.addActionListener(e -> {
            LeaderboardInformation leaderboardInformation = new LeaderboardInformation();
            leaderboardInformation.setVisible(true);
        });
    }

    public static void main(String[] args) {
        new TetrisMind();
    }

    private void createUIComponents() {
        board = new Board();
    }
}
