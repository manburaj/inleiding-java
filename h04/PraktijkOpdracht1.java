package h04;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht1 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);

        //LIJN
        g.drawLine(10, 30, 200, 30);
        g.drawString("Lijn",95,45);

        //RECHTHOEK
        g.drawRect(10,60,190,100);
        g.drawString("Rechthoek",80,175);

        //AFGERONDE RECHTHOEK
        g.drawRoundRect(10,190,190,100,30,30);
        g.drawString("Afgeronde rechthoek",50,305);

        //GEVULDE RECHTHOEK MET OVAAL
        g.setColor(Color.magenta);
        g.fillRect(220,60,190,100);
        g.setColor(Color.black);
        g.drawOval(220,60,190,100);
        g.drawString("Gevulde ovaal",275,175);

        //GEVULDE OVAAL
        g.setColor(Color.magenta);
        g.fillOval(220,190,190,100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",275,303);

        //TAARTPUNT MET OVAAL EROMHEEN
        g.fillArc(430,60,190,100,0,45);
        g.setColor(Color.black);
        g.drawOval(430,60,190,100);
        g.drawString("Taartpunt met ovaal eromheen",455,173);

        //CIRKEL
        g.drawOval(475,190,100,100);
        g.drawString("Cirkel",510,305);
    }
}
