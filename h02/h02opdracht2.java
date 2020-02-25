package h02;

import java.applet.Applet;
import java.awt.*;

public class h02opdracht2 extends Applet {
    // VARIABELEN DECLAREREN

    String voornaam;
    String achternaam;
    public void init() {

        // VARIABELEN INITIALISEREN

        voornaam = "Madav";
        achternaam = "Anburaj";
        setSize(300,300);
        setBackground(Color.white);
    }

    public void paint(Graphics g) {

        // DINGEN IN BEELD BRENGEN
        g.setColor(Color.blue);
        g.drawString(voornaam, 20,20);
        g.setColor(Color.red);
        g.drawString(achternaam, 20,30);
    }
}

