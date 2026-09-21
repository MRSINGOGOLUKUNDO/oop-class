package com.zut;

public class BankAccount {
    // Attributes - instance variables - data
    private String accountHolder;
    private double balance;

    public BankAccount (String accountHoldersName){
        this.accountHolder = accountHoldersName;
        this.balance = 0;
    }

    // State or behaviour
    public void deposit(double ammount) {
        // if (this.isValidAmount(ammount)){
        //  this.balance = this.balance + ammount;
        // }
         if (ammount <= 0 ){
             throw new IllegalArgumentException("Deposit must be positive. got: " + ammount);
        }
         this.balance = this.balance + ammount;

    }

    public void withdraw(double ammount) {
       
        if (ammount > balance) {
            System.out.println("Insufficient funds...");
            return;
        }
        this.balance = this.balance - ammount;
    }
    private boolean isValidAmount (double amount) {
        return amount > 0;
    }
    // Getter for balance
    public double getBalance() {
        return this.balance;
    }
    public void setBalance (double amount){
        this.balance = amount;
    }
    //Getter for account details
    public void getAccountDetails() {
        System.out.println("Account Holder: " + this.accountHolder + ", \nBalance: " + this.balance);
    }

}
