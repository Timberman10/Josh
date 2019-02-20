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
        System.out.print("Your answer is ");
        System.out.print(numone / numtwo);
        System.out.print(" with a remainder of ");
        System.out.println();
        System.out.print(numone % numtwo);
    }
}
