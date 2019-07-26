package com.sda.javabyd3.lusi.introduction.regularexpression.ex02;

import java.util.regex.Pattern;

public class PostCodeValidator {
	private final Pattern patter = Pattern.compile("^\\d{2}-\\d{3}$");

	public Boolean isPostodeValid(String postCode) {
		return patter.matcher(postCode).matches();
	}
}
