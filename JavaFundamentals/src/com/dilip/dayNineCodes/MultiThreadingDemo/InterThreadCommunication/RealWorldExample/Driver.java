package com.dilip.dayNineCodes.MultiThreadingDemo.InterThreadCommunication.RealWorldExample;

import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {

		Account account = new Account(101, "Dilip", 5000);
		System.out.println(account);

		XBank[] x = new XBank[6];
		for (int i = 0; i < x.length; i++) {
			int withdrawAmt = (i + 1) *1000;
			System.out.println(withdrawAmt);
			x[i] = new XBank(account, withdrawAmt);
		}

		try {
			for (int j = 0; j < x.length; j++)
				x[j].join();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
