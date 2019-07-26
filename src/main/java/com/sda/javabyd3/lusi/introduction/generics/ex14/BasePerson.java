package com.sda.javabyd3.lusi.introduction.generics.ex14;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Base person class
 */
@Getter
@Setter
@AllArgsConstructor
public class BasePerson {

	/**
	 * Persona name
	 */
	private String name;

	/**
	 * Person surname
	 */
	private String surname;
}
