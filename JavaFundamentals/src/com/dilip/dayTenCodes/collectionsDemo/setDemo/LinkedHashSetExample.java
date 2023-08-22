package com.dilip.dayTenCodes.collectionsDemo.setDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> fruits = new LinkedHashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("LinkedHashSet: " + fruits);
        System.out.println("Contains 'Apple': " + fruits.contains("Apple"));
        System.out.println("Size: " + fruits.size());

        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        fruits.clear();
        System.out.println("Cleared LinkedHashSet: " + fruits);
    }
}
