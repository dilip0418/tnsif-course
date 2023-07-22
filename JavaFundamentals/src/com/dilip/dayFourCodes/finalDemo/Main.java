package com.dilip.dayFourCodes.finalDemo;

public final class Main {
	// Final static variable
	final static int FINAL_STATIC_VARIABLE = 10;

	// Final instance variable
	final int FINAL_INSTANCE_VARIABLE = 20;

	// Final static method
	final static void finalStaticMethod() {
		System.out.println("This is a final static method.");
	}

	// Final instance method
	final void finalInstanceMethod() {
		System.out.println("This is a final instance method.");
	}

	// Example snippet to show that declaring a class as final avoids inheritance
	/*
	 * class SubFinal extends Main {
	 * 
	 * }
	 */

	public static void main(String[] args) {
		// Accessing final static variable and final static method directly using class
		// name
		System.out.println("Final static variable: " + Main.FINAL_STATIC_VARIABLE);
		Main.finalStaticMethod();

		// Example snippet to show that the variable cannot be modified.
		/*
		 * System.out.println(++Main.FINAL_STATIC_VARIABLE);
		 */

		// Creating an instance of the class to access final instance variable and final
		// instance method
		Main obj = new Main();
		System.out.println("Final instance variable: " + obj.FINAL_INSTANCE_VARIABLE);
		obj.finalInstanceMethod();
	}
}
