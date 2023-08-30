package com.dilip.dayTwelveCodes.lambdaDemo.withFunctionalInterfaces.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		/*
		 * methods in this interface: 
		 * 1. test() 
		 * 2. and()
		 * 3. negate()
		 * 4. or()
		 */
		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			numbers.add(i);
		}

		Predicate<Integer> isEven = n -> n % 2 == 0;
		System.out.print("Even numbers: ");
		numbers.forEach(number -> {
			if (isEven.test(number)) {
				System.out.print(number + " ");
			}
		});
		System.out.println();
		
		Predicate<Integer> isPositive = num -> num > 0;

        Predicate<Integer> evenAndPositive = isEven.and(isPositive);

        System.out.println("Is 6 even and positive? " + evenAndPositive.test(6));
        System.out.println("Is -5 even and positive? " + evenAndPositive.test(-5));
        
        
        Predicate<Integer> isOdd = isEven.negate();

        System.out.println("Is 7 odd? " + isOdd.test(7));
        
        
        Predicate<Integer> evenOrPositive = isEven.or(isPositive);

        System.out.println("Is 4 even or positive? " + evenOrPositive.test(4));
        System.out.println("Is -3 even or positive? " + evenOrPositive.test(-3));
	}

}
