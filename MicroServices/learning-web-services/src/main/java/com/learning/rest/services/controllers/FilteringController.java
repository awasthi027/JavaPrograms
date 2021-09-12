package com.learning.rest.services.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.learning.rest.services.models.TodoInfo;

@RestController
public class FilteringController {
	
	@RequestMapping(path = "v1/filter/")
	
	@GetMapping(path = "")
	public MappingJacksonValue findAllTodoList() {
		List<TodoInfo> list = new ArrayList<TodoInfo>();
		list.add(new TodoInfo(1,"Leaning Basic Java","Once you completed the Java course will get certifgicate"));
		list.add(new TodoInfo(2,"Leaning Mediate Java","Once you completed the Java course will get certifgicate"));
		list.add(new TodoInfo(3,"Leaning Expert Java","Once you completed the Java course will get certifgicate"));
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id","description");
		FilterProvider provider = new SimpleFilterProvider().addFilter("TodoInfoFilter", filter);
		MappingJacksonValue mapping = new MappingJacksonValue(list);
		mapping.setFilters(provider);
		return mapping;
	}

}
