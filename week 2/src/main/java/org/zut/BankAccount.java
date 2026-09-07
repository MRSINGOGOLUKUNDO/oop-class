package org.zut;

public class BankAccount {
     String accountHolder;
     double balance;

     void deposit (double ammount){
         this.balance = this.balance + ammount;
        }
     void withdraw(double ammount) {
         if (ammount > this.balance){
             System.out.println("Insufficient funds!");
             return;
         } else {
             this.balance = this.balance - ammount;
         }
         }

    }
