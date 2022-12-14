package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int numberOfTransactions;
    private int balance;
    private int positiveBalance;
    private int negativeBalance;

    public CashMachine() {
        this.numberOfTransactions = 0;
        this.transactions = new int[0];
        this.balance = 0;
    }

    public void add(int value) {
        this.numberOfTransactions++;
        int[] newTransactions = new int[this.numberOfTransactions];
        System.arraycopy(transactions, 0, newTransactions, 0, transactions.length);
        newTransactions[this.numberOfTransactions-1] = value;
        this.transactions = newTransactions;
        if (value > 0) {
            positiveBalance++;
        } else {
            negativeBalance++;
        }
    }

    public int getBalance() {
        for (int i = 0; i < this.numberOfTransactions; i++) {
            balance += transactions[i];
        }
        return balance;
    }

    public int getPositiveBalanceSum() {
        positiveBalance = 0;
        for (int i = 0; i <transactions.length; i++) {
            if(transactions[i] > 0) {
                positiveBalance += transactions[i];
            }
        }
        return positiveBalance;
    }

    public int getNegativeBalanceSum() {
        negativeBalance = 0;
        for (int i = 0; i < transactions.length; i++) {
            if(transactions[i] < 0) {
                negativeBalance += transactions[i];
            }
        }
        return negativeBalance;
    }

    public double getAverageOfPositiveBalance() {
        if (this.transactions.length == 0) {
            return 0;
        }

    double averageOfPositiveBalance = 0;
    for (int i = 0; i < this.numberOfTransactions; i++)
        if (this.transactions[i] > 0) {
            averageOfPositiveBalance = averageOfPositiveBalance + this.transactions[i];
        }
        return averageOfPositiveBalance / this.getPositiveBalanceSum();
    }

    public int[] getTransactions() {
        return transactions;
    }
    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public int getPositiveBalance() {
        return positiveBalance;
    }

    public int getNegativeBalance() {
        return negativeBalance;
    }
}
