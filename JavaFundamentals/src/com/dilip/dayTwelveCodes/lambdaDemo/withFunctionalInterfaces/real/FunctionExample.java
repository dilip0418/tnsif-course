package com.dilip.dayTwelveCodes.lambdaDemo.withFunctionalInterfaces.real;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/*
 * Here in this program we are mapping the length of the 
 * products (in real time scenarios the length might be any 
 * other metadata of the product) to the product.
 */

public class FunctionExample {
	public static void main(String[] args) {
		List<String> products = new ArrayList<>();
		products.add("Phone");
		products.add("Laptop");
		products.add("Tablet");

		Function<String, Integer> mapToLength = product -> product.length();
		for (String product : products) {
			int length = mapToLength.apply(product);
			System.out.println("Length of " + product + ": " + length);
		}
	}
}
