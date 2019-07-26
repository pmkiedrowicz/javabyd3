package com.sda.javabyd3.lusi.introduction.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Utwórz obiekt typu LocalDate przechowujący datę 01.01.2017 oraz obiekt typu
 * LocalDate przechowujący datę 05.05.2017. Wykorzystując obiekt typu Period
 * Wyświetl ile czasu minęło pomiędzy datami.
 */
public class ex12 {
	public static void main(String[] args) {
		LocalDate startDate = LocalDate.of(2017, 1, 1);
		LocalDate endDate = LocalDate.of(2017, 5, 5);
		Period period = Period.between(startDate, endDate);
		System.out.println(String.format("Pomiędzy datą %s a %s minęły %s miesiące i %s dni.", startDate, endDate, period.getMonths(), period.getDays()));
		System.out.println(String.format("Pomiędzy datą %s a %s minęły %s dni.", startDate, endDate, ChronoUnit.DAYS.between(startDate, endDate)));
	}
}
