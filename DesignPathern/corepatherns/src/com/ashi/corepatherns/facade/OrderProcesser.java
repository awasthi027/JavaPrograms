package com.ashi.corepatherns.facade;

public class OrderProcesser {

	public boolean checkStock(String name) {
		System.out.println("checking stock");
		return true;
	}
	
	public String placeOrder(String name, int quantity) {
		System.out.println("Order placed ");
		return "#Order123";
	}
	public void shipOrder(String orderId) {
		System.out.println("Order shipped...");
	}
}
