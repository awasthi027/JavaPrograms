package com.ashi.corepatherns.decorator;

public class CheezePizzaDecorator extends PizzaDecorator{

	public CheezePizzaDecorator(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	public void bake() {
		super.bake();
		System.out.println("Adding vigge topping on it");
	}

}
