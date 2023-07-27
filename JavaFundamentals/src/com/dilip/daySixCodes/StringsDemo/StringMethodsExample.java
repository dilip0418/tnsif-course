package com.dilip.daySixCodes.StringsDemo;

public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Length of the string
        int length = str.length();
        System.out.println("Length: " + length); // Outputs "Length: 13"
        
        // Extracting substrings
        String substring1 = str.substring(7); // Starting from index 7 to end
        String substring2 = str.substring(0, 5); // From index 0 to 4 (excluding 5)
        System.out.println("Substring 1: " + substring1); // Outputs "World!"
        System.out.println("Substring 2: " + substring2); // Outputs "Hello"
        
        // Concatenation
        String concatenated = str.concat(" Welcome");
        System.out.println("Concatenated: " + concatenated); // Outputs "Hello, World! Welcome"
        
        // Converting case
        String lowercase = str.toLowerCase();
        String uppercase = str.toUpperCase();
        System.out.println("Lowercase: " + lowercase); // Outputs "hello, world!"
        System.out.println("Uppercase: " + uppercase); // Outputs "HELLO, WORLD!"
        
        // Checking if the string starts or ends with a given substring
        boolean startsWithHello = str.startsWith("Hello");
        boolean endsWithWorld = str.endsWith("World!");
        System.out.println("Starts with \"Hello\": " + startsWithHello); // Outputs "Starts with "Hello": true"
        System.out.println("Ends with \"World!\": " + endsWithWorld); // Outputs "Ends with "World!": true"
        
        // Finding the index of a specific character or substring
        int index1 = str.indexOf('o');
        int index2 = str.indexOf("World");
        System.out.println("Index of 'o': " + index1); // Outputs "Index of 'o': 4"
        System.out.println("Index of \"World\": " + index2); // Outputs "Index of "World": 7"
        
        // Replacing characters
        String replaced = str.replace('o', 'O');
        System.out.println("Replaced: " + replaced); // Outputs "HellO, WOrld!"
        
        // Splitting the string
        String[] parts = str.split(", ");
        for (String part : parts) {
            System.out.println("Split: " + part);
        }
        // Outputs:
        // Split: Hello
        // Split: World!
        
        // Trimming leading and trailing whitespaces
        String stringWithSpaces = "   Trim Me   ";
        String trimmed = stringWithSpaces.trim();
        System.out.println("Trimmed: " + trimmed); // Outputs "Trim Me"
        
        // Checking if the string is empty or null
        String emptyString = "";
        String nullString = null;
        System.out.println("Is empty: " + emptyString.isEmpty()); // Outputs "Is empty: true"
        System.out.println("Is null: " + (nullString == null)); // Outputs "Is null: true"
    }
}
