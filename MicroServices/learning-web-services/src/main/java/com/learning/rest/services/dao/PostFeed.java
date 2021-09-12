package com.learning.rest.services.dao;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "post_feed")
public class PostFeed {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String decription;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	private UserInfo userInfo;

}
