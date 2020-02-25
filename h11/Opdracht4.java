package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int result;
        int times=3;
        int number=1;
        int count;
        int y = 0;

        for (count = 0; count <= 10; count++) {
            y+= 20;
            result = (number*times)*count;
            g.drawString("" + result, 50, y );
        }
    }
}
