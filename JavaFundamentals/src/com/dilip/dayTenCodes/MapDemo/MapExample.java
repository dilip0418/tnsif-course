package com.dilip.dayTenCodes.MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		// Create a Map to store user preferences (Username, Theme)
		Map<String, String> userPreferences = new HashMap<>();

		// Adding user preferences
		userPreferences.put("alice", "Light Theme");
		userPreferences.put("bob", "Dark Theme");
		userPreferences.put("charlie", "Default Theme");

		// Display the Map
		System.out.println("User Preferences Map: " + userPreferences);

		// Check if a username exists
		boolean containsAlice = userPreferences.containsKey("alice");
		System.out.println("Does User Preferences Map contain 'alice'? " + containsAlice);

		// Check if a theme exists
		boolean containsDarkTheme = userPreferences.containsValue("Dark Theme");
		System.out.println("Does User Preferences Map contain 'Dark Theme'? " + containsDarkTheme);

		// Get entry set and iterate through it
		Set<Map.Entry<String, String>> entrySet = userPreferences.entrySet();
		System.out.println("Entry Set:");
		for (Map.Entry<String, String> entry : entrySet) {
			System.out.println("Username: " + entry.getKey() + ", Theme: " + entry.getValue());
		}

		// Get the value associated with a key
		String themeForBob = userPreferences.get("bob");
		System.out.println("Theme for 'bob': " + themeForBob);

		// Check if the map is empty
		boolean isEmpty = userPreferences.isEmpty();
		System.out.println("Is User Preferences Map empty? " + isEmpty);

		// Get a Set of usernames
		Set<String> usernames = userPreferences.keySet();
		System.out.println("Usernames: " + usernames);

		// Add more user preferences using putAll
		Map<String, String> additionalPreferences = new HashMap<>();
		additionalPreferences.put("dave", "Light Theme");
		additionalPreferences.put("erin", "Dark Theme");
		userPreferences.putAll(additionalPreferences);

		// Remove a user preference
		userPreferences.remove("alice");

		// Get the values (themes)
		Collection<String> themes = userPreferences.values();
		System.out.println("Themes: " + themes);

		// Get the value associated with a key, or return default value if not present
		String themeForEve = userPreferences.getOrDefault("eve", "Default Theme");
		System.out.println("Theme for 'eve': " + themeForEve);

		// Merge user preferences with a remapping function
		
		/*
		 * method signature of merge method: 
		 * public V merge(K key, V value, BiFunction remappingFunction) 
		 * where, 
		 * input: Key: It is the key for which we have a particular value. 
		 * If two keys have the same value they are merged. 
		 * Value: It is the index corresponding to the particular key which is stored in the bucket. 
		 * BiFunction: This is the function having two arguments to be used for
		 * calculating the new mapping from the old value and given value. 
		 * output: This method returns the key along with its value if the key is not present or is
		 * associated with null. 
		 * If the key already holds any value, it merges the old value with the new value using the mapping technique.
		 */
		// here, {(oldValue, newValue) -> oldValue + " and " + newValue}; is a lambda expression of the BiFunction remapping method
		userPreferences.merge("charlie", "Custom Theme", (oldValue, newValue) -> oldValue + " and " + newValue);

		// Put a value only if the key is absent
		userPreferences.putIfAbsent("frank", "Dark Theme");

		// Display the final User Preferences Map
		System.out.println("Final User Preferences Map: " + userPreferences);
	}
}
