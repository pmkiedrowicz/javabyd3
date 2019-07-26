package com.sda.javabyd3.lusi.introduction.datetime;

import java.time.LocalTime;

/**
 * Wykorzystując obiekt typu LocalTime wyświetl aktualny czas.
 */
public class ex9 {
	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println("Aktualny czas: " + localTime);
	}
}
