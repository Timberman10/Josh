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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the radius of a circle in cm");
        double rad = input.nextDouble();
        System.out.print("the area of your circle is ");
        System.out.println(Math.PI * Math.pow(rad,2));
    }
}
