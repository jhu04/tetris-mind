import javax.swing.*;
import java.awt.*;

public class InformationButton {
    private static final Icon DEFAULT_ICON = new ImageIcon("assets/info-32x32.png");
    private final JButton button;

    public InformationButton(Component parentComponent, Icon icon, String information) {
        this.button = new JButton(icon);

        button.setPreferredSize(new Dimension(32, 32));
        button.setMinimumSize(button.getPreferredSize());
        button.setSize(button.getPreferredSize());

        button.addActionListener(event -> {
            JOptionPane.showMessageDialog(parentComponent, information);
        });
    }

    public InformationButton(Component parentComponent, String information) {
        this(parentComponent, DEFAULT_ICON, information);
    }

    public JButton getButton() {
        return button;
    }
}
