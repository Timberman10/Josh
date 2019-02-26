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
public class A2Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);
        //ask them for specifications abotu the day
        System.out.println("Please input the day of the week (0=Sun, 1=Mon, 6=Sat");
        int day = input.nextInt();
           System.out.println("is it a holiday (yes or no)");
           input.nextLine();
           //wrong answer on day
           String hol = input.nextLine();
                   if( day > 6 || day < 0){
               System.out.println("you should never wake up");
           }
                   //tell them to wake up at 10
                   else{
           if( day == 0 || day == 6 || hol.equals("yes") ){
               System.out.println("you should wake up at 10:00");
           }
           //tell them to wake up at 7
                      else{
               System.out.println("you should wake up at 7:00");
           }
                   }
    }
    
}
