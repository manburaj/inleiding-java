package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht9 extends Applet {
    public void init() {
        setSize(500,500);}

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        int width = 50;
        int height = 50;
        for (int rows = 0; rows < 4; rows++) {
            g.drawRect(x, y, width, height);

            // REGEL 1
            for (int column = 0; column < 8; column++) {
                g.drawRect(x, y, width, height);
                if (column == 0 || column == 2 || column == 4 || column == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, width, height);
                } else {
                    g.setColor(Color.white);
                }
                x += width;
            }
            x = 50;
            y += height;

            // REGEL 2
            for (int column = 0; column < 8; column++) {
                g.setColor(Color.black);
                g.drawRect(x, y, width, height);
                if (column == 0 || column == 2 || column == 4 || column == 6) {
                    g.setColor(Color.white);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, width, height);
                }
                x += width;
            }
            x = 50;
            y += height;
        }
    }
}
