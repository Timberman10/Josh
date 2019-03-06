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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask for a number 
        System.out.println("please input a number between 1 and 10 ");
        int number = input.nextInt();
        //if they didn't lsiten ask them again
        while (number > 10 || number < 1) {
            System.out.println("please input a number between 1 and 10 ");
            number = input.nextInt();
        }
        //tell them their number 
        System.out.println("your number is " + number);
    }

}
