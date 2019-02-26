/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author vuksj2164
 */
public class Conditions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a nubmer between one and ten");
        int number = input.nextInt();
        if(number > 10 || number < 1){
            System.out.println("Go back to preschool and learn to count " + number + " is not between 1 and 10");
        }
        else{
            if(number == 7){
                System.out.println("lucky number 7, how basic can ya get ");
            } else if (number != 7){
            System.out.println("rules were made to be broken ya goody two shoes");
        }
        }
        input.nextLine();
        System.out.println("...");
        String word = input.nextLine();
        if(word.equals ("hello")){
            System.out.println("oh ur still here");
        }      
    }
    
}
