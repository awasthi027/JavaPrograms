package com.ashi.corepatherns.factory;



public class PizzaStore {
	public Pizza orderPizza(PizzaType pizzaType) {
		Pizza pizza = PizzaFactory.createPizza(pizzaType);
        return pizza;
	}

	
}
