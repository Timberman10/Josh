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
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask the user about their current financial situation 
        System.out.println("please enter your initial amount");
        double initial = input.nextDouble();
        System.out.println("please enter your interest rate as a decimal");
        double rate = input.nextDouble();
        System.out.println("please enter the amount of years");
        int years = input.nextInt();
        //tell them how much money they have
        System.out.println("your current balance is " + interest(initial, rate, years));

    }

    public static double interest(double initial, double rate, int years) {
        //figure out their current balance
        double balance = initial * Math.pow((1 + rate), years);
        return balance;
    }
}
