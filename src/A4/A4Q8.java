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
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       //ask for a word
        System.out.println("please enter a word");
        String word = input.nextLine();
        //check length
        int length = word.length();
        //re ask if they dont type anything
        while (length == 0){
           System.out.println("please enter a word"); 
           word = input.nextLine();
           length = word.length();
        }
        //print word backwards
        char letter = word.charAt(0);
        while(length != 0){
             letter = word.charAt(length-1);
            System.out.print(letter);
            length--;
        }
        System.out.println(" ");
    }
    
}
