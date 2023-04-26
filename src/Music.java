import javax.swing.*;
import java.awt.event.KeyEvent;

public class Music extends JPanel {
    private final JToggleButton musicToggle;
    private final InformationButton information;

    public Music() {
        this.musicToggle = new JToggleButton();
        this.information = new InformationButton(this, "[Stress information]");

        musicToggle.setMnemonic(KeyEvent.VK_M);
    }
}
