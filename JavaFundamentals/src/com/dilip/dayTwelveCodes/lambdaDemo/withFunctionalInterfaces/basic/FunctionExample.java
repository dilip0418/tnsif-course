package com.dilip.dayTwelveCodes.lambdaDemo.withFunctionalInterfaces.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.lang.*;

public class FunctionExample {

	public static void main(String[] args) {

		// Function Interface (accepts arguments - returns result)
		/*
		 * methods in this interface: 
		 * 1. apply() 
		 * 2. andThen()
		 * 3. compose()
		 * 4. identity()
		 */
		Function<Integer, Boolean> isEven = n -> n % 2 == 0;
		System.out.println(isEven.apply(5));

		Function<String, String> toUpper = str -> str.toUpperCase();
		System.out.println(toUpper.apply("dilip"));

		Function<Integer, Integer> square = num -> num * num;
		Function<Integer, String> convertToString = num -> "Result: " + num;

		Function<Integer, String> squareAndToString = square.andThen(convertToString);
		String result = squareAndToString.apply(5);
		System.out.println(result);
		
		Function<Integer, Integer> square1 = num -> num * num;
        Function<Integer, String> convertToString1 = num -> "Result: " + num;

        Function<Integer, String> convertAndSquare = convertToString1.compose(square1);
        String result1 = convertAndSquare.apply(5);
        System.out.println(result1);
        
        
        
        /*
         * Use this link to better understand the usage of identity() method 
         * Link: https://javabydeveloper.com/java-8-identity-function-examples/
         */
        Function<Integer, Integer> identityFunction = Function.identity();

        int result2 = identityFunction.apply(7);
        System.out.println(result2);
	}

}
