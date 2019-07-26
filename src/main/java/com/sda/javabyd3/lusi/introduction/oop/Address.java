package com.sda.javabyd3.lusi.introduction.oop;

public class Address {
	String street;
	String city;
	String country;
	Integer flatNo;
	Integer homeNo;

	public Address(String street, String city, String country, Integer flatNo, Integer homeNo) {
		this.street = street;
		this.city = city;
		this.country = country;
		this.flatNo = flatNo;
		this.homeNo = homeNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(Integer flatNo) {
		this.flatNo = flatNo;
	}

	public Integer getHomeNo() {
		return homeNo;
	}

	public void setHomeNo(Integer homeNo) {
		this.homeNo = homeNo;
	}
}
