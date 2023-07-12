package com.dilip.dayOneCodes;

public class LoopingDemo {

	public static void main(String[] args) {
		String name = "Dilip Kumar B K";
		System.out.println("For Loop");
		for(int i= 0; i < 6; i++) {
			System.out.println(name);
		}
		System.out.println();
		System.out.println("While Loop");
		int i = 0;
		while(i < 6) {
			System.out.println(name);
			i++;
		}
		
		System.out.println();
		System.out.println("Do While Loop");
		int j = 0;
		do {
			System.out.println(name);
			j++;
		}while(j < 6);
	}

}
