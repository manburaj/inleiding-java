package h13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    public void paint(Graphics g) {

        Color myColor3 = Color.decode("#c4bebe");
        g.setColor(myColor3);
        g.drawRect(25,35,300,150);

        int x, y, width, height;
        x = 25;
        y = 10;
        width = 50;
        height = 25;

        Color myColor1 = Color.decode("#750000");
        g.setColor(myColor1);
        g.fillRect(x, 35, 300, 150);

        for (int i = 0; i < 3; i++) {
            x = 50;
            y += 25;
            for (int row = 0; row < 5; row++) {
                Color myColor2 = Color.decode("#c4bebe");
                g.setColor(myColor2);
                g.drawRect(x, y, width, height);
                x += 50;
            }
            x = 25;
            y += 25;
            for (int column = 0; column < 6; column++) {
                Color myColor2 = Color.decode("#c4bebe");
                g.setColor(myColor2);
                g.drawRect(x, y, width, height);
                x += 50;
            }
        }
    }
}
