package learning.microservices.currencyexchangeservice;



import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment environment;
	
	@Autowired
	private CurrencyExchangeRespository respository;
	
	private Logger logger = LoggerFactory.getLogger(CurrencyExchangeController.class);
	
	@GetMapping(path = "/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retriveExchangeValue(@PathVariable String from, @PathVariable String to) {
		
	   logger.info("Currency exchange request has received.");
	  String port = this.environment.getProperty("local.server.port");
	  
	  CurrencyExchange currencyExchange = this.respository.findByFromAndTo(from, to);
	  if (currencyExchange == null) {
		  throw new RuntimeException("Unable to find from " + from + " To" + to );
	  }
	//CHANGE-KUBERNETES
	String host = environment.getProperty("HOSTNAME");
    String version = "v13";
			
     currencyExchange.setEnvironment(port + " " + version + " " + host);
	  return  currencyExchange;
	}
}
