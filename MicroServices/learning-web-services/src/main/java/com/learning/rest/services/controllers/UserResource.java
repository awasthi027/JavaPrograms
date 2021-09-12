package com.learning.rest.services.controllers;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.learning.rest.services.exceptions.UserNotFoundException;
import com.learning.rest.services.models.User;
import com.learning.rest.services.services.layers.UserDaoService;


@RestController
@RequestMapping(path = "v1/users/")
public class UserResource {

	@Autowired
	private UserDaoService userDaoService;

	@GetMapping(path = "/all")
	public List<User> findAllUsers() {
		return userDaoService.findAll();
	}

	@GetMapping(path = "/{id}")
	public EntityModel<User> findUser(@PathVariable int id) {
		User user = userDaoService.findOne(id);
		if (user == null) {
			throw new UserNotFoundException("We don't have user for this id: " + id);
		}
		EntityModel <User> model = EntityModel.of(user);
		WebMvcLinkBuilder linkToUsers = linkTo(methodOn(this.getClass()).findAllUsers());
		model.add(linkToUsers.withRel("all-users"));
		return model;
	}

	@PostMapping(path = "/create/")
	public ResponseEntity<Object> createUser(@RequestBody @Valid final User user) {
		User saveUser = userDaoService.saveUser(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").
				buildAndExpand(saveUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PostMapping(path = "/create/new")
	public User createNewUser(User user) {
		User saveUser = userDaoService.saveUser(user);
		return saveUser;
	}

	@DeleteMapping(path = "/delete/{id}")
	public User deleteUser(@PathVariable int id) {
		User user = userDaoService.deleteUser(id);
		if (user == null) {
			throw new UserNotFoundException("We don't have this in our data base: " + id);
		}
		return user;
	}

}
