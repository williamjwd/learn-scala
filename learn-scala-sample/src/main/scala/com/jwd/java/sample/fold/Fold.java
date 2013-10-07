package com.jwd.java.sample.fold;

public class Fold {
	public static void main(String[] args) {
		int[] numbers = {5, 15, 30, 20, 35, 45};
		int total = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		
		System.out.println(total);
	}
}
