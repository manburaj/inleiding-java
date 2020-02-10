package h02;

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {

    // VARIABELEN DECLAREREN
    String voornaam;

    public void init() {

        // VARIABELEN INITIALISEREN

        voornaam = "Madav";
        setSize(400,400);
        setBackground(Color.blue);
    }


    public void paint(Graphics g) {

        // DINGEN IN BEELD BRENGEN
        g.setColor(Color.yellow);
        g.drawString(voornaam,20,20);
    }
}