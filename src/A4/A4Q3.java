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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask user for a word
        System.out.println("Please enter a word");
        String word = input.nextLine();
        //check length of the word 
        int length = word.length();
        //move the last two letters to the front
        String end = word.substring(0, length - 2);
        String start = word.substring(length - 2);
        System.out.println(start + end);
    }

}
