package com.example.part1;

public class Money implements Expression {
	protected int amount;
	protected String currency;
//	abstract String currency();
	
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}
	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}
	
	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	Expression plus(Money addend) {
		return new Money(amount + addend.amount, currency);
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
