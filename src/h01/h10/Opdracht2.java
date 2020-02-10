package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht2 extends Applet {
    TextField tekstvak;
    boolean firstnumber;
    int maxInput;
    int minInput;
    int ingevoerdeWaarde;

    public void init() {
        tekstvak = new TextField(30);
        tekstvak.addActionListener(new TextListener());
        add(tekstvak);
        maxInput = 0;
        minInput = 0;
        firstnumber = true;
    }

    public void paint(Graphics g) {
        g.drawString("Hoogste getal: "+ maxInput,40,100);
        g.drawString("Laagste getal: " + minInput, 40,130);
    }

    class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String ingevoerdeWaardeString = tekstvak.getText();
            ingevoerdeWaarde = Integer.parseInt(ingevoerdeWaardeString);
            if (firstnumber) {
                firstnumber = false;
                maxInput = ingevoerdeWaarde;
                minInput = ingevoerdeWaarde;
                repaint();
            } else if (ingevoerdeWaarde > maxInput) {
                maxInput = ingevoerdeWaarde;
                repaint();
            } else if (ingevoerdeWaarde < minInput) {
                minInput = ingevoerdeWaarde;
                repaint();
            }
        }
    }
}
