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
        int numone = input.nextInt();
        int numtwo = input.nextInt();
        //tell them which number is bigger 
        if(numone > numtwo){
            System.out.println(numone + " is bigger than " + numtwo);
    }
        if(numtwo > numone){
            System.out.println(numtwo + " is bigger than " + numone);   
}
        if(numtwo == numone){
            System.out.println(numone + " is equal to " + numtwo);
        }
    }
}