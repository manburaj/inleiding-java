package h13;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdrachtDeel1 extends Applet {

    void drawTree(Graphics g) {
        Color myColor1 = Color.decode("#290909");
        g.setColor(myColor1);
        g.fillRect(40,80,20,100);
        g.setColor(Color.green);
        g.fillOval(15,25,70,70);

    }

    public void paint(Graphics g) {
        drawTree(g);
    }
}

