package com.sda.javabyd3.lusi.introduction.datetime;

import java.time.LocalDateTime;

/**
 * Wykorzystując obiekt typu LocalDateTime wyświetl aktualną datę i godzinę.
 */
public class ex11 {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Aktualna data i godzina: " + localDateTime);
	}
}
