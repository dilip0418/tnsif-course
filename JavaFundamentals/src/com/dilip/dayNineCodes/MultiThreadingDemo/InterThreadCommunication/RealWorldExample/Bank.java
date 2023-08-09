package com.dilip.dayNineCodes.MultiThreadingDemo.InterThreadCommunication.RealWorldExample;

public interface Bank {
	int MIN_BALANCE = 3000;
	int MAX_DEPOSIT_LIMIT = 25000;

	void deposit(int amt) throws MaximumDepositLimitException;

	void withdraw(int amt) throws MinimumBalanceExceptioin;
}
