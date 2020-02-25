package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdrachtDeel2 extends Applet {
    Button next;
    int tablenumber;
    int result;

    public void init() {
        tablenumber = 0;
        next = new Button("Volgende tafel");
        next.addActionListener(new okListener());
        add(next);
    }

    class okListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tablenumber++;
            if (tablenumber > 10) {
                tablenumber = 1;
            }
            repaint();
        }
    }

    public void paint(Graphics g) {
        int y = 40;

        for (int counter = 0; counter < 10; counter++) {
            result = tablenumber * (counter + 1);
            g.drawString((counter + 1) + " X " + tablenumber + " = " + result, 20, y);
            y += 20;
        }
    }
}
