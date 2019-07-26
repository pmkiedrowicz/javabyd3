package com.sda.javabyd3.lusi.introduction.generics.ex14;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Employee class
 */
@Getter
@Setter
public class Employee extends BasePerson {
	/**
	 * Company name
	 */
	private String companyName;

	/**
	 * Employee class constructor
	 *
	 * @param name
	 * 		Employee name
	 * @param surname
	 * 		Employee surname
	 * @param companyName
	 * 		Employee companyName
	 */
	@Builder
	public Employee(String name, String surname, String companyName) {
		super(name, surname);
		this.companyName = companyName;
	}
}
