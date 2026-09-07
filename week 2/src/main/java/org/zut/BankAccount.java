package org.zut;

public class BankAccount {
     String accountHolder;
    public double balance;

    public void deposit (double ammount){
         this.balance = this.balance + ammount;
        }
    public void withdraw(double ammount) {
         if (ammount > this.balance){
             System.out.println("Insufficient funds!");
             return;
         } else {
             this.balance = this.balance - ammount;
         }
         }

    }
