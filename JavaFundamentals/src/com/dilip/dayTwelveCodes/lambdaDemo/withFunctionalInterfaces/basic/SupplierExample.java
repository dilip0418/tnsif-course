package com.dilip.dayTwelveCodes.lambdaDemo.withFunctionalInterfaces.basic;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		/*
		 * Methods in Supplier:
		 * 1. get()
		 */
		
		Supplier<String> helloSupplier = () -> "Hello, World!";

        String result = helloSupplier.get();
        System.out.println(result);

	}

}
