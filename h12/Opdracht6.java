package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht6 extends Applet {

    int[]numbers = {1,1,2,2,2,3,4,5,6,7,7,7,8,9,10,10,10,10,10};
    double searching;
    Button ok;
    TextField textField;
    Boolean found;
    int quantity;

    public void init() {
        searching = 0;
        found = false;
        quantity = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searching) {
                found = true;
                break;
            }
        }
        textField = new TextField(5);
        add(textField);
        ok = new Button("OK");
        ok.addActionListener(new ButtonListener());
        add(ok);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            quantity = 0;
            found = false;
            searching = Integer.valueOf(textField.getText());

            int counter = 0;
            while (counter < numbers.length) {
                if (numbers[counter] == searching) {
                    found = true;
                    quantity ++;
                }
                counter ++;
            }
            repaint();
        }
    }
    public void paint(Graphics g) {

        g.drawString("Kies een getal tussen 1 en 10. ", 10,50);
        if(found == true) {
            g.drawString("Het ingevoerde getal komt " + quantity + " voor.", 10, 100);
        }
        else {
            g.drawString("Het ingevoerde getal is niet gevonden.", 10, 100);
        }
    }
}
