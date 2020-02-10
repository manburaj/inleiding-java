package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int count;
        int y = 5;
        int x = 5;
        int width = 20;
        int height = 20;

        for (count = 0; count < 5; count++) {
            g.drawRect(x,y,width,height);

            y += height;
            x += width;
        }
    }
}
