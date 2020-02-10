package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {

    Button button;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Label label;

    int male;
    int female;
    int malestudents;
    int femalestudent;
    int total;

    public void init() {
        button = new Button("Male");
        button2= new Button("Female");
        button3 = new Button("Male students");
        button4 = new Button("Female Student");
        button5 = new Button("reset");
        button5.addActionListener(new ResetButtonListener());
        button4.addActionListener(new button4Listener());
        button3.addActionListener(new button3Listener());
        button2.addActionListener(new button2Listener());
        button.addActionListener(new buttonListener());
        total= male+malestudents+female+femalestudent;

        add(button);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
    }

    public void paint(Graphics g) {
        g.drawString("Total = " + total, 50, 270);
        g.drawString("Male = " + male, 50, 100);
        g.drawString("Female = " + female, 50, 130);
        g.drawString("Male Student = " + malestudents, 50, 160);
        g.drawString("Female student = " + femalestudent, 50, 190);
    }

    public void repaint() {
        super.repaint();
    }

    class buttonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            male++;
            total=male+female+malestudents+femalestudent;
            repaint();
        }
    }

    class button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            female++;
            total=male+female+malestudents+femalestudent;
            repaint();
        }
    }

    class button3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            malestudents++;
            total=male+female+malestudents+femalestudent;
            repaint();
        }
    }

    class button4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            femalestudent++;
            total=male+female+malestudents+femalestudent;
            repaint();
        }
    }

    class ResetButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            malestudents = 0;
            femalestudent = 0;
            male = 0;
            female = 0;
            total = 0;
            repaint();
        }
    }
}
