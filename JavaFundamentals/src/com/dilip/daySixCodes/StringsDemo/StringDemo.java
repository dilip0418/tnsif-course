package com.dilip.daySixCodes.StringsDemo;

public class StringDemo {

	public static void main(String[] args) {
		// Different ways to create a string.

		// 1. Using Character Arrays
		char name[] = { 'd', 'i', 'l', 'i', 'p' };
		System.out.println(name);

		// 2. using the string literals.
		String str1 = "dilip";
		System.out.println(str1);

		// 3. using the new keyword and the string constructor
		String str2 = new String("dilip using new");
		System.out.println(str2);

		// using the substring method
		String sub = str2.substring(0, 6);
		System.out.println(sub);

	}
}
