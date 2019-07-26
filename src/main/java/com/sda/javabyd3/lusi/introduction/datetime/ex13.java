package com.sda.javabyd3.lusi.introduction.datetime;

import java.time.Duration;
import java.time.LocalTime;

/**
 * Utwórz obiekt typu LocalTime przechowujący godzinę 14:11 oraz obiekt typu
 * LocalTime przechowujący godzinę 18:41. Wykorzystując klasę Duration oblicz ile
 * czasu upłynęło pomiędzy godzinami.
 */
public class ex13 {
	public static void main(String[] args) {
		LocalTime startTime = LocalTime.of(14, 11);
		LocalTime endTime = LocalTime.of(18, 41);
		Duration duration = Duration.between(startTime, endTime);
		System.out.println(String.format("Pomiędzy %s a %s minęło %s minut", startTime, endTime, duration.toMinutes()));
	}
}
