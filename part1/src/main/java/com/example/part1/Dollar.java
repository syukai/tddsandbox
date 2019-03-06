package com.example.part1;

public class Dollar {
	int amount;
	Dollar(int amount) {
		this.amount = amount;
	}
	
	void times(int multiplier) {
		amount *= multiplier;
	}
}
