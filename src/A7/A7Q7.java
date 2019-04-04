/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A7;

import java.util.Scanner;

/**
 *
 * @author vuksj2164
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask for a number
        System.out.println("please enter a number");
        int number = input.nextInt();
        firstDigit(number);
    }

    public static void firstDigit(int number) {
        int digit = number;
        //find the first digit
        while (number > 10) {
            digit = number / 10;
            number = number / 10;
        }
        System.out.println(digit);
    }
}
