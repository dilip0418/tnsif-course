package com.dilip.dayEightCodes.exceptionHandlingDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // ArithmeticException: Division by zero
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException: " + ex.getMessage());
        }

        try {
            // NullPointerException
            String str = null;
            int length = str.length();
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException: " + ex.getMessage());
        }

        try {
            // ArrayIndexOutOfBoundsException
            int[] numbers = { 1, 2, 3 };
            int element = numbers[5];
            System.out.println("Element at index 5: " + element);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException: " + ex.getMessage());
        }

        try {
            // IOException: File not found
            readFile("nonexistent.txt");
        } catch (IOException ex) {
            System.out.println("IOException: " + ex.getMessage());
        }

        try {
            // NumberFormatException
            String numStr = "abc";
            int num = Integer.parseInt(numStr);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException ex) {
            System.out.println("NumberFormatException: " + ex.getMessage());
        }

        try {
            // MalformedURLException
            URL url = new URL("invalid-url");
            System.out.println("URL protocol: " + url.getProtocol());
        } catch (MalformedURLException ex) {
            System.out.println("MalformedURLException: " + ex.getMessage());
        }

        try {
            // NoSuchElementException
            List<String> names = new ArrayList<>();
            String firstName = names.get(0);
            System.out.println("First name: " + firstName);
        }
        catch (IndexOutOfBoundsException ioe) {
        	System.out.println("IndexOutOfBoundsException: " + ioe.getMessage());
			
		}
        catch (NoSuchElementException ex) {
            System.out.println("NoSuchElementException: " + ex.getMessage());
        }
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }

    public static void readFile(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Process each line of data from the file
                // ...
            	System.out.println(line);
            }
        }
    }
}
