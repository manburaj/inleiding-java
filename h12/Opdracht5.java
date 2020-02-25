package h12;
//check if it works good

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {

    double[] numbers = { 100, 200, 500, 400, 300 };
    double searching;
    Button ok;
    TextField textField;
    Boolean found;

    public void init() {
        searching = 0;
        found = false;
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
            found = false;
            searching = Integer.valueOf(textField.getText());

            int counter = 0;
            while (counter < numbers.length) {
                if (numbers[counter] == searching) {
                    found = true;
                }
                counter ++;
            }
            repaint();
        }
    }
    public void paint(Graphics g) {
        if(found == true) {
            g.drawString("De waarde is gevonden.", 20, 50);
        }
        else {
            g.drawString("De waarde is niet gevonden.", 20, 50);
        }
    }
}
