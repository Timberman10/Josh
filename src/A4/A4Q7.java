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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countX = 0;
        int countY = 0;
        System.out.println("Please enter a word");
        String word = input.nextLine();
        String checkX = "x";
        String checkY = "y";
         boolean x = word.contains(checkX);
         boolean y = word.contains(checkY);
        if (x == true) {
            int first = word.indexOf(checkX);
            while (first >= 0) {
                first = word.indexOf(checkX, first + 1);
                countX++;
            }
            
        }
        if (y == true) {
            int first = word.indexOf(checkY);
            while (first >= 0) {
                first = word.indexOf(checkY, first + 1);
                countY++;
            }
            
        }
        if (countX == countY){
            System.out.println("the string is balanced, as all thigns should be");
        }
        else{
            System.out.println("the string isn't balanced");
        }
    }
    
}
