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
public class A5Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //create an array
        int numbers[] = new int[2];
        int change = 0;
        //ask the user for two integers 
        System.out.println("please insert 2 integers");
        numbers[0] = input.nextInt();
        numbers[1] = input.nextInt();
        //place the numbers in ascending order 
        if (numbers[0] > numbers[1]) {
            change = numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = change;
        }
        System.out.println("youy numbers in ascending order are " + numbers[0] + ", " + numbers[1]);
    }

}
