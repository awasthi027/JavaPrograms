package com.ashi.corepatherns.flyweight;

public class Cricle extends Shape {

	private String label;
	
	public Cricle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}
	 @Override
	public void drawCircle(int radius, String fillColor, String lineColor) {
		System.out.println("Draw Circle");
	}
 

	
}
