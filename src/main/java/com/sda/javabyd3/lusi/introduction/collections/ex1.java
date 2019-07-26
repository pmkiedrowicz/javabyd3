package com.sda.javabyd3.lusi.introduction.collections;

public class ex1 {
	public static void main(String[] args) {
		int[] intArray = new int[10];
		for (int i = 1; i <= 10; i++) {
			intArray[i - 1] = i;
		}
		System.out.println("Długość tablicy: " + intArray.length);
		displayArray(intArray);
		// Multiply
		for (int i = 1; i <= 10; i++) {
			intArray[i - 1] *= 2;
		}
		displayArray(intArray);
	}

	private static void displayArray(int[] intArray) {
		for (int i = 0; i < 10; i++) {
			System.out.println("[" + i + "]=" + intArray[i]);
		}
	}
}
