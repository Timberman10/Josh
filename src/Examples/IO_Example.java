/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 * Example of Java Input and Output 
 * @author vuksj2164
 */
public class IO_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        //Output text to the screen 
        System.out.println("Mario Maker 2");
        System.out.println("June 2019");
        //prints text, but waitsd at the end of the line
        System.out.print("The Hype ");
        System.out.print("is Real ");
        System.out.println();
        
        //create a string variable for name and say hello
        String name = "Lord Jishua the Third";
        System.out.println("Hello " + name);
        
        // create a scanner for input
        Scanner input = new Scanner(System.in);
    
        //scans in the usrs year of birth
        System.out.println("Please Enter Your Brithyear");
        int  birthYear = input.nextInt();
       
        //math stuffs
        //Math.pow (base, exponent)  power of
        //Math.sqrt (number) square root
        
        //calculate age
        int age = 2019 - birthYear; 
        System.out.println("You are probably " + age + " years old");
        System.out.println("Was I correct yes or no");
        input.nextLine(); 
        String answer = input.nextLine();
        //if (answer = yes) { 
           // System.out.println("Yeah i did it");
        //}
        //} else {
           // System.out.println("Well that sucks");
         }
}
