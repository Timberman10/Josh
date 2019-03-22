/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A5;

import java.util.Scanner;

/**
 *
 * @author vuksj2164
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double average = 0;
        //ask how many people are in the group
        System.out.println("How many people are in your group");
        int people = input.nextInt();
        int add = people;
        double[] height = new double[people];
        //place the height of everyone in an array
        while (add > 0){
            System.out.println("please input the height of the next person in meters");
            height[add-1] = input.nextDouble();
            add--;
        }
        add = people;
        while (add > 0){
            average = average + height[add-1];
                    add--;
        }
        add = people;
        //determine the average
        average = average/people;
        System.out.println("your average height is " + average + "m");
        //print who is above average
        System.out.println("the people in your group above average are");
        while (add > 0){
            if(height[add-1] > average){
                System.out.print(height[add-1] + "m, ");
            }
            add--;
        }
        System.out.print("tall");
        System.out.println("");
    }
    
}
