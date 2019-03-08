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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.println("Please enter a word");
        String word = input.nextLine();
        String check = "code";
        boolean code = word.contains(check);
        if (code == true) {
            int first = word.indexOf(check);
            while (first >= 0) {
                first = word.indexOf(check, first + 4);
                count++;
            }
            if (count == 1) {
                System.out.println("your word contains " + count + " code");
            } else {
                System.out.println("your word contains " + count + " codes");
            }
        } else if (code == false) {
            System.out.println("your word does not contain any codes");
        }
    }

}
