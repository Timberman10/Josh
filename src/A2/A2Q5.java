/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2;

import java.util.Scanner;

/**
 *
 * @author vuksj2164
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);
        //ask for the amount of tea and cookies
        System.out.println("Please input the amount of teas at your tea part");
        int tea = input.nextInt();
        System.out.println("Please input the amount of candies at your tea part");
       //tell them that they can't have less than zero
        int candy = input.nextInt();
                if(tea < 0 || candy < 0){
        if(tea < 0){
            System.out.println("how do you have less than zero tea, do you owe someone, is the debt collector gonna come around looking for your tea");
        }
                if(candy < 0){
            System.out.println("how do you have less than zero candy, do you owe someone, is the debt collector gonna come around looking for your candies");
        }
                //tell them the tea party is terrible
                } else if(tea >= 0 || candy >= 0){
                if(tea < 5 && tea > 0 || candy < 5 && tea > 0){
            System.out.println("this a pretty objectively terrible tea party");
                }
                //tell them it isn't a tea party
                if(tea == 0){
            System.out.println("how is this even a tea party, you got no tea");
                }
                //tell them their tea party is great
                if(tea * 2 <= candy && tea > 5 || candy * 2 <= tea && candy > 5){
            System.out.println("this a great tea party");
                }
                //tell them their tea party is good
                else if(tea >= 5 && candy >= 5){
                    System.out.println("this is a good tea party");
                }
                }
           }
    
}
