package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdrachtDeel1 extends Applet {
    TextField textfield;
    Button ok;
    int inputnumber;
    int result;

    public void init() {
        textfield = new TextField("", 30);
        ok = new Button("Ok");
        ok.addActionListener(new okListener());
        add(textfield);
        add(ok);
    }

    class okListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputnumber = Integer.valueOf(textfield.getText());

            if (inputnumber > 1000) {
                inputnumber = 1;
            }
            repaint();
        }
    }

    public void paint(Graphics g) {
        int y = 40;

        for (int counter = 0; counter < 10; counter++) {
            result = inputnumber * (counter + 1);
            g.drawString((counter + 1) + " X " + inputnumber + " = " + result, 20, y);
            y += 20;
        }
    }
}
