package com.sda.javabyd3.lusi.introduction.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Wyświetla bieżącą godzinę w Bydgoszczy. Wykorzystaj DateTimeFormatter aby
 * wyświetlić datę w następującym formacie
 * 3 lutego 2018 roku, sobota 22:12:27
 */
public class ex15 {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd MMMM YYYY 'roku', EEEE HH:MM:SS")));
	}
}
