/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2;

import java.util.Scanner;

/**
 *
 * @author vuksj2164
 */
public class A2Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);
        //ask for speed limit and speed
        System.out.println("Please enter the speed limit");
        int limit = input.nextInt();
        System.out.println("Please enter the recorded speed of the car");
        int car = input.nextInt();
        //tell them they are following the law
        if (car - limit <= 0) {
            System.out.println("congrats, you are within the speed limit");
        }
        //tell them their fine
        if (car - limit >= 1 && car - limit <= 20) {
            System.out.println("Stop right there criminal scum, you are speeding and will be fined $100");
        }
        if (car - limit >= 21 && car - limit <= 30) {
            System.out.println("Stop right there criminal scum, you are speeding and will be fined $270");
        }
        if (car - limit >= 31) {
            System.out.println("Stop right there criminal scum, you are speeding and will be fined $500");
        }
    }

}
