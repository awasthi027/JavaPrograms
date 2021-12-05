package com.ashi.corepatherns.facade;

public class TestFacade {

	public static void main(String[] args) {
		
		// Here the problem which we resolve via facade
//		OrderProcesser processer = new OrderProcesser();
//		if (processer.checkStock("Macbook")) {
//			String orderId=  processer.placeOrder("Macbook", 2);
//			processer.shipOrder(orderId);
//		}
        facadeSoluation();

	}
	
	public static void facadeSoluation() {
		OrderFacade orderFacade = new OrderFacade();
		orderFacade.processOrder("Macbook", 3);
	}

}
