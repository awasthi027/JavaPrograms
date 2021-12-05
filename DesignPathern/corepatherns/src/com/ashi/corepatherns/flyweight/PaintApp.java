package com.ashi.corepatherns.flyweight;

public class PaintApp {

	public void render(int numberOfShapes) {
		Shape  shape = null;
		for(int i = 0; i<=numberOfShapes;i++) {
			if (i%2 == 0) {
				shape = ShapeFactory.getShape("circle");
				shape.drawCircle(i, "red", "white");
				
			} else {
				shape = ShapeFactory.getShape("rectangle");
				shape.drawRect(i, i+1, "white");
			}
			
		}
	}
}
