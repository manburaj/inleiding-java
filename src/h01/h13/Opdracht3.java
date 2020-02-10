package h13;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {

    Button revealgreywall;
    Button revealredwall;
    Boolean click1, click2;

    public void init() {
        revealgreywall = new Button("Grey wall");
        revealgreywall.addActionListener(new ButtonListener1());
        revealredwall = new Button("Red wall");
        revealredwall.addActionListener(new ButtonListener2());
        add(revealgreywall);
        add(revealredwall);
        click1 = false;
        click2 = false;
    }

    public void paint(Graphics g) {
        if (click1) {
            greyWall(g);
        }
        else if (click2) {
            redWall(g);
        }
    }

    class ButtonListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            click2 = true;
            repaint();
        }
    }

    class ButtonListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            click1 = true;
            repaint();
        }
    }
    void redWall(Graphics g) {
        Color redGrey = Color.decode("#c4bebe");
        g.setColor(redGrey);
        g.drawRect(25, 35, 300, 150);

        int x, y, width, height;
        x = 25;
        y = 10;
        width = 50;
        height = 25;

        Color red = Color.decode("#750000");
        g.setColor(red);
        g.fillRect(x, 35, 300, 150);

        for (int i = 0; i < 3; i++) {
            x = 50;
            y += 25;
            for (int row = 0; row < 5; row++) {
                g.setColor(redGrey);
                g.drawRect(x, y, width, height);
                x += 50;
            }
            x = 25;
            y += 25;
            for (int column = 0; column < 6; column++) {
                g.setColor(redGrey);
                g.drawRect(x, y, width, height);
                x += 50;
            }
        }
        click1 = false;
    }
    void greyWall(Graphics g) {
        int x, y, width, height;
        x = 25;
        y = 25;
        width = 100;
        height = 25;
        g.setColor(Color.black);
        g.drawRect(20,50,500,150);
        g.setColor(Color.gray);
        g.fillRect(20,50,500,150);

        for (int i = 0; i < 3; i++) {
            x = 20;
            y += 25;
            for (int row = 0; row < 5; row++) {
                g.drawRect(x, y, width, height);
                g.setColor(Color.black);
                x += 100;
            }
            x = 20;
            y += 25;
            for (int column = 0; column < 5; column++) {
                g.drawRect(x, y, width, height);
                g.setColor(Color.black);
                x += 100;
            }
        }
        click2 = false;
    }
}
