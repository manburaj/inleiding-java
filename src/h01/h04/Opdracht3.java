package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.fillRect(40, 20, 250, 45);

        g.setColor(Color.white);
        g.fillRect(40, 65, 250, 45);

        g.setColor(Color.blue);
        g.fillRect(40, 110, 250, 45);

        g.setColor(Color.black);
        g.fillRect(30,20,10,350);
    }
}
