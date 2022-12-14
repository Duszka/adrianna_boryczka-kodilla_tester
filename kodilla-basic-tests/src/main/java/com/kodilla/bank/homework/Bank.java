package com.kodilla.bank.homework;

public class Bank {
    private CashMachine cashMachine[];

    public Bank(CashMachine cashMachines[]) {
        this.cashMachine = cashMachines;
    }

    public int AllTransactions() {
        int allTransactions = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            allTransactions = allTransactions + cashMachine[i].getBalance();
        }
        return allTransactions;
    }

    public int getAllPositiveBalanceTransactions() {
        int positiveBalanceTransactions = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            positiveBalanceTransactions += cashMachine[i].getPositiveBalanceSum();
        }
        return positiveBalanceTransactions;
    }

    public int getAllNegativeBalanceTransactions() {
        int negativeBalanceTransactions = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            negativeBalanceTransactions += cashMachine[i].getNegativeBalanceSum();
        }
        return negativeBalanceTransactions;
    }

    public double getPositiveBalanceAverage() {
        for (int i = 0; i < cashMachine.length; i++) {
            if (cashMachine[i].getBalance() == 0) {
                return 0;
            }
        }
        double positiveBalanceAverage = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            positiveBalanceAverage += cashMachine[i].getAverageOfPositiveBalance() / cashMachine.length;
        }
        return positiveBalanceAverage;
    }

    public double getNegativeBalanceAverage() {
        for (int i = 0; i < cashMachine.length; i++) {
            if (cashMachine[i].getBalance() == 0) {
                return 0;
            }
        }
        double negativeBalanceAverage = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            negativeBalanceAverage += cashMachine[i].getNegativeBalanceSum() / cashMachine.length;
        }
        return negativeBalanceAverage;
    }

    public static void main(String[] args) {
        CashMachine mbank = new CashMachine();
        mbank.add(450);
        mbank.add(-70);
        mbank.add(-120);
        mbank.add(900);
        mbank.add(-320);

        System.out.println(mbank.getNumberOfTransactions() + " transactions were executed.");
        System.out.println("The balance in mbank is " + mbank.getBalance() + " PLN.");
        System.out.println(mbank.getPositiveBalance() + " deposit transactions were made.");
        System.out.println(mbank.getNegativeBalance() + " withdrawal transactions were made.");
        System.out.println("The average value of deposits is " + mbank.getPositiveBalanceSum());
        System.out.println("The average value of withdrawals is " + mbank.getNegativeBalanceSum());

        CashMachine millennium = new CashMachine();
        millennium.add(500);
        millennium.add(-90);
        millennium.add(300);
        millennium.add(-610);
        millennium.add(280);
        millennium.add(-70);

        System.out.println(millennium.getNumberOfTransactions() + " transactions were executed.");
        System.out.println("The balance in millennium is " + millennium.getBalance() + " PLN.");
        System.out.println(millennium.getPositiveBalance() + " deposit transactions were made.");
        System.out.println(millennium.getNegativeBalance() + " withdrawal transactions were made.");
        System.out.println("The average value of deposits is " + millennium.getPositiveBalanceSum());
        System.out.println("The average value of withdrawals is " + millennium.getNegativeBalanceSum());
    }
}