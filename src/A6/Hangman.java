/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A6;

import java.util.Scanner;

/**
 *
 * @author vuksj2164
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //create starting scores for players
        int player = 0;
        int score1 = 0;
        //ask the user for a word
        int score2 = 0;
        while (true) {
            System.out.println("Player " + (1 + player) + " please insert a word");
            String answer = input.nextLine();
            //determine length of word and create a blank line the same length
            int count = answer.length();
            String hidden = "";
            for (int inc = 0; inc < count; inc++) {
                hidden = hidden + "-";
            }
            char letters[] = new char[count];
            for (int inc = 0; inc < count; inc++) {
                letters[inc] = answer.charAt(inc);
            }
            for (int inc = 0; inc < 42; inc++) {
                System.out.println("");
            }
            int fail = 0;
            System.out.println(hidden);
            char out[] = new char[count];
            for (int inc = 0; inc < count; inc++) {
                out[inc] = '-';
            }
            for (int in = 0; in < count;) {
                System.out.println("    +----+");
                System.out.println("    |    |");
                if (fail > 0) {
                    System.out.println("    0    |");
                } else {
                    System.out.println("         |");
                }
                if (fail == 2) {
                    System.out.println("    |    |");
                }
                if (fail == 3) {
                    System.out.println("   /|    |");
                }
                if (fail > 3) {
                    System.out.println("   /|\\   |");
                }
                if (fail < 2) {
                    System.out.println("         |");
                }
                if (fail == 5) {
                    System.out.println("   /     |");
                }
                if (fail < 5) {
                    System.out.println("         |");
                }
                System.out.println("         |");
                System.out.println("==========");
                System.out.println("player " + (2 - player) + " please guess a letter you have " + (6 - fail) + " lives left");
                String guess = input.nextLine();
                int guessL = guess.length();
                while (guessL > 1 || guessL < 1) {
                    System.out.println("please enter 1 letter");
                    guess = input.nextLine();
                    guessL = guess.length();
                }

                char letter = guess.charAt(0);
                for (int inc = 0; inc < count; inc++) {
                    if (letter == letters[inc]) {
                        out[inc] = letter;
                        in++;
                    }
                }
                int check = 0;
                for (int incr = 0; incr < count; incr++) {
                    if (letter != letters[incr]) {
                        check++;
                        if (check == count) {
                            fail++;
                        }
                    }
                }
                for (int i = 0; i < count; i++) {
                    System.out.print(out[i]);
                }
                if (fail == 6) {
                    System.out.println("");
                    System.out.println("    +----+");
                    System.out.println("    0    |");
                    System.out.println("   /|\\   |");
                    System.out.println("   / \\   |");
                    System.out.println("         |");
                    System.out.println("==========");
                    System.out.println("the word was " + answer);
                }
                System.out.println("");
            }
            System.out.println("you have recieved " + (6 - fail) + " points");
            if (player == 0) {
                score2 = score2 + (6 - fail);
            } else {
                score1 = score1 + (6 - fail);
            }
            System.out.println("the score is currently player 1:" + score1 + " player 2:" + score2 + " do you want to play again? (yes/no)");
            String play = input.nextLine();
            if (play.equals("yes")) {
                if (player == 0) {
                    player++;
                } else {
                    player--;
                }
            } else {
                return;
            }
        }
    }
}