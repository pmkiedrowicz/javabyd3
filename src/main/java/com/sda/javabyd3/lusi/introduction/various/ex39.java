package com.sda.javabyd3.lusi.introduction.various;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Napisz program, który pobiera od użytkownika serię liczb różnych od zera (Zero
 * kończy wprowadzanie danych). Po wprowadzeniu danych program oblicza sumę
 * liczb wprowadzonych przez użytkownika, najmniejszą oraz największą liczbę. Na
 * koniec działania wyświetla obliczone wartości. Oczywiście nie zapomnij o
 * przechwyceniu ewentualnych wyjątków.
 */
public class ex39 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		System.out.println("Wprowadź dowolną ilosć liczb. Liczba 0 kończy wprowadzanie");
		int numberEnteredByUser = -1;
		do {
			String valueEnteredByUser = "";
			try {
				System.out.print("Wprowadź liczbę: ");
				valueEnteredByUser = scanner.nextLine();
				numberEnteredByUser = Integer.parseInt(valueEnteredByUser);
				if (numberEnteredByUser != 0) {
					numbers.add(numberEnteredByUser);
				}
			} catch (Exception e) {
				System.out.println(String.format("Wartość %s jest niepoprawna", valueEnteredByUser));
			}
		}
		while (numberEnteredByUser != 0);
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int number : numbers) {
			sum += number;
			min = Integer.min(min, number);
			max = Integer.max(max, number);
		}
		System.out.println("Suma wprowadzonych liczb wynosi: " + sum);
		System.out.println("Minimalna wprowadzona liczba: " + min);
		System.out.println("Maksymalna wprowadzona liczba: " + max);
	}
}
