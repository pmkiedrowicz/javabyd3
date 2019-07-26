package com.sda.javabyd3.lusi.introduction.stream.ex28;

/**
 * Bank account class stores balance and acocunt name.
 */
public class BankAccount {
	int balance;
	String name;

	/**
	 * Bank account constructor.
	 *
	 * @param balance
	 * 		Account balance
	 * @param name
	 * 		Account name
	 */
	public BankAccount(int balance, String name) {
		this.balance = balance;
		this.name = name;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
