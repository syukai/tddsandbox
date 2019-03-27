package com.example.part3;

public abstract class Figure {
	protected Integer x;
	protected Integer y;
	protected Integer width;
	protected Integer height;
	public Figure(int x, int y, int width, int height) {
		this.x = Integer.valueOf(x);
		this.y = Integer.valueOf(y);
		this.width = Integer.valueOf(width);
		this.height = Integer.valueOf(height);
	}
	public abstract String run();

}
