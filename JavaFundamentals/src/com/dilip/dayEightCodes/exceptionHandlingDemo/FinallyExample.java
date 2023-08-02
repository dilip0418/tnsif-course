package com.dilip.dayEightCodes.exceptionHandlingDemo;

public class FinallyExample {
    public static void main(String[] args) {
        try {
//            int result = divide(10, 2); // Works fine without throwing any exception
            int result = divide(10, 0); // Throws ArithematicException 
            System.out.println("Result: " + result);
            
            
            int[] arr = {1,2,3};
            System.out.println(arr[5]);
            
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException caught: " + ex.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught: "+ e.getMessage());
		}finally {
            System.out.println("Finally block executed.");
        }
    }

    public static int divide(int numerator, int denominator) {
        try {
            return numerator / denominator;
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException inside divide(): " + ex.getMessage());
            return -1;
        }
    }
}
