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
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask for a number between 1 and 5
        System.out.println("please input a number between 1 and 5 ");
        int number = input.nextInt();
        //make sure it is between 1 and 5
        while (number > 5 || number < 1) {
            System.out.println("no between 1 and 5");
            number = input.nextInt();
        }
        // print out "number" amount os * 
        while (number > 0) {
            number = number - 1;
            System.out.print("*");
        }
        System.out.println("");
    }

}
