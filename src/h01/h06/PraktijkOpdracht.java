package h06;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {
    double getalA;
    double getalB;
    double getalC;
    double gemiddelde;
    double gemiddelde2;
    int gemiddelde3;
    double afgerondGemiddelde;

    public void init() {
        getalA = 5.9;
        getalB = 6.3;
        getalC = 6.9;
        gemiddelde = (5.9+6.3+6.9)/3;
        gemiddelde2= gemiddelde*10;//gemiddelde met 10 vermenigvuldigen en daarna converteren naar een int
        gemiddelde2= (int)gemiddelde2; //int is the short form for integer
        gemiddelde3= (int) (gemiddelde2/10); //terugconverteren naar een double en door 10 delen.
        gemiddelde3= (int) afgerondGemiddelde;
        afgerondGemiddelde = (int)gemiddelde;
    }
    public void paint(Graphics g) {
        g.drawString( "Gemiddelde="+gemiddelde,20,40);
        g.drawString(" Het gemiddelde is="+(int)gemiddelde,20,60);
    }
}
