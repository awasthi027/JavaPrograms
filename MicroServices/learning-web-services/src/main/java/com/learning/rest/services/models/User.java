package com.learning.rest.services.models;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class User {
	
	private Integer id;

	@Size(min = 2, message = "Name should have at least 2 chars.")
	private String name;
	
	@Past
	private Date birthDate;
	
}
