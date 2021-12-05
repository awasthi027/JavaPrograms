package com.ashi.corepatherns.facade;

public class OrderFacade {
	
	OrderProcesser processer = new OrderProcesser();
	
	public void processOrder(String product, int quantity) {
		if (processer.checkStock(product)) {
			String orderId=  processer.placeOrder(product, quantity);
			processer.shipOrder(orderId);
		}
	}

}
