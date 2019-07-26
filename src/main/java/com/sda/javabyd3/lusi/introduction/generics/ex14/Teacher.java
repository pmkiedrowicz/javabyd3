package com.sda.javabyd3.lusi.introduction.generics.ex14;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Teacher class
 */
@Getter
@Setter
public class Teacher extends BasePerson {
	/**
	 * Teacher school name
	 */
	private String school;

	/**
	 * Teacher degree
	 */
	private String degree;

	/**
	 * Teacher class constructor
	 *
	 * @param name
	 * 		Teacher name
	 * @param surname
	 * 		Teacher surname
	 * @param school
	 * 		Teacher school
	 * @param degree
	 * 		Teacher degree
	 */
	@Builder
	public Teacher(String name, String surname, String school, String degree) {
		super(name, surname);
		this.school = school;
		this.degree = degree;
	}
}
