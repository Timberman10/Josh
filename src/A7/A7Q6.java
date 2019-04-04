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
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask for a number
        System.out.println("please enter a number");
        int number = input.nextInt();
        lastDigit(number);
    }

    public static void lastDigit(int number) {
        //find the last digit 
        int digit = number % 10;
        System.out.println(digit);
    }
}
