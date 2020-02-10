package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {
    TextField text;
    Button button;
    Button button2;
    Label label;

    public void init() {
        label = new Label("type hier:");
        add(label);
        text = new TextField("", 30);

        button = new Button("Ok");
        button2 = new Button("reset");
        button2.addActionListener(new ResetButtonListener());
        button.addActionListener(new ButtonListener());
        add(text);
        add(button);
        add(button2);
    }

    public void paint(Graphics g) {
        g.drawString("Type hier " + "en klik op Ok", 50, 60);
    }

    public void repaint() {
        super.repaint();
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text.setText("Great u have filled in.");
            repaint();
        }
    }

    class ResetButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text.setText("");
            repaint();
        }
    }
}
