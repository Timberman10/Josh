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
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);
        //ask for input
        System.out.println("Please input two integers and I will tell you which is bigger");
        int numOne = input.nextInt();
        int numTwo = input.nextInt();
        //tell them which number is bigger 
        if(numOne > numTwo){
            System.out.println(numOne + " is bigger than " + numTwo);
    }
        if(numTwo > numOne){
            System.out.println(numTwo + " is bigger than " + numOne);   
}
        if(numTwo == numOne){
            System.out.println(numOne + " is equal to " + numTwo);
        }
    }
}