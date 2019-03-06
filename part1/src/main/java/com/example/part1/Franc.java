package com.example.part1;

public class Franc {
	private int amount;
	Franc(int amount) {
		this.amount = amount;
	}
	
	Franc times(int multiplier) {
//		amount *= multiplier;
		return new Franc(amount * multiplier);
	}
	
	public boolean equals(Object object) {
		Franc dollar = (Franc) object;
		return amount == dollar.amount;
	}
}
