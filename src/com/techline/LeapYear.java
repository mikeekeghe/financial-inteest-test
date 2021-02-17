package com.techline;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        int year;
       Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        year = input.nextInt();

        if (year %4==400){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is NOT a leap year");
        }
    }
}
