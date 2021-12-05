package com.ashi.corepatherns.factory;

public class VaggiPizza  implements Pizza {
	
	public VaggiPizza() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void prepare() {
	   System.out.println("Preparing Vaggi PIZZA");
	}

	@Override
	public void bake() {
		 System.out.println("Baking Vaggi PIZZA");	
	}

	@Override
	public void cut() {
		 System.out.println("Cut Vaggi PIZZA");	

	}
}
