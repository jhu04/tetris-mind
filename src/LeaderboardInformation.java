import javax.swing.*;

public class LeaderboardInformation extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public LeaderboardInformation() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(e -> onOK());

        pack();
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    public static void main(String[] args) {
        LeaderboardInformation dialog = new LeaderboardInformation();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
