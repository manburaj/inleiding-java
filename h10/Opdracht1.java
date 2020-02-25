package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht1 extends Applet {
    TextField text;
    boolean firstnumber;
    int maxInput;
    int minInput;
    int inputvalue;

    public void init() {
        text = new TextField(30);
        text.addActionListener(new Textinput());
        add(text);
        maxInput = 0;
        minInput = 0;
        firstnumber = true;
    }

    public void paint(Graphics g) {
        g.drawString("Hoogste getal: "+ maxInput,40,100);
        g.drawString("Laagste getal: " + minInput, 40,130);
    }

    class Textinput implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String ingevoerdeWaardeString = text.getText();
             inputvalue = Integer.parseInt(ingevoerdeWaardeString);
            if (firstnumber) {
                firstnumber = false;
                maxInput = inputvalue;
                minInput = inputvalue;
                repaint();
            } else if (inputvalue > maxInput) {
                maxInput = inputvalue;
                repaint();
            } else if (inputvalue < minInput) {
                minInput = inputvalue;
                repaint();
            }
        }
    }
}
