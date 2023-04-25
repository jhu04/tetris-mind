import javax.swing.*;
import java.awt.*;

public class InformationButton extends JButton {
    private static final Icon DEFAULT_ICON = new ImageIcon("assets/info-32x32.png");
    private final JFrame frame;
    private final String text;

    public InformationButton(JFrame frame, Icon icon, String text) {
        super(icon);
        this.frame = frame;
        this.text = text;

        setPreferredSize(new Dimension(32, 32));
        setMinimumSize(getPreferredSize());
        setSize(getPreferredSize());

        addActionListener(event -> {
            JOptionPane.showMessageDialog(frame, text);
        });
    }

    public InformationButton(JFrame frame, String text) {
        this(frame, DEFAULT_ICON, text);
    }
}
