package com.dilip.dayFiveCodes.abstractDemo.functionalInterfaces;

@FunctionalInterface
interface Calculator {
	int calculate(int a, int b);
}

public class Example2 {

	public static void main(String[] args) {

		// Using Lambda expressions to implement the calculator
		Calculator addition = (a, b) -> a + b;
		Calculator subtraction = (a, b) -> a - b;
		Calculator multiplication = (a, b) -> a * b;
		Calculator division = (a, b) -> {
			if (b != 0) {
				return a / b;
			} else {
				throw new ArithmeticException("Cannot divide by zero.");
			}
		};

		// Using the calculator with Lambda expressions
		System.out.println("Addition: " + addition.calculate(5, 3)); // Outputs "Addition: 8"
		System.out.println("Subtraction: " + subtraction.calculate(5, 3)); // Outputs "Subtraction: 2"
		System.out.println("Multiplication: " + multiplication.calculate(5, 3)); // Outputs "Multiplication: 15"
		System.out.println("Division: " + division.calculate(6, 3)); // Outputs "Division: 2"
	}

}
