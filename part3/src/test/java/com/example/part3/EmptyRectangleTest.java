package com.example.part3;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Rectangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmptyRectangleTest {
	private Rectangle empty;
	@BeforeEach
	public void setUp() {
		empty = new Rectangle(0, 0, 0, 0);
	}

	@Test
	void testEmpty() {
		assertTrue(empty.isEmpty());
	}
	
	@Test
	public void testWidth() {
		assertEquals(0.0, empty.getWidth(), 0.1);
	}

}
