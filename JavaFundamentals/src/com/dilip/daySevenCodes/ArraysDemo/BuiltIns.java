package com.dilip.daySevenCodes.ArraysDemo;

import java.util.Arrays;


public class BuiltIns {
	static void printArr(int[] arr) {
		//to print the array elements
		System.out.println(Arrays.toString(arr));		
	}

	public static void main(String[] args) {
		
		
		//Different built-in methods 
		int[] arr = {1,4,3,6,5,7,8,10};
		
		printArr(arr);
		
		//to sort the array elements in-place
		Arrays.sort(arr);
		printArr(arr);
		
		//Search for an element using the binary search method
		System.out.println(Arrays.binarySearch(arr, 10));
		
		//Extending the power of binSearch method by searching within a particular range of elements in the input array.
		System.out.println(Arrays.binarySearch(arr, 0, 4, 5));
		
		//When the key we are looking for doesn't exists in the array then the binSearch method returns a negative value (which is the number of elements it has checked)
		System.out.println(Arrays.binarySearch(arr, 0, 2, 5)); //-3 is the output because 0 -> 1, 1 -> 4 and 2 -> 3. And the Key we want is 5 which is not present in the given range so it returns the number of elements traversed as a negative value.
		
		int arr1[] = new int[5];
		
		// to fill the array initially with any default value we can use 
		Arrays.fill(arr1, 999);
		printArr(arr1);
		
		
	}

}
