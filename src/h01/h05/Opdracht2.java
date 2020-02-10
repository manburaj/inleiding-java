package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    //DECLARATIE.
    int gewichtValerie;
    int gewichtJeroen;
    int gewichtHans;
    int hoogteXas;

    public void init() {
        //INITIALISATIE.
        gewichtValerie = 40;
        gewichtJeroen = 100;
        gewichtHans = 80;
        hoogteXas = 250;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(60,30,60,hoogteXas);
        g.drawLine(60,hoogteXas,300,hoogteXas);

        //Gegevens van staven
        g.setColor(Color.red);
        //g.fillRect(61, gewichtValerie, 75, 30);
        g.fillRect(61, hoogteXas - 2* gewichtValerie, 75,2*gewichtValerie);

        g.setColor(Color.blue);
        //g.fillRect(136,gewichtJeroen,75,175);
        g.fillRect(136, hoogteXas - 2* gewichtJeroen, 75,2* gewichtJeroen);

        g.setColor(Color.orange);
        //g.fillRect(211,gewichtHans,75,140);
        g.fillRect(211, hoogteXas - 2* gewichtHans, 75, 2* gewichtHans);

        g.setColor(Color.black);
        g.drawString("Valerie", 76,262);

        g.setColor(Color.black);
        g.drawString("Jeroen",156,262);

        g.setColor(Color.black);
        g.drawString("Hans",231,262);

        g.setColor(Color.black);
        g.drawString("0",50,255);
        g.drawString("20",42,215);
        g.drawString("40", 42, 175);
        g.drawString("60",42,135);
        g.drawString("80",42,95);
        g.drawString("100",36,55);
    }
}
