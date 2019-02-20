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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create new scanenr 
        Scanner input = new Scanner (System.in); 
        //ask integers 
        System.out.println("Please input an integer");
        int numone = input.nextInt();
        System.out.println("please insert another");
        int numtwo = input.nextInt();
        //show answer
        System.out.print("The sum of those two integers is ");
        System.out.print(numone + numtwo);
        System.out.println();
        System.out.print("The product of those two integers is ");
        System.out.print(numone * numtwo);
        System.out.println("");
   }
}
