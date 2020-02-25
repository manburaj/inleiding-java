package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRoundRect(40, 40, 150, 150, 40, 40);
        g.fillOval(60, 65, 35, 35);
        g.fillOval(60, 135, 35, 35);
        g.fillOval(135, 65, 35, 35);
        g.fillOval(135, 135, 35, 35);
    }
}
