/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A4;

import java.util.Scanner;

/**
 *
 * @author vuksj2164
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //asl user for a word 
        System.out.println("Please enter a word");
        String word = input.nextLine();
        //check the length of the word
        int length = word.length();
        //give the first letter for a one letter word
        if (length == 1){
            String two = word.substring(0,1);
        System.out.println("the first letter is " + two);
        }
        //give the first two letteres
        if (length > 1){
        String two = word.substring(0,2);
        System.out.println("the first two letter are " + two);
        }
    }
    
}
