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
public class T2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask user for two integers
        System.out.println("please enter your first integer");
        int numOne = input.nextInt();
        System.out.println("please enter your second integer");
        int numTwo = input.nextInt();
        //check if numbers are 0
        if (numOne == 0 && numTwo == 0){
            System.out.println("the largest common divisor is 0");
            return;
        }
        //divide by the larger number and increment down which number we divide by
        if (numOne >= numTwo) {
            int divisor = numOne;
            while (true){
                int check1 = numOne % divisor;
                int check2 = numTwo % divisor;
                //end if there is no remainder
                if (check1 == 0 && check2 == 0) {
                    System.out.println("the largest common divisor is " + divisor);
                    return;
                }
                divisor--;
            }
            
        }
        //divide by the larger number and increment down which number we divide by
        if (numOne < numTwo) {
            int divisor = numTwo;
            while (true) {
                int check1 = numOne % divisor;
                int check2 = numTwo % divisor;
                //end if there is no remainder
                if (check1 == 0 && check2 == 0) {
                    System.out.println("the largest common divisor is " + divisor);
                    return;
                }
                divisor--;
            }
        }
    }

}
