import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Credits extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextArea credits;

    public Credits() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

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
