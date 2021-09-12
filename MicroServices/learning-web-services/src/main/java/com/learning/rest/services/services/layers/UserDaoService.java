package com.learning.rest.services.services.layers;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.learning.rest.services.models.User;


@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<User>();
	private static Integer userCount = 3;

	static {
		users.add(new User(1, "Ashish", new Date()));
		users.add(new User(2, "Tanuja", new Date()));
		users.add(new User(3, "Abhishek", new Date()));
	}

	public List<User> findAll() {
		return users;
	}

	public User saveUser(User user) {
		if (user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}

	public User findOne(int id) {
		for(User user: users) {
		   if (user.getId() == id) {
			 return user;
		   }
		}
		return null;
	}

	public User deleteUser(int id) {
	
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}

}
