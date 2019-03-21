package com.example.part3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void testSum() {
		assertEquals(4, plus(3, 1));
		assertEquals(7, plus(3, 4));
		assertEquals(12, sum(new int[] {5, 7}));
	}
	
	
	private int plus(int augend, int addend) {
		return augend + addend;
	}
	
	private int sum(int[] values) {
		return IntStream.of(values).sum();
	}
	

}
