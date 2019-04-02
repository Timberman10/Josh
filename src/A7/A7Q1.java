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
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input the radius of your circle");
        double rad = input.nextDouble();
        System.out.println("the area of the circle is " + circleArea(rad));
    }

    public static double circleArea(double rad) {
        double area = Math.PI * Math.pow(rad, 2);
        return area;
    }

}
