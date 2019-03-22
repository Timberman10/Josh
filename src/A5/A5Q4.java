/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A5;

import java.util.Scanner;

/**
 *
 * @author vuksj2164
 */
public class A5Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inOut = 0;
        int change = 0;
        //ask the user for 10 integers 
        System.out.println("please insert 10 numbers");
        int sort[] = new int[10];
        while (inOut < 10) {
            sort[0 + inOut] = input.nextInt();
            inOut++;
        }
        //place the integers in order 
        System.out.println("");
        for (int inc2 = 0; inc2 < 10; inc2++) {
            for (int inc = 0; inc < 10; inc++) {
                if (sort[inc2] < sort[inc]) {
                    change = sort[inc];
                    sort[inc] = sort[inc2];
                    sort[inc2] = change;
                }
            }
        }
        inOut = 0;
        //print out the integers 
        while (inOut < 10) {
            System.out.println(sort[0 + inOut]);
            inOut++;
        }
    }

}
