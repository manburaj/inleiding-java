package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {
    public void init() {
        setSize(500,500);
    }
    int count;
    int x = 10;
    int y = 10;
    int width = 500;
    int height = 500;
    public void paint(Graphics g) {
        for (count = 0; count < 50; count++) {
            g.drawOval(x,y,width,height);

            y += 5;
            x += 5;

            height -= 10;
            width -= 10;
        }
    }
}
