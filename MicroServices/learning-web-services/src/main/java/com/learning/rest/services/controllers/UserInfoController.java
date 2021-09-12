package com.learning.rest.services.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.learning.rest.services.dao.PostFeed;
import com.learning.rest.services.dao.UserInfo;
import com.learning.rest.services.exceptions.UserNotFoundException;
import com.learning.rest.services.models.TodoInfo;
import com.learning.rest.services.services.layers.PostFeedService;
import com.learning.rest.services.services.layers.UserJPAService;



@RequestMapping(path = "/v1/jpa/users")
@RestController
public class UserInfoController {
	
	@Autowired
	UserJPAService userJPAService;
	
	@Autowired
	PostFeedService postFeedService;
	
	@GetMapping(path = "/all")
	public List <UserInfo> findAll() {
		return userJPAService.findAll();
	}
	
	@GetMapping(path = "/feed/all")
	public List <PostFeed> findAllFeeds() {
		return postFeedService.findAll();
	}
	
	@PostMapping(path = "/create") 
	public UserInfo createTodo(@RequestBody UserInfo userInfo) {
		return userJPAService.saveUser(userInfo);
	}
	
	@PostMapping(path = "/create/{id}/post") 
	public ResponseEntity<Object> createPost(@PathVariable int id, @RequestBody PostFeed postFeed) {
		Optional<UserInfo> optionalUser = userJPAService.findById(id);
		if (!optionalUser.isPresent()) {
			throw new UserNotFoundException("id:- " + id);
		}
		UserInfo userInfo = optionalUser.get();
		postFeed.setUserInfo(userInfo);
		PostFeed savedPostFeed = postFeedService.savePostFeed(postFeed);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").
				buildAndExpand(savedPostFeed.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	

	

}
