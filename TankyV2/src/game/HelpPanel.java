package game;

import buttons.ButtonMenu;
import tools.Canvas;
import tools.EImages;
import tools.Image;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * 3/15/2022 - 9:17 AM
 *
 * @author simon
 */
public class HelpPanel extends JPanel {

    private final Canvas canvas;

    private static final int WIDTH = 700;
    private static final int HEIGHT = 800;

    public HelpPanel(Canvas canvas) {
        this.panel(Color.BLACK, WIDTH, HEIGHT);

        this.canvas = canvas;
        super.setLayout(null);

        //Buttons
        super.add(new ButtonMenu(WIDTH / 2 - 600 / 2, 40, 600, 150, "", true, this));
    }

    public void panel(Color color, int width, int height) {
        super.setBackground(color);
        super.setPreferredSize(new Dimension(width, height));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D)g;

        Image image = new Image(EImages.HELP.getImage());
        image.paint(g2D, WIDTH / 2 - 550 / 2, 240, 550, 430, 0);
        this.revalidate();
    }

    public void goToMenu() {
        super.removeAll();
        this.canvas.add(new MenuPanel(this.canvas));
        this.canvas.panelConfig(this);
    }
}
