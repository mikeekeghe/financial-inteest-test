package com.techline;

import java.util.Scanner;

public class heating {
    public static void main(String[] args) {

        double curMetReading, prevMetReading,custHeatingBill,
        gasCost,totalCost ;
        Scanner input = new Scanner(System.in);
        System.out.print("Current meter reading:  ");
        curMetReading = input.nextFloat();
        System.out.print("Previous meter reading: ");
        prevMetReading = input.nextFloat();

        gasCost = ((curMetReading - prevMetReading) * 4.24) ;

        totalCost = (gasCost + 54.25 + 4.24 + ((5/100) * gasCost));

        System.out.println("\t\t\tBill Details");
        System.out.println("");
        System.out.println("\t\t\tGas Cost:\t\t "+ gasCost);
        System.out.println("\t\t\t\tAdmin Fee:\t\t\t   54.25");
        System.out.println("\t\t\t\t\t GST:\t\t\t  4.83");
        System.out.println("\t\t\tTotal Charge:\t\t\t "+ totalCost);

    }
}
