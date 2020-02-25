package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for (teller = 20; teller > 10; teller--) {
            y+= 20;
            g.drawString("" + teller, 50, y );
        }
    }
}
