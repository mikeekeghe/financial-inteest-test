package com.techline;

/*
1.
Given two int variables, firstPlaceWinner and secondPlaceWinner,
write some code that swaps their values. Declare any additional
variables as necessary.

*/
import java.util.Scanner;

public class Switcher {
    public static void main(String[] args) {

        int firstPlaceWinner, secondPlaceWinner, temp;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Place Winner: ");
        firstPlaceWinner = input.nextInt();
        System.out.print("Enter the Second Place Winner: ");
        secondPlaceWinner = input.nextInt();
        temp = firstPlaceWinner;
        firstPlaceWinner = secondPlaceWinner;
        secondPlaceWinner = temp;

        System.out.println("the First Place Winner is now "+ firstPlaceWinner);
        System.out.println("the Second Place Winner is now "+ secondPlaceWinner);
        input.close();

    }
}