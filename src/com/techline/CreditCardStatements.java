package com.techline;

//Date and Name
import java.io.*;
import java.util.*;

public class CreditCardStatements {

//    final static String FROM_FILE_LOCATION = "D:\\desktop\\tester.txt";
//    final static String TO_FILE_LOCATION = "D:\\Desktop\\transactions.txt";
    final static String FROM_FILE_LOCATION = "src/tester.txt";
    final static String TO_FILE_LOCATION = "src/transactions.txt";

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int decision;

        System.out.println("Credit Card Processing");
        System.out.println("\n1. Load Transactions");
        System.out.println("2. Produce Summary");
        System.out.println("3. Create Statement");
        System.out.println("0. Exit");
        System.out.print("\nEnter Selection: ");
        decision = Integer.parseInt(in.nextLine());

        switch (decision) {

            case 1:
                LoadTransactions();
                break;

            case 2:
                ProduceSummary();
                break;
            case 3:
                CreateStatement();
                break;
            case 0:
                System.exit(0);
                break;

            default:
                System.out.println("Invalid option selected.");

        }

    }

    public static void LoadTransactions() {
        Scanner in = new Scanner(System.in);

        ArrayList<Transaction> list = new ArrayList<Transaction>();
        Transaction t;

        System.out.print("Enter account type: ");
        String accType = in.nextLine();
        System.out.print("Enter account number: ");
        long accNumber = Long.parseLong(in.nextLine());
        System.out.print("Enter transaction date: ");
        String transDate = in.nextLine();
        System.out.print("Enter cheque number: ");
        int chequeNum = Integer.parseInt(in.nextLine());
        System.out.print("Enter description 1: ");
        String description1 = in.nextLine();
        System.out.print("Enter description 2: ");
        String description2 = in.nextLine();
        System.out.print("Enter CAD$: ");
        double CAD$ = Double.parseDouble(in.nextLine());
        System.out.print("Enter USD$: ");
        int USD$ = Integer.parseInt(in.nextLine());

        t = new Transaction(accType, accNumber, transDate, chequeNum, description1, description2, CAD$, USD$);
        list.add(t);

    }

    public static void ProduceSummary() { //on screen report

        System.out.println(display());

    }

    public static void CreateStatement() {
        try {

            FileWriter toFile = new FileWriter(TO_FILE_LOCATION);
            BufferedReader fromFile = new BufferedReader(new FileReader(FROM_FILE_LOCATION));

            String data;
            //loop while there is info in the provided file
            while ((data = fromFile.readLine()) != null) {
                int count = 0;

                String[] answer = data.split(",");

                String  transactionDate = answer[2].trim();
                String description1 = answer[4].trim();
                double cadAmount = Double.parseDouble(answer[6].trim());
                count ++;
                String summary = display();

                String a, b, c, d = "", e;

                a = "\n\nStatement for " + transactionDate;
                b = "\n\nTransaction\t\tActivity Description\t\t\tAmount($)";
                c = "\n======================================================";

                for (int i = 0; i < count; i++) {
                    d = "\n" + transactionDate + "\t\t" + description1 + "\t\t" + cadAmount;
                }

                e = "\n\nClosing balance: ";


                String statement = a + b + c + d + e;

                String display = summary + statement;

                toFile.write(display);
                toFile.close();

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }//end of createStatement()

    public static String display() {

        Scanner in = new Scanner(System.in);
        String display = "";
        System.out.print("Enter name: ");
        String customerName = in.nextLine();
        System.out.print("Enter opening balance: $");
        double openingBalance = Double.parseDouble(in.nextLine());
        System.out.print("Enter Credit Limit: $");
        double creditLimit = Double.parseDouble(in.nextLine());
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter Transaction File ");
        String transactionFile =input1.nextLine();


        try {
            BufferedReader inFile = new BufferedReader(new FileReader(transactionFile));
            Transaction trans = new Transaction();

            String data;

            while ((data = inFile.readLine()) != null) {

                String[] answer = data.split(",");
                //eliminate the "" from the bank account type
                String accountType = answer[0].substring(1,answer[0].length()-1);
                //remove the letter at the end of the account Number
                int len = answer[1].length() - 1;
                //remove any spaces to prevent errors when converting to long
                String accountNum1 = answer[1].substring(0, len).trim();
                long accountNumber = Long.parseLong(accountNum1);
                String transactionDate = answer[2].trim();
                int chequeNumber = Integer.parseInt(answer[3].trim());
                String description1 = answer[4].trim();
                String description2 = answer[5].trim();
                double cadAmount = Double.parseDouble(answer[6].trim());

                double availableCredit = 0;
                double purchases = 0;
                purchases += cadAmount;
                double paymentsAndCredits = Math.round(openingBalance + purchases);
                double purchasesAndDebits = openingBalance - purchases;
                double newBalance = creditLimit - purchasesAndDebits;
                availableCredit = creditLimit;
                int rewardDollars = (int) Math.round(purchasesAndDebits * 0.015);
                double minPayment = Math.round(newBalance * 0.05);

                String accNumber = Long.toString(accountNumber);
                //convert String accNumber into a char array
                char[] hiddenCharacters = accNumber.toCharArray();

                for (int i = 6; i < 13; i++) {
                    hiddenCharacters[i] = '*';
                }
                String outputAccNumber = new String(hiddenCharacters);

                //following variables will be used for layout purposes of the statement in the text file
                String a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p;
                a = "\n\n\t\tWORLD BANK " + accountType;
                b = "\n\nSummary for:\t\t\t" + customerName;
                c = "\nAccount Number:\t\t\t" + outputAccNumber;
                d = "\nRewards Summary:\t\t";
                e = "\nReward Dollars Earned:\t\t" + rewardDollars;
                f = "\nPayments and Interest Rates:";
                g = "\nMinimum Payment:\t\t$" + minPayment;
                h = "\nCredit Limit:\t\t\t$" + creditLimit;
                i = "\nAvailable Credit\t\t$" + trans.getCadAmount();
                j = "\nAnnual Interest Rate";
                k = "\nPurchases:\t\t\t$" + purchases;
                l = "\nCalculating your Balance";
                m = "\nOpening Balance: \t\t$" + openingBalance;
                n = "\nPayments and Credits:\t\t$" + paymentsAndCredits;
                o = "\nPurchases and Debits:\t\t$" + purchasesAndDebits;
                p = "\nNEW BALANCE:\t\t\t$" + newBalance;

                display = a + b + c + d + e + f + g + h + i + j + k + l + m + n + o + p;

            }

            inFile.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return display;
    }
}
/*
 World Bank MasterCard

 Summary for Harvey Wallbanger
 Account Number: 552490******3920
 Rewards Summary:
 Reward Dollars Earned:    67
 Payments and Interest Rates
 Minimum Payment        $146.67
 Credit Limit      $10000.00
 Available Credit       $7066.57
 Annual Interest Rate
 Purchases         19.99%
 Calculating your Balance
 Opening Balance        $895.91
 Payments and Credits      $-2444.02
 Purchases and Debits       $4481.54
 NEW BALANCE       $2933.43

 Statement for 4/9/2020 to 5/7/2020

 PREVIOUS STATEMENT BALANCE                                     $895.91

 Transaction    Activity Description                          Amount($)
 ======================================================================
 4/9/2020       SWISS CHALET #1912 CALGARY AB                    $32.31

 4/10/2020      WAL*MART CANADA INC Mississauga ON              $200.95

 4/11/2020      Amazon.ca Prime Member amazon.ca/priBC            $8.39

 4/11/2020      AMZN Mktp CA*M58d33330 WWW.AMAZON.CAON           $62.98
 .
 .
 .
 5/7/2020       NBX*WYCLIFFE BIBLE TRA CALGARY AB               $140.00

 5/7/2020       THE HOME DEPOT #7082 CALGARY AB                  $27.28

 Closing Balance                                $2933.43

 */
