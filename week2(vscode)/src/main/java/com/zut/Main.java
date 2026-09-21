package com.zut;


public class Main {
    public static void main(String[] args) {
    
        BankAccount b2 = new BankAccount
         ("Lukundo");
      //  b2.getAccountDetails();
        try {
        b2.deposit(1000);
        System.out.println("Deposited. New balance: " + b2.getBalance());
    } catch (IllegalArgumentException e) {
        System.out.println("Deposit Rejected: " + e.getMessage());
    }
    finally {
        System.out.println("Transaction attempt logged.");
    }
       
       
      }  
    }
       
       
        /* 
       //Testing access levels

        Probe p = new Probe();
        System.out.println("Public " + p._public);  // Accessible
        System.out.println("Protected or package-private " + p._protected);  // Accessible within same package
        System.out.println("Default " + p._default);  // Accessible within same package
       // System.out.println("Private " + p._private);  // Not accessible
        */
       


       /*Testing with Auditor class
         Auditor a = new Auditor();
          a.inspect();
       */
          //Testing BankAccount class

      /*   BankAccount lukundosAccount = new BankAccount();

        lukundosAccount.accountHolder = "Lukundo";
        lukundosAccount.balance = 1;

        System.out.println("Before Deposit: " + lukundosAccount.balance);
        lukundosAccount.deposit(1000);
        System.out.println("After Deposit: " + lukundosAccount.balance);
        */
    