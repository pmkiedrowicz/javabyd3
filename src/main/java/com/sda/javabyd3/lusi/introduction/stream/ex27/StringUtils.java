package com.sda.javabyd3.lusi.introduction.stream.ex27;

public class StringUtils {

	public static String betterString(String arg1, String arg2, ComapreString comparator) {
		if (comparator.betterString(arg1, arg2)) {
			return arg1;
		} else {
			return arg2;
		}
		//	return comparator.betterString(arg1, arg2) ? arg1 : arg2;
	}
}
