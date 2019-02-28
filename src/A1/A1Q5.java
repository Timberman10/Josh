/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A1;

import java.util.Scanner;

/**
 *
 * @author vuksj2164
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new scanne
        Scanner input = new Scanner(System.in);
        //ask for all coordinates 
        System.out.println("Please enter the x coordinate of your first point");
        int x1 = input.nextInt();
        System.out.println("Please enter the y coordinate of your first point");
        int y1 = input.nextInt();
        System.out.println("Please enter the x coordinate of your second point");
        int x2 = input.nextInt();
        System.out.println("Please enter the y coordinate of your second point");
        int y2 = input.nextInt();
        //give slope of line
        System.out.println("Your line has a slope of " + ((y2 - y1) / (x2 - x1)));
    }
}
