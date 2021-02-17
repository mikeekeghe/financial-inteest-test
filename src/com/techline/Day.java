package com.techline;


import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String day  = input.nextLine();
            if (day.equals("Sunday") ) {
                System.out.println("Today is Sunday");
            } else if (day.equals( "Monday")) {
                System.out.println("Today is Monday");
            }
           else{
                System.out.println("Today is ordinary day");
            }

    }
}


