package h04;

import java.awt.*;
import java.applet.Applet;

public class Opdracht1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(40,40,178,247);
        g.drawLine(40,40,290,40);
        g.drawLine(290,40,178,247);
    }
}
