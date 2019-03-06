/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3;

/**
 *
 * @author vuksj2164
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //define variables
        int sum = 0;
        int increase = 1;
        //create a loop that adds the first 100 odd numbers
        for (int count = 1; increase <= 100; count = count + 2){
            increase = increase + 1;
            sum = sum + count;
            
         
                } 
        //give the sum of the first 100 odd numbers
        System.out.println(sum);
   
    }
}
    

