package com.learning.rest.services.models;




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


public class TodoInfo {
	
	private Integer id;
	
	private String title;
	
	private String description;

}
