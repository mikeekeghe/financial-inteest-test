package com.techline;

import java.util.Scanner;

public class LastRightmost {
    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        x = input.nextInt();
        y = x % 10;
        System.out.println("the rightmost value is " + y);
        input.close();
    }
}