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
public class A5Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask how many integers they want
        System.out.println("how many integers do you wish to enter");
        int count = input.nextInt();
        int reset = count;
        int[] numbers = new int[count];
        //get all the integers
        while (count > 0) {
            System.out.println("please enter an integer");
            numbers[count-1] = input.nextInt();
            count--;
        }
        count = reset;
        //determine the highest number
        int high = numbers[count-1];
        while (count > 0) {
            if (high < numbers[count-1]) {
                high = numbers[count-1];
            }
            count--;
        }
        System.out.println("the highest number is " + high);
        count = reset;
        //determine the lowest number 
        int low = numbers[count-1];
        while (count < 0) {
            if (low > numbers[count-1]) {
                low = numbers[count-1];
            }
            count--;
        }
        System.out.println("the lowest number is " + low);
    }

}
