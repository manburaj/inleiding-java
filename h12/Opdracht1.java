package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    double numbers[];
    double total;
    double average;

    public void init() {
        numbers = new double[10];

        for (int counter = 0; counter < numbers.length; counter++) {
            numbers[counter] = 150 * counter + 150;
            total += numbers[counter];
        }
    }

    public void paint(Graphics g) {

        for (int counter = 0; counter < numbers.length; counter++) {
            g.drawString("" + numbers[counter], 40, 10 * counter + 20);
            average = total/ numbers.length;
        }
        g.drawString("Gemiddelde = " + average, 40, 150);
    }
}
