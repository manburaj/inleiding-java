package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int number1=0;
        int number2=1;
        int number3=1;
        int count;
        int y = 0;

        for (count = 0; count < 30; count++) {
            y+= 20;
            g.drawString("" + number1, 50, y );

            number1 = number2;
            number2 = number3;
            number3 = number1 + number2;

        }
    }
}
