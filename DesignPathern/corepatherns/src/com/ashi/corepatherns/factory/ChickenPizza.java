package com.ashi.corepatherns.factory;

public class ChickenPizza implements Pizza {

	public ChickenPizza() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void prepare() {
	   System.out.println("Preparing Chicken PIZZA");
	}

	@Override
	public void bake() {
		 System.out.println("Baking Chicken PIZZA");	
	}

	@Override
	public void cut() {
		 System.out.println("Cut  Chicken PIZZA");	

	}

}
