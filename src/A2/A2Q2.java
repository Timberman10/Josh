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
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);
        //ask themn to input two integers
        System.out.println("Please input two integers and I will put them in ascending order");
        int numOne = input.nextInt();
        int numTwo = input.nextInt();
        //tell them the nubmers in ascending order
        if(numOne < numTwo || numTwo == numOne){
            System.out.println("Your numbers in ascending order are " + numOne + ", " + numTwo);
    }
        if(numTwo < numOne){
            System.out.println("Your numbers in ascending order are " + numTwo + ", " + numOne);   
}
    }
    
}
