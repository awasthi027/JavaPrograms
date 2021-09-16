package learning.microservices.currencyexchangeservice;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@RestController
public class CircuitBreakerController {
    
	private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);
	
	@GetMapping(path = "sample-api")
//	@Retry(name = "sample-api", fallbackMethod = "hardCodedResponse")
	@CircuitBreaker(name = "sample-api", fallbackMethod = "hardCodedResponse")
	public String sampleApi() {
		logger.info("Sample API Request received");
		ResponseEntity<String> responseEntity = new RestTemplate().getForEntity("http:/localhost:/same-dummyapi", String.class);
		return responseEntity.getBody();
	}
	public String hardCodedResponse(Exception ex) {
		return "hardCodedResponse";
	}
}
