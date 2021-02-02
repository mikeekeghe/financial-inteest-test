package com.techline;
/*
(Financial application: calculate future investment value)
Write a program that reads in investment amount, annual
 interest rate, and number of years, and displays the
 future investment value using the following formula:
futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears * 12)

For example, if you enter amount 1000,
annual interest rate 3.25%, and number of years 1,
the future investment value is 1032.98
*/

import java.util.Scanner;
import java.lang.Math;

public class Financial {

    public static void main(String[] args) {
        int numberOfYears;
        double investmentAmount, annualInterestRate,monthlyInterestRate,  futureInvestmentValue;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the investment Amount: ");
        investmentAmount = input.nextFloat();
        System.out.print("Enter the Annual Interest Rate: ");
        annualInterestRate = input.nextFloat();
        System.out.print("Enter the number Of Years: ");
        numberOfYears = input.nextInt();
        monthlyInterestRate = annualInterestRate/12;
        futureInvestmentValue = investmentAmount * ( Math.pow((1 + (monthlyInterestRate/100)), (numberOfYears * 12)));
        System.out.print("future investment value is: $" + futureInvestmentValue);
        input.close();
    }
}
