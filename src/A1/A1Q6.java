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
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new scanner
       Scanner input = new Scanner (System.in);
       //ask for value a
        System.out.println("Please enter the a value of the parabola");
        double a = input.nextDouble();
        //ask for value b
        System.out.println("Please enter the b value of the parabola");
        double b = input.nextDouble();
        //ask for value c
        System.out.println("Please enter the c value of the parabola");
        double c = input.nextDouble();
        //calculate the two roots
        System.out.print("The positive root of your parabola is ");
        System.out.println((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
        System.out.print("The negative root of your parabola is ");
        System.out.println((-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
    }
}
