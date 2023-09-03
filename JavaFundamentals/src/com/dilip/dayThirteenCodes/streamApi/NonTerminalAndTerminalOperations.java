package com.dilip.dayThirteenCodes.streamApi;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NonTerminalAndTerminalOperations {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape", "kiwi", "lemon");

		// INTERMEDIATE OPERATIONS/METHODS
		
		// Filter words starting with 'c'
		List<String> filteredWords = words.stream().filter(word -> word.startsWith("c")).collect(Collectors.toList());
		System.out.println("Filtered words: " + filteredWords);

		// Map words to their lengths
		List<Integer> wordLengths = words.stream().map(String::length).collect(Collectors.toList());
		System.out.println("Word lengths: " + wordLengths);
		
		// Using flatMap to split each string into letters and collect them into a
		// single list
		List<Character> letters = words.stream().flatMap(str -> str.chars().mapToObj(c -> (char) c))
				.collect(Collectors.toList());
		System.out.println(letters);
		
		// Distinct words
		List<String> distinctWords = words.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct words: " + distinctWords);

		// Sorted words
		List<String> sortedWords = words.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted words: " + sortedWords);

		// Sorted words by length
		List<String> sortedWordsByLength = words.stream().sorted((a, b) -> Integer.compare(a.length(), b.length()))
				.collect(Collectors.toList());
		System.out.println("Sorted words by length: " + sortedWordsByLength);

		// Peek and Limit
		List<String> peekedWords = words.stream().peek(word -> System.out.println("Peek: " + word)).limit(3)
				.collect(Collectors.toList());
		System.out.println("Limited words: " + peekedWords);

		// Skip
		List<String> skippedWords = words.stream().skip(2).collect(Collectors.toList());
		System.out.println("Skipped words: " + skippedWords);

		
		//TERMINAL OPERATIONS/METHODS
        IntStream numbers = IntStream.range(1, 6);

        // forEach - printing each element
        numbers.forEach(System.out::println);

        // Re-create the stream
        numbers = IntStream.range(1, 6);

        // toArray - convert to an array
        int[] numberArray = numbers.toArray();
        System.out.println("Array: " + Arrays.toString(numberArray));

        // Re-create the stream
        numbers = IntStream.range(1, 6);

        // reduce - calculate the sum
        int sum = numbers.reduce(0, (x, y) -> x + y);
        System.out.println("Sum: " + sum);

        // Collect - collect to a list
        numbers = IntStream.range(1, 6);
        List<Integer> list = numbers.boxed().collect(Collectors.toList());
        System.out.println("List: " + list);

        // min - find the minimum
        numbers = IntStream.range(1, 6);
        OptionalInt min = numbers.min();
        System.out.println("Min: " + min.getAsInt());

        // count - count elements
        numbers = IntStream.range(1, 6);
        long count = numbers.count();
        System.out.println("Count: " + count);
        
        List<String> names = Stream.of("Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace")
                .collect(Collectors.toList());

        // anyMatch / allMatch / noneMatch
        boolean anyStartsWithA = names.stream().anyMatch(name -> name.startsWith("A"));
        boolean allStartWithA = names.stream().allMatch(name -> name.startsWith("A"));
        boolean noneStartWithZ = names.stream().noneMatch(name -> name.startsWith("Z"));

        System.out.println("Any start with 'A': " + anyStartsWithA);
        System.out.println("All start with 'A': " + allStartWithA);
        System.out.println("None start with 'Z': " + noneStartWithZ);

        // findFirst / findAny
        Optional<String> first = names.stream().findFirst();
        Optional<String> any = names.stream().findAny();

        System.out.println("First name: " + first.orElse("No names"));
        System.out.println("Any name: " + any.orElse("No names"));

        // forEachOrdered
        System.out.print("Names in original order: ");
        names.stream().forEachOrdered(name -> System.out.print(name + " "));
        System.out.println();

        // summaryStatistics
        IntSummaryStatistics stats = names.stream()
                .mapToInt(name -> name.length())
                .summaryStatistics();

        System.out.println("Statistics: ");
        System.out.println("  Count: " + stats.getCount());
        System.out.println("  Min Length: " + stats.getMin());
        System.out.println("  Max Length: " + stats.getMax());
        System.out.println("  Sum Length: " + stats.getSum());
        System.out.println("  Average Length: " + stats.getAverage());
        
	}

}
