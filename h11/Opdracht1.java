package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y1 = 0;
        int y2 = 200;
        int x = 10;
        for (teller = 0; teller < 10; teller++) {
            x += 50;
            g.drawLine(x, y1, x, y2);
        }
    }
}
