package com.dilip.dayTwelveCodes.lambdaDemo.withFunctionalInterfaces.basic;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		/*
		 * methods in Supplier: 
		 * 1. accept()
		 * andThen()
		 */

		
		Consumer<String> printInUpperCase = str -> System.out.println(str.toUpperCase());
		printInUpperCase.accept("hello");
		
		
        Consumer<String> printInLowerCase = str -> System.out.println(str.toLowerCase());

        Consumer<String> printInBothCases = printInUpperCase.andThen(printInLowerCase);
        printInBothCases.accept("Java");
	}

}
