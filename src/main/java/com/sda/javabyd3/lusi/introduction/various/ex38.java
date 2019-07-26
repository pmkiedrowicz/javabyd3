package com.sda.javabyd3.lusi.introduction.various;

import java.util.Scanner;

/**
 * Napisz program obliczający pole powierzchni koła. Promień koła użytkownik
 * wprowadza z klawiatury. Program powinien zasygnalizować błędne dane (liczbę
 * ujemną lub zero) i ponownie zapytac o długośc promienia. Wykorzystaj metodę
 * Parse klasy float. Oczywiście nie zapomnij o przechwyceniu ewentualnych wyjątków.
 */
public class ex38 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		float circleRadius = 0;
		while (circleRadius <= 0) {
			System.out.print("Podaj promień koła: ");
			try {
				circleRadius = Float.parseFloat(scanner.next());
				if (circleRadius <= 0)
					System.out.println("Promień musi być większy od zera");
			} catch (NumberFormatException e) {
				System.out.println("!!! Wprowadzono niepoprawny promień koła !!!");
			}
		}
		System.out.println(String.format("Pole koła wynosi %.2f", circleRadius * circleRadius));
	}
}
