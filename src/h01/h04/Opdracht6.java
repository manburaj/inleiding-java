package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRoundRect(60,10,95,205,100,120);

        g.drawRect(92,210,30,80);

        g.setColor(Color.red);
        g.fillOval(81,23,53,53);

        g.setColor(Color.yellow);
        g.fillOval(81,83,53,53);

        g.setColor(Color.green);
        g.fillOval(81,143,53,53);
    }
}
