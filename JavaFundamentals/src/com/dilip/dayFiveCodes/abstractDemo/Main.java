package com.dilip.dayFiveCodes.abstractDemo;

//Abstract class representing a generic bank account
abstract class BankAccount {
 protected String accountNumber;
 protected double balance;

 public BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // Abstract method to withdraw money (to be implemented by concrete subclasses)
 public abstract void withdraw(double amount);

//Abstract method to deposit money (to be implemented by concrete subclasses)
 public void deposit(double amount) {
	 balance += amount;
     System.out.println("Successfully deposited Rs. " + amount);
     this.checkBalance();
 };

 // Concrete method to check account balance
 public void checkBalance() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: Rs. " + balance);
     System.out.println();
 }
}

//Concrete subclass representing a savings account
class SavingsAccount extends BankAccount {
 private double interestRate;

 public SavingsAccount(String accountNumber, double balance, double interestRate) {
     super(accountNumber, balance);
     this.interestRate = interestRate;
 }

 @Override
 public void withdraw(double amount) {
     if (balance - amount >= 0) {
         balance -= amount;
         System.out.println("Successfully withdrawn $" + amount);
     } else {
         System.out.println("Insufficient balance.");
     }
     System.out.println();
 }


 public void addInterest() {
     double interest = balance * interestRate / 100;
     balance += interest;
     System.out.println("Interest added: $" + interest);
     System.out.println();
 }
 
}

//Concrete subclass representing a checking account
class CheckingAccount extends BankAccount {
 private double overdraftLimit;

 public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
     super(accountNumber, balance);
     this.overdraftLimit = overdraftLimit;
 }

 @Override
 public void withdraw(double amount) {
     if (balance - amount >= -overdraftLimit) {
         balance -= amount;
         System.out.println("Successfully withdrawn $" + amount);
     } else {
         System.out.println("Insufficient balance. You have reached your overdraft limit.");
     }
     System.out.println();
 }
}

public class Main {
 public static void main(String[] args) {
     SavingsAccount savingsAccount = new SavingsAccount("QWERTY123", 1000.0, 2.5);
     CheckingAccount checkingAccount = new CheckingAccount("YTREWQ321", 500.0, 200.0);

     savingsAccount.checkBalance();
     savingsAccount.withdraw(200.0);
     savingsAccount.addInterest();
     savingsAccount.checkBalance();
     savingsAccount.deposit(300.0);
     
     
     System.out.println();

     checkingAccount.checkBalance();
     checkingAccount.withdraw(700.0);
     checkingAccount.withdraw(400.0);
     checkingAccount.checkBalance();
     checkingAccount.deposit(300.0);
 }
}
