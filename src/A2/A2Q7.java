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
public class A2Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner (System.in);
        //ask for their fizzbuzz number
        System.out.println("Please enter a number to play FizzBuzz");
        int num = input.nextInt();
        //tell them what to day
        System.out.print("You should say ");
        if (num % 3 == 0){
            System.out.print("Fizz");
            
        }
                if (num % 5 == 0){
            System.out.print("Buzz");
            
        }
                        if (num % 3 != 0 && num % 5 != 0){
            System.out.print(num);
            
        }
                        System.out.println("");
    }
    
}
