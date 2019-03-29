package com.example.part3;

public class Money {
	int value;
	Money(int value) {
		this.value = value;
	}
	static Money zero() {
		return new Money(0);
	}
	public Money plus(Money add) {
		return new Money(this.value + add.value);
	}
}
