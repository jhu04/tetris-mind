import javax.swing.*;

public class Credits extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextPane credits;

    public Credits() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(e -> onOK());

        pack();
    }

    private void onOK() {
        dispose();
    }

    public static void main(String[] args) {
        Credits dialog = new Credits();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
