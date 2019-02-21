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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new scanner for input
        Scanner input = new Scanner (System.in);
        //ask for integers 
        System.out.println("Please enter two integers on separate lines");
        int numone = input.nextInt();
        int numtwo = input.nextInt();
        System.out.print("Your answer is " + (numone / numtwo));
        System.out.println(" with a remainder of " + (numone % numtwo));
    }
}
