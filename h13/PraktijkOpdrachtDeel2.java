package h13;
import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdrachtDeel2 extends Applet {
    int y1 = 80;
    int y2 = 25;
    int x1 = 40;
    int x2 = 15;

    void drawTree(Graphics g) {
        Color myColor1 = Color.decode("#290909");
        g.setColor(myColor1);
        g.fillRect(x1, y1, 20, 100);
        g.setColor(Color.green);
        g.fillOval(x2, y2, 70, 70);
    }

    public void paint(Graphics g) {
        for (int counter = 0; counter < 5; counter++) {
            drawTree(g);
            x1+=60;
            x2+=60;
        }
        x1 = 70;
        x2 = 45;
        y1 = 200;
        y2 = 145;

        for (int counter = 0; counter < 5; counter++) {
            drawTree(g);
            x1 += 60;
            x2 += 60;
        }
    }
}
