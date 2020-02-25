package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {

    double average;
    double input1;
    double input2;
    double input3;
    double input4;
    double input5;

    String state;
    TextField textboxA;
    TextField textboxB;
    TextField textboxC;
    TextField textboxD;
    TextField textboxE;
    Button calc;
    Button reset;

    public void init() {
        textboxA = new TextField(4);
        textboxB = new TextField(4);
        textboxC = new TextField(4);
        textboxD = new TextField(4);
        textboxE = new TextField(4);

        add(textboxA);
        add(textboxB);
        add(textboxC);
        add(textboxD);
        add(textboxE);

        calc = new Button("bereken");
        calc.addActionListener(new ButtonListener());
        reset = new Button("reset");
        reset.addActionListener(new ButtonListener());
        add(calc);
        add(reset);
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + average + " dus de leerling is " + state, 50, 50);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input1 = Double.valueOf(textboxA.getText());
            input2 = Double.valueOf(textboxB.getText());
            input3 = Double.valueOf(textboxC.getText());
            input4 = Double.valueOf(textboxD.getText());
            input5 = Double.valueOf(textboxE.getText());
            average = (input1 + input2 + input3 + input4 + input5) / 5;

            if (average > 5.5) {
                state = "Geslaagd";
            } else {
                state = "Gezakt";
            }
            repaint();
        }
    }

    class ResetButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input1 = 0;
            input2 = 0;
            input3 = 0;
            input4 = 0;
            input5 = 0;
            average = 0;
            repaint();
        }

    }
}
