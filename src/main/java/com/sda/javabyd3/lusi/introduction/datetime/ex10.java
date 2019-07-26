package com.sda.javabyd3.lusi.introduction.datetime;

import java.time.LocalTime;

/**
 * Wykorzystując obiekt typu LocalDate wyświetl aktualną datę.
 */
public class ex10 {
	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println("Aktualna godzina: " + localTime);
	}
}
