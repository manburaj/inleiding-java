package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {
    int getalA;
    int getalB;
    int uitkomst;

    public void init() {
        getalA = 5;
        getalB = 2147483647;
        uitkomst= 5+2147483647;
    }
    public void paint(Graphics g) {
        g.drawString( "5+2147483647="+uitkomst,20,40);
    }
}
