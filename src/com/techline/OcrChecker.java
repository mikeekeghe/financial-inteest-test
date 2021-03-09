package com.techline;

import java.util.Scanner;

public class OcrChecker {

    public static void main(String[] args) {
        String remainder = "";
        String finalNumber = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word amount to deposit (exit to quit): ");
        String wordAmount = input.nextLine();
        Double numberAmount = null;
        if (wordAmount.equalsIgnoreCase("exit")) {
            System.exit(1);
        } else {
            Scanner input2 = new Scanner(System.in);
            System.out.print("Enter the number amount:  ");
            numberAmount = input2.nextDouble();
            // check to see if the line contains "hundred"
            boolean containsHundred, containsNinety, containsEighty, containsSeventy, containsSixty,
                    containsFifty, containsForty, containsThirty, containsTwenty;
            String hundredsDigit = "";
            // Attach a Scanner object to the input string
            Scanner cheqScanner = new Scanner(wordAmount);
            containsHundred = wordAmount.contains("hundred");
            containsNinety = wordAmount.contains("ninety");
            containsEighty = wordAmount.contains("eighty");
            containsSeventy = wordAmount.contains("seventy");
            containsSixty = wordAmount.contains("sixty");
            containsFifty = wordAmount.contains("fifty");
            containsForty = wordAmount.contains("forty");
            containsThirty = wordAmount.contains("thirty");
            containsTwenty = wordAmount.contains("twenty");

            if (containsHundred) {
                // the cheque has a hundreds amount read the digit
                hundredsDigit = cheqScanner.next();
                // read the discard the word "hundred"
                cheqScanner.next();
                // read the remainder of the String till the end of line
                remainder = cheqScanner.nextLine();
                System.out.printf("Hundreds digit was: %s%n", hundredsDigit);
                System.out.printf("Remainder of the line is:%s%n", remainder);
                switch (hundredsDigit) {
                    case "one":
                        finalNumber = "1";
                        break;

                    case "two":
                        finalNumber = "2";
                        break;

                    case "three":
                        finalNumber = "3";
                        break;

                    case "four":
                        finalNumber = "4";
                        break;

                    case "five":
                        finalNumber = "5";
                        break;

                    case "six":
                        finalNumber = "6";
                        break;

                    case "seven":
                        finalNumber = "7";
                        break;

                    case "eight":
                        finalNumber = "8";
                        break;

                    case "nine":
                        finalNumber = "9";
                        break;

                }
            }
            if ((remainder==null) || (remainder.equals(""))){
                remainder = cheqScanner.nextLine();
            }
            if (containsNinety) {
                finalNumber += "9";
            } else if (containsEighty) {
                finalNumber += "8";
            } else if (containsSeventy) {
                finalNumber += "7";
            } else if (containsSixty) {
                finalNumber += "6";
            } else if (containsFifty) {
                finalNumber += "5";
            } else if (containsForty) {
                finalNumber += "4";
            } else if (containsThirty) {
                finalNumber += "3";
            } else if (containsTwenty) {
                finalNumber += "2";
            }
            if (remainder.contains("one")) {
                finalNumber += "1";
            } else if (remainder.contains("two")) {
                finalNumber += "2";
            } else if (remainder.contains("three")) {
                finalNumber += "3";
            } else if (remainder.contains("four")) {
                finalNumber += "4";
            } else if (remainder.contains("five")) {
                finalNumber += "5";
            } else if (remainder.contains("six")) {
                finalNumber += "6";
            } else if (remainder.contains("seven")) {
                finalNumber += "7";
            } else if (remainder.contains("eight")) {
                finalNumber += "8";
            } else if (remainder.contains("nine")) {
                finalNumber += "9";
            } else if (remainder.contains("eleven")) {
                finalNumber += "11";
            } else if (remainder.contains("twelve")) {
                finalNumber += "12";
            } else if (remainder.contains("thirteen")) {
                finalNumber += "13";
            } else if (remainder.contains("fourteen")) {
                finalNumber += "14";
            } else if (remainder.contains("fifteen")) {
                finalNumber += "15";
            } else if (remainder.contains("sixteen")) {
                finalNumber += "16";
            } else if (remainder.contains("seventeen")) {
                finalNumber += "17";
            } else if (remainder.contains("eighteen")) {
                finalNumber += "18";
            } else if (remainder.contains("nineteen")) {
                finalNumber += "19";
            }

        }
        System.out.println("finalNumber is :"+ finalNumber);
        String newValue = String.valueOf((int)Math.round(numberAmount));
        System.out.println("newValue :"+ newValue);
        if (finalNumber.matches(newValue)) {
            System.out.println("Valid Check");
        } else {
            System.out.println("Invalid Cheque");
        }

    }
}
