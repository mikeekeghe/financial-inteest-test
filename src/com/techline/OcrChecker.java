package com.techline;

import java.util.Scanner;

public class OcrChecker {

    public static void main(String[] args) {
        String firstLine, decimals, remainder, wordAmount;
        Double finalNumber, numberAmount;
        do {
            finalNumber = 0.0;
            numberAmount = 0.0;
            remainder = "";
            decimals = "";
            Scanner input1 = new Scanner(System.in);
            System.out.print("Enter the 1st line of the cheque to deposit  (exit to quit): ");
            firstLine = input1.nextLine();
            if (firstLine.equalsIgnoreCase("exit")) {
                System.exit(1);
            }
            if (firstLine.contains(".")) {
                int ind = firstLine.indexOf(".");
                decimals = firstLine.substring(ind + 1);
                //firstLine = firstLine.substring(0, ind);
            }
            firstLine = firstLine.replaceAll("\\D+", "");

            String newString = "";
            int index = (firstLine.length() - 3);

            for (int i = 0; i < firstLine.length(); i++) {

                newString += firstLine.charAt(i);

                if (i == index) {
                    newString += ".";
                }
            }
            numberAmount = Double.valueOf(newString);
            Scanner input2 = new Scanner(System.in);
            System.out.print("Enter the 2nd line of the cheque:  ");

            wordAmount = input2.nextLine();
            wordAmount = wordAmount.toLowerCase();

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
//            System.out.println("containsHundred is "+ containsHundred);
            if (containsHundred) {
                // the cheque has a hundreds amount read the digit
                hundredsDigit = cheqScanner.next();
                // read the discard the word "hundred"
                cheqScanner.next();
                // read the remainder of the String till the end of line
                remainder = cheqScanner.nextLine();
//                System.out.printf("Hundreds digit was: %s%n", hundredsDigit);
//                System.out.printf("Remainder of the line is:%s%n", remainder);
                switch (hundredsDigit) {
                    case "one":
                        finalNumber = 100.00;
                        break;

                    case "two":
                        finalNumber = 200.00;
                        break;

                    case "three":
                        finalNumber = 300.00;
                        break;

                    case "four":
                        finalNumber = 400.00;
                        break;

                    case "five":
                        finalNumber = 500.00;
                        break;

                    case "six":
                        finalNumber = 600.00;
                        break;

                    case "seven":
                        finalNumber = 700.00;
                        break;

                    case "eight":
                        finalNumber = 800.00;
                        break;

                    case "nine":
                        finalNumber = 900.00;
                        break;

                }
//                System.out.println("finalNumber at hunderds is : "+ finalNumber);
            }
            if ((remainder == null) || (remainder.equals(""))) {
                remainder = cheqScanner.nextLine();
            }
            if (containsNinety) {
                finalNumber += 90;
            } else if (containsEighty) {
                finalNumber += 80;
            } else if (containsSeventy) {
                finalNumber += 70;
            } else if (containsSixty) {
                finalNumber += 60;
            } else if (containsFifty) {
                finalNumber += 50;
            } else if (containsForty) {
                finalNumber += 40;
            } else if (containsThirty) {
                finalNumber += 30;
            } else if (containsTwenty) {
                finalNumber += 20;
            }
//            System.out.println("finalNumber at tens is : "+ finalNumber);

            if (remainder.contains("one")) {
                finalNumber += 1;
            } else if (remainder.contains("two")) {
                finalNumber += 2;
            } else if (remainder.contains("three")) {
                finalNumber += 3;
            } else if (remainder.contains("four")) {
                finalNumber += 4;
            } else if (remainder.contains("five")) {
                finalNumber += 5;
            } else if (remainder.contains("six ")) {
                finalNumber += 6;
            } else if (remainder.contains("seven ")) {
                finalNumber += 7;
            } else if (remainder.contains("eight ")) {
                finalNumber += 8;
            } else if (remainder.contains("nine ")) {
                finalNumber += 9;
            } else if (remainder.contains("eleven")) {
                finalNumber += 11;
            } else if (remainder.contains("twelve")) {
                finalNumber += 12;
            } else if (remainder.contains("thirteen")) {
                finalNumber += 13;
            } else if (remainder.contains("fourteen")) {
                finalNumber += 14;
            } else if (remainder.contains("fifteen")) {
                finalNumber += 15;
            } else if (remainder.contains("sixteen")) {
                finalNumber += 16;
            } else if (remainder.contains("seventeen")) {
                finalNumber += 17;
            } else if (remainder.contains("eighteen")) {
                finalNumber += 18;
            } else if (remainder.contains("nineteen")) {
                finalNumber += 19;
            }

            String finalNumberStr = String.valueOf(finalNumber);
            if (finalNumberStr.contains(".")) {
                int ind = finalNumberStr.indexOf(".");
                finalNumberStr = finalNumberStr.substring(0, ind);
            }
            finalNumberStr = finalNumberStr + "." + decimals;
            finalNumber = Double.valueOf(finalNumberStr);
//            System.out.println("Generated Number 2 is :"+ finalNumber);
//            System.out.println("entered numerals 2 :"+ numberAmount);
            if (finalNumber.equals(numberAmount)) {
                System.out.println("Numeric amount and word amount match!");
                System.out.println("Cheque amount deposited is $" + numberAmount);
            } else {
                System.out.println("ERROR: numeric amount and word amount DON'T MATCH.");
                System.out.println("Auto Deposit rejected.");
            }

        }
        while (!firstLine.equalsIgnoreCase("exit"));
    }
}