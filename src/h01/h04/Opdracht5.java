package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(40, 70, 300, 150, 0, 360);
    }
}


