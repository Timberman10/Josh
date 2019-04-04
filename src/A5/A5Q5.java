/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A5;

import java.util.Scanner;

/**
 *
 * @author vuksj2164
 */
public class A5Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       //ask the user for input 
        System.out.println("what number of the Fibonacci sequence would you like");
        int amount = input.nextInt();
        //check if its 0 
        if (amount == 0){
           System.out.println("please enter a number greater than 0");
           amount = input.nextInt();
       }
        int fib[] = new int[amount];
        fib[0] = 0;
        //make sure that it wont leave the array
        if (amount > 1){
        fib[1] = 1;
        }
        //determine the number of the fibonacci sequnce that is needed
        for (int inc = 2; inc < amount; inc++){
            fib[inc] = fib[inc-2] + fib[inc-1];
        }
        //print the number 
        System.out.println(fib[amount-1]);
    }
    
}
