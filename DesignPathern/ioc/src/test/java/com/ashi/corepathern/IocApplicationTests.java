package com.ashi.corepathern;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class IocApplicationTests {

	@Autowired
	Customer customer;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void testPayment() {
		customer.pay();
	}

}
