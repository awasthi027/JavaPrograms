package com.ashi.corepatherns.factory;

public class PlainCheese implements Pizza {

	
	public PlainCheese() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() {
	   System.out.println("Preparing Cheese PIZZA");
	}

	@Override
	public void bake() {
		 System.out.println("Baking Cheese PIZZA");	
	}

	@Override
	public void cut() {
		 System.out.println("Cut Cheese PIZZA");	

	}

}
