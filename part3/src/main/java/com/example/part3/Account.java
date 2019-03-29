package com.example.part3;

public class Account {
	Money sum = Money.zero();
	private Holding[] holdings;
	Money balance() {
		for (int i = 0; i < holdings.length; i++) 
			sum = sum.plus(holdings[i].balance());
			
		return sum;
	}
}
