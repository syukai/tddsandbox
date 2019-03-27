package com.example.part3;

import java.awt.Rectangle;

public class RectangleFigure extends Figure {

	public RectangleFigure(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	public String run() {
		return "rectangle "
				+ x.toString()
				+ " " + y.toString()
				+ " " + width.toString()
				+ " " + height.toString()
				+ "¥n";
				
	}
}
