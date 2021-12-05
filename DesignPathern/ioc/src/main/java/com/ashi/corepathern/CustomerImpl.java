package com.ashi.corepathern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerImpl implements Customer{

	
	CreditCard creditCard;
	
	@Override
	public void pay() {
		creditCard.makePayment();
		// TODO Auto-generated method stub
		
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}
	@Autowired
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

}
