package com.ashi.corepatherns.factory.test;

import com.ashi.corepatherns.factory.PizzaStore;
import com.ashi.corepatherns.factory.PizzaType;

public class FactoryTest {
	
	public static void main(String[] args) {
          PizzaStore pizzaStore = new PizzaStore();
          pizzaStore.orderPizza(PizzaType.CHEEZE);
	}
}
