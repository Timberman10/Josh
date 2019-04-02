/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T2;

import java.util.Scanner;

/**
 *
 * @author vuksj2164
 */
public class T2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //create an increment to count how many times it goes through the loop
        int inc = 0;
        while (true) {
            //ask for words
            System.out.println("Please enter a word type STOP to stop the loop");
            String word = input.nextLine();
            //if stop comes up end it 
            if (word.equals("stop")) {
                System.out.println("you have entered " + inc + " words before typing stop");
                return;
            }
            //incement up
            inc++;

        }
    }

}
