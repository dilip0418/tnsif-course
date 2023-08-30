package com.dilip.dayTwelveCodes.lambdaDemo.withFunctionalInterfaces.real;

import java.util.function.Supplier;


public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> passwordGenerator = () -> generatePassword(8);

        for (int i = 0; i < 5; i++) {
            System.out.println("Generated Password: " + passwordGenerator.get());
        }
    }

    private static String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        String lowerChars = "abcdefghijklmnopqrstuvwxyz";
        String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";

        // Generate at least one lowercase letter, one uppercase letter, and one digit
        password.append(lowerChars.charAt((int) (Math.random() * lowerChars.length())));
        password.append(upperChars.charAt((int) (Math.random() * upperChars.length())));
        password.append(digits.charAt((int) (Math.random() * digits.length())));

        String allChars = lowerChars + upperChars + digits;
        for (int i = 3; i < length; i++) {
            int index = (int) (Math.random() * allChars.length());
            password.append(allChars.charAt(index));
        }

        // Shuffle the characters to create a random password
        return shuffleString(password.toString());
    }

    private static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            int randomIndex = (int) (Math.random() * characters.length);
            char temp = characters[i];
            characters[i] = characters[randomIndex];
            characters[randomIndex] = temp;
        }
        return new String(characters);
    }
}

