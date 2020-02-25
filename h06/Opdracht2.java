package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    double sec, uur, dag, jaar;

    public void init() {
        sec = 1;
        uur = 60*60;
        dag = (60*60)*24;
        jaar = (3600*24)*365;
    }
    public void paint(Graphics g) {
        g.drawString("uur = "+ 60*60 + "seconden",20,40);
        g.drawString("Berekening:60*60= 3600 seconden",30,55);
        g.drawString("dag = "+ (60*60)*24 + "seconden",20,80);
        g.drawString("Berekening:(60*60)*24=86400 seconden",30,95);
        g.drawString("jaar = "+ (3600*24)*365+ "seconden",20,130);
        g.drawString("Berekening:(3600*24)*365= 31536000 seconden" ,30,145);
    }
}
