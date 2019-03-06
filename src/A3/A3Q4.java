/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3;

import java.util.Scanner;

/**
 *
 * @author vuksj2164
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //define the range that needs to be counted
        int count = 0;
        System.out.println("please input an integer greater than 1 ");
        int max = input.nextInt();
        //count the numbers
        while (max >= 1) {
            count = count + 1;
            System.out.println(count);
            max = max - 1;
        }
    }

}
