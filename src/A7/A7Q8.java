/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A7;

import java.util.Scanner;

/**
 *
 * @author vuksj2164
 */
public class A7Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask the user for a number
        System.out.println("please enter a number");
        int number = input.nextInt();
        //tell them whether it is true or false
        System.out.println(allDigitsOdd(number));
    }

    public static boolean allDigitsOdd(int number) {
        int digit = number;
        while (number > 0) {
            //check if its even
            int check = digit % 2;
            if (check == 0) {
                //return false
                boolean answer = false;
                return answer;
            }
            //move onto next digit
            digit = number / 10;
            number = number / 10;
        }
        //return true
        boolean answer = true;
        return answer;
    }
}
