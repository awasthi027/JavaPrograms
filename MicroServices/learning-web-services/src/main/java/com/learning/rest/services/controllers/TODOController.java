package com.learning.rest.services.controllers;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.rest.services.models.TodoInfo;
import com.learning.rest.services.responses.ResponseMessage;



@RestController
@RequestMapping(path = "v1/todo/" )
public class TODOController {
	
	@Autowired
	private MessageSource messageSource;
	
	@GetMapping(path =  "hello/{userName}")
    public String  helloworld(@PathVariable String userName) {
		return "Hello" + " " +  userName + "!";	}
	
	@GetMapping(path =  "hello/")
    public ResponseMessage  helloworld() {
		return new ResponseMessage("Hello User");	}
	
	@GetMapping(path = "greet/international")
	public String greetingInternational() 
	 {
		return messageSource.getMessage("good.morning.msg", null,"Default Message", LocaleContextHolder.getLocale());
	}
	
	@PostMapping(path = "create/") 
	public TodoInfo idandPostBody(@RequestBody TodoInfo postFeed) {
	 return postFeed;
	}
	

}
