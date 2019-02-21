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
public class A1Q2 {
//formula is  F=(C*9)/5 +32
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner (System.in); 
        System.out.println("Please enter the temperature in degrees celsius");
        //create new variable
        int temperature = input.nextInt();
        //give temperature in farenheit
        System.out.print("it is currently " + (temperature*9/5+32 ) + " degrees farenheit");
        System.out.println("");
    }
}
