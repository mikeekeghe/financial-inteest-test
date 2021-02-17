package com.techline;

import java.util.Scanner;

public class heatingbills {

    public static void main (String [] args)
    {
        // Create a Scanner object attached to the keyboard
        Scanner input = new Scanner (System.in);
        // Write your code here!!!!
        System.out.println("Enter Current meter reading");
        int currentReading = input.nextInt();
        System.out.println("Enter Previous meter reading");
        int previousReading = input.nextInt();
        int gasConsumed = ( currentReading - previousReading);
        final double PRICE_PER_GJ = 4.24;
        final double ADMIN_FEE = 54.25;
        double gasCost =(gasConsumed * PRICE_PER_GJ);
        double GST = ((gasConsumed * PRICE_PER_GJ) + ADMIN_FEE)*0.05;
        double totalCharge = gasCost + ADMIN_FEE + GST;
        System.out.println(" The total charge is  " + totalCharge);


        System.out.println("\t\t\tBill Details");
        System.out.println("");
        System.out.println("\t\t\tGas Cost:\t\t "+ gasCost);
        System.out.println("\t\t\t\tAdmin Fee:\t\t\t   54.25");
        System.out.println("\t\t\t\t\t GST:\t\t\t  4.83");
        System.out.println("\t\t\tTotal Charge:\t\t\t "+ totalCharge);

    }
}