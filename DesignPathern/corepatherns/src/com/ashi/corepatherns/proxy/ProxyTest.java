package com.ashi.corepatherns.proxy;

public class ProxyTest {

	public static void main(String[] args) {
//		Customer customer = new CustomerImpl();
//		System.out.println(customer.getId());
//		System.out.println(customer.getOrders());
		
		Customer customer = new CustomerProxyImpl();
		System.out.println(customer.getId());
		System.out.println(customer.getOrders());
	}
}
