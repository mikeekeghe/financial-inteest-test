package com.techline;

import java.util.Scanner;

public class VideoGame {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String ageString = input1.nextLine();
        if (ageString.equalsIgnoreCase("exit")) {
            System.exit(1);
        } else {

            int age = Integer.parseInt(ageString);

            Scanner input2 = new Scanner(System.in);
            System.out.print("Enter the video game info:  ");
            String videoGameName = input2.nextLine();
            videoGameName = videoGameName.toLowerCase();

            // check to see if the line contains "hundred"

            // Attach a Scanner object to the input string
            Scanner cheqScanner = new Scanner(videoGameName);
            boolean containsDash = videoGameName.contains("-");

            if (containsDash) {
                // read the remainder of the String till the end of line
                String remainder = cheqScanner.nextLine();
//                System.out.printf("Hundreds digit was: %s%n", hundredsDigit);
//                System.out.printf("Remainder of the line is:%s%n", remainder);
                if (remainder.contains("E10")) {
                    System.out.println("You are allowed to play this game");


                } else if (remainder.contains("T")) {
                    System.out.println("You are allowed to play this game");

                } else if (remainder.contains("M")) {
                    System.out.println("You are NOT allowed to play this game");

                } else if (remainder.contains("AO")) {
                    System.out.println("You are NOT allowed to play this game");

                } else if (remainder.contains("E")) {
                    System.out.println("You are NOT allowed to play this game");

                }

            }
        }
    }
}
