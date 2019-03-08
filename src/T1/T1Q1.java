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
public class T1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //ask the user to input the ages of the child
        System.out.println("please enter the age of the youngest child");
        int young = input.nextInt();
        System.out.println("please enter the age of the middle child");
        int mid = input.nextInt();
        //check to make sure it isn't a negative
        if(young < 0 || mid < 0){
            System.out.println("wait what... how, how can you be less than zero years old?");
        }
             //output the age of the oldest child
        System.out.println("the oldest child will be " + (mid - young + mid));
    }
    
}
