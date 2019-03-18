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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask user for a word
        System.out.println("Please enter a word");
        String word = input.nextLine();
        //check length of word
        int length = word.length();
        //tell them the word without the outside characters
        if (length == 1) {
            System.out.println("ok 1 letter, 1 outside character, you get rid of it... YOUR ANSWER IS NOTHING");
        }
        if (length == 2) {
            System.out.println("ok 2 letters, 2 outside characters, you get rid of them... YOUR ANSWER IS NOTHING");
        }
        if (length > 2) {
            String out = word.substring(1, length - 1);
            System.out.println("the word without the outside character is " + out);
        }
    }

}
