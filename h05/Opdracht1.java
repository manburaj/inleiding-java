package h05;

import java.applet.Applet;
import java.awt.*;


public class Opdracht1 extends Applet {
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;
    int hoogte2;
    int breedte2;

    public void init() {
        //initialisatie.
        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        breedte = 190;
        hoogte = 100;
        hoogte2 = 100;
        breedte2 = 100;
    }

    public void paint(Graphics g) {
        //teken lijn
        setBackground(Color.white);
        g.setColor(lijnkleur);
        //LIJN
        g.drawLine(10, 30,200,30);
        g.drawString("Lijn",95,45);

        //RECHTHOEK
        g.drawRect(10,60,breedte,hoogte);
        g.drawString("Rechthoek",80,175);

        //AFGERONDE RECHTHOEK
        g.drawRoundRect(10,190,breedte,hoogte,30,30);
        g.drawString("Afgeronde rechthoek",50,305);

        //GEVULDE RECHTHOEK MET OVAAL
        g.setColor(opvulkleur);
        g.fillRect(220,60,breedte,hoogte);
        g.setColor(Color.black);
        g.drawOval(220,60,breedte,hoogte);
        g.drawString("Gevulde ovaal",275,175);

        //GEVULDE OVAAL
        g.setColor(opvulkleur);
        g.fillOval(220,190,breedte,hoogte);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",275,303);

        //TAARTPUNT MET OVAAL EROMHEEN
        g.setColor(opvulkleur);
        g.fillArc(430,60,breedte,hoogte,0,45);

        g.setColor(lijnkleur);
        g.drawOval(430,60,breedte,hoogte);
        g.drawString("Taartpunt met ovaal eromheen",455,173);

        //CIRKEL
        g.drawOval(475,190,breedte2,hoogte2);
        g.drawString("Cirkel",510,305);
    }
}
