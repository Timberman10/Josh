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
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask for integers 
        System.out.println("please input an integer ");
        int number = input.nextInt();
        System.out.println("please input another integer ");
        int power = input.nextInt();
        //create a constant to multiply by
        int constant = number;
        //multiply it by itself "power" amount of times
        while (power > 1) {
            number = constant * number;
            power = power - 1;
        }
        System.out.println(number);
    }

}
