package learning.microservices.limitservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import learning.microservices.limitservice.beans.Limits;
import learning.microservices.limitservice.configuration.Configuration;

@RestController
@RequestMapping("v1/limits")
public class LimitController {
	
  @Autowired	
  public Configuration configuration;
	
	@GetMapping(path = "")
	public Limits retriveAllLimits() {
		return new Limits(configuration.getMin(), configuration.getMax());
		//return new Limits(1, 1000);
	}

}
