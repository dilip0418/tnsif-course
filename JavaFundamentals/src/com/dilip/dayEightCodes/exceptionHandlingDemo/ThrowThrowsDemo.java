package com.dilip.dayEightCodes.exceptionHandlingDemo;

//custom exception class (condition: one should extend the Exception class to define a custom exception class) 
class InvalidAgeException extends Exception {

	public InvalidAgeException(String message) {
		super(message); // Constructs a new exception with the specified detail message. (to say it in
						// simple words: The object of Exception type is created)
	}
}

public class ThrowThrowsDemo {
	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be at least 18 years."); // throw the exception with the message to
																				// show as the argument
		} else {
			System.out.println("Valid age: " + age);
		}
	}

	public static void main(String[] args) {
		try {
			int age = 15;
			validateAge(age);
		} catch (InvalidAgeException ex) {
			System.out.println("Exception caught: " + ex.getMessage());
		}
	}
}
