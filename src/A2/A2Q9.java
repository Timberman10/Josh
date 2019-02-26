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
public class A2Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner (System.in);
        //ask for three integers
        System.out.println("Please enter an integer");
        int a = input.nextInt();
        System.out.println("Please enter a second integer");
        int b = input.nextInt();
        System.out.println("Please enter one last integer");
        int c = input.nextInt();
        //calculate whether it is a Pythagorean triple or not and tell them
        if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)){
            System.out.println("This is a Pythagorean triple");
        }
        else{
            System.out.println("this isn't a Pythagorean triple");
        }
    }
    
}
