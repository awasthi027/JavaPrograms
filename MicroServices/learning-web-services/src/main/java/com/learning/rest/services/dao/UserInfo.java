package com.learning.rest.services.dao;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Entity
@Table(name = "user_info")
public class UserInfo {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	
	private String firstName;
	

	private String lastName;
	
	@OneToMany(mappedBy = "userInfo")
	private List<PostFeed> posts;

}
