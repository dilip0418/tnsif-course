package com.dilip.dayNineCodes.MultiThreadingDemo.InterThreadCommunication.RealWorldExample;

public class XBank extends Thread {
	private Account a;
	int amt;

	public XBank(Account a, int amt) {
		this.a = a;
		this.amt = amt;
		start();
	}
	
	
	@Override
	public String toString() {
		return "XBank [a=" + a + ", amt=" + amt + "]";
	}

	@Override
	public void run() {
		try {
			a.withdraw(amt);
			try {
				a.deposit(amt);
			} catch (MaximumDepositLimitException e) {
				e.getMessage();
			}
		}catch (MinimumBalanceExceptioin e) {
			System.out.println(e.getMessage());
		}
		
	}
}
