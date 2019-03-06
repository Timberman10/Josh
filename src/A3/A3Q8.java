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
public class A3Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //generate a random number 
        int number = (int)(Math.random()*100 + 1);
        int guess = 0;
        //tell them the number is too high or too low 
        while (number != guess){
        System.out.println("please enter your guess between 1 and 100");
        guess = input.nextInt();
        if (guess < number){
            System.out.println("too low");
        }
        if (guess > number){
            System.out.println("too high");
        }
        //if correct it will end the program
        if (guess == number){
            System.out.println("you are correct");
        }
        }
    }
    
}
