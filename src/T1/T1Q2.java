/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1;

import java.util.Scanner;

/**
 *
 * @author vuksj2164
 */
public class T1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //ask the user to input how many antennas and eyes they saw
        System.out.println("how many antennas did you see?");
        int ant = input.nextInt();
        System.out.println("how many eyes did you see?");
        int eye = input.nextInt();
        //make sure it's not a fake witness
        if(eye < 0 || ant < 0){
            System.out.println("you didn't actually see an alien, did you now?");
        }
        //put the alien into a category based on which one was seen 
        if(ant >= 3 && eye <= 4 && eye > 0 && ant > 0){
            System.out.println("TroyMartian");
        }
        if(ant <= 2 && eye <= 3 && eye > 0 && ant > 0){
            System.out.println("GreameMercurian");
        }
        if(ant <= 6 && eye >= 2 && eye > 0 && ant > 0){
            System.out.println("VladSaturnian");
        }
        else if((ant > 3 && eye > 4) || (ant > 6 && eye > 4)){
            System.out.println("None found");
        }
    }
    
}
