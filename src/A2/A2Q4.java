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
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);
        //ask for an integer 
        System.out.println("Please input an integer and I will tell you if it is special or not");
        int number = input.nextInt();
        // calculate whether or not their number is special and tell them
        if(number % 11 == 0 || (number + 1 % 11) == 0){
            System.out.println("your number is special");
        } else {
      System.out.println("your number is not special");
    }
    }
    
}
