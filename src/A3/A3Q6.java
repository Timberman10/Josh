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
public class A3Q6 {

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
        //create two integers to be used
        int holder = number;
        int reset = number;
        //create a box of * the size of the nubmer given
        while (holder > 1) {
            while (number > 0) {
                number--;
                System.out.print("*");
                if (holder > 1 && number == 0) {
                    System.out.println("");
                    holder--;
                    number = reset;
                }
            }
            System.out.println("");
        }

    }

}
