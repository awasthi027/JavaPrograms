package com.ashi.corepatherns.decorator;

public class ViggePizzaDecorator extends PizzaDecorator{

	public ViggePizzaDecorator(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	public void bake() {
		super.bake();
		System.out.println("Adding Cheeze topping on it");
	}

}
