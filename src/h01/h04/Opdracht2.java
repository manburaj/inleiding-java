package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(100,100, 175, 25);
        g.drawLine(100,100,250,100);
        g.drawLine(175,25,250,100);
        g.drawRect(100,100,150,100);
        g.drawRect(200,140,30,30); //window
        g.drawRect(160,160,25,40);
        g.fillOval(180,180,5,5);
    }
}
