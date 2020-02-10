package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht3 extends Applet {
    TextField text;
    int month;
    int days;
    String nameofthemonth;
    Label label;

    public void init() {
        text = new TextField(10);
        text.addActionListener(new TextListener());
        label = new Label("Type het maandnummer en druk op enter:");
        add(label);
        add(text);
    }

    public void paint(Graphics g) {
        g.drawString(" De maand "+ nameofthemonth +" heeft " + days + " dagen." ,40,100);
    }

    class TextListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            month = Integer.valueOf(text.getText());
            switch (month){
                case 1:
                    nameofthemonth = "januari";
                    days = 31;
                    break;
                case 2:
                    nameofthemonth = "februari";
                    days = 28;
                    break;
                case 3:
                    nameofthemonth = "maart";
                    days = 31;
                    break;
                case 4:
                    nameofthemonth = "april";
                    days = 30;
                    break;
                case 5:
                    nameofthemonth = "mei";
                    days = 31;
                    break;
                case 6:
                    nameofthemonth = "juni";
                    days = 30;
                    break;
                case 7:
                    nameofthemonth = "juli";
                    days = 31;
                    break;
                case 8:
                    nameofthemonth = "augustus";
                    days = 31;
                    break;
                case 9:
                    nameofthemonth = "september";
                    days = 30;
                    break;
                case 10:
                    nameofthemonth = "oktober";
                    days = 31;
                    break;
                case 11:
                    nameofthemonth = "november";
                    days = 30;
                    break;
                case 12:
                    nameofthemonth = "december";
                    days= 31;
                    break;
                default:
                    nameofthemonth = "0";
                    days = 0;
                    break;
            }
            repaint();
        }
    }
}
