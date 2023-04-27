import javax.swing.*;

public class MusicInformation extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public MusicInformation() {
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
        MusicInformation dialog = new MusicInformation();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
