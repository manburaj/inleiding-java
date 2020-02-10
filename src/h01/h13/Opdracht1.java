package h13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet{

    int x1,x2,x3,y1,y2;

    public void init() {
        //X - COORDINATEN//
        x1 = 125;
        x2 = 200;
        x3 = 50;
        //Y - COORDINATEN//
        y1 = 100;
        y2 = 200;
    }

    void drawTriangle(Graphics g, int x1, int y1, int x2, int y2, int x3) {
        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x2, y2, x3, y2);
        g.drawLine(x3, y2, x1, y1);
    }

    public void paint(Graphics g) {
        drawTriangle(g,x1,y1,x2,y2,x3);
    }

}
