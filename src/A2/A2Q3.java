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
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new scanner
                Scanner input = new Scanner(System.in);
                //ask them for an integer
        System.out.println("Please input an integer and I will tell you if it is even or odd");
        int number = input.nextInt();
        //check for remainder and tell them if it is even or odd
       if(number % 2 > 0){
           System.out.println("your number is odd");
       }
       if(number % 2 == 0){
           System.out.println("your number is even");
       }
    }
    
}
