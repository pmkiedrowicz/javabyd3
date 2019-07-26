package com.sda.javabyd3.lusi.introduction.collections;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		String[] names = new String[5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.print("Podaj " + i + " imię: ");
			names[i - 1] = scanner.nextLine();
		}
		int counter = 0;
		while (counter < names.length) {
			System.out.println(String.format("[%s] = %s ", counter, names[counter]));
			counter++;
		}
	}
}
