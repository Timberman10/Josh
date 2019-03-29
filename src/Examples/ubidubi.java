/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author vuksj2164
 */
public class ubidubi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("please enter a word");
        String word = input.nextLine();
        int count = word.length();
        String translate = "";
        for(int i = 0; i < count; i++){
            char letter = word.charAt(i);
            if  (letter == 'a' | letter == 'e' | letter == 'i'| letter == 'o'| letter == 'u' ){
                translate = translate + "ub"; 
            }
            translate = translate + letter;
        }
        System.out.println(translate);
    }
    
}
