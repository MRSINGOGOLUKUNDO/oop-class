package org.zut;

public class Main {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();
        myAccount.balance = 500;

        applyBonusToAccount(myAccount);

        System.out.println("myAccount: " + myAccount.balance);

        int cash = 500;

        applyBonusToAmount(cash);

        System.out.println("cash: " + cash);
    }

    public static void applyBonusToAccount(BankAccount acc) {
        acc.balance = acc.balance + 100;
    }

    public static void applyBonusToAmount(int amount) {
        amount = amount + 100;
    }
}