package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht8 extends Applet {
    public void init() {}

    int count;
    int x = 1;
    int y = 1;
    int width = 20;
    int height = 20;

    public void paint(Graphics g) {
        for (count = 0; count < 100; count++) {
            g.drawOval(x, y, width, height);

            x += 3;
            y += 3;

            height += 2;
            width += 2;
        }
    }
}
