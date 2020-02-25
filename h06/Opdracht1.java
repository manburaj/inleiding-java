package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    double Jan, Ali,Jeannette,Madav,Totaalbedrag;

    public void init() {
        Totaalbedrag = 113;

        Jan = Totaalbedrag/4;
        Ali = Totaalbedrag/4;
        Jeannette = Totaalbedrag/4;
        Madav = Totaalbedrag/4;

    }
    public void paint(Graphics g) {
        g.drawString("Totaalbedrag = " + Totaalbedrag, 30, 20);
        g.drawString("Jan = "+ Totaalbedrag/4,30,50);
        g.drawString("Ali = "+ Totaalbedrag/4,30,80);
        g.drawString("Jeannette = "+ Totaalbedrag/4,30,110);
        g.drawString("Madav = "+ Totaalbedrag/4,30,140);
    }
}
