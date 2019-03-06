/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3;

import java.util.Scanner;

/**
 *
 * @author vuksj2164
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask for the first integer 
        System.out.println("please input a positive integer (type -1 to stop)");
        int number = input.nextInt();
        int high = number;
        int low = number;
        //replace highest and lowest if new numbers are higher or lower than the first
        while (number > -1) {
            System.out.println("please input a positive integer (type -1 to stop)");
            number = input.nextInt();
            if (number > high) {
                high = number;
            }
            if (number < low && number >= 0) {
                low = number;
            }

        }
        //print the lowest and highest number 
        System.out.println("the lowest number was " + low + " the highest number was " + high);
    }

}
