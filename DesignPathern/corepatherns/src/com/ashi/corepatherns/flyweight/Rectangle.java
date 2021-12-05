package com.ashi.corepatherns.flyweight;

public class Rectangle extends Shape {

	private String label;
	
	public Rectangle() {
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
	public void drawRect(int length, int breath, String fillStyple) {
		System.out.println("Draw Rectangle");
	}

}
