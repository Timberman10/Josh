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
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //aask the user for their mark
        System.out.println("please input your exam grade");
        int grade = input.nextInt();
        examGrade(grade);
    }

    public static void examGrade(int grade) {
        //find what letter they have
        char letter = 'V';
        if (grade < 50) {
            letter = 'F';
        }
        if (grade >= 50 && grade < 60) {
            letter = 'D';
        }
        if (grade >= 60 && grade < 70) {
            letter = 'C';
        }
        if (grade >= 70 && grade < 80) {
            letter = 'B';
        }
        if (grade >= 80) {
            letter = 'A';
        }
        //output what grade they got
        System.out.println("your letter grade is " + letter);
    }
}
