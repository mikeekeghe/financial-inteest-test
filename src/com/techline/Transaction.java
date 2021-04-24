package com.techline;


public class Transaction {
    private String accountType;
    private long accountNumber;
    private String transactionDate;
    private int chequeNumber;
    private String description1;
    private String description2;
    private double cadAmount;

    Transaction(String accountType, long accountNumber, String transactionDate, int chequeNumber, String description1,  String description2, double cadAmount, int USD){

    }

    Transaction() {

    }



    public long getAccountNumber() {
        return accountNumber;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public int getChequeNumber() {
        return chequeNumber;
    }

    public String getDescription1() {
        return description1;
    }

    public String getDescription2() {
        return description2;
    }

    public double getCadAmount() {
        return cadAmount;
    }

    @Override

    public String toString() {
        return "";
    }

}
