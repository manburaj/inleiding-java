package h14;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class PracticeGame extends Applet {

    Button playButton;
    Button okButton;
    TextField textField;

    int number;
    int stones;
    boolean hasClicked;
    boolean gameHasStarted;
    boolean playersTurn;
    String state;

    Image image;
    URL pad;

    public void init() {
        playButton = new Button("Play again");
        playButton.addActionListener(new StartButtonListener());

        okButton = new Button("OK");
        okButton.addActionListener(new UpdateButtonListener());

        textField = new TextField("", 3);

        pad = Image.class.getResource("../Resources/");
        image = getImage(pad, "slime.png");

        add(textField);
        add(okButton);
        add(playButton);


    }

    public class StartButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            stones = 23;
            gameHasStarted = true;
            hasClicked = false;
            playersTurn = true;
            repaint();
        }
    }

    public class UpdateButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            UpdateGame();
        }}

    public void UpdateGame() {

        int input = 0;
        if (playersTurn) {
            input = Integer.valueOf(textField.getText());
        }
        textField.setText("");

        if (input >= 1 && input <= 3 && stones > 0 && stones >= input) {


            stones -= input;

            if (stones <= 1) {
                state = "You lost, HAHA!";
            }


            playersTurn = false;
            hasClicked = true;
            if (stones > 0) {

                if (stones % 4 == 0) {
                    stones -= 3;
                    number = 3;
                    if(stones < 1) {
                        state = "You won, congrats";
                        stones = 0;
                    }
                }

                else if (stones % 4 == 1) {
                    double random = Math.random();
                    int random2 = (int) (random * 3 + 1);
                    stones -= random2;
                    number = random2;
                    if(stones < 1) {
                        state = "You won, congrats";
                        stones = 0;
                    }
                }

                else if (stones % 4 == 2) {
                    stones -= 1;
                    number = 1;
                    if(stones < 1) {
                        state = "You won, congrats";
                        stones = 0;
                    }
                }

                else if (stones % 4 == 3) {
                    stones -= 2;
                    number = 2;
                    if(stones < 1) {
                        state = "You won, congrats";
                        stones = 0;
                    }
                }


            }


            playersTurn = true;
            repaint();

        }


    }

    public void paint(Graphics g) {
        int x = 60;
        int y = 60;
        if (gameHasStarted) {
            if (hasClicked) {
                g.drawString("I removed " + number + " stones", x, y);
                y += 20;
            }

            g.drawString("There are " + stones + " stones left", x, y);
            y += 20;
        }

        int x1 = 70;
        int y1 = 100;
        for (int i = 0; i < stones; i++) {
            g.drawImage(image, x1, y1, 30, 30, this);
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

        }


        if (stones <= 0 ) {
            g.drawString("" + state, x, y);
        }

    }
}