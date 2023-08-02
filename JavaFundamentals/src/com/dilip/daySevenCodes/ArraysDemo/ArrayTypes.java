package com.dilip.daySevenCodes.ArraysDemo;

import java.util.Arrays;

public class ArrayTypes {

	public static void main(String[] args) {
		
		/*There are three type of arrays :
			i. 1-D.
			ii. 2-D. (Multi-Dimensional)
			iii. Jagged Array*/
		
		//		i. 1-D arrays
		int[] arr = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		
		//		ii. 2-D arrays
		int[][] arr1 = {{1,2},{3,4},{5,6},{7,8}};
		System.out.println(Arrays.deepToString(arr1));
		
		//		iii. Jagged arrays :- Jagged array is an array of arrays (with different column size at different rows.
		//Example is to store Students records present in different classes (rows). So there may variable number of students in each class
		int[][] arr2 = {{1,2},{3,4,5},{6},{7,8,9,10}};
		System.out.println(Arrays.deepToString(arr2));
		
	}

}
