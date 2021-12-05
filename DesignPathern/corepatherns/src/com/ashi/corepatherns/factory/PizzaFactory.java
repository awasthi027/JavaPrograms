package com.ashi.corepatherns.factory;

public class PizzaFactory {
	
	public static Pizza createPizza(PizzaType pizzaType) {
		Pizza pizza = null;
		switch (pizzaType) {
		case PLAIN: {
			pizza = new VaggiPizza();
		   }
		break;
		case CHEEZE: {
			pizza = new PlainCheese();
		}
		break;
		case CHICKEN: {
			pizza = new ChickenPizza();
		   }
		break;
		}
		
		pizza.prepare();;
		pizza.bake();
		pizza.cut();
		return pizza;

	}
}
