package com.dilip.dayTenCodes.collectionsDemo.setDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> animals = new HashSet<>();

        // Add elements
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Elephant");
        animals.add("Lion");

        // Display the HashSet
        System.out.println("HashSet: " + animals);

        // Check if an element exists
        boolean containsDog = animals.contains("Dog");
        System.out.println("Contains 'Dog': " + containsDog);

        // Size of the HashSet
        int size = animals.size();
        System.out.println("Size of HashSet: " + size);

        // Remove an element
        boolean removedElephant = animals.remove("Elephant");
        System.out.println("Removed 'Elephant': " + removedElephant);
        System.out.println("HashSet after removal: " + animals);

        // Clear the HashSet
        animals.clear();
        System.out.println("Cleared HashSet: " + animals);

        // Is the HashSet empty?
        boolean isEmpty = animals.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty);
    }
}
