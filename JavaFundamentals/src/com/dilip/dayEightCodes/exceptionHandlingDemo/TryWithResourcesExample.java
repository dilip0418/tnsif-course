package com.dilip.dayEightCodes.exceptionHandlingDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        File filename = new File("D:\\git\\tnsif-course\\JavaFundamentals\\src\\com\\dilip\\dayEightCodes\\exceptionHandlingDemo\\data.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
        	br.lines().forEach(System.out::println);
        } catch (IOException ex) {
            System.out.println("Error reading the file: " + ex.getMessage());
        }
    }
}

