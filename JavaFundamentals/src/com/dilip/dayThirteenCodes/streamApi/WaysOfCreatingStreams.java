package com.dilip.dayThirteenCodes.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WaysOfCreatingStreams {

	public static void main(String[] args) {
		// 1. From a Collection:

		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		Stream<Integer> streamFromList = numbers.stream();
		streamFromList.forEach(System.out::println);

		// 2. From an Array:

		Integer[] array = { 1, 2, 3 };

		Stream<Integer> streamFromArray = Arrays.stream(array);
		streamFromArray.forEach(System.out::println);

		// 3. Using Stream.of():

		Stream<Integer> streamOfElements = Stream.of(1, 2, 3);
		streamOfElements.forEach(System.out::println);

		// 4. From Stream.Builder:
		Stream.Builder<String> builder = Stream.builder();
		builder.add("dilip");
		builder.add("gani");
		builder.add("rohit");

		Stream<String> streamFromStreamBuilder = builder.build();
		/*
		 * builder.add("abc"); 
		 * after the build method the bulider object can't be used
		 * anymore to add stream objects anymore
		 */
		streamFromStreamBuilder.map(name -> name.toUpperCase()).forEach(System.out::println);

		// and many more ways...
	}

}
