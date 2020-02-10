package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {
    double input;
    TextField textfield;
    Button OK;
    Button resetbutton;
    String state = "";

    public void init() {
        textfield = new TextField(4);
        OK = new Button("OK");
        OK.addActionListener(new ButtonListener());
        resetbutton = new Button("Reset");
        resetbutton.addActionListener(new ResetButtonListener());

        add(textfield);
        add(OK);
        add(resetbutton);
    }

    public void paint(Graphics g) {
        g.drawString("" + state,40,40);

    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = Double.valueOf(textfield.getText());

            if (input < 4) {
                state = "Slecht";
                repaint();
            }
            if (input == 4) {
                state = "Onvoldoende";
                repaint();
            }
            if (input < 5.5) {
                state = "Matig";
                repaint();
            }
            if (input > 5.5) {
                state = "Voldoende";
                repaint();
            }
            if (input > 7) {
                state = "Goed";
                repaint();
            }
            if (input > 10) {
                state = "Error";
                repaint();
            }
            if (input < 1) {
                state = "Error";
                repaint();
            }
        }
    }

    class ResetButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = 0;
            state = "";
            repaint();
        }
    }
}
