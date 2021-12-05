package com.ashi.corepatherns.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer {

	CustomerImpl customerImpl = new CustomerImpl();
	
	@Override
	public int getId() {
		customerImpl.setId(1001);
		return customerImpl.getId();
	}

	@Override
	public List<Order> getOrders() {
		ArrayList<Order> orders = new ArrayList<Order>();
		Order order = new Order();
		order.setProductName("iPhone");
		order.setQuantity(100);
		order.setId(1);
		orders.add(order);
		customerImpl.setOrders(orders);
		return customerImpl.getOrders();
	}

}
