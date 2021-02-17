package com.techline;

public class StringTests {
    public static void main(String[] args) {
//        String var = "Mike";
//        System.out.println(var.length());

        String str= new String("quick brown fox jumps over the lazy dog");
        System.out.println("Substring starting from index 15:");
        System.out.println(str.substring(15));
        System.out.println("Substring starting from index 15 and ending at 20:");
        System.out.println(str.substring(15, 20));
    }
}
