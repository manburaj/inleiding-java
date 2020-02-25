package h08;

import java.applet.Applet;
import java.awt.*;



public class test extends Applet {
    TextField tekstvak;
    Label Label;


    public void init() {
        tekstvak = new TextField("Klik op mij", 20);
        add(tekstvak);
        Label = new Label("type");
        add(Label);
    }

    public void paint(Graphics g) {
        g.drawString("Type iets in het tekstvakje", 50, 60 );
    }
}
