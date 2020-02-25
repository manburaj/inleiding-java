package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {

    Button ok;
    TextField textField1;
    TextField textField2;
    Label namelabel;
    Label telnmrlabel;
    String[] name = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    int[] telnmr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int counter;

    public void init() {
        namelabel = new Label("Naam: ");
        textField1 = new TextField(5);
        telnmrlabel = new Label("Telefoonnummer: ");
        textField2 = new TextField(5);
        add(namelabel);
        add(textField1);
        add(telnmrlabel);
        add(textField2);
        ok = new Button("OK");
        ok.addActionListener(new ButtonListener());
        add(ok);
        counter = 0;
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            name[counter] = textField1.getText();
            telnmr[counter] = Integer.parseInt(textField2.getText());
            counter++;
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString("Namen: ↓ " ,20, 70);
        g.drawString("Telefoonnummers: ↓ ",140,70);
        int y = 100;

        if (name[(name.length - 1)] != "10") {
            for (int i = 0; i < name.length; i++) {
                g.drawString((i + 1) + " = " + name[i], 20, y);
                g.drawString(telnmr[i] + "", 250, y);
                y+= 20;
            }
        }
    }
}
