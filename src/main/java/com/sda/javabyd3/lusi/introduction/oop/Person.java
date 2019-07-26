package com.sda.javabyd3.lusi.introduction.oop;

public class Person {
	/**
	 * Name
	 */
	String name;

	/**
	 * Surname
	 */
	String surname;

	/**
	 * Age
	 */
	Integer age;

	/**
	 * Address
	 */
	Address address;

	public Person() {
	}

	public Person(String name, String surname, Integer age, Address address) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.address = address;
	}

	public void introduce() {
		System.out.println(name + " " + surname);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
