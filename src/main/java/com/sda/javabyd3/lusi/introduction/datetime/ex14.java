package com.sda.javabyd3.lusi.introduction.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Wyświetl bieżącą datę i godzinę w Tokyo.
 */
public class ex14 {
	public static void main(String[] args) {
		LocalDateTime dateTimeInTokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println("Data i czas w Tokyo: " + dateTimeInTokyo.toString());
	}
}
