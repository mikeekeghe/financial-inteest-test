package com.techline;

public class hacker1 {

    public static void main(String[] args) {
        int status=0;
        switch (status) {
            case 200:
                System.out.println("OK");
                break;
            case 403:
                System.out.println("Forbidden");
                break;
            case 404:
                System.out.println("not found");
                break;
            case 500:
                System.out.println("server error");
                break;
            default:
                // code block
        }
    }

}
