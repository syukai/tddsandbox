package com.example.part1;

public abstract class Money {
	protected int amount;
	abstract Money times(int multipulier);
	
	public static Money dollar(int amount) {
		return new Dollar(amount);
	}
	public static Money franc(int amount) {
		return new Franc(amount);
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount == money.amount && getClass().equals(object.getClass());
	}

}
