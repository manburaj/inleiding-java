package h10;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {
    TextField textbox;
    int month;
    int days;
    int year;
    String mountname;
    String calc;
    Label label;
    TextField textbox2;
    String text;

    public void init() {
        textbox2 = new TextField(4);
        textbox2.addActionListener(new TextListener());
        textbox = new TextField(10);
        textbox.addActionListener(new TextListener());
        label = new Label("Vul het jaartal en maandnummer in:");
        add(label);
        add(textbox2);
        add(textbox);
        text = "";
    }

    public void paint(Graphics g) {
        g.drawString(" De maand "+ mountname +" van het jaar " + year +" heeft "+ days + " dagen." ,40,80);
        g.drawString(text, 70, 100 );
    }

    class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            month = Integer.valueOf(textbox.getText());
            switch (month){
                case 1:
                    mountname= "januari";
                    days = 31;
                    break;
                case 2:

                    calc = textbox2.getText();
                    year = Integer.parseInt(calc);
                    if ((year % 4 == 0 && !(year % 100 == 0)) ||
                            year % 400 == 0) {
                        mountname = "februari";
                        days = 29;
                    } else {
                        mountname = "februari";
                        days = 28;
                    }
                    break;
                case 3:
                    mountname = "maart";
                    days = 31;
                    break;
                case 4:
                    mountname = "april";
                    days = 30;
                    break;
                case 5:
                    mountname = "mei";
                    days = 31;
                    break;
                case 6:
                    mountname = "juni";
                    days = 30;
                    break;
                case 7:
                    mountname = "juli";
                    days = 31;
                    break;
                case 8:
                    mountname = "augustus";
                    days = 31;
                    break;
                case 9:
                    mountname = "september";
                    days = 30;
                    break;
                case 10:
                    mountname = "oktober";
                    days = 31;
                    break;
                case 11:
                    mountname = "november";
                    days = 30;
                    break;
                case 12:
                    mountname = "december";
                    days = 31;
                    break;
                default:
                    mountname = "0";
                    days = 0;
                    break;
            }
            repaint();
        }
    }
}
