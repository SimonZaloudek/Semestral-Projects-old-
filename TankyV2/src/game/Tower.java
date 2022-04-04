package game;

import entities.Player;
import tools.EImages;
import tools.Image;
import tools.KeyHandler;

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * 3/15/2022 - 9:17 AM
 *
 * @author simon
 */
public class Tower extends Player implements MouseMotionListener {

    private double angleM;

    public Tower(GamePanel p, KeyHandler h) {
        super(p, h);
    }

    public void draw(Graphics2D g2D) {
        super.update();

        Image image = new Image(EImages.getTower(super.getPanel().getTankN() + 7).getImage());
        image.paint(g2D, super.getX() - 6, super.getY() - 7, 87, 104, (int)this.angleM, 40);
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.angleM = 90 + (Math.toDegrees(Math.atan2(e.getY() - super.getY() - 7 - 40, e.getX() - super.getX() - 6 - 40))) % 360;
    }
}
