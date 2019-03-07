package com.example.part1;

public class Money {
	protected int amount;
	protected String currency;
	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
//	abstract String currency();
	
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}
	public static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}
	
	String currency() {
		return currency;
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount == money.amount &&
				currency.equals(money.currency);
	}
	
	public String toString() {
		return amount + " " + currency;
	}

}
