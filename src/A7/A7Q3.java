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
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0;
        int numTwo = ask(num);
        int factors[] = new int[numTwo];
        int inc2 = 0;
        //find all the divisors and place them in an array
        for (int inc = 1; inc <= numTwo; inc++) {
            int remainder = numTwo % inc;
            if (remainder == 0) {
                factors[inc2] = inc;
                inc2++;
            }
        }
        //print all the divisors
        for (int inc = (inc2 - 1); inc >= 0; inc--) {
            System.out.println(factors[inc]);
        }
    }

    public static int ask(int num) {
        Scanner input = new Scanner(System.in);
        //ask the user for a number
        System.out.println("please input an integer");
        int number = input.nextInt();
        return number;
    }
}
