package Practice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Timer;

/**
 *
 * @author vuksj2164
 */
public class DrawingTest extends JComponent implements ActionListener {

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

    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    int x = 0;
    int y = 0;
    int z = 0;

    boolean down = false;
    boolean up = false;
    boolean left = false;
    boolean right = false;

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public DrawingTest() {
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
        g.setColor(Color.BLACK);
        g.fillRect(x + 50, y + 50, 10, 10);
        g.fillRect(x + 120, y + 50, 10, 10);
        g.fillRect(x + 60, y + 60, 10, 10);
        g.fillRect(x + 110, y + 60, 10, 10);
        g.fillRect(x + 50, y + 70, 80, 10);
        g.fillRect(x + 40, y + 80, 20, 10);
        g.fillRect(x + 70, y + 80, 40, 10);
        g.fillRect(x + 120, y + 80, 20, 10);
        g.fillRect(x + 30, y + 90, 120, 10);
        g.fillRect(x + 30, y + 100, 10, 10);
        g.fillRect(x + 30, y + 110, 10, 10);
        g.fillRect(x + 50, y + 100, 80, 10);
        g.fillRect(x + 140, y + 100, 10, 10);
        g.fillRect(x + 140, y + 110, 10, 10);
        g.fillRect(x + 50, y + 110, 10, 10);
        g.fillRect(x + 120, y + 110, 10, 10);
        g.fillRect(x + 60, y + 120, 20, 10);
        g.fillRect(x + 100, y + 120, 20, 10);

        g.fillRect(x + 180, y + 50, 10, 10);
        g.fillRect(x + 250, y + 50, 10, 10);
        g.fillRect(x + 190, y + 60, 10, 10);
        g.fillRect(x + 240, y + 60, 10, 10);
        g.fillRect(x + 180, y + 70, 80, 10);
        g.fillRect(x + 170, y + 80, 20, 10);
        g.fillRect(x + 200, y + 80, 40, 10);
        g.fillRect(x + 250, y + 80, 20, 10);
        g.fillRect(x + 160, y + 90, 120, 10);
        g.fillRect(x + 160, y + 100, 10, 10);
        g.fillRect(x + 160, y + 110, 10, 10);
        g.fillRect(x + 180, y + 100, 80, 10);
        g.fillRect(x + 270, y + 100, 10, 10);
        g.fillRect(x + 270, y + 110, 10, 10);
        g.fillRect(x + 180, y + 110, 10, 10);
        g.fillRect(x + 250, y + 110, 10, 10);
        g.fillRect(x + 190, y + 120, 20, 10);
        g.fillRect(x + 230, y + 120, 20, 10);

        g.fillRect(x + 180 + 130, y + 50, 10, 10);
        g.fillRect(x + 250 + 130, y + 50, 10, 10);
        g.fillRect(x + 190 + 130, y + 60, 10, 10);
        g.fillRect(x + 240 + 130, y + 60, 10, 10);
        g.fillRect(x + 180 + 130, y + 70, 80, 10);
        g.fillRect(x + 170 + 130, y + 80, 20, 10);
        g.fillRect(x + 200 + 130, y + 80, 40, 10);
        g.fillRect(x + 250 + 130, y + 80, 20, 10);
        g.fillRect(x + 160 + 130, y + 90, 120, 10);
        g.fillRect(x + 160 + 130, y + 100, 10, 10);
        g.fillRect(x + 160 + 130, y + 110, 10, 10);
        g.fillRect(x + 180 + 130, y + 100, 80, 10);
        g.fillRect(x + 270 + 130, y + 100, 10, 10);
        g.fillRect(x + 270 + 130, y + 110, 10, 10);
        g.fillRect(x + 180 + 130, y + 110, 10, 10);
        g.fillRect(x + 250 + 130, y + 110, 10, 10);
        g.fillRect(x + 190 + 130, y + 120, 20, 10);
        g.fillRect(x + 230 + 130, y + 120, 20, 10);
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
        if (down) {
            y+=5;
        }
        if (up) {
            y--;
        }
        if (left) {
            x--;
        }
        if (right) {
            x++;
        }
        /* if (x < 790 && y == 0){
        x+=6;
        }
        if (x == 792){
            y+=5;
            }
            int t = y % 10;
        if (t==5){
            x-=6;
            }
        if (x == -54){
            y+=5;
            }
        t = y % 10;
        if (t == 0){
            x+=6;
            }*/
    }

    // Used to implement any of the Mouse Actions
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
            int key2 = e.getKeyCode();
            if (key == KeyEvent.VK_UP) {
                up = true;
            }
            int key3 = e.getKeyCode();
            if (key == KeyEvent.VK_LEFT) {
                left = true;
            }
            int key4 = e.getKeyCode();
            if (key == KeyEvent.VK_RIGHT) {
                right = true;
            }
            if (key == KeyEvent.VK_SPACE) {

            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_DOWN) {
                down = false;
            }
            int key2 = e.getKeyCode();
            if (key == KeyEvent.VK_UP) {
                up = false;
            }
            int key3 = e.getKeyCode();
            if (key == KeyEvent.VK_LEFT) {
                left = false;
            }
            int key4 = e.getKeyCode();
            if (key == KeyEvent.VK_RIGHT) {
                right = false;
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
        DrawingTest game = new DrawingTest();
    }
}
