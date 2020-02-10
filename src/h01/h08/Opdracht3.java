package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht3 extends Applet {

    TextField text;
    Button button;
    Button button2;
    Label label;

    double bedragonafgerond;
    double bedragx10;
    int bedragint;
    double bedrag;

    public void init() {
        label = new Label("Vul het gewenste bedrag in:");
        add(label);
        text = new TextField("", 30);

        button = new Button("bereken");
        button2 = new Button("reset");
        button2.addActionListener(new Opdracht3.ResetButtonListener());
        button.addActionListener(new Opdracht3.KnopListener());
        add(text);
        add(button);
        add(button2);
    }

    public void paint(Graphics g) {
        g.drawString("" + bedrag, 50, 100);
    }

    public void repaint() {
        super.repaint();
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bedragonafgerond = Double.valueOf(text.getText());

            bedragonafgerond = bedragonafgerond * 1.21;

            bedragx10 = bedragonafgerond * 10;
            bedragint = (int) bedragx10;
            bedrag = (double) bedragint / 10;
            repaint();
        }
    }

    class ResetButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text.setText("");
            bedrag = 0;
            repaint();
        }
    }
}
