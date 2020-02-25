package h14;



import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;


public class Game extends Applet {
    String state;
    URL url;

    Image img;
    Button reset;
    Button ok;
    TextField txt;


    int number;
    int smile;


    boolean click;
    boolean start;
    boolean player;

    public class reset implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            start = true;
            click = false;
            player = true;
            repaint();
        }
    }

    public class value implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            UpdateGame();
        }
    }

    public void UpdateGame(){
        int input = 0;
        if (player) {
            input = Integer.valueOf(txt.getText());
        }
        txt.setText("");

        if (input >= 1 && input <= 3 && smile > 0 && smile >= input) {


            smile -= input;

            if (smile <= 1) {
                state = "You lost, HAHA!";
            }


            player = false;
            click = true;
            if (smile > 0) {

                if (smile % 4 == 0) {
                    smile -= 3;
                    number = 3;
                    if(smile < 1) {
                        state = "You won, congrats";
                        smile = 0;
                    }
                }

                else if (smile % 4 == 1) {
                    double random = Math.random();
                    int random2 = (int) (random * 3 + 1);
                    smile -= random2;
                    number = random2;
                    if(smile < 1) {
                        state = "You won, congrats";
                        smile = 0;
                    }
                }

                else if (smile % 4 == 2) {
                    smile -= 1;
                    number = 1;
                    if(smile < 1) {
                        state = "You won, congrats";
                        smile = 0;
                    }
                }

                else if (smile % 4 == 3) {
                    smile -= 2;
                    number = 2;
                    if(smile < 1) {
                        state = "You won, congrats";
                        smile = 0;
                    }
                }


            }


            player = true;
            repaint();

        }

    }

    @Override
    public void init() {

        txt = new TextField("", 3);

        url = Game.class.getResource("../Resources/");
        img = getImage(url, "slime1.png");

        ok = new Button("ok");
        ok.addActionListener(new value());


        reset = new Button("reset");
        reset.addActionListener(new reset());

        add(txt);
        add(ok);
        add(reset);

        smile = 23;
        start = true;
        player = true;

    }


    @Override
    public void paint(Graphics g) {

        int x = 60;
        int y = 60;
        if (start) {
            if (click) {
                g.drawString("I removed " + number + " stones", x, y);
                y += 20;
            }

            g.drawString("There are " + smile + " stones left", x, y);
            y += 20;
        }

        int x1 = 70;
        int y1 = 100;
        for (int i = 0; i < 23; i++) {
            g.drawImage(img, x1, y1, 30, 30, this);
            x1 += 40;
            if (i == 6) {
                y1 += 40;
                x1 = 70;
            }
            if (i == 13) {
                y1 += 40;
                x1 = 70;
            }

            if (i == 20) {
                y1 += 40;
                x1 = 70;
            }


        //for (int i = 0; i < 23; i++) { //is used to mutliply the boxes
            //g.drawImage(img, 10 + (i * 3), 100, 30, 30, this);
        //}

        //g.drawImage(img, 50, 50, this);

    }



            player = true;
            repaint();

        }
    }



