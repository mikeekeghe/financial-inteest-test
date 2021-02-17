package com.techline;

public class credits {

    public static void main(String[] args) {
int credits =0;
       if (credits < 30) {
           System.out.println("freshman");
       }
       else if (credits >= 30 && credits < 60) {
           System.out.println("sophomore");
       }
       else if(credits >= 60 && credits < 90) {
           System.out.println("junior");
       }
       else{
           System.out.println("senior");
       }
    }
}
