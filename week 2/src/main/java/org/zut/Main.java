package org.zut;

public class Main {
    static void main() {

        BankAccount lukundosAcount = new BankAccount();
        lukundosAcount.accountHolder = "Lukundo";
        lukundosAcount.balance = 100;

        System.out.println("Before Deposit: " + lukundosAcount.balance);
        lukundosAcount.deposit(100);
        System.out.println("After Deposit: " + lukundosAcount.balance);
        }
    }

