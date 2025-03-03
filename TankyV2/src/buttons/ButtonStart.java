package buttons;

import game.MapSelectionPanel;
import tools.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 3/15/2022 - 9:17 AM
 *
 * @author simon
 */
public class ButtonStart extends Button {

    public ButtonStart(int x, int y, int width, int height, String text, MapSelectionPanel panel) {
        super(x, y, width, height, text);
        super.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.goToGame();
            }
        });
    }
}
