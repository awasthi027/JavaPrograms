package com.learning.rest.services.services.layers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.learning.rest.services.dao.UserInfo;
import com.learning.rest.services.respositories.UserJPARespository;

@Service
public class UserJPAService {
	
	@Autowired
	UserJPARespository jpaRespository;

	public List<UserInfo> findAll() {
		return jpaRespository.findAll();
	}
	
	public Optional<UserInfo> findById(int id){
		return jpaRespository.findById(id);
	}
	
	public UserInfo saveUser(UserInfo userInfo) {
		return jpaRespository.save(userInfo);
	}
	
	
}
