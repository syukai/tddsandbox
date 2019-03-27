package com.example.part3;

import java.awt.Rectangle;

public class Drawing {

	private Figure figure;
	public void addFigure(Figure figure) {
		this.figure = figure;
	}
	
	public void display(RecordingMedium medium) {
		medium.run(figure);
	}
}
