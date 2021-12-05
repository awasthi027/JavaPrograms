package com.ashi.corepatherns.decorator;



public class PizzaShop {
	
    public static void main(String[] args) {
	   Pizza pizza = new CheezePizzaDecorator(new PlainPizza());
	   pizza.bake();
	   System.out.println("===============New=======");
	   pizza = new ViggePizzaDecorator(new CheezePizzaDecorator(new PlainPizza()));
	   pizza.bake();
	   
    }
}
