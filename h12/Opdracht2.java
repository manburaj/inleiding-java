package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    Button thathing;
    int number[];

    public void init() {
        number = new int[25];

        for (int Button = 0; Button < number.length; Button ++) {
            number[Button] = 50 * Button + 50;
            thathing = new Button("ja");
            add(thathing);
        }
    }
    public void paint(Graphics g) {
        g.drawString("Het antwoord op je vraag is...", 430,20);
    }
}
