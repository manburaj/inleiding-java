package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht3 extends Applet {

    int[] input = {1, 2, 3, 4, 5};
    TextField[] textFieldArray;
    Button ok;

    public void init() {
        textFieldArray = new TextField[5];
        for (int i = 0; i < 5; i++) {
            textFieldArray[i] = new TextField("", 5);
            add(textFieldArray[i]);
        }
        ok = new Button("OK");
        ok.addActionListener(new ButtonListener());
        add(ok);
        repaint();
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for(int i = 0; i < 5; i++ ) {
                input[i] = Integer.valueOf(textFieldArray[i].getText());
            }
            Arrays.sort(input);
            for (int i = 0; i < 5; i++) { textFieldArray[i].setText(String.valueOf(input[i]));
            }
            repaint();
        }
    }
}

