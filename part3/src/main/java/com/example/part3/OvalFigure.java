package com.example.part3;

public class OvalFigure extends Figure {

	public OvalFigure(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	public String run() {
		return "oval "
				+ x.toString()
				+ " " + y.toString()
				+ " " + width.toString()
				+ " " + height.toString()
				+ "¥n";
				
	}

}
