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

    int[] highscores = new int[5];
    String[] highscoreNames = new String[5];

    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    int random3 = (int) (Math.random() * 800 + 450);
    int random2 = (int) (Math.random() * 400 - 50);
    int random = (int) (Math.random() * 1400 + 850);
    boolean down = false;
    boolean up = false;
    boolean left = false;
    boolean right = false;
    boolean space = false;
    boolean shoot = false;
    boolean enter = false;
    boolean spark1 = false;
    boolean led = false;
    boolean spark2 = false;
    boolean spark3 = false;
    boolean spark4 = false;
    boolean spark5 = false;
    boolean spark6 = false;
    boolean spark7 = false;
    boolean spark8 = false;
    boolean deadBomb1 = true;
    boolean deadBomb2 = true;
    boolean deadBomb3 = true;
    boolean deadPlayer = false;
    boolean intro = true;
    boolean timer = true;
    boolean scoreChecker = true;
    boolean click = false;
    boolean leaderBoard = false;
    boolean fool = true;
    boolean zed = false;
    boolean layzor = false;
    boolean help = false;
    boolean sColour = false;
    boolean credits = false;
    boolean escape = false;
    boolean BP = true;
    boolean BP2 = true;
    boolean BP3 = true;
    boolean death = true;
    boolean death2 = true;
    boolean death3 = true;
    int secret = 0;
    int health1 = 0;
    int health2 = 0;
    int health3 = 0;
    int score = 0;
    int p = 0;
    int x = 0;
    int y = 0;
    int inc = 595 + y;
    int inc2 = 0;
    int fire = 0;
    int fire2 = 0;
    int fire3 = 0;
    int check = 0;
    int sparks = 0;
    int superWeapon = 1;
    int counter = 0;
    long millis = System.currentTimeMillis();
    long time = millis;
    int respawnBomb1 = 0;
    int respawnBomb2 = 0;
    int respawnBomb3 = 0;
    boolean issues = true;
    boolean issues2 = true;
    boolean issues3 = true;
    int deathline = (int) (Math.random() * 6);
    JFrame frame = new JFrame("FrameDemo");
//to do list  2. spinner enemy 3. homing enemy 4. back and forth friing enemy  5. if time permits add items
    Font gameOverFont = new Font("Copperplate Gothic Bold", Font.BOLD, 82);
    Font gameOverLine = new Font("Copperplate Gothic Bold", Font.BOLD, 30);
    Font titleScreen = new Font("Copperplate Gothic Bold", Font.BOLD, 120);
    Font points = new Font("Franklin Gothic Demi Cond", Font.BOLD, 30);
    Font symbol = new Font("ESRI Enviro Hazard Analysis", Font.BOLD, 30);
    Color words = new Color(51, 64, 183);
    Color glass = new Color(137, 30, 143);
    Color superSaiyan = new Color(255, 238, 0);

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
        //game over screen 
        if (deadPlayer) {
            //set everything dead
            deadBomb1 = true;
            deadBomb2 = true;
            deadBomb3 = true;
            x = 0;
            y = 0;
            //draw game over screen
            g.setColor(Color.black);
            g.fillRect(0, 0, 1200, 800);
            g.setColor(Color.white);
            g.setFont(gameOverFont);
            g.drawString("GAME OVER", 280, 350);
            g.setFont(gameOverLine);
            //death taglines 
            if (deathline == 0) {
                g.drawString("My 3 Year Old cousin did better Than You", 220, 400);
            }
            if (deathline == 1) {
                g.drawString("Try Shooting", 450, 400);
            }
            if (deathline == 2) {
                g.drawString("Hint: Don't Die", 450, 400);
            }
            if (deathline == 3) {
                g.drawString("You're The Best ... At Dying", 340, 400);
            }
            if (deathline == 4) {
                g.drawString("Congratulations, You Are Better Than 0% Of Players", 130, 400);
            }
            if (deathline == 5) {
                g.drawString("I Expected you to fail, but not this early", 220, 400);
            }
            //play again
            g.drawString("Press \"Enter\" To Play Again", 330, 500);
            if (enter) {
                deadPlayer = false;
                score = -400;
            }
            //return to main menu
            g.drawString("Press \"Escape\" To Return To Menu", 280, 550);
            if (escape) {
                intro = true;
                score = -400;
            }
        }
        //draw ship
        if (deadPlayer == false) {
            fool = true;
            //reset deathline
            deathline = (int) (Math.random() * 6);
            //draw sbackground
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, 1200, 800);
            Color star = new Color(224, 224, 224, 60);
            //draw the stars
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
            //show points
            g.setColor(Color.white);
            g.setFont(points);
            g.drawString("" + score, 15, 40);
            g.setColor(glass);
            //secret colour
            if (sColour) {
                g.setColor(superSaiyan);
            }
            //draw spaceship
            g.fillOval(575 + x, 575 + y, 50, 50);
            g.setColor(Color.DARK_GRAY);
            if (sColour) {
                g.setColor(superSaiyan);
            }
            g.fillRect(575 + x, 650 + y, 50, 50);
            g.setColor(Color.darkGray);
            if (sColour) {
                g.setColor(superSaiyan);
            }
            g.fillRect(545 + x, 595 + y, 8, 80);
            g.fillRect(648 + x, 595 + y, 8, 80);
            g.fillRect(562 + x, 580 + y, 8, 70);
            g.fillRect(630 + x, 580 + y, 8, 70);
            g.setColor(Color.GRAY);
            if (sColour) {
                g.setColor(superSaiyan);
            }
            g.fillRect(575 + x, 600 + y, 50, 70);
            int[] xPoints = {575 + x, 575 + x, 540 + x};
            int[] yPoints = {630 + y, 670 + y, 680 + y};
            g.fillPolygon(xPoints, yPoints, 3);
            int[] xPoints2 = {625 + x, 625 + x, 660 + x};
            int[] yPoints2 = {630 + y, 670 + y, 680 + y};
            g.fillPolygon(xPoints2, yPoints2, 3);
        }
        //super weapon recharge
        if ((score / 2000) >= superWeapon && deadPlayer == false) {
            layzor = true;
        }
        //superweapon stuff
        if (layzor && deadPlayer == false) {
            g.setFont(symbol);
            g.setColor(glass);
            g.drawString("_", 585 + x, 660 + y);
            if (sColour) {
                g.setColor(superSaiyan);
            }
            //fire the superweapon
            if (zed) {
                g.fillRect(575 + x, -400 + y, 50, 1000);
                counter++;
                if (counter == 200) {
                    zed = false;
                    counter = 0;
                    layzor = false;
                    superWeapon++;
                }
            }
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
            if (sColour) {
                g.setColor(superSaiyan);
            }
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
                        BP = true;
                        BP2 = true;
                        BP3 = true;
                    }
                }
            }
        }

        //create dive bomb enemy 1
        if (fire < 800 && deadBomb1 == false) {
            g.setColor(Color.DARK_GRAY);
            g.fillRect(110 + random, 10 + fire, 30, 10);
            g.setColor(Color.CYAN);
            if(score > 1000 && death){
                g.setColor(Color.GREEN);
                health1 = 1;
                
            }
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
            if (health3 == 1){
                fire += 2;
            }
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
            random = (int) (Math.random() * 1400 + 850);
            fire = 0;
            death = true;
        }

        //create dive bomb enemy 2
        if (fire2 < 800 && deadBomb2 == false) {
            g.setColor(Color.DARK_GRAY);
            g.fillRect(110 + random2, 10 + fire2, 30, 10);
            g.setColor(Color.CYAN);
            if(score > 1000 && death2){
                g.setColor(Color.GREEN);
                health2 = 1;
            }
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
            if (health2 == 1){
                fire2 += 2;
            }
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
            random2 = (int) (Math.random() * 400 - 50);
            fire2 = 0;
            death2 = true;
        }
        //create dive bomb enemy 3
        if (fire3 < 800 && deadBomb3 == false) {
            g.setColor(Color.DARK_GRAY);
            g.fillRect(110 + random3, 10 + fire3, 30, 10);
            g.setColor(Color.CYAN);
            if(score > 1000 && death3){
                g.setColor(Color.GREEN);
                health3 = 1;
            }
            int[] xPoints3 = {100 + random3, 125 + random3, 150 + random3};
            int[] yPoints3 = {20 + fire3, 35 + fire3, 20 + fire3};
            g.fillPolygon(xPoints3, yPoints3, 3);
            g.setColor(Color.ORANGE);
            int[] xPoints4 = {110 + random3, 125 + random3, 140 + random3};
            int[] yPoints4 = {10 + fire3, 0 + fire3, 10 + fire3};
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
                g.fillRect(112 + random3, 0 + fire3, 10, 8);
            }
            if (spark2) {
                g.fillRect(133 + random3, 0 + fire3, 9, 11);
            }
            if (spark3) {
                g.fillRect(123 + random3, -3 + fire3, 13, 7);
            }
            if (spark4) {
                g.fillRect(119 + random3, -1 + fire3, 6, 8);
            }
            if (spark5) {
                g.fillRect(115 + random3, -4 + fire3, 10, 8);
            }
            if (spark6) {
                g.fillRect(127 + random3, -4 + fire3, 7, 9);
            }
            if (spark7) {
                g.fillRect(118 + random3, -7 + fire3, 11, 11);
            }
            if (spark8) {
                g.fillRect(117 + random3, -5 + fire3, 14, 12);
            }
            g.fillPolygon(xPoints4, yPoints4, 3);
            if (health3 == 1){
                fire3 += 2;
            }
            fire3 += 6;
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
            random3 = (int) (Math.random() * 800 + 450);
            fire3 = 0;
            death3 = true;
        }
        //title screen 
        if (intro) {
            deadBomb1 = true;
            deadBomb2 = true;
            deadBomb3 = true;
            g.setColor(Color.black);
            g.fillRect(0, 0, 1200, 800);
            g.setColor(words);
            g.setFont(titleScreen);
            g.drawString("Zone Zero", 200, 350);
            g.setColor(Color.RED);
            g.fill3DRect(300, 500, 150, 80, up);
            g.fill3DRect(700, 500, 150, 80, up);
            g.fill3DRect(700, 600, 150, 80, up);
            g.fill3DRect(300, 600, 150, 80, up);
            g.setColor(words);
            g.setFont(gameOverLine);
            g.drawString("Start", 320, 550);
            g.drawString("High", 730, 535);
            g.drawString("Scores", 710, 565);
            g.drawString("Help", 330, 650);
            g.drawString("Credits", 705, 650);
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
        //leaderboard screen
        if (leaderBoard) {
            loadHighScores();
            g.setColor(Color.black);
            g.fillRect(0, 0, 1200, 800);
            g.setColor(Color.white);
            g.setFont(gameOverFont);
            g.drawString("Leaderboard", 270, 200);
            g.setFont(gameOverLine);
            g.drawString("" + highscoreNames[0], 270, 300);
            g.drawString("" + highscoreNames[1], 270, 350);
            g.drawString("" + highscoreNames[2], 270, 400);
            g.drawString("" + highscoreNames[3], 270, 450);
            g.drawString("" + highscoreNames[4], 270, 500);
            g.drawString("" + highscores[0], 850, 300);
            g.drawString("" + highscores[1], 850, 350);
            g.drawString("" + highscores[2], 850, 400);
            g.drawString("" + highscores[3], 850, 450);
            g.drawString("" + highscores[4], 850, 500);
            g.setColor(Color.RED);
            g.fill3DRect(550, 600, 150, 80, up);
            g.setColor(words);
            g.drawString("Return", 555, 650);
            //finish
            if (secret >= 200) {
                g.setFont(gameOverLine);
                g.setColor(Color.white);
                g.drawString("Great job, Now get it to 1000.", 50, 750);
                g.drawString("L Counter: " + secret, 650, 750);
                if (secret == 1000) {
                    leaderBoard = false;
                    intro = false;
                    deadBomb1 = false;
                    deadBomb2 = false;
                    deadPlayer = false;
                    sColour = true;
                }
            }
        }
        //help screen
        if (help) {
            g.setColor(Color.black);
            g.fillRect(0, 0, 1200, 800);
            g.setColor(Color.white);
            g.setFont(gameOverFont);
            g.drawString("Help", 470, 150);
            g.setFont(gameOverLine);
            g.drawString("Use the arrow keys to move", 320, 220);
            g.drawString("Use the space bar to shoot", 325, 270);
            g.drawString("Press Z to use super weapon", 315, 320);
            g.drawString("When a triangle appears on your ship", 240, 370);
            g.drawString("Your super weapon is ready", 320, 420);
            g.drawString("If you press L 200 times looking at the leaderboard", 120, 470);
            g.drawString("Something very special will happen", 260, 520);
            g.setColor(Color.RED);
            g.fill3DRect(520, 600, 150, 80, up);
            g.setColor(words);
            g.drawString("Return", 526, 650);
        }
        //credits screen
        if (credits) {
            g.setColor(Color.black);
            g.fillRect(0, 0, 1200, 800);
            g.setColor(Color.white);
            g.setFont(gameOverFont);
            g.drawString("Credits", 400, 100);
            g.setFont(gameOverLine);
            g.drawString("Programming:               Josh Vuksic", 50, 150);
            g.drawString("Help when i'm stuck:   Thomas Pintier", 50, 200);
            g.drawString("                                         Cameron Carmichael", 50, 250);
            g.drawString("                                         Mr. Lamont", 50, 300);
            g.drawString("Title:                               Randomwordgenerator.com", 50, 350);
            g.drawString("Distracting me:            The internet", 50, 400);
            g.drawString("                                         Tate Ramessar", 50, 450);
            g.drawString("                                         Thomas Pintier", 50, 500);
            g.drawString("                                         Myself", 50, 550);
            g.setColor(Color.RED);
            g.fill3DRect(540, 600, 150, 80, up);
            g.setColor(words);
            g.drawString("Return", 545, 650);
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
        //reset score
        if(score < 0){
            score = 0;
        }
        //secret secret, i've got a secret 
        if (led) {
            secret++;
            led = false;
        }
        //input a new highscore 
        if (deadPlayer) {
            loadHighScores();
            if (score > highscores[0] && fool) {
                fool = false;
                up = false;
                down = false;
                left = false;
                right = false;
                highscores[4] = highscores[3];
                highscores[3] = highscores[2];
                highscores[2] = highscores[1];
                highscores[1] = highscores[0];
                highscores[0] = score;
                String inputValue = JOptionPane.showInputDialog("You set a new local highscore congratulations on sucking a little less, Please enter your initials");
                highscoreNames[4] = highscoreNames[3];
                highscoreNames[3] = highscoreNames[2];
                highscoreNames[2] = highscoreNames[1];
                highscoreNames[1] = highscoreNames[0];
                highscoreNames[0] = inputValue;
            }
            if (score > highscores[1] && fool) {
                fool = false;
                up = false;
                down = false;
                left = false;
                right = false;
                highscores[4] = highscores[3];
                highscores[3] = highscores[2];
                highscores[2] = highscores[1];
                highscores[1] = score;
                String inputValue = JOptionPane.showInputDialog("You set a new local highscore congratulations on sucking a little less, Please enter your initials");
                highscoreNames[4] = highscoreNames[3];
                highscoreNames[3] = highscoreNames[2];
                highscoreNames[2] = highscoreNames[1];
                highscoreNames[1] = inputValue;

            }
            if (score > highscores[2] && fool) {
                fool = false;
                up = false;
                down = false;
                left = false;
                right = false;
                highscores[4] = highscores[3];
                highscores[3] = highscores[2];
                highscores[2] = score;
                String inputValue = JOptionPane.showInputDialog("You set a new local highscore congratulations on sucking a little less, Please enter your initials");
                highscoreNames[4] = highscoreNames[3];
                highscoreNames[3] = highscoreNames[2];
                highscoreNames[2] = inputValue;

            }
            if (score > highscores[3] && fool) {
                fool = false;
                up = false;
                down = false;
                left = false;
                right = false;
                highscores[4] = highscores[3];
                highscores[3] = score;
                String inputValue = JOptionPane.showInputDialog("You set a new local highscore congratulations on sucking a little less, Please enter your initials");
                highscoreNames[4] = highscoreNames[3];
                highscoreNames[3] = inputValue;

            }
            if (score > highscores[4] && fool) {
                fool = false;
                up = false;
                down = false;
                left = false;
                right = false;
                highscores[4] = score;
                String inputValue = JOptionPane.showInputDialog("You set a new local highscore congratulations on sucking a little less, Please enter your initials");
                highscoreNames[4] = inputValue;

            }
            writeHighScore();
        }
        //respawn timers 
        if (deadBomb1 == true) {
            fire = 0;
            respawnBomb1++;
        }
        if (deadBomb2 == true) {
            fire2 = 0;
            respawnBomb2++;
        }
        if (deadBomb3 == true) {
            fire3 = 0;
            respawnBomb3++;
        }
        if (respawnBomb1 == 100) {
            deadBomb1 = false;
            respawnBomb1 = 0;
            issues = true;
        }
        if (respawnBomb2 == 100) {
            deadBomb2 = false;
            respawnBomb2 = 0;
            issues2 = true;
        }
        if (respawnBomb3 == 100) {
            deadBomb3 = false;
            respawnBomb3 = 0;
            issues3 = true;
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
                if (sColour) {
                    y += 10;
                }
            }
        }
        //make ship go up
        if (up) {
            if (y > -580) {
                y -= 10;
                if (sColour) {
                    y -= 10;
                }
            }
        }
        //make ship go left
        if (left) {
            if (x > -540) {
                x -= 10;
                if (sColour) {
                    x -= 10;
                }
            }
        }
        //make ship go right
        if (right) {
            if (x < 540) {
                x += 10;
                if (sColour) {
                    x += 10;
                }
            }
        }
//hit detection for enemy 1, 2  and 3
        if (100 + random <= 545 + p && 150 + random >= 545 + p && -28 + fire <= inc - 32 && 40 + fire >= inc - 32 && shoot == true && BP) {
            if (health1 == 0){
            deadBomb1 = true;
            death = true;
            score+=100;
            }
            else{
                health1--;
                death = false;
                score+=100;
            }
            BP = false;
        }
        if (100 + random <= 648 + p && 150 + random >= 648 + p && -28 + fire <= inc - 32 && 40 + fire >= inc - 32 && shoot == true && BP) {
            if (health1 == 0){
            deadBomb1 = true;
            death = true;
            score+=100;
            }
            else{
                health1--;
                death = false;
                score+=100;
            }
            BP = false;
        }
        if (100 + random2 <= 545 + p && 150 + random2 >= 545 + p && -28 + fire2 <= inc - 32 && 40 + fire2 >= inc - 32 && shoot == true && BP2) {
            if (health2 == 0){
            deadBomb2 = true;
            death2 = true;
            score+=100;
            }
            else{
                health2--;
                death2 = false;
                score+=100;
            }
            BP2 = false;
        }
        if (100 + random2 <= 648 + p && 150 + random2 >= 648 + p && -28 + fire2 <= inc - 32 && 40 + fire2 >= inc - 32 && shoot == true && BP2) {
            if (health2 == 0){
            deadBomb2 = true;
            death2 = true;
            score+=100;
            }
            else{
                health2--;
                death2 = false;
                score+=100;
            }
            BP2 = false;
        }
        if (100 + random3 <= 545 + p && 150 + random3 >= 545 + p && -28 + fire3 <= inc - 32 && 40 + fire3 >= inc - 32 && shoot == true && BP3) {
            if (health3 == 0){
            deadBomb3 = true;
            death3 = true;
            score+=100;
            }
            else{
                health3--;
                death3 = false;
                score+=100;
            }
            BP3 = false;
        }
        if (100 + random3 <= 648 + p && 150 + random3 >= 648 + p && -28 + fire3 <= inc - 32 && 40 + fire3 >= inc - 32 && shoot == true && BP3) {
            if (health3 == 0){
            deadBomb3 = true;
            death3 = true;
            score+=100;
            }
            else{
                health3--;
                death3 = false;
                score+=100;
            }
            BP3 = false;
        }
        if (100 + random <= 553 + p && 150 + random >= 553 + p && -28 + fire <= inc - 32 && 40 + fire >= inc - 32 && shoot == true && BP) {
            if (health1 == 0){
            deadBomb1 = true;
            death = true;
            score+=100;
            }
            else{
                health1--;
                death = false;
                score+=100;
            }
            BP = false;
        }
        if (100 + random <= 656 + p && 150 + random >= 656 + p && -28 + fire <= inc - 32 && 40 + fire >= inc - 32 && shoot == true && BP) {
            if (health1 == 0){
            deadBomb1 = true;
            death = true;
            score+=100;
            }
            else{
                health1--;
                death = false;
                score+=100;
            }
            BP = false;
        }
        if (100 + random2 <= 553 + p && 150 + random2 >= 553 + p && -28 + fire2 <= inc - 32 && 40 + fire2 >= inc - 32 && shoot == true && BP2) {
            if (health2 == 0){
            deadBomb2 = true;
            death2 = true;
            score+=100;
            }
            else{
                health2--;
                death2 = false;
                score+=100;
            }
            BP2 = false;
        }
        if (100 + random2 <= 656 + p && 150 + random2 >= 656 + p && -28 + fire2 <= inc - 32 && 40 + fire2 >= inc - 32 && shoot == true && BP2) {
            if (health2 == 0){
            deadBomb2 = true;
            death2 = true;
            score+=100;
            }
            else{
                health2--;
                death2 = false;
                score+=100;
            }
            BP2 = false;
        }
        if (100 + random3 <= 553 + p && 150 + random3 >= 553 + p && -28 + fire3 <= inc - 32 && 40 + fire3 >= inc - 32 && shoot == true && BP3) {
            if (health3 == 0){
            deadBomb3 = true;
            death3 = true;
            score+=100;
            }
            else{
                health3--;
                death3 = false;
                score+=100;
            }
            BP3 = false;
        }
        if (100 + random3 <= 656 + p && 150 + random3 >= 656 + p && -28 + fire3 <= inc - 32 && 40 + fire3 >= inc - 32 && shoot == true && BP3) {
            if (health3 == 0){
            deadBomb3 = true;
            death3 = true;
            score+=100;
            }
            else{
                health3--;
                death3 = false;
                score+=100;
            }
            BP3 = false;
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
        if (540 + x <= 100 + random3 && 660 + x >= 100 + random3 && 575 + y <= 35 + fire3 && 680 + y >= 35 + fire3) {
            deadPlayer = true;
        }
        if (540 + x <= 150 + random3 && 660 + x >= 150 + random3 && 575 + y <= 35 + fire3 && 680 + y >= 35 + fire3) {
            deadPlayer = true;
        }
        //super weapon hit box
        if (zed) {
            if (100 + random <= 575 + x && 150 + random >= 575 + x && - 28 + fire <= 575 + y) {
                deadBomb1 = true;
                score+=100;
            }
            if (100 + random <= 625 + x && 150 + random >= 625 + x && - 28 + fire <= 575 + y) {
                deadBomb1 = true;
                score+=100;
            }
            if (100 + random2 <= 575 + x && 150 + random2 >= 575 + x && - 28 + fire2 <= 575 + y) {
                deadBomb2 = true;
                score+=100;
            }
            if (100 + random2 <= 625 + x && 150 + random2 >= 625 + x && - 28 + fire2 <= 575 + y) {
                deadBomb2 = true;
                score+=100;
            }
            if (100 + random3 <= 575 + x && 150 + random3 >= 575 + x && - 28 + fire3 <= 575 + y) {
                deadBomb3 = true;
                score+=100;
            }
            if (100 + random3 <= 625 + x && 150 + random3 >= 625 + x && - 28 + fire3 <= 575 + y) {
                deadBomb3 = true;
                score+=100;
            }
        }
        //fix issues 
        if (deadBomb1 && issues && intro == false && deadPlayer == false) {
            random = 50000;
            issues = false;
        }
        if (deadBomb2 && issues2 && intro == false && deadPlayer == false) {
            random2 = 50000;
            issues2 = false;
        }
        if (deadBomb3 && issues3 && intro == false && deadPlayer == false) {
            random3 = 50000;
            issues3 = false;
        }
    }

    public void writeHighScore() {
        //wrtie highscores 
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
        //load in highscores from doc
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
            //check for clicking
            click = true;
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
            //get mouse tracking 
            Point tip = MouseInfo.getPointerInfo().getLocation();
            int mouseX = tip.x;
            int mouseY = tip.y;
            //menu buttons 
            if (mouseX >= 300 && mouseX <= 450 && mouseY >= 500 && mouseY <= 580 && click && intro) {
                intro = false;
                deadBomb1 = false;
                deadBomb2 = false;
                deadPlayer = false;
                click = false;
            } else if (mouseX >= 700 && mouseX <= 850 && mouseY >= 500 && mouseY <= 580 && click && intro) {
                leaderBoard = true;
                click = false;
            } else if (mouseX >= 300 && mouseX <= 450 && mouseY >= 600 && mouseY <= 680 && click && intro) {
                help = true;
                click = false;
            } else if (mouseX >= 550 && mouseX <= 700 && mouseY >= 600 && mouseY <= 680 && click && leaderBoard) {
                leaderBoard = false;
                click = false;
            } else if (mouseX >= 520 && mouseX <= 670 && mouseY >= 600 && mouseY <= 680 && click && help) {
                help = false;
                click = false;
            } else if (mouseX >= 520 && mouseX <= 670 && mouseY >= 600 && mouseY <= 680 && click && help) {
                help = false;
                click = false;
            } else if (mouseX >= 700 && mouseX <= 850 && mouseY >= 600 && mouseY <= 680 && click && intro) {
                credits = true;
                click = false;
            } else if (mouseX >= 540 && mouseX <= 690 && mouseY >= 600 && mouseY <= 680 && click && credits) {
                credits = false;
                click = false;
            } else if (click) {
                click = false;
            }
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
            if (key == KeyEvent.VK_P) {
                score +=1000;
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
                if (key == KeyEvent.VK_ESCAPE) {
                    escape = true;
                }
            }
            if (key == KeyEvent.VK_SPACE) {
                if (timer) {
                    space = true;
                }
                timer = false;

            }
            if (layzor) {
                if (key == KeyEvent.VK_Z) {
                    zed = true;
                }
            }
            if (leaderBoard) {
                if (key == KeyEvent.VK_L) {

                    led = true;
                }
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
            if (key == KeyEvent.VK_ESCAPE) {
                escape = false;
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