package com.techline;

import java.util.*;

public class NumberMatching

{



    public static void main (String [] args)

    {

        int[] numbers1 = {-7, -5, -4, 1, -6, -10, -9, -5, 6, 9};

        int[] numbers2 = {1, 4, 9, 10, 13, 15, 12, 14, 20, 15};

        int[] searchValues = {-10, -5, 0};

        int numFound;



        System.out.println("Number set  1: " + Arrays.toString(numbers1));

        System.out.println("Number set  2: " + Arrays.toString(numbers2));

        System.out.println("Search values: " + Arrays.toString(searchValues));



        numFound = countMatches(numbers1, searchValues);

        System.out.printf("%nFirst number set contains %d of the search values%n", numFound);



        numFound = countMatches(numbers2, searchValues);

        System.out.printf("%nSecond number set contains %d of the search values%n", numFound);

    }



    // write countMatches here !!
    private static int countMatches(int[] inputNumArray, int[] searchArray) {
        int count = 0;
        for (int i = 0; i < searchArray.length; i++) {

            for (int j = 0; j < inputNumArray.length; j++) {

                if (searchArray[i] == inputNumArray[j]){
                    count ++;
                }
            }
        }

        return count;
    }

}
