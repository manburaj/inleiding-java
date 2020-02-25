package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    int gewichtValerie;
    int gewichtJoreon;
    int gewichtHans;
    int hoogteX;
    public void init() {
        gewichtValerie = 40;
        gewichtJoreon = 100;
        gewichtHans = 80;
        hoogteX = 250;

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawLine(49,49,49, hoogteX);
        g.drawLine(49,hoogteX,300,hoogteX);

        //Valerie
        g.setColor(Color.cyan);
        g.fillRect(50, hoogteX-2*gewichtValerie,80,2*gewichtValerie);
        g.setColor(Color.black);
        g.drawString("Valerie", 76,262);

        //Joreon
        g.setColor(Color.RED);
        g.fillRect(130, hoogteX-2*gewichtJoreon,80,2*gewichtJoreon);
        g.setColor(Color.black);
        g.drawString("Jeroen",156,262);

        //Hans
        g.setColor(Color.orange);
        g.fillRect(210, hoogteX-2*gewichtHans,80,2*gewichtHans);
        g.setColor(Color.black);
        g.drawString("Hans",231,262);

        //Schaal
        //SCHAALVERDELING//
        g.setColor(Color.black);
        g.setColor(Color.black);
        g.drawString("0",41,255);
        g.drawString("20",35,215);
        g.drawString("40", 35, 175);
        g.drawString("60",35,135);
        g.drawString("80",35,95);
        g.drawString("100",30,55);




    }
}
