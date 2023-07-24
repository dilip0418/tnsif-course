package com.dilip.dayFiveCodes.abstractDemo.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface NumberFilter {
	boolean test(int number);
}

public class Example3 {

	public static void main(String[] args) {
		// Using Lambda expressions to implement the number filter
		NumberFilter isEven = (number) -> number % 2 == 0;
		NumberFilter isPositive = (number) -> number > 0;

		// Sample list of numbers
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -11);

		// Filtering numbers using Lambda expressions
		List<Integer> evenNumbers = filterNumbers(numbers, isEven);
		List<Integer> positiveNumbers = filterNumbers(numbers, isPositive);

		// Output the filtered lists
		System.out.println("Even Numbers: " + evenNumbers); // Outputs "Even Numbers: [2, 4, 6, 8, 10]"
		System.out.println("Positive Numbers: " + positiveNumbers); // Outputs "Positive Numbers: [1, 2, 3, 4, 5, 6, 7,
																	// 8, 9, 10]"
	}

	// Method to filter numbers based on the given condition
	private static List<Integer> filterNumbers(List<Integer> numbers, NumberFilter filter) {
		List<Integer> filteredNumbers = new ArrayList<>();
		for (int number : numbers) {
			if (filter.test(number)) {
				filteredNumbers.add(number);
			}
		}
		return filteredNumbers;
	}

}
