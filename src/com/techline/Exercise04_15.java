package com.techline;

import java.util.Scanner;

public class Exercise04_15 {
    public static void main (String [] args)
    {
        // Create a Scanner object attached to the keyboard
        Scanner in = new Scanner (System.in);
        // Write your code here!!!!
        String s;
        System.out.print ("Enter a letter: ");
        s = in.next();
        // extract the 1st character
            char ch = s.charAt(0);
        if(!Character.isLetter(s.charAt(0))){
            System.out.print(ch + " is an invalid input");
        }
        else if (Character.toUpperCase ('A') == 'A'  || Character.toUpperCase ('B') == 'B' ||Character.toUpperCase ('C') == 'C'){
            System.out.print("The corresponding number is 2");
        }
        else if (Character.toUpperCase ('D') == 'D'|| Character.toUpperCase ('E') == 'E'|| Character.toUpperCase('F')=='F'){
            System.out.print("The corresponding number is 3");
        }
        else if(Character.toUpperCase ('G') == 'G'  || Character.toUpperCase ('H') == 'H' ||Character.toUpperCase ('I') == 'I'){
            System.out.print("The corresponding number is 4");
        }
        else if(Character.toUpperCase ('J') == 'J'  || Character.toUpperCase ('K') == 'K' ||Character.toUpperCase ('L') == 'L'){
            System.out.print("The corresponding number is 5");
        }
        else if(Character.toUpperCase ('M') == 'M'  || Character.toUpperCase ('N') == 'N' ||Character.toUpperCase ('O') == 'O'){
            System.out.print("The corresponding number is 6");
        }

        else if(Character.toUpperCase ('P') == 'P'  || Character.toUpperCase ('Q') == 'Q' ||Character.toUpperCase ('R') == 'R'||Character.toUpperCase ('S') == 'S'){
            System.out.print("The corresponding number is 7");
        }
        else if(Character.toUpperCase ('T') == 'T'  || Character.toUpperCase ('U') == 'U' ||Character.toUpperCase ('V') == 'V'){
            System.out.print("The corresponding number is 8");
        }
        else {
            System.out.print("The corresponding number is 9");
        }

    }
}
