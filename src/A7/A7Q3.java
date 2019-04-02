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
   /* public static void main(String[] args) {
        int factors[] = new int[user(num)];
        int inc2 = 0;
        for (int inc = 0; inc < user(num); inc++) {
            int remainder = number % inc;
            if (remainder == 0) {
                factors[inc2] = inc;
                inc2++;
            }
        }
        for (int inc = 0; inc < number; inc++) {
            System.out.println(factors[inc]);
        }
    }
    public static int user(int num) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input an integer");
        int number = input.nextInt();
        return number;
    }
}/*
