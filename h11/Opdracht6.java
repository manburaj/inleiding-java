package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet { public void init() {
    setSize(500,500);
}
    int count;
    int x = 100;
    int y = 100;
    int width = 50;
    int height = 50;
    public void paint(Graphics g) {
        for (count = 0; count < 5; count++) {
            g.drawOval(x,y,width,height);

            y += 5;
            x += 5;

            height -= 10;
            width -= 10;
        }
    }
}
