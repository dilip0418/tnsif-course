package com.dilip.dayNineCodes.MultiThreadingDemo.InterThreadCommunication.RealWorldExample;

public class Account implements Bank {

	private int accNo;
	private String name;
	private double balance;

	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}

	@Override
	public void deposit(int amt) throws MaximumDepositLimitException {
		if (amt > MAX_DEPOSIT_LIMIT)
			throw new MaximumDepositLimitException();
		else {
			balance += amt;
			System.out.println("Amount Deposited Successfully!\n Balance: " + balance);
		}
	}

	@Override
	public void withdraw(int amt) throws MinimumBalanceExceptioin {
		if (balance - amt < MIN_BALANCE)
			throw new MinimumBalanceExceptioin();
		else {
			balance -= amt;
			System.out.println("Amount Withdraw Successful!\n Balance: "+balance);
		}
	}


}
