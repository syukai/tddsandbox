package com.example.part3;

public class Transaction implements Holding {
	Money value;
	Transaction(Money value) {
		this.value = value;
	}
	public Money balance() {
		return this.value;
	}
}
