package com.techline;


public class harmonics {
    public static void main(String[] args) {
        float input, harmonic= 1;
        input = 2;
       for (int i = (int) input; i>1; i--){
           harmonic = harmonic + (1/input);
        }
        System.out.println("the final harmonic is " + harmonic);
    }
}
