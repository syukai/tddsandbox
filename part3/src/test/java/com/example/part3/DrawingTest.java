package com.example.part3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DrawingTest {

	@Test
	void testRectangle() {
		Drawing d = new Drawing();
		d.addFigure(new RectangleFigure(0, 10, 50, 100));
		RecordingMedium brush = new RecordingMedium();
		d.display(brush);
		assertEquals("rectangle 0 10 50 100¥n", brush.log());
	}

	@Test
	void testOval() {
		Drawing d = new Drawing();
		d.addFigure(new OvalFigure(0, 10, 50, 100));
		RecordingMedium brush = new RecordingMedium();
		d.display(brush);
		assertEquals("oval 0 10 50 100¥n", brush.log());
	}

}
