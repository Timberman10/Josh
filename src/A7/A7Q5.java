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
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //ask hoy many lines they want
        System.out.println("how many lines do you want");
        int lines = input.nextInt();
        chaotic(lines);
    }
    public static void chaotic(int lines) {
        //find a random number
        int randNum = (int)(Math.random()*(5 - 1 + 1))+ 1;
        while (lines > 0){
            //print the random number of asteriks "lines" amount of times
        while (randNum > 0){
            System.out.print("*");
            randNum--;
        }
        //print a blank line
            System.out.println("");
        randNum = (int)(Math.random()*(5 - 1 + 1))+ 1;
        lines--;
    }
    }
}
