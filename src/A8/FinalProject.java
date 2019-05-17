package A8;

import Practice.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.Timer;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vuksj2164
 */
public class FinalProject extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 1200;
    static final int HEIGHT = 800;

    //Title of the window
    String title = "My Game";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));

    int[] highscores = new int[3];
    String[] highscoreNames = new String[3];

    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    int random2 = (int) (Math.random() * 600 - 100);
    int random = (int) (Math.random() * 1400 + 650);
    boolean down = false;
    boolean up = false;
    boolean left = false;
    boolean right = false;
    boolean space = false;
    boolean shoot = false;
    boolean enter = false;
    boolean spark1 = false;
    boolean spark2 = false;
    boolean spark3 = false;
    boolean spark4 = false;
    boolean spark5 = false;
    boolean spark6 = false;
    boolean spark7 = false;
    boolean spark8 = false;
    boolean deadBomb1 = true;
    boolean deadBomb2 = true;
    boolean deadPlayer = true;
    boolean intro = true;
    boolean timer = true;
    boolean scoreChecker = true;
    int score = 0;
    int p = 0;
    int x = 0;
    int y = 0;
    int inc = 595 + y;
    int inc2 = 0;
    int fire = 0;
    int fire2 = 0;
    int check = 0;
    int sparks = 0;
    long millis = System.currentTimeMillis();
    long time = millis;
    int respawnbomb1 = 0;
    int respawnbomb2 = 0;
    int deathline = (int) (Math.random() * 6);
    JFrame frame = new JFrame("FrameDemo");
//to do list  2. spinner enemy 3. homing enemy 4. back and forth friing enemy 7. add high score board 8. title screen 9. super weapon 10. if time permits add items
    Font gameOverFont = new Font("Copperplate Gothic Bold", Font.BOLD, 82);
    Font gameOverLine = new Font("Copperplate Gothic Bold", Font.BOLD, 30);
    Font titleScreen = new Font("Copperplate Gothic Bold", Font.BOLD, 120);
    Font points = new Font("Franklin Gothic Demi Cond", Font.BOLD, 30);

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public FinalProject() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);

        // Set things up for the game at startup
        preSetup();

        // Start the game loop
        gameTimer = new Timer(desiredTime, this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        if (intro){
            deadBomb1 = true;
            deadBomb2 = true;
            g.setColor(Color.black);
            g.fillRect(0, 0, 1200, 800);
            Color words = new Color(51, 64, 183);
            g.setColor(words);
            g.setFont(titleScreen);
            g.drawString("Zone Zero", 200,350);
            g.setColor(Color.RED);
            g.fill3DRect(300, 500, 150, 80, up);
            g.setColor(Color.RED);
            g.fill3DRect(700, 500, 150, 80, up);
            g.setColor(words);
            g.setFont(gameOverLine);
            g.drawString("Start", 320,550);
            g.drawString("High", 730,535);
            g.drawString("Scores", 710,565);
           // g.setFont(gameOverLine);
         //   g.drawString("Press Enter to Start", 380,500);
            int[] xPoints = {0, 50, 250};
            int[] yPoints = {800, 800, 400};
            g.fillPolygon(xPoints, yPoints, 3);
            int[] xPoints2 = {1200, 1150, 950};
            int[] yPoints2 = {800, 800, 400};
            g.fillPolygon(xPoints2, yPoints2, 3);
            int[] xPoints3 = {75, 125, 280};
            int[] yPoints3 = {800, 800, 400};
            g.fillPolygon(xPoints3, yPoints3, 3);
            int[] xPoints4 = {1125, 1075, 920};
            int[] yPoints4 = {800, 800, 400};
            g.fillPolygon(xPoints4, yPoints4, 3);
            int[] xPoints5 = {-75, -25, 220};
            int[] yPoints5 = {800, 800, 400};
            g.fillPolygon(xPoints5, yPoints5, 3);
            int[] xPoints6 = {1275, 1225, 980};
            int[] yPoints6 = {800, 800, 400};
            g.fillPolygon(xPoints6, yPoints6, 3);
        }
        if (deadPlayer && intro == false) {
            deadBomb1 = true;
            deadBomb2 = true;
            x = 0;
            y = 0;
            g.setColor(Color.black);
            g.fillRect(0, 0, 1200, 800);
            g.setColor(Color.white);
            g.setFont(gameOverFont);
            g.drawString("GAME OVER", 250, 400);
            g.setFont(gameOverLine);
            if (deathline == 0) {
                g.drawString("My 3 Year Old cousin did better Than You", 180, 450);
            }
            if (deathline == 1) {
                g.drawString("Try Shooting", 420, 450);
            }
            if (deathline == 2) {
                g.drawString("Hint: Don't Die", 400, 450);
            }
            if (deathline == 3) {
                g.drawString("You're The Best ... At Dying", 300, 450);
            }
            if (deathline == 4) {
                g.drawString("Congratulations, You Are Better Than 0% Of Players", 100, 450);
            }
            if (deathline == 5) {
                g.drawString("I Expected you to fail, but not this early", 180, 450);
            }
            g.drawString("Press \"Enter\" To Play Again", 280, 550);
            if (enter) {
                deadPlayer = false;
                score = 0;
            }
        }
        //draw ship
        if (deadPlayer == false) {
            deathline = (int) (Math.random() * 6);
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, 1200, 800);
            Color star = new Color(224, 224, 224, 60);
            g.setColor(star);
            g.fillRect(435, 324, 8, 8);
            g.fillRect(245, 769, 8, 8);
            g.fillRect(900, 723, 8, 8);
            g.fillRect(276, 101, 8, 8);
            g.fillRect(73, 407, 8, 8);
            //the god of death
            g.fillRect(887, 77, 8, 8);
            g.fillRect(907, 467, 8, 8);
            Color closeStar = new Color(224, 224, 234, 80);
            g.setColor(closeStar);
            g.fillRect(536, 524, 10, 10);
            g.fillRect(1002, 214, 8, 8);
            g.fillRect(700, 210, 9, 10);
            Color glass = new Color(137, 30, 143,150);
            g.setColor(Color.white);
            g.setFont(points);
            g.drawString("" + score, 15, 40);
            g.setColor(glass);
            g.fillOval(575 + x, 575 + y, 50, 50);
            g.setColor(Color.DARK_GRAY);
            g.fillRect(575 + x, 650 + y, 50, 50);
            g.setColor(Color.darkGray);
            g.fillRect(545 + x, 595 + y, 8, 80);
            g.fillRect(648 + x, 595 + y, 8, 80);
            g.fillRect(562 + x, 580 + y, 8, 70);
            g.fillRect(630 + x, 580 + y, 8, 70);
            g.setColor(Color.GRAY);
            g.fillRect(575 + x, 600 + y, 50, 70);
            int[] xPoints = {575 + x, 575 + x, 540 + x};
            int[] yPoints = {630 + y, 670 + y, 680 + y};
            g.fillPolygon(xPoints, yPoints, 3);
            int[] xPoints2 = {625 + x, 625 + x, 660 + x};
            int[] yPoints2 = {630 + y, 670 + y, 680 + y};
            g.fillPolygon(xPoints2, yPoints2, 3);
        }
        //check is space is pressed 
        if (space && deadPlayer == false) {
            shoot = true;
        }
        //seperate lazer from ship
        if (shoot) {
            if (p == 0) {
                p = x;
            }
            g.setColor(Color.RED);
            //shoot lazers
            if (shoot) {
                if (inc >= -40) {
                    g.fillRect(545 + p, inc - 32, 8, 32);
                    g.fillRect(648 + p, inc - 32, 8, 32);
                    inc -= 40;
                    time = System.currentTimeMillis();
                    //reset lazer
                    if (inc < -40) {
                        p = 0;
                        inc = 600 + y;
                        shoot = false;
                    }
                }
            }
        }

        //create dive bomb enemy 1
        if (fire < 800 && deadBomb1 == false) {
            g.setColor(Color.DARK_GRAY);
            g.fillRect(110 + random, 10 + fire, 30, 10);
            g.setColor(Color.CYAN);
            int[] xPoints3 = {100 + random, 125 + random, 150 + random};
            int[] yPoints3 = {20 + fire, 35 + fire, 20 + fire};
            g.fillPolygon(xPoints3, yPoints3, 3);
            g.setColor(Color.ORANGE);
            int[] xPoints4 = {110 + random, 125 + random, 140 + random};
            int[] yPoints4 = {10 + fire, 0 + fire, 10 + fire};
            check = sparks % 2;
            //create fire out back of ship
            if (check == 0) {
                spark1 = true;
            }
            check = sparks % 5;
            if (check == 0) {
                spark2 = true;
            }
            check = sparks % 3;
            if (check == 0) {
                spark3 = true;
            }
            check = sparks % 15;
            if (check == 0) {
                spark4 = true;
            }
            check = sparks % 4;
            if (check == 0) {
                spark5 = true;
            }
            check = sparks % 6;
            if (check == 0) {
                spark6 = true;
            }
            check = sparks % 20;
            if (check == 0) {
                spark7 = true;
            }
            check = sparks % 7;
            if (check == 0) {
                spark8 = true;
            }
            if (spark1) {
                g.fillRect(112 + random, 0 + fire, 10, 8);
            }
            if (spark2) {
                g.fillRect(133 + random, 0 + fire, 9, 11);
            }
            if (spark3) {
                g.fillRect(123 + random, -3 + fire, 13, 7);
            }
            if (spark4) {
                g.fillRect(119 + random, -1 + fire, 6, 8);
            }
            if (spark5) {
                g.fillRect(115 + random, -4 + fire, 10, 8);
            }
            if (spark6) {
                g.fillRect(127 + random, -4 + fire, 7, 9);
            }
            if (spark7) {
                g.fillRect(118 + random, -7 + fire, 11, 11);
            }
            if (spark8) {
                g.fillRect(117 + random, -5 + fire, 14, 12);
            }
            g.fillPolygon(xPoints4, yPoints4, 3);
            fire += 6;
            //turn off fire
            spark1 = false;
            spark2 = false;
            spark3 = false;
            spark4 = false;
            spark5 = false;
            spark6 = false;
            spark7 = false;
            spark8 = false;
            sparks++;
        } else {
            random = (int) (Math.random() * 1400 + 650);
            fire = 0;
        }

        //create dive bomb enemy 2
        if (fire2 < 800 && deadBomb2 == false) {
            g.setColor(Color.DARK_GRAY);
            g.fillRect(110 + random2, 10 + fire2, 30, 10);
            g.setColor(Color.CYAN);
            int[] xPoints3 = {100 + random2, 125 + random2, 150 + random2};
            int[] yPoints3 = {20 + fire2, 35 + fire2, 20 + fire2};
            g.fillPolygon(xPoints3, yPoints3, 3);
            g.setColor(Color.ORANGE);
            int[] xPoints4 = {110 + random2, 125 + random2, 140 + random2};
            int[] yPoints4 = {10 + fire2, 0 + fire2, 10 + fire2};
            check = sparks % 2;
            //create fire out back of ship
            if (check == 0) {
                spark1 = true;
            }
            check = sparks % 5;
            if (check == 0) {
                spark2 = true;
            }
            check = sparks % 3;
            if (check == 0) {
                spark3 = true;
            }
            check = sparks % 15;
            if (check == 0) {
                spark4 = true;
            }
            check = sparks % 4;
            if (check == 0) {
                spark5 = true;
            }
            check = sparks % 6;
            if (check == 0) {
                spark6 = true;
            }
            check = sparks % 20;
            if (check == 0) {
                spark7 = true;
            }
            check = sparks % 7;
            if (check == 0) {
                spark8 = true;
            }
            if (spark1) {
                g.fillRect(112 + random2, 0 + fire2, 10, 8);
            }
            if (spark2) {
                g.fillRect(133 + random2, 0 + fire2, 9, 11);
            }
            if (spark3) {
                g.fillRect(123 + random2, -3 + fire2, 13, 7);
            }
            if (spark4) {
                g.fillRect(119 + random2, -1 + fire2, 6, 8);
            }
            if (spark5) {
                g.fillRect(115 + random2, -4 + fire2, 10, 8);
            }
            if (spark6) {
                g.fillRect(127 + random2, -4 + fire2, 7, 9);
            }
            if (spark7) {
                g.fillRect(118 + random2, -7 + fire2, 11, 11);
            }
            if (spark8) {
                g.fillRect(117 + random2, -5 + fire2, 14, 12);
            }
            g.fillPolygon(xPoints4, yPoints4, 3);
            fire2 += 6;
            //turn off fire
            spark1 = false;
            spark2 = false;
            spark3 = false;
            spark4 = false;
            spark5 = false;
            spark6 = false;
            spark7 = false;
            spark8 = false;
            sparks++;
        } //reset bomb enemies
        else {
            random2 = (int) (Math.random() * 600 - 100);
            fire2 = 0;
        }

        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
if (deadPlayer){
    loadHighScores();
            if (score > highscores[2]) {
                if (score > highscores[1]) {
                    if (score > highscores[0]) {
                        highscores[0] = score;
                        String inputValue = JOptionPane.showInputDialog("You set a new local highscore congratulations on sucking a little less, Please enter your initials");
                        highscoreNames[0] = inputValue;
                    }
                    highscores[1] = score;
                    String inputValue = JOptionPane.showInputDialog("You set a new local highscore congratulations on sucking a little less, Please enter your initials");
                    highscoreNames[1] = inputValue;
                }
                highscores[2] = score;
                String inputValue = JOptionPane.showInputDialog("You set a new local highscore congratulations on sucking a little less, Please enter your initials");
                highscoreNames[2] = inputValue;
            }
            writeHighScore();
}
        if (deadBomb1 == true) {
            fire = 0;
            respawnbomb1++;
            random = 50000;
        }
        if (deadBomb2 == true) {
            fire2 = 0;
            respawnbomb2++;
            random2 = 50000;
        }
        if (respawnbomb1 == 100) {
            deadBomb1 = false;
            respawnbomb1 = 0;
        }
        if (respawnbomb2 == 100) {
            deadBomb2 = false;
            respawnbomb2 = 0;
        }
        if (timer == false) {
            millis = System.currentTimeMillis();
        }
        if (millis - time >= 250) {
            timer = true;
        }
        //make ship go down
        if (down) {
            if (y < 100) {
                y += 10;
            }
        }
        //make ship go up
        if (up) {
            if (y > -580) {
                y -= 10;
            }
        }
        //make ship go left
        if (left) {
            if (x > -540) {
                x -= 10;
            }
        }
        //make ship go right
        if (right) {
            if (x < 540) {
                x += 10;
            }
        }
//hit detection for enemy 1 and 2
        if (100 + random <= 545 + p && 150 + random >= 545 + p && -28 + fire <= inc - 32 && 40 + fire >= inc - 32 && shoot == true) {
            deadBomb1 = true;
            score += 50;
        }
        if (100 + random <= 648 + p && 150 + random >= 648 + p && -28 + fire <= inc - 32 && 40 + fire >= inc - 32 && shoot == true) {
            deadBomb1 = true;
            score += 50;
        }
        if (100 + random2 <= 545 + p && 150 + random2 >= 545 + p && -28 + fire2 <= inc - 32 && 40 + fire2 >= inc - 32 && shoot == true) {
            deadBomb2 = true;
            score += 50;
        }
        if (100 + random2 <= 648 + p && 150 + random2 >= 648 + p && -28 + fire2 <= inc - 32 && 40 + fire2 >= inc - 32 && shoot == true) {
            deadBomb2 = true;
            score += 50;
        }
        if (100 + random <= 553 + p && 150 + random >= 553 + p && -28 + fire <= inc - 32 && 40 + fire >= inc - 32 && shoot == true) {
            deadBomb1 = true;
            score += 50;
        }
        if (100 + random <= 656 + p && 150 + random >= 656 + p && -28 + fire <= inc - 32 && 40 + fire >= inc - 32 && shoot == true) {
            deadBomb1 = true;
            score += 50;
        }
        if (100 + random2 <= 553 + p && 150 + random2 >= 553 + p && -28 + fire2 <= inc - 32 && 40 + fire2 >= inc - 32 && shoot == true) {
            deadBomb2 = true;
            score += 50;
        }
        if (100 + random2 <= 656 + p && 150 + random2 >= 656 + p && -28 + fire2 <= inc - 32 && 40 + fire2 >= inc - 32 && shoot == true) {
            deadBomb2 = true;
            score += 50;
        }
        //add hit box on you
        if (540 + x <= 100 + random && 660 + x >= 100 + random && 575 + y <= 35 + fire && 680 + y >= 35 + fire) {
            deadPlayer = true;
        }
        if (540 + x <= 150 + random && 660 + x >= 150 + random && 575 + y <= 35 + fire && 680 + y >= 35 + fire) {
            deadPlayer = true;
        }
        if (540 + x <= 100 + random2 && 660 + x >= 100 + random2 && 575 + y <= 35 + fire2 && 680 + y >= 35 + fire2) {
            deadPlayer = true;
        }
        if (540 + x <= 150 + random2 && 660 + x >= 150 + random2 && 575 + y <= 35 + fire2 && 680 + y >= 35 + fire2) {
            deadPlayer = true;
        }

    }
    //540 + x to 660 + x and 575 + y to 680 + y

    public void writeHighScore() {
        try {
            PrintWriter output = new PrintWriter(new File("highscore"));
            for (int i = 0; i < highscores.length; i++) {
                output.println(highscoreNames[i] + " " + highscores[i]);
            }
            output.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FinalProject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadHighScores() {
        try {
            Scanner input = new Scanner(new File("highscore"));
            for (int i = 0; i < highscores.length; i++) {
                highscoreNames[i] = input.next();
                highscores[i] = input.nextInt();
                input.nextLine();
            }
            input.close();
        } catch (Exception e) {

        }
    }

    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {

        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {

        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {

        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
      Point p = MouseInfo.getPointerInfo().getLocation();
      int mouseX = p.x;
      int mouseY = p.y;
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_DOWN) {
                down = true;
            }
            if (key == KeyEvent.VK_UP) {
                up = true;
            }
            if (key == KeyEvent.VK_LEFT) {
                left = true;
            }
            if (key == KeyEvent.VK_RIGHT) {
                right = true;
            }
            if (deadPlayer == true) {
                if (key == KeyEvent.VK_ENTER) {
                    enter = true;
                }
            }
            if (key == KeyEvent.VK_SPACE) {
                if (timer) {
                    space = true;
                }
                timer = false;

            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_DOWN) {
                down = false;
            }
            if (key == KeyEvent.VK_UP) {
                up = false;
            }
            if (key == KeyEvent.VK_LEFT) {
                left = false;
            }
            if (key == KeyEvent.VK_RIGHT) {
                right = false;
            }
            if (key == KeyEvent.VK_SPACE) {
                space = false;
            }
            if (key == KeyEvent.VK_ENTER) {
                enter = false;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        gameLoop();

        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        FinalProject game = new FinalProject();
    }
}
