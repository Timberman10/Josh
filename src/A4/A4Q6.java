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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = input.nextLine();
        word = word.replaceFirst("a","");
        word = word.replaceFirst("a","");
        System.out.println("your word without the first two letter 'a's is " + word);
    }
    
}
